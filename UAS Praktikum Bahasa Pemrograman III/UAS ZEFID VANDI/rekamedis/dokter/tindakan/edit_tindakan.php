<?php
session_start();
include "../../connect.php";
mysql_query("UPDATE tindakan set
			 kd_tindakan	='$_POST[kd_tindakan]',
			 nm_tindakan	='$_POST[nm_tindakan]',
			 ket			='$_POST[ket]'
			 where kd_tindakan = '$_POST[kd_tindakan]'");
header("location:form_tindakan.php");			 
?>
