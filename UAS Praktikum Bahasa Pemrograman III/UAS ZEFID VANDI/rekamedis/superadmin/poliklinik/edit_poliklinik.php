<?php
session_start();
include "../../connect.php";
mysql_query("UPDATE poliklinik set
			 kd_poli	='$_POST[kd_poli]',
			 nm_poli	='$_POST[nm_poli]',
			 lantai		='$_POST[lantai]'
			 where kd_poli = '$_POST[kd_poli]'");
header("location:form_poliklinik.php");			 
?>
