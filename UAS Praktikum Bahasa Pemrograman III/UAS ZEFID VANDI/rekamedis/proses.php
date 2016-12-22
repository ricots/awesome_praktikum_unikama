<?php
session_start();
include "connect.php";
$user = $_POST["username"];
$pass = md5($_POST["password"]);
$login = mysql_query ("SELECT * FROM login WHERE username = '$user' AND password = '$pass'");

$hasil = mysql_num_rows($login);

$row = mysql_fetch_array($login);

$kd_user = $row["kd_user"];
$nama = $row["nama_lengkap"];
$level= $row["hak_akses"];

$_SESSION["user"] = $nama;
$_SESSION["level"] = $level;
$_SESSION["kd_user"] = $kd_user;

if($level == 'superadmin'){header('location:superadmin.php');}
if($level == 'dokter'){header('location:dokter.php');}
if($level == 'pasien'){header('location:pasien.php');}

include "index.php";
?>
<script>alert("Username/Password salah");</script>
<script>window.location='index.php';</script>
<?php

?> 