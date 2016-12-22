<!DOCTYPE html>
<html>
<head>
	<link href="css/bootstrap.css" rel="stylesheet">
	<title>UAS Pemrograman III</title>
</head>
<?php 

include "connection.php";

$kode = $_POST['inp_kode'];
$tipe = $_POST['inp_tipe'];
$merek = $_POST['inp_merek'];
$nama = $_POST['inp_nama'];
$harga = $_POST['inp_harga'];
$kondisi = $_POST['inp_kondisi'];

$query = "UPDATE barang SET tipe='$tipe', merek='$merek', nama='$nama', harga='$harga', kondisi='$kondisi' WHERE kode='$kode'";

$exequery =mysqli_query($konek,$query);

if($exequery)
{
echo '<div class="alert alert-success">Data berhasil diupdate >_<</div>';
echo "<a href='index.php'>Refresh dulu ..</a>";
}
else
{
echo '<div class="alert alert-warning">Data gagal diupdate !!!</div>';
}

?>
</html>