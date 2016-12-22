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
$query = "select * from data_buku";	
$hasil = mysql_query($query);

echo "<center><h1>Data Buku : </h1> <br><br><a href='tambah_buku.php'>Tambah Buku Baru</a><br><br><br><table border = 1px>";

echo "<tr><td><b>Kode</b></td><td><b>Nama Buku</b></td><td><b>Pengarang</b></td><td><b>Tahun Terbit</b></td><td><b>Penerbit</b></td></tr>";

while($data=mysql_fetch_array($hasil)){
echo "<tr><td>$data[id]</td><td> $data[nama_buku] </td> <td> $data[pengarang] </td><td> $data[tahun] </td><td> $data[penerbit] </td> ";
echo "<td><a href='edit_buku.php?id=$data[id]'></a> </td>
<td><a href='hapus_buku.php?id=$data[id]'>Hapus<a/> <br></td></tr>";
}
echo "</table>";

?>

</div>
<br class="clearfloat" />
<?php
include "footer.php";
?>
</div>

</body>
</html>
<?php } ?>