<?php 
	include_once('../helper/config.php');

	$nama_ormawa	= mysql_real_escape_string($_POST['nama_ormawa']);

	$query	= mysql_query("INSERT INTO ormawa VALUES('', '$nama_ormawa')");

	if ($query) {
		header('location:ormawa.php?msg=success');
	} else {
		header('location:ormawa.php?msg=failed');
	}
 ?>