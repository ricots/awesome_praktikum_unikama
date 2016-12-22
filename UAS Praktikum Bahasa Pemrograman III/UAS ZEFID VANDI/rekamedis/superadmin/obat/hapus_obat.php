<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM obat WHERE kd_obat = '$_GET[kd_obat]'";
mysql_query($delete);
header("location:form_obat.php");
	

?>