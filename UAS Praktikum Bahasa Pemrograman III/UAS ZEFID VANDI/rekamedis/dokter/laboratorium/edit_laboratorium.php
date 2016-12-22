<?php
session_start();
include "../../connect.php";
mysql_query("UPDATE laboratorium set
			 kd_lab	='$_POST[kd_lab]',
			 no_RM	='$_POST[no_RM]',
			 hasil_lab	='$_POST[hasil_lab]',
			 ket	='$_POST[ket]'
			 where kd_lab = '$_POST[kd_lab]'");
header("location:form_laboratorium.php");			 
?>
