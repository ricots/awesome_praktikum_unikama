<?php
session_start();
include "../../connect.php";
$nama = $_SESSION['username'];
$level  = $_SESSION['level']; 
if($level == 'superadmin' OR $level=='dokter') {   

?>
<!DOCTYPE html>
<head>
<title>LAPORAN KUNJUNGAN</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu_dokter.php"; ?>
<div id="atassuper"></div>
<div id="header">
<div id="content">
<form action="report_kunjungan.php">
<h1>LAPORAN KUNJUNGAN PASIEN</h1><br>
<table border="1">
	    <tr>
    	<th>NO</th>
        <th>KODE PASIEN</th>
        <th>NAMA PASIEN</th>
        <th>AGAMA</th>
        <th>ALAMAT</th>
        <th>NAMA DOKTER</th>
        <th>TGL_KUNJUNGAN</th>
        <th>JAM_KUNJUNGAN</th>
       
      
    </tr>
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
$tampil=mysql_query("SELECT p.no_pasien,p.nm_pasien,p.agama,p.alamat,d.nm_dokter,k.tgl_kunjungan,k.jam_kunjungan
FROM pasien p, kunjungan k, dokter d
WHERE p.no_pasien = k.no_pasien AND d.kd_dokter = k.kd_dokter ORDER BY no_pasien ASC limit $posisi,$batas");
$no = $posisi + 1;
while($r = mysql_fetch_array($tampil))
{echo"
	<tr>
		<td>$no</td>
		<td>$r[no_pasien]</td>
		<td>$r[nm_pasien]</td>
		<td>$r[agama]</td>
		<td>$r[alamat]</td>
		<td>$r[nm_dokter]</td>
		<td>$r[tgl_kunjungan]</td>
		<td>$r[jam_kunjungan]</td>
		</tr>";
	$no++;
}
echo"</table>";
//Langkah ketiga:hitung total data dan halaman serta Link 1.2.3...
echo "<br><h3>Halaman :&nbsp;";


$tampil2="SELECT p.no_pasien,p.nm_pasien,p.agama,p.alamat,d.nm_dokter,k.tgl_kunjungan,k.jam_kunjungan
FROM pasien p, kunjungan k, dokter d 
WHERE p.no_pasien = k.no_pasien AND d.kd_dokter = k.kd_dokter ORDER BY no_pasien ASC";
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
echo "<br>Total Laporan Kunjungan :&nbsp;<b>$jmldata</b> </p></h3>";	
?>
</table>
<br>
<input class="submit" type="submit" value="DOWNLOAD">
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