<?php
session_start();
include "../../connect.php";
$nama = $_SESSION['user'];
$level  = $_SESSION['level']; 
if($level == 'superadmin') {  

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>POLIKLINIK</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h1>POLIKLINIK</h1>
<form method="post" action="form_insert.php">
<input class="submit" type="submit" value="TAMBAH POLIKLINIK" />
</form>
<br />
<table border="1">
<tr>
<th>No</th><th>Kd Poli</th><th>Nama Poliklinik</th><th>Lantai</th><th>Aksi</th></tr>
<?php
include "../../connect.php";
$batas = 5;
$halaman = $_GET['halaman'];
if(empty($halaman)){
	$posisi=0;
	$halaman=1;
}
else{
	$posisi = ($halaman-1) * $batas;
}
$tampil= "SELECT * FROM poliklinik ORDER BY kd_poli asc limit $posisi,$batas";
$hasil = mysql_query ($tampil);
$no= $posisi + 1;
while ($row=mysql_fetch_array($hasil)){

	echo "<tr>";
	echo "<td> $no </td> ";
	echo "<td> $row[kd_poli] </td> ";
	echo "<td> $row[nm_poli] </td> ";
	echo "<td> $row[lantai] </td> ";
	echo "<td>
	<a href=form_edit.php?kd_poli=$row[kd_poli]>Edit</a>&nbsp; | 
	<a href=\"hapus_poliklinik.php?kd_poli=$row[kd_poli]\"onClick=\"return confirm('Apakah Anda benar-benar akan menghapus $row[nm_poli]?')\">Hapus</a>
	</td></tr>";
	$no++;
}
echo"</table>";
echo "<br><h3>Halaman :&nbsp;";


$tampil2="select * from poliklinik";
$hasil2=mysql_query($tampil2);
$jmldata=mysql_num_rows($hasil2);
$jmlhalaman=ceil($jmldata/$batas);

for($i=1;$i<=$jmlhalaman;$i++)
if($i!=$halaman)
{
	
	echo"<a href=$_SERVER[PHP_SELF]?halaman=$i style=color:#000>$i</a> |";
}
else
{
	echo"<b>$i</b> |";
}
echo "<br>Total Poliklinik :&nbsp;<b>$jmldata</b> </p></h3>";
?>

</table>

<?php
}
else
{

?>   
	<script>alert("MAAF ANDA TIDAK MEMILIKI HAK AKSES HALAMAN INI"); </script>
    <script>window.location='../../index.php'; </script>	
<?php
}
?>

</body>
</html>