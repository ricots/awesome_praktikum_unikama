<?php
session_start();
include "../../connect.php";
mysql_query("INSERT INTO laboratorium(kd_lab,no_RM,hasil_lab,ket)VALUES
							('$_POST[kd_lab]',
							 '$_POST[no_RM]',
							 '$_POST[hasil_lab]',
							 '$_POST[ket]')");
header('location:form_laboratorium.php');							 
?>