<!DOCTYPE html>
    <html>
        <head>
            <title>Transaki pembayaran</title>
            <link rel="stylesheet" href="css/bootstrap.css">
            <script src="js/jquery.js"></script>
            <script src="js/jquery.ui.datepicker.js"></script>
            <script>
                //mendeksripsikan variabel yang akan digunakan
                var nota;
                var tanggal;
                var kode;
                var nama;
                var harga;
                var jumlah;
                var stok;
                $(function(){
                    //meload file pk dengan operator ambil barang dimana nantinya
                    //isinya akan masuk di combo box
                    $("#kode").load("pk.php","op=ambilbarang");
                    
                    //meload isi tabel
                    $("#barang").load("pk.php","op=barang");
                    
                    //mengkosongkan input text dengan masing2 id berikut
                    $("#nama").val("");
                    $("#harga").val("");
                    $("#jumlah").val("");
                    $("#stok").val("");
                                
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
                                $("#harga").val(data[1]);
                                $("#stok").val(data[3]);
                                $("#jumlah").focus();
                                //hilangkan status animasi dan loading
                                $("#status").html("");
                                $("#loading").hide();
                            }
                        });
                    });
                    
                    //jika tombol tambah di klik
                    $("#tambah").click(function(){
                        kode=$("#kode").val();
                        stok=$("#stok").val();
                        jumlah=$("#jumlah").val();
                        if(kode=="Kode Barang"){
                            alert("nama anda Harus diisi");
                            exit();
                        }else if(jumlah > stok){
                            alert("jumlah tidak terpenuhi");
                            $("#jumlah").focus();
                            exit();
                        }else if(jumlah < 1){
                            alert(" tidak boleh 0");
                            $("#jumlah").focus();
                            exit();
                        }
                        nama=$("#nama").val();
                        harga=$("#harga").val();
                        
                                                
                        $("#status").html("sedang diproses. . .");
                        $("#loading").show();
                        
                        $.ajax({
                            url:"pk.php",
                            data:"op=tambah&kode="+kode+"&nama="+nama+"&harga="+harga+"&jumlah="+jumlah,
                            cache:false,
                            success:function(msg){
                                if(msg=="sukses"){
                                    $("#status").html("Berhasil disimpan. . .");
                                }else{
                                    $("#status").html("ERROR. . .");
                                }
                                $("#loading").hide();
                                $("#nama").val("");
                                $("#harga").val("");
                                $("#jumlah").val("");
                                $("#stok").val("");
                                $("#kode").load("pk.php","op=ambilbarang");
                                $("#barang").load("pk.php","op=barang");
                            }
                        });
                    });
                    
                    //jika tombol proses diklik
                    $("#proses").click(function(){
                        nota=$("#nota").val();
                        tanggal=$("#tanggal").val();
                        
                        $.ajax({
                            url:"pk.php",
                            data:"op=proses&nota="+nota+"&tanggal="+tanggal,
                            cache:false,
                            success:function(msg){
                                if(msg=='sukses'){
                                    $("#status").html('Transaksi pembayaran berhasil');
                                    alert('Transaksi Berhasil');
                                    exit();
                                }else{
                                    $("#status").html('Transaksi Gagal');
                                    alert('Transaksi Gagal');
                                    exit();
                                }
                                $("#kode").load("pk.php","op=ambilbarang");
                                $("#barang").load("pk.php","op=barang");
                                $("#loading").hide();
                                $("#nama").val("");
                                $("#harga").val("");
                                $("#jumlah").val("");
                                $("#stok").val("");
                            }
                        })
                    })
                });
            </script>
        </head>
        <body>
            <div class="container">
                <?php
                include "db/koneksi.php";
                $p=isset($_GET['act'])?$_GET['act']:null;
                switch($p){
                    default:
                        echo "<table class='table table-bordered'>
                            <tr>
                                <td colspan='3'><a href='?page=penjualan&act=tambah' class='btn btn-primary'>Input pembayaran</a></td>
                            </tr>
                                <tr>
                                    <td>No.Nota</td>
                                    <td>Tanggal</td>
                                    <td>Jumlah</td>
                                    <td>Tools</td>
                                </tr>";
                                $query=mysql_query("select * from pembayaran");
                                while($r=mysql_fetch_array($query)){
                                    echo "<tr>
                                            <td><a href='?page=penjualan&act=detail&nota=$r[nonota]'>$r[nonota]</a></td>
                                            <td>$r[tanggal]</td>
                                            <td>$r[total]</td>
                                            <td><a href='?page=penjualan&act=detail&nota=$r[nonota]'>Cetak Nota</a></td>
                                        </tr>";
                                }
                                echo"</table>";
                        
                        break;
                    case "tambah":
                        $tgl=date('Y-m-d');
                        //untuk autonumber di nota
                        $auto=mysql_query("select * from pembayaran order by nonota desc limit 1");
                        $no=mysql_fetch_array($auto);
                        $angka=$no['nonota']+1;
                        echo "<div class='navbar-form pull-right'>
                                No. Nota : <input type='text' id='nota' value='$angka' readonly >
                                <input type='text' id='tanggal' value='$tgl' readonly>   
                            </div>";
                            
                            echo'<legend>Transaksi pembayaran</legend>
                            <label>NAMA ANDA</label>
                            <select id="kode"></select>
                            <input type="text" id="nama" placeholder="Nama Barang" readonly>
                            <input type="text" id="harga" placeholder="Harga perkilo" class="span2" readonly>
                            <input type="text" id="stok" placeholder="totalberat" class="span1" readonly>
                            <input type="text" id="jumlah" placeholder="Jumlah Beli" class="span1">
                            <button id="tambah" class="btn">Tambah</button>
                            
                            <span id="status"></span>
                            <table id="barang" class="table table-bordered">
                                    
                            </table>
                            <div class="form-actions">
                                <button id="proses">Proses</button>
                            </div>';
                        break;
                    case "detail":
                        echo "<legend>Nota pembayaran</legend>";
                        $nota=$_GET['nota'];
                        $query=mysql_query("select pembayaran.nonota,detail_pembayaran.kode,tblbarang.nama,
                                           detail_pembayaran.harga,detail_pembayaran.jumlah,detail_pembayaran.subtotal
                                           from detail_pembayaran,pembayaran,tblbarang
                                           where pembayaran.nonota=detail_pembayaran.nonota and tblbarang.kode=detail_pembayaran.kode
                                           and detail_pembayaran.nonota='$nota'");
                        $nomor=mysql_fetch_array(mysql_query("select * from pembayaran where nonota='$nota'"));
                        echo "<div class='navbar-form pull-right'>
                                Nota : <input type='text' value='$nomor[nonota]' disabled>
                                <input type='text' value='$nomor[tanggal]' disabled>
                            </div>";
                        echo "<table class='table table-hover'>
                                <thead>
                                    <tr>
                                        <td>Nama Anda</td>
                                        <td>Nama Barang</td>
                                        <td>Harga Perkilo/KG</td>
                                        <td>Total Berat</td>
                                        <td>Subtotal</td>
                                    </tr>
                                </thead>";
                                while($r=mysql_fetch_row($query)){
                                    echo "<tr>
                                            <td>$r[1]</td>
                                            <td>$r[2]</td>
                                            <td>$r[3]</td>
                                            <td>$r[4]</td>
                                            <td>$r[5]</td>
                                        </tr>";
                                }
                                echo "<tr>
                                        <td colspan='4'><h4 align='right'>Total</h4></td>
                                        <td colspan='5'><h4>$nomor[total]</h4></td>
                                    </tr>
                                    </table>";
                        break;
                }
                ?>
            </div>
        </body>
    </html>