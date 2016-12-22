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
<?php
include "../../connect.php";
$edit= mysql_query("SELECT * FROM pasien
					WHERE no_pasien='$_GET[no_pasien]'");
$row=mysql_fetch_array($edit);
?>
<h2> EDIT DATA PASIEN </h2>
<form method="post" action="edit_pasien.php">
<input type="hidden" name="no_pasien" value="<?php echo $row[no_pasien] ?>">
<table>
<tr><td> KD PASIEN</td>
<td> : <b><?php echo $row[no_pasien] ?></b></td></tr>
<tr><td>Nama</td><td>:<input type="text" name="nm_pasien" value="<?php echo $row[nm_pasien] ?>" /></td></tr>
<tr><td>Jenis Kelamin</td><td>:<select name="j_kel">
<option>--Pilih--</option>
<?php 
if($row[j_kel]=='Laki-Laki'){
	echo"<option value=Laki-Laki selected>Laki-Laki</option>";
	}
else{ echo"<option value=Laki-Laki>Laki-Laki</option>";
}
if($row[j_kel]=='Perempuan'){
	echo"<option value=Perempuan selected>Perempuan</option>";
}
else{ echo"<option value=Perempuan>Perempuan</option>";
}
?>


</select>
</td></tr>
<tr><td>Agama</td><td>:<select name="agama">
<option>--Pilih--</option>
<?php
if($row[agama]=='islam'){
	echo"<option value=islam selected>Islam</option>";
}
else{
	echo"<option value=islam>Islam</option>";	
}
if($row[agama]=='kristen'){
	echo"<option value=kristen selected>Kristen</option>";
}
else{
	echo"<option value=kristen>Kristen</option>";	
}
if($row[agama]=='katolik'){
	echo"<option value=katolik selected>katolik</option>";
}
else{
	echo"<option value=katolik>katolik</option>";	
}
if($row[agama]=='budha'){
	echo"<option value=budha selected>budha</option>";
}
else{
	echo"<option value=budha>budha</option>";	
}
?>
</select>
</td></tr>
<tr><td>Alamat</td><td>:<input type="text" name="alamat" value="<?php echo $row[alamat] ?>" /></td></tr>
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
<tr><td>Usia</td><td>:<input type="text" name="usia" value="<?php echo $row[usia] ?>" /></td></tr>
<tr><td>No Telp</td><td>:<input type="text" name="no_telp" value="<?php echo $row[no_telp] ?>" /></td></tr>
<tr><td>Nama KK</td><td>:<input type="text" name="nm_kk" value="<?php echo $row[nm_kk] ?>" /></td></tr>
<tr><td>Hubungan Kel</td><td>:<input type="text" name="hub_kel" value="<?php echo $row[hub_kel] ?>" /></td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="EDIT" />
<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>

</body>