<?php
include "koneksi.php";
$id=$_GET[id];
mysql_query("delete from anggota where
id='$id'");
header("Location:data_anggota.php");
?>