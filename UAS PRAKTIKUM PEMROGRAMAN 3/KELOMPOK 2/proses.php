<?php
include "db/koneksi.php";
$data=mysql_query("select * from tblbarang");
$op=isset($_GET['op'])?$_GET['op']:null;

if($op=='kode'){
    echo"<option>nama anda</option>";
    while($r=mysql_fetch_array($data)){
        echo "<option value='$r[kode]'>$r[kode]</option>";
    }
}elseif($op=='barang'){
    echo'<table id="nama anda" class="table table-hover">
    <thead>
            <tr>
                <Td colspan="5"><a href="?page=barang&act=tambah" class="btn btn-primary">masukan data yang akan di loundri</a></td>
            </tr>
            <tr>
                <td>nama anda</td>
                <td>Nama Barang</td>
                <td>Harga per kilo</td>
                <td>Total Berat</td>
                <td>jumlah</td>
            </tr>
        </thead>';
	while ($b=mysql_fetch_array($data)){
        echo"<tr>
                <td>$b[kode]</td>
                <td>$b[nama]</td>
                <td>$b[perkilo]</td>
                <td>$b[totalberat]</td>
                <td>$b[jumlah]</td>
            </tr>";
        }
    echo "</table>";
}elseif($op=='ambildata'){
    $kode=$_GET['kode'];
    $dt=mysql_query("select * from tblbarang where kode='$kode'");
    $d=mysql_fetch_array($dt);
    echo $d['nama']."|".$d['perkilo']."|".$d['totalberat']."|".$d['jumlah'];
}elseif($op=='cek'){
    $kd=$_GET['kd'];
    $sql=mysql_query("select * from tblbarang where kode='$kd'");
    $cek=mysql_num_rows($sql);
    echo $cek;
}elseif($op=='update'){
    $kode=$_GET['kode'];
    $nama=htmlspecialchars($_GET['nama']);
    $beli=htmlspecialchars($_GET['beli']);
    $jual=htmlspecialchars($_GET['jual']);
    $stok=htmlspecialchars($_GET['stok']);
    
    $update=mysql_query("update tblbarang set nama='$nama',
                        perkilo='$beli',
                        totalberat='$jual',
                        jumlah='$stok'
                        where kode='$kode'");
    if($update){
        echo "Sukses";
    }else{
        echo "ERROR. . .";
    }
}elseif($op=='delete'){
    $kode=$_GET['kode'];
    $del=mysql_query("delete from tblbarang where kode='$kode'");
    if($del){
        echo "sukses";
    }else{
        echo "ERROR";
    }
}elseif($op=='simpan'){
    $kode=$_GET['kode'];
    $nama=htmlspecialchars($_GET['nama']);
    $jual=htmlspecialchars($_GET['jual']);
    $beli=htmlspecialchars($_GET['beli']);
    $stok=htmlspecialchars($_GET['stok']);
    
    $tambah=mysql_query("insert into tblbarang (kode,nama,perkilo,totalberat,jumlah)
                        values ('$kode','$nama','$beli','$jual','$stok')");
    if($tambah){
        echo "sukses";
    }else{
        echo "error";
    }
}
?>