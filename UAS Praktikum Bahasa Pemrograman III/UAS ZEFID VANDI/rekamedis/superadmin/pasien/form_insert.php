<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>PASIEN</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h2>INPUT PASIEN</h2>
<form method="post" action="insert_pasien.php">
<table border="0">
<tr><td>KD USER</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(no_pasien)FROM pasien";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM pasien");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,2,3);
$no_pinjam++;
$newid = "P".sprintf("%04s",$no_urut);

$cari = mysql_query ("SELECT * FROM pasien WHERE no_pasien = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="P".sprintf("%04s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="kd_user" value="<?php echo $newid2 ?>" readonly required /></td></tr>
<tr><td>Username</td><td>:<input type="text" name="username" placeholder="Username" required /></td></tr>
<tr><td>Password</td><td>:<input type="password" name="password" placeholder="Password" required /></td></tr>
<tr><td colspan="2">&nbsp;</td></tr>
<tr><td>KD PASIEN</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(no_pasien)FROM pasien";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM pasien");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,2,3);
$no_pinjam++;
$newid = "P".sprintf("%04s",$no_urut);

$cari = mysql_query ("SELECT * FROM pasien WHERE no_pasien = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="P".sprintf("%04s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="no_pasien" value="<?php echo $newid2 ?>" readonly required /></td></tr>
<tr><td>Nama</td><td>:<input type="text" name="nm_pasien" placeholder="Nama Pasien" required /></td></tr>
<tr><td>Jenis Kelamin</td><td>		: <select name="j_kel">
<option>--pilih--</option>
<option value="Laki-Laki">Laki-Laki</option>
<option value="Perempuan">Perempuan</option>
</select></td></tr>
<tr><td>Agama</td><td>		: <select name="agama">
<option>--Pilih--</option>
<option value="islam">Islam</option>
<option value="kristen">Kristen</option>
<option value="hindu">Hindu</option>
<option value="budha">Budha</option>
<option value="katholik">Katholik</option>
</select>
</td></tr>
<tr><td>Alamat</td><td>:<input type="text" name="alamat" placeholder="Alamat" required /></td></tr>
<tr><td>Tgl Lahir</td><td> 		: 
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

<tr><td>Usia</td><td>:<input type="text" name="usia" placeholder="Usia" required /></td></tr>
<tr><td>No Telp</td><td>:<input type="text" name="no_telp" placeholder="No Telp" required /></td></tr>
<tr><td>Nama KK</td><td>:<input type="text" name="nm_kk" placeholder="Nama Kepala Keluarga" required /></td></tr>
<tr><td>Hubungan Kel</td><td>		: <select name="hub_kel">
<option>--pilih--</option>
<option value="Anak Kandung">Anak Kandung</option>
<option value="Saudara">Saudara</option>
<option value="Lainnya">Lainnya</option>
</select></td></tr>

<tr><td colspan="2"><input class="submit" type="submit" value="SIMPAN" />
		<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>
</form>



