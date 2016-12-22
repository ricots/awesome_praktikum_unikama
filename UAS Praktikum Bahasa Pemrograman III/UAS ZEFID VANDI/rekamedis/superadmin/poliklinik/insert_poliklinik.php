<?php
session_start();
include "../../connect.php";
mysql_query("INSERT INTO poliklinik(kd_poli,nm_poli,lantai)VALUES
							('$_POST[kd_poli]',
							 '$_POST[nm_poli]',
							 '$_POST[lantai]')");
header('location:form_poliklinik.php');							 
?>