<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM laboratorium WHERE kd_lab = '$_GET[kd_lab]'";
mysql_query($delete);
header("location:form_laboratorium.php");
	

?>