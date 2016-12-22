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
<?php
include "../../connect.php";
$edit= mysql_query("SELECT * FROM rekamedis
					WHERE no_RM='$_GET[no_RM]'");
$row=mysql_fetch_array($edit);
?>
<h2> EDIT DATA REKAMEDIS </h2>
<form method="post" action="edit_rekamedis.php">
<input type="hidden" name="no_RM" value="<?php echo $row[no_RM] ?>">
<table>
<tr><td> NO Rekamedis</td>
<td> : <b><?php echo $row[no_RM] ?></b></td></tr>
<tr><td>Kd Tindakan</td><td>:<select name="kd_tindakan">
<option>--Pilih--</option>
<?php
include"../../connect.php";
$tampil1=mysql_query("SELECT * FROM tindakan ORDER BY kd_tindakan ASC");
while($data1=mysql_fetch_array($tampil1)){
	echo"<option value=$data1[kd_tindakan]>$data1[nm_tindakan]</option>";
}
?>
</select>
</td></tr>
<tr><td>Kd Obat</td><td>:<select name="kd_obat">
<option>--Pilih--</option>
<?php
include"../../connect.php";
$tampil2=mysql_query("SELECT * FROM obat ORDER BY kd_obat ASC");
while($data2=mysql_fetch_array($tampil2)){
	echo"<option value=$data2[kd_obat]>$data2[nm_obat]</option>";
}
?>
</select>
</td></tr>
<tr><td>Dokter</td><td>:<select name="kd_user">
<option>--Pilih--</option>
<?php
include"../../connect.php";
$tampil3=mysql_query("SELECT * FROM dokter ORDER BY kd_dokter ASC");
while($data3=mysql_fetch_array($tampil3)){
	echo"<option value=$data3[kd_dokter]>$data3[nm_dokter]</option>";
}
?>
</select>
</td></tr>

<tr><td>Kd Pasien</td><td>:<select name="no_pasien">
<option>--Pilih--</option>
<?php
include"../../connect.php";
$tampil4=mysql_query("SELECT * FROM pasien ORDER BY no_pasien ASC");
while($data4=mysql_fetch_array($tampil4)){
	echo"<option value=$data4[no_pasien]>$data4[nm_pasien]</option>";
}
?>
<tr><td>Diagnosa</td><td>:<input type="text" name="diagnosa" value="<?php echo $row[diagnosa] ?>" /></td></tr>
<tr><td>Resep</td><td>:<input type="text" name="resep" value="<?php echo $row[resep] ?>" /></td></tr>
<tr><td>Keluhan</td><td>:<input type="text" name="keluhan" value="<?php echo $row[keluhan] ?>" /></td></tr>
<tr><td>Tgl Pemeriksaan</td><td> 		: 
<select name="tanggal">
<option>Tanggal</option>
<?php
for($i=1; $i<=31; $i++){
	if(strlen($i)==1){
		$tanggal = '0'.$i;
		echo"<option value=$tanggal>$i</option>";
	}
	else{
		echo"<option value=$i>$i</option>";
	}
}
?>
</select>
- <select name="bulan">
<option>Bulan</option>
<option value="01">Januari</option>
<option value="02">Februari</option>
<option value="03">Maret</option>
<option value="04">April</option>
<option value="05">Mei</option>
<option value="06">Juni</option>
<option value="07">Juli</option>
<option value="08">Agustus</option>
<option value="09">September</option>
<option value="10">Oktober</option>
<option value="11">November</option>
<option value="12">Desember</option>
</select>
- <select name="tahun">
<option>Tahun</option>
<?php
for($i=2015; $i>=1950; $i--){
	echo"<option value='$i'>$i</option>";
}
?>
</select>
</td></tr>
<tr><td>Ket</td><td>:<input type="text" name="ket" value="<?php echo $row[ket] ?>" /></td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="EDIT" />
<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>

</body>