<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>TINDAKAN</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu_dokter.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<?php
include "../../connect.php";
$edit = mysql_query("select * from tindakan
			 where kd_tindakan ='$_GET[kd_tindakan]'");
$row=mysql_fetch_array($edit);	
?>		 
<h1>EDIT TINDAKAN</h1>
<form method="post" action="edit_tindakan.php">
<input type="hidden" name="kd_tindakan" value="<?php $row['kd_tindakan'] ?>">
<table>
<tr><td>Kd Tindakan</td><td>:<input type="text" name="kd_tindakan" value="<?php echo $row['kd_tindakan'] ?>" readonly /></td></tr>
<tr><td>Nama Tindakan</td><td>:<input type="text" name="nm_tindakan" value=" <?php echo $row['nm_tindakan'] ?>"></td></tr>
<tr><td>Ket</td><td>:<input type="text" name="ket" value="<?php echo $row['ket'] ?>" /></td></tr>
<tr><td colspan=2><input class="submit" type="submit" value="UPDATE">
<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table> </form>


</body>
