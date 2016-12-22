<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>obat</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<?php
include "../../connect.php";
$edit = mysql_query("select * from obat
			 where kd_obat ='$_GET[kd_obat]'");
$row=mysql_fetch_array($edit);	
?>		 
<h1>EDIT OBAT</h1>
<form method="post" action="edit_obat.php">
<input type="hidden" name="kd_obat" value="<?php $row['kd_obat'] ?>">
<table>
<tr><td>Kd Obat</td><td>:<input type="text" name="kd_obat" value="<?php echo $row['kd_obat'] ?>" readonly /></td></tr>
<tr><td>Nama obat</td><td>:<input type="text" name="nm_obat" value=" <?php echo $row['nm_obat'] ?>"></td></tr>
<tr><td>Jumlah</td><td>:<input type="text" name="jml_obat" value="<?php echo $row['jml_obat'] ?>" /></td></tr>
<tr><td>Ukuran</td><td>:<select name="ukuran">
<option>--Pilih--</option>
<?php
if($row[ukuran]=='Kecil'){
	echo"<option value=Kecil selected>Kecil</option>";
}
else{
	echo"<option value=Kecil>Kecil</option>";	
}
if($row[ukuran]=='Sedang'){
	echo"<option value=Sedang selected>Sedang</option>";
}
else{
	echo"<option value=Sedang>Sedang</option>";	
}
if($row[ukuran]=='Besar'){
	echo"<option value=Besar selected>Besar</option>";
}
else{
	echo"<option value=Besar>Besar</option>";	
}
?>
</select>
</td></tr>
<tr><td>Harga</td><td>:<input type="text" name="harga" value="<?php echo $row['harga'] ?>" /></td></tr>
<tr><td colspan=2><input class="submit" type="submit" value="UPDATE">
<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table> </form>


</body>
