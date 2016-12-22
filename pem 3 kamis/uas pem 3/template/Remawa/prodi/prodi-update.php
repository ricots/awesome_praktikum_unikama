<?php 
	include_once('../helper/config.php');

	$id_prd			= $_POST['id_prd'];
	$nama_prodi		= $_POST['nama_prodi'];

	$query	= mysql_query("UPDATE prodi SET nama_prodi='$nama_prodi' WHERE id_prd='$id_prd'") or die(mysql_error());

	if ($query) {
		header('location:prodi.php?msg=success');
	} else {
		header('location:prodi.php?msg=failed');
	}
 ?>