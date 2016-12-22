<?php
session_start();
include"../../connect.php";
$delete="DELETE FROM pasien WHERE no_pasien = '$_GET[no_pasien]'";
$w=mysql_query($delete);
if($w==1){
mysql_query("DELETE FROM login WHERE kd_user = '$_GET[no_pasien]'");
}
header("location:form_pasien.php");
	

?>