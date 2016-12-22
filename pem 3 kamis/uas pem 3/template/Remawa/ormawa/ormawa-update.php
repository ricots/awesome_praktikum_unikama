<?php 
	include_once('../helper/config.php');

	$Id_orm			= $_POST['Id_orm'];
	$nama_ormawa	= $_POST['nama_ormawa'];

	$query	= mysql_query("UPDATE ormawa SET nama_ormawa='$nama_ormawa' WHERE Id_orm='$Id_orm'") or die(mysql_error());

	if ($query) {
		header('location:ormawa.php?msg=success');
	} else {
		header('location:ormawa.php?msg=failed');
	}
 ?>