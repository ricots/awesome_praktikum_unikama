<?php
session_start();
include "../../connect.php";
mysql_query("UPDATE obat set
			 kd_obat	='$_POST[kd_obat]',
			 nm_obat	='$_POST[nm_obat]',
			 jml_obat	='$_POST[jml_obat]',
			 ukuran	='$_POST[ukuran]',
			 harga		='$_POST[harga]'
			 where kd_obat = '$_POST[kd_obat]'");
header("location:form_obat.php");			 
?>
