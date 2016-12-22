<?php 
	include_once('../helper/config.php');

	$NIM				= $_POST['NIM'];
	$password_baru		= $_POST['password'];
	$konfirmasi_password		= $_POST['konfirmasi_password'];

	if ($password_baru == $konfirmasi_password) {
		$query	= mysql_query("UPDATE mahasiswa SET password='$password_baru'
							WHERE NIM='$NIM'");
	}

	if ($query) {
			header('location:mahasiswa.php?msg=success');
		} else {
			header('location:mahasiswa.php?msg=failed');
		}

	
 ?>