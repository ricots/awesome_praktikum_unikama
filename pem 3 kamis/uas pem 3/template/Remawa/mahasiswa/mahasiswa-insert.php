<?php 
	include_once('../helper/config.php');

	$NIM			= mysql_real_escape_string($_POST['NIM']);
	$password		= mysql_real_escape_string($_POST['password']);


	$query	= mysql_query("INSERT INTO mahasiswa VALUES('', '$NIM','password')");

	if ($query) {
		header('location:mahasiswa.php?msg=success');
	} else {
		header('location:mahasiswa.php?msg=failed');
	}
 ?>