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
<h2>INPUT REKAMEDIS</h2>
<form method="post" action="insert_rekamedis.php">
<table border="0">
<tr><td>NO RM</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(no_RM)FROM rekamedis";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM rekamedis");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,3,4);
$no_pinjam++;
$newid = "RM".sprintf("%03s",$no_urut);

$cari = mysql_query ("SELECT * FROM rekamedis WHERE no_RM = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="RM".sprintf("%03s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="no_RM" value="<?php echo $newid2 ?>" readonly required /></td></tr>
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
</select>
</td></tr>
<tr><td>Diagnosa</td><td>:<input type="text" name="diagnosa" placeholder="Diagnosa" required /></td></tr>
<tr><td>Resep</td><td>:<input type="text" name="resep" placeholder="Resep" required /></td></tr>
<tr><td>Keluhan</td><td>:<input type="text" name="keluhan" placeholder="Keluhan" required /></td></tr>
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
<tr><td>Ket</td><td>:<input type="text" name="ket" placeholder="Ket" required /></td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="SIMPAN" />
		<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>
</form>



