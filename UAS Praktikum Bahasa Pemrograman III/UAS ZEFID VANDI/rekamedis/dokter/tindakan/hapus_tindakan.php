<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM tindakan WHERE kd_tindakan = '$_GET[kd_tindakan]'";
mysql_query($delete);
header("location:form_tindakan.php");
	

?>