<?php 
	//Melanjutkan session yang sudah dibuat sebelumnya
	session_start();

	//Hapus session yang sudah dibuat
	session_destroy();

	//redirect ke halaman login
	header('location:login.php');
 ?>