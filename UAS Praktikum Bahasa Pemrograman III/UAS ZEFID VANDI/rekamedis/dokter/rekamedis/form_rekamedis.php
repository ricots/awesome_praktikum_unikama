<?php
session_start();
include "../../connect.php";
$nama = $_SESSION['user'];
$level  = $_SESSION['level']; 
if($level == 'superadmin' OR $level=='dokter') {   

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>REKAMEDIS</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu_dokter.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h1>REKAMEDIS</h1>
<form method="post" action="form_insert.php">
<input class="submit" type="submit" value="TAMBAH REKAMEDIS" />
</form>
<br />
<table border="1">
<tr>
<th>No</th><th>No RM</th><th>Kd Tindakan</th><th>Kd obat</th><th>Kd user</th><th>no Pasien</th><th>diagnosa</th><th>resep</th><th>Keluhan<th>Tgl Pemeriksaan</th><th>ket</th></th><th>Aksi</th></tr>
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
$tampil= "SELECT * FROM rekamedis ORDER BY no_RM asc limit $posisi,$batas";
$hasil = mysql_query ($tampil);
$no= $posisi + 1;
while ($row=mysql_fetch_array($hasil)){

	echo "<tr>";
	echo "<td> $no </td> ";
	echo "<td> $row[no_RM] </td> ";
	echo "<td> $row[kd_tindakan] </td> ";
	echo "<td> $row[kd_obat] </td> ";
	echo "<td> $row[kd_user] </td> ";
	echo "<td> $row[no_pasien] </td> ";
	echo "<td> $row[diagnosa] </td> ";
	echo "<td> $row[resep] </td> ";
	echo "<td> $row[keluhan] </td> ";
	echo "<td> $row[tgl_pemeriksaan] </td> ";
	echo "<td> $row[ket] </td> ";
	echo "<td>
	<a href=form_edit.php?no_RM=$row[no_RM]>Edit</a>&nbsp; | 
	<a href=\"hapus_rekamedis.php?no_RM=$row[no_RM]\"onClick=\"return confirm('Apakah Anda benar-benar akan menghapus $row[no_RM]?')\">Hapus</a>
	</td></tr>";
	$no++;
}
echo"</table>";
echo "<br><h3>Halaman :&nbsp;";


$tampil2="select * from rekamedis";
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
echo "<br>Total rekamedis :&nbsp;<b>$jmldata</b></p></h3>";
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