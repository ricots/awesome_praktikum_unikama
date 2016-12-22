<?php
include "koneksi.php";
$nama_buku=$_POST[nama_buku];
$penerbit=$_POST[penerbit];
$tahun=$_POST[tahun];
$pengarang=$_POST[pengarang];
mysql_query("insert into data_buku(nama_buku, penerbit, tahun, pengarang)
values('$nama_buku','$penerbit','$tahun','$pengarang')");
header("Location:data_buku.php");
?>