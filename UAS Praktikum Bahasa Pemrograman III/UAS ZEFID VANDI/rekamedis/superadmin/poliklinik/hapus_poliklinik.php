<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM poliklinik WHERE kd_poli = '$_GET[kd_poli]'";
mysql_query($delete);
header("location:form_poliklinik.php");
	

?>