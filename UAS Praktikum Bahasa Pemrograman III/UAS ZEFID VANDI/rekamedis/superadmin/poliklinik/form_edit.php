<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>POLIKLINIK</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<?php
include "../../connect.php";
$edit = mysql_query("select * from poliklinik
			 where kd_poli ='$_GET[kd_poli]'");
$row=mysql_fetch_array($edit);	
?>		 
<h1>EDIT POLIKLINIK</h1>
<form method="post" action="edit_poliklinik.php">
<input type="hidden" name="kd_poli" value="<?php $row['kd_poli'] ?>">
<table>
<tr><td>Kd Poli</td><td>:<input type="text" name="kd_poli" value="<?php echo $row['kd_poli'] ?>" readonly /></td></tr>
<tr><td>Nama Poliklinik</td><td>:<input type="text" name="nm_poli" value=" <?php echo $row['nm_poli'] ?>"></td></tr>
<tr><td>Lantai</td><td>:<input type="text" name="lantai" value="<?php echo $row['lantai'] ?>" /></td></tr>
<tr><td colspan=2><input class="submit" type="submit" value="UPDATE">
<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table> </form>


</body>
