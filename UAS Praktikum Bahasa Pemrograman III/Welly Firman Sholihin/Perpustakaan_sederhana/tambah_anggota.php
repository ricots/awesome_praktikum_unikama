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
<center><h1>Tambah Data Anggota</h1><table>
<tr><td></td></tr>
<form method="post" action="tambahproses_anggota.php">
<tr><td>Nama Anggota</td><td>: </td><td><input type="text" name="nama_anggota"> <br></td></tr>
<tr><td>Jenis Kelamin</td><td>:</td><td> <select multiple name="jenis_kelamin">
<option value="Perempuan">Perempuan</option>
<option value="Laki Laki">Laki Laki</option>
</select>  <br></td></tr>
<tr><td>Tempat Lahir</td><td>:</td><td> <input type="text" name="tempat_lahir">  <br></td></tr>
<tr><td>Tanggal Lahir</td><td>:</td><td> <input type="text" name="tanggal_lahir">  <br></td></tr>
<tr><td>Nomor HP</td><td>:</td><td> <input type="text" name="no_hp">  <br></td></tr>
<tr><td></td><td></td><td><input type="submit" value="Tambah"></td><td><a href="data_anggota.php">Batal</a></td></tr>

</table>
</form>
</div>
<br class="clearfloat" />
<?php
include "footer.php";
?>
</div>

</body>
</html>
<?php } ?>