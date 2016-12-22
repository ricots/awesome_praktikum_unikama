<?php
session_start();
include "../../connect.php";
mysql_query("INSERT INTO obat(kd_obat,nm_obat,jml_obat,ukuran,harga)VALUES
							('$_POST[kd_obat]',
							 '$_POST[nm_obat]',
							 '$_POST[jml_obat]',
							 '$_POST[ukuran]',
							 '$_POST[harga]')");
header('location:form_obat.php');							 
?>