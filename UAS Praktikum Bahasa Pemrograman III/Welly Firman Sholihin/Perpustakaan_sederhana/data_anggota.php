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
$query = "select id, nama_anggota, tanggal_join, no_hp, jenis_kelamin, tempat_lahir, date_format(now(),'%Y') - date_format(tanggal_lahir,'%Y') as umur
from anggota";	
$hasil = mysql_query($query);

echo "<center><h1>Data Anggota : </h1> <br><br><a href='tambah_anggota.php'>Tambah Anggota</a><br><br><br><table border = 1px>";
echo "<tr><td>ID Anggota</td><td>Nama</td><td>Jenis Kelamin</td><td>Usia</td><td>Nomor HP</td><td>Tanggal Join</td></tr>";

while($data=mysql_fetch_array($hasil)){
echo "<tr><td>$data[id]</td><td> $data[nama_anggota] </td> <td> $data[jenis_kelamin] </td><td> $data[umur] </td><td> $data[no_hp] </td><td> $data[tanggal_join] </td>";
echo "<td><a href='edit_anggota.php?id=$data[id]'></a> </td>
<td><a href='hapus_anggota.php?id=$data[id]'>Hapus<a/> <br></td></tr>";
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