<?php 
	include_once('../helper/config.php');

	$faculty	= mysql_real_escape_string($_POST['nama_fak']);

	$query	= mysql_query("INSERT INTO fakultas VALUES('', '$faculty')");

	if ($query) {
		header('location:fakultas.php?msg=success');
	} else {
		header('location:fakultas.php?msg=failed');
	}
 ?>