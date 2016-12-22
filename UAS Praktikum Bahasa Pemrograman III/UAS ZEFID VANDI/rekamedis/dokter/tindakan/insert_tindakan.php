<?php
session_start();
include "../../connect.php";
mysql_query("INSERT INTO tindakan(kd_tindakan,nm_tindakan,ket)VALUES
							('$_POST[kd_tindakan]',
							 '$_POST[nm_tindakan]',
							 '$_POST[ket]')");
header('location:form_tindakan.php');							 
?>