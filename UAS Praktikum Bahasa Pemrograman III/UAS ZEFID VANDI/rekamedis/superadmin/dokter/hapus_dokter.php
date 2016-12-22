<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM dokter WHERE kd_dokter = '$_GET[kd_dokter]'";
$w=mysql_query($delete);
if($w==1){
mysql_query("DELETE FROM login WHERE kd_user = '$_GET[kd_dokter]'");
}
header("location:form_dokter.php");
	

?>