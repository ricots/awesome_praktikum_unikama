<?php
include "koneksi.php";
$nama_anggota=$_POST[nama_anggota];
$jenis_kelamin=$_POST[jenis_kelamin];
$no_hp=$_POST[no_hp];
$tempat_lahir=$_POST[tempat_lahir];
$tanggal_lahir=$_POST[tanggal_lahir];
mysql_query("insert into anggota(nama_anggota, jenis_kelamin, no_hp, tempat_lahir, tanggal_lahir, tanggal_join)
values('$nama_anggota','$jenis_kelamin','$no_hp','$tempat_lahir','$tanggal_lahir',now())");
header("Location:data_anggota.php");
?>