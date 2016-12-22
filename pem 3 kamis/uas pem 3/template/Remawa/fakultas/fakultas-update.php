<?php 
	include_once('../helper/config.php');

	$id_fakultas	= $_POST['id_fak'];
	$faculty		= $_POST['nama_fak'];

	$query	= mysql_query("UPDATE fakultas SET nama_fak='$faculty' WHERE id_fak='$id_fakultas'") or die(mysql_error());

	if ($query) {
		header('location:fakultas.php?msg=success');
	} else {
		header('location:fakultas.php?msg=failed');
	}
 ?>