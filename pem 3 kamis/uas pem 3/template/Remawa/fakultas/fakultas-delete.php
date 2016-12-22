<?php 
	include_once('../helper/config.php');

	$id_fakultas		= $_GET['id_fak'];

	$query	= mysql_query("DELETE FROM fakultas WHERE id_fak='$id_fakultas'") or die(mysql_error());

	if ($query) {
		header('location:fakultas.php?msg=success');
	} else {
		header('location:prodi.php?msg=failed');
	}
 ?>