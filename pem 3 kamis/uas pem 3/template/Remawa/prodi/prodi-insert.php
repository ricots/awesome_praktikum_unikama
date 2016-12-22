<?php 
	include_once('../helper/config.php');

	$prodi			= mysql_real_escape_string($_POST['nama_prodi']);
	$id_fakultas	= mysql_real_escape_string($_POST['id_fak']);


	$query	= mysql_query("INSERT INTO prodi VALUES('', '$prodi','$id_fakultas')");

	if ($query) {
		header('location:prodi.php?msg=success');
	} else {
		header('location:prodi.php?msg=failed');
	}
 ?>