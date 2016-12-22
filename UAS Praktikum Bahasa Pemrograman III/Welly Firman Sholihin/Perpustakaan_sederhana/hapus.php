<?php
include "koneksi.php";
$id=$_GET[id];
mysql_query("delete from kelas where
id_kelas='$id'");
header("Location:kelas.php");
?>