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
<?php
include "../../connect.php";
$edit= mysql_query("SELECT * FROM dokter
					WHERE kd_dokter='$_GET[kd_dokter]'");
$row=mysql_fetch_array($edit);
echo "<h2> EDIT DATA DOKTER </h2>
<form method=POST action=edit_dokter.php>
<input type=hidden name=kd_dokter value='$row[kd_dokter]'>
<table>
<tr><td> KD DOKTER</td>
<td> : <b>$row[kd_dokter]</b></td></tr>";
?>
<tr><td>KD POLI</td><td>		: <select name="kd_poli">
<option>--pilih--</option>
<?php
include"../../connect.php";
$tampil = mysql_query("SELECT * FROM poliklinik ORDER BY kd_poli ASC");
while($data = mysql_fetch_array($tampil)){
if($row['kd_poli']==$data['kd_poli']){
echo"<option value=$data[kd_poli] selected>$data[nm_poli]</option>";	
}
else{
echo"<option value=$data[kd_poli]>$data[nm_poli]</option>";
}
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
<?php
echo"<tr><td> KD User </td>
<td class=perintah> : <input type=text name=kd_user value='$row[kd_user]' readonly>* Tidak Bisa Diubah</td></tr>
<tr><td> Nama </td>
<td> : <input type=text name=nm_dokter value='$row[nm_dokter]'></td></tr>
<tr><td> SIP </td>
<td> : <input type=text name=SIP value='$row[SIP]'></td></tr>
<tr><td> Tempat Lahir </td>
<td> : <input type=text name=tmp_lahir value='$row[tmp_lahir]'></td></tr>
<tr><td> No Telp </td>
<td> : <input type=text name=no_telp value=$row[no_telp]></td></tr>
<tr><td> Alamat </td>
<td> : <input type=text name=alamat value=$row[alamat]></td></tr>
<tr><td colspan=2><input class=submit type=submit value=UPDATE>
<input class=submit type=button value=BATAL onclick=self.history.back()></td></tr>
</table> </form>";
?>

</body>