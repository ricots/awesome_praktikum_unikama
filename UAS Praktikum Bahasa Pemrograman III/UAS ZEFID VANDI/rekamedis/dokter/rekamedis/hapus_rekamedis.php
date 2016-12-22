<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM rekamedis WHERE no_RM = '$_GET[no_RM]'";
mysql_query($delete);
header("location:form_rekamedis.php");
	

?>