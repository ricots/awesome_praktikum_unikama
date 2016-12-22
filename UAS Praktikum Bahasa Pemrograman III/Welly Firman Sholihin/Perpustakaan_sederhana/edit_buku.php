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
$data=mysql_query("select * from data_buku where id='$id'");
$d=mysql_fetch_array($data); 
?>
<center><table><tr><td><h1>Edit Data Buku</h1></td></tr>
<form method="post" action="editproses_buku.php">
<input type = "hidden" name="id" value="<?=$d["id"]?>">
<tr><td>Nama Buku</td><td>: </td><td><input type="text" name="nama_buku" value="<?=$d["nama_buku"]?>"> <br></td></tr>
<tr><td>Pengarang</td><td>:</td><td> <input type="text" name="pengarang" value="<?=$d["pengarang"]?>">  <br></td></tr>
<tr><td>Tahun Terbit</td><td>:</td><td> <input type="text" name="tahun" value="<?=$d["tahun"]?>">  <br></td></tr>
<tr><td>Penerbit</td><td>:</td><td> <input type="text" name="penerbit" value="<?=$d["penerbit"]?>">  <br></td></tr>

<tr><td></td><td></td><td><input type="submit" value=""></td><td><a href="data_buku.php">Batal</a></td></tr>

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