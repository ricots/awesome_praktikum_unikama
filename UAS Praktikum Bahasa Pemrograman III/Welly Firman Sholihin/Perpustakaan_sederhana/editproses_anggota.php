<?php
include "koneksi.php";
$id=$_POST[id];
$nama_anggota=$_POST[nama_anggota];
$jenis_kelamin=$_POST[jenis_kelamin];
$no_hp=$_POST[no_hp];
$tempat_lahir=$_POST[tempat_lahir];
$tanggal_lahir=$_POST[tanggal_lahir];
mysql_query("update anggota set nama_anggota = '$nama_anggota', jenis_kelamin = '$jenis_kelamin', no_hp = '$no_hp', tempat_lahir = '$tempat_lahir', tanggal_lahir = '$tanggal_lahir' where id = '$id'");
header("Location:data_anggota.php");
?>
