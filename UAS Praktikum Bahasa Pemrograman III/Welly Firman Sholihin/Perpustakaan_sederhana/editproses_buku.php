<?php
include "koneksi.php";
$id=$_POST[id];
$nama_buku=$_POST[nama_buku];
$penerbit=$_POST[penerbit];
$tahun=$_POST[tahun];
$pengarang=$_POST[pengarang];
mysql_query("update data_buku set nama_buku = '$nama_buku', pengarang = '$pengarang', tahun = '$tahun', penerbit = '$penerbit' where id = '$id'");
header("Location:data_buku.php");
?>
