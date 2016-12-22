<!DOCTYPE html>
    <html>
        <head>
            <title>Form loundry</title>
            <script src="js/jquery.js"></script>
            <script>
                //mengidentifikasikan variabel yang kita gunakan
                var kode;
                var nama;
                var beli;
                var jual;
                var stok;
                $(function(){
                    $("#kode").load("proses.php","op=kode");
                    $("#barang").load("proses.php","op=barang");
                    
                    //jika ada perubahan di kode barang
                    $("#kode").change(function(){
                        kode=$("#kode").val();
                        
                        //tampilkan status loading dan animasinya
                        $("#status").html("loading. . .");
                        $("#loading").show();
                        
                        //lakukan pengiriman data
                        $.ajax({
                            url:"proses.php",
                            data:"op=ambildata&kode="+kode,
                            cache:false,
                            success:function(msg){
                                data=msg.split("|");
                                
                                //masukan isi data ke masing - masing field
                                $("#nama").val(data[0]);
                                $("#beli").val(data[1]);
                                $("#jual").val(data[2]);
                                $("#stok").val(data[3]);
                                
                                
                                //hilangkan status animasi dan loading
                                $("#status").html("");
                                $("#loading").hide();
                            }
                        });
                    });
                    
                    //cek kode barang yang sudah ada
                    $("#kode2").change(function(){
                        var kd=$("#kode2").val();
                        
                        $.ajax({
                            url:"proses.php",
                            data:"op=cek&kd="+kd,
                            success:function(data){
                                if(data==0){
                                    $("#pesan").html('Nama Bisa digunakan');
                                    $("#kode2").css('border','3px #090 solid');
                                }else{
                                    $("#pesan").html('nama sudah ada');
                                    $("#kode2").css('border','3px #c33 solid');
                                }
                            }
                        });
                    });
                    
                    //ketika tombol update di klik
                    $("#update").click(function(){
                        //cek apakah kode barang kosong atau tidak
                        kode=$("#kode").val();
                        if(kode=="Kode Barang"){
                            alert("Pilih Kode barang dulu");
                            exit();
                        }
                        nama=$("#nama").val();
                        beli=$("#beli").val();
                        jual=$("#jual").val();
                        stok=$("#stok").val();
                        
                        //tampilkan status update
                        $("#status").html('sedang diupdate. . .');
                        $("#loading").show();
                        
                        $.ajax({
                            url:"proses.php",
                            data:"op=update&kode="+kode+"&nama="+nama+"&beli="+beli+"&jual="+jual+"&stok="+stok,
                            cache:false,
                            success:function(msg){
                                if(msg=='Sukses'){
                                    $("#status").html('Update Berhasil. . .');
                                }else{
                                    $("#status").html('ERROR. . .')
                                }
                                $("#loading").hide();
                                $("#nama").val("");
                                $("#jual").val("");
                                $("#beli").val("");
                                $("#stok").val("");
                                $("#barang").load("proses.php","op=barang");
                                $("#kode").load("proses.php","op=kode");
                            }
                        });
                    });
                    
                    //ketika tombol hapus diklik
                    $("#hapus").click(function(){
                        kode=$("#kode").val();
                        if(kode=="Kode Barang"){
                            alert("Kode barang belim dipilih");
                            exit();
                        }
                        $("#status").html('Sedang Dihapus. . .');
                        $("#loading").show();
                        
                        $.ajax({
                            url:"proses.php",
                            data:"op=delete&kode="+kode,
                            cache:false,
                            success:function(msg){
                                if(msg=="sukses"){
                                    $("#status").html('Berhasil Dihapus. . .');
                                }else{
                                    $("#status").html('ERROR. . .');
                                }
                                $("#nama").val("");
                                $("#jual").val("");
                                $("#beli").val("");
                                $("#stok").val("");
                                $("#barang").load("proses.php","op=barang");
                                $("#kode").load("proses.php","op=kode");
                                
                            }
                        });
                    });
                    
                    //ketika tombol simpan diklik
                    $("#simpan").click(function(){
                        kode=$("#kode2").val();
                        if(kode==""){
                            alert("Kode Barang Harus diisi");
                            exit();
                        }
                        nama=$("#nama").val();
                        beli=$("#beli").val();
                        jual=$("#jual").val();
                        stok=$("#stok").val();
                        
                        $("#status").html("sedang diproses. . .");
                        $("#loading").show();
                        
                        $.ajax({
                            url:"proses.php",
                            data:"op=simpan&kode="+kode+"&nama="+nama+"&beli="+beli+"&jual="+jual+"&stok="+stok,
                            cache:false,
                            success:function(msg){
                                if(msg=="sukses"){
                                    $("#status").html("Berhasil disimpan. . .");
                                }else{
                                    $("#status").html("ERROR. . .");
                                }
                                $("#loading").hide();
                                $("#nama").val("");
                                $("#jual").val("");
                                $("#beli").val("");
                                $("#stok").val("");
                                $("#kode2").val("");
                            }
                        });
                    });
                });
            </script>
        </head>
        <body>
            <?php
            $p=isset($_GET['act'])?$_GET['act']:null;
            switch($p){
                default:
                    echo'
                        <legend>INPUTAN LOUNDRY</legend>
                        <label>PILIH NAMA ANDA </label>
                        <select id="kode"></select>
						<label>Nama Barang </label>
                        <input type="text" id="nama"  class="span2">
						<label>harga per kilo</label>
                        <input type="text" id="beli" placeholder="" class="span2">
						<label> Total berat </label>
                        <input type="text" id="jual" placeholder="" class="span2">
						<label> Jumlah Banyak </label>
                        <input type="text" id="stok" placeholder="" class="span1">
						<br>
                        <button id="update" class="btn">Update</button>
                        <button id="hapus" class="btn">Hapus</button>
						</br>
                    <div id="status"></div><br>
                    <div id="barang"></div>';
                    break;
                case "tambah":
                        echo'<legend>masukan nama dan barang yang akan di laundry</legend>
                        <label>nama anda</label>
                            <input type="text" id="kode2"> <span id="pesan"></span>
                        <label>Barang Yang akan di laundry</label>
                            <input type="text" id="nama" >
                        <label>Harga Perkilo/KG</label>
                            <input type="text" id="beli" >
                        <label>Total Berat</label>
                            <input type="text" id="jual" >
                        <label>Jumlah Banyak</label>
                            <input type="text" id="stok" class="span1">
                        <label></label>
                        <button id="simpan" class="btn">Simpan</button>
                        <a href="?page=barang" class="btn">Kembali</a>
                        <div id="status"></div>';
                    break;
            }
            ?>
        </body>
    </html>
