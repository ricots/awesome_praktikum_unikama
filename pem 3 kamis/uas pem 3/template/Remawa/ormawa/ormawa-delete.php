<?php 
	include_once('../helper/config.php');

	$Id_orm		= $_GET['Id_orm'];

	$query	= mysql_query("DELETE FROM ormawa WHERE Id_orm='$Id_orm'") or die(mysql_error());

	if ($query) {
		header('location:ormawa.php?msg=success');
	} else {
		header('location:ormawa.php?msg=failed');
	}
 ?>