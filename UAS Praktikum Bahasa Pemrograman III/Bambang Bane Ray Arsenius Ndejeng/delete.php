<!DOCTYPE html>
<html>
<head>
	<link href="css/bootstrap.css" rel="stylesheet">
	<title>UAS Pemrograman III</title>
</head>
<?php
	require_once("connection.php");

	$kode = $_GET['kode'];

	$query = "DELETE FROM barang WHERE kode='$kode'";
	$exequery = mysqli_query($konek,$query);

	if($exequery){
		echo '<div class="alert alert-warning">Data berhasil dihapus</div>';
  		echo "<a href='index.php'>Refresh dulu ..</a>";
	}
	else{
		echo '<div class="alert alert-warning">Data gagal dihapus !!!</div>';
		echo "<a href='index.php'>Kembali</a>";
	}
?>
</html>