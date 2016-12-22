<?php
//cek session
session_start();
if (empty($_SESSION['user']) or empty($_SESSION['pass'])){
	header("Location:login.php");
}
else
{?>
<html>
<head><title></title>
<link rel="stylesheet" type="text/css" href="style2.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body class="twoColElsLtHdr">

<div id="container">
<?php
include "header.php";
?>
  <div id="sidebar1">
<?php
include "menu.php";
?>
</div>
</div>

  <div id="mainContent">
<?php
include "koneksi.php";
$id=$_GET["id"]; 
$data=mysql_query("select * from anggota where id='$id'");
$d=mysql_fetch_array($data); 
?>
<center><table><tr><td><h1>Edit Data Anggota</h1></td></tr>
<form method="post" action="editproses_anggota.php">
<input type = "hidden" name="id" value="<?=$d["id"]?>">
<tr><td>Nama Anggota</td><td>: </td><td><input type="text" name="nama_anggota" value="<?=$d["nama_anggota"]?>"> <br></td></tr>
<tr><td>Jenis Kelamin</td><td>:</td><td> <select multiple name="jenis_kelamin" value="<?=$d["jenis_kelamin"]?>">
<option value="Perempuan">Perempuan</option>
<option value="Laki Laki">Laki Laki</option>
</select>  <br></td></tr>
<tr><td>Tempat Lahir</td><td>:</td><td> <input type="text" name="tempat_lahir" value="<?=$d["tempat_lahir"]?>">  <br></td></tr>
<tr><td>Tanggal Lahir</td><td>:</td><td> <input type="text" name="tanggal_lahir" value="<?=$d["tanggal_lahir"]?>">  <br></td></tr>
<tr><td>Nomor HP</td><td>:</td><td> <input type="text" name="no_hp" value="<?=$d["no_hp"]?>">  <br></td></tr>

<tr><td></td><td></td><td><input type="submit" value="Edit"></td><td><a href="data_anggota.php">Batal</a></td></tr>

</form>
<table></center>
</div>
<br class="clearfloat" />
<?php
include "footer.php";
?>
</div>

</body>
</html>
<?php } ?>