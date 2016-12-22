<?php 
	include_once('../helper/config.php');

	$id_prodi		= $_GET['id_prd'];

	$query	= mysql_query("DELETE FROM prodi WHERE id_prd='$id_prodi'") or die(mysql_error());

	if ($query) {
		header('location:prodi.php?msg=success');
	} else {
		header('location:prodi.php?msg=failed');
	}
 ?>