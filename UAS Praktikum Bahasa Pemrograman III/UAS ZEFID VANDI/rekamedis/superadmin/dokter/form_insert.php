<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>DOKTER</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h2>INPUT DOKTER</h2>
<form method="post" action="insert_dokter.php">
<table border="0">
<tr><td>KD USER</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(kd_dokter)FROM dokter";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM dokter");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,2,3);
$no_pinjam++;
$newid = "D".sprintf("%04s",$no_urut);

$cari = mysql_query ("SELECT * FROM dokter WHERE kd_dokter = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="D".sprintf("%04s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="kd_user" value="<?php echo $newid2 ?>" readonly required /></td></tr>
<tr><td>Username</td><td>:<input type="text" name="username" placeholder="Username" required /></td></tr>
<tr><td>Password</td><td>:<input type="password" name="password" placeholder="Password" required /></td></tr>
<tr><td colspan="2">&nbsp;</td></tr>
<tr><td>KD DOKTER</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(kd_dokter)FROM dokter";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM dokter");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,2,3);
$no_pinjam++;
$newid = "D".sprintf("%04s",$no_urut);

$cari = mysql_query ("SELECT * FROM dokter WHERE kd_dokter = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="D".sprintf("%04s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="kd_dokter" value="<?php echo $newid2 ?>" readonly required /></td></tr>
<tr><td>KD POLI</td><td>		: <select name="kd_poli">
<option>--pilih--</option>
<?php
include"../../connect.php";
$tampil = mysql_query("SELECT * FROM poliklinik ORDER BY kd_poli ASC");
while($row = mysql_fetch_array($tampil)){
echo "<option value='$row[kd_poli]'>$row[nm_poli]</option>";
}
?>
</select></td></tr>
<tr><td>Tgl Kunjungan</td><td> 		: 
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

<tr><td>Nama</td><td class="perintah">:<input type="text" name="nm_dokter" placeholder="Nama Dokter" required />* Nama Lengkap</td></tr>
<tr><td>SIP</td><td class="perintah">:<input type="text" name="SIP" placeholder="Surat Izin Praktek" required />* Example (0001/1234)</td></tr>
<tr><td>Tempat Lahir</td><td>:<input type="text" name="tmp_lahir" placeholder="Tempat Lahir" required /></td></tr>
<tr><td>No Telp</td><td>:<input type="text" name="no_telp" placeholder="No Telp" required /></td></tr>
<tr><td>Alamat</td><td>:<input type="text" name="alamat" placeholder="Alamat" required /></td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="SIMPAN" />
		<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>
</form>



