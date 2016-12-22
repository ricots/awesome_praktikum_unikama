<?php
$server = "localhost";
$username = "root";
$password = "";
$dbname = "rekamedis";

mysql_connect($server,$username,$password) or die ("koneksi gagal");
mysql_select_db($dbname) or die ("Database Tidak Tersedia");
?>