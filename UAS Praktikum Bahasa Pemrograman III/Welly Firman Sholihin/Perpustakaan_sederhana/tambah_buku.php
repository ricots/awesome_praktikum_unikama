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
  
<center><h1>Input Data Buku</h1><table>
<tr><td></td></tr>
<form method="post" action="tambahproses_buku.php">
<tr><td>Nama Buku</td><td>: </td><td><input type="text" name="nama_buku"> <br></td></tr>
<tr><td>Pengarang</td><td>:</td><td> <input type="text" name="pengarang">  <br></td></tr>
<tr><td>Tahun Terbit</td><td>:</td><td> <input type="text" name="tahun">  <br></td></tr>
<tr><td>Penerbit</td><td>:</td><td> <input type="text" name="penerbit">  <br></td></tr>
<tr><td></td><td></td><td><input type="submit" value="Tambah"></td><td><a href="data_buku.php">Batal</a></td></tr>

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