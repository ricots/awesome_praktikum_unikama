<?php
include "koneksi.php";
$id=$_GET[id];
mysql_query("delete from data_buku where
id='$id'");
header("Location:data_buku.php");
?>