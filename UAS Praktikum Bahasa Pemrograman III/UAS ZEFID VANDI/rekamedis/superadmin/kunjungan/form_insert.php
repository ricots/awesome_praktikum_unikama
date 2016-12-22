<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>KUNJUNGAN</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h2>INPUT KUNJUNGAN</h2>
<form method="post" action="insert_kunjungan.php">
<table border="0">
<tr><td>Tgl Kunjungan</td><td>:<select name="tanggal">
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
<tr><td>KD Pasien</td><td>:<select name="no_pasien">
<option>--Pilih--</option>
<?php
include "../../connect.php";
$tampil = mysql_query("SELECT * FROM pasien ORDER BY no_pasien ASC");
while($row = mysql_fetch_array($tampil)){
echo "<option value=$row[no_pasien]>$row[nm_pasien]";
}
?>
</select>
</td></tr>
<tr><td>KD Dokter</td><td>:<select name="kd_dokter">
<option>--Pilih--</option>
<?php
include "../../connect.php";
$tampil = mysql_query("SELECT * FROM dokter ORDER BY kd_dokter ASC");
while($data = mysql_fetch_array($tampil)){
echo "<option value=$data[kd_dokter]>$data[nm_dokter]";
}
?>
</select>
</td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="SIMPAN" />
		<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>
</form>



