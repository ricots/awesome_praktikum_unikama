<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>LABORATORIUM</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<?php
include "../../connect.php";
$edit = mysql_query("select * from laboratorium
			 where kd_lab ='$_GET[kd_lab]'");
$row=mysql_fetch_array($edit);	
?>		 
<h1>EDIT LABORATORIUM</h1>
<form method="post" action="edit_laboratorium.php">
<input type="hidden" name="kd_lab" value="<?php $row['kd_lab'] ?>">
<table>
<tr><td>Kd Lab</td><td>:<input type="text" name="kd_lab" value="<?php echo $row['kd_lab'] ?>" readonly /></td></tr>
<tr><td>No RM</td><td>:<select name="no_RM">
<option>--Pilih--</option>
<?php
include "../../connect.php";
$tampil=mysql_query("SELECT * FROM rekamedis ORDER BY no_RM ASC");
while($data=mysql_fetch_array($tampil)){
if($row[no_RM]==$data[no_RM]){
	echo "<option value=$data[no_RM] selected>$data[no_RM]";	
}
else{
	echo "<option value=$data[no_RM]>$data[no_RM]";	
}
}
?>
</select>
</td></tr>
<tr><td>Hasil Lab</td><td>:<input type="text" name="hasil_lab" value="<?php echo $row['hasil_lab'] ?>" /></td></tr>
<tr><td>Ket</td><td>:<input type="text" name="ket" value="<?php echo $row['ket'] ?>" /></td></tr>
<tr><td colspan=2><input class="submit" type="submit" value="UPDATE">
<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table> </form>


</body>
