<?php
session_start();
include "../../connect.php";
$nama = $_SESSION['user'];
$level  = $_SESSION['level']; 
if($level == 'superadmin' OR $level == 'dokter' OR $level == 'pasien'){  

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PASIEN</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu_pasien.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h1>PASIEN</h1>
<table border="1">
<tr>
<th>No</th><th>Kd Pasien</th><th>Nama</th><th>J Kel</th><th>Agama</th><th>Alamat</th><th>Tgl Lahir</th><th>Usia</th><th>No Telp<th>NM KK</th><th>Hub Kel</th></th></tr>
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
$tampil= "SELECT * FROM pasien ORDER BY no_pasien asc limit $posisi,$batas";
$hasil = mysql_query ($tampil);
$no= $posisi + 1;
while ($row=mysql_fetch_array($hasil)){

	echo "<tr>";
	echo "<td> $no </td> ";
	echo "<td> $row[no_pasien] </td> ";
	echo "<td> $row[nm_pasien] </td> ";
	echo "<td> $row[j_kel] </td> ";
	echo "<td> $row[agama] </td> ";
	echo "<td> $row[alamat] </td> ";
	echo "<td> $row[tgl_lahir] </td> ";
	echo "<td> $row[usia] </td> ";
	echo "<td> $row[no_telp] </td> ";
	echo "<td> $row[nm_kk] </td> ";
	echo "<td> $row[hub_kel] </td> ";
	echo "</tr>";
	$no++;
}
echo"</table>";
echo "<br><h3>Halaman :&nbsp;";


$tampil2="select * from pasien";
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
echo "<br>Total Pasien :&nbsp;<b>$jmldata</b> Orang</p></h3>";
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