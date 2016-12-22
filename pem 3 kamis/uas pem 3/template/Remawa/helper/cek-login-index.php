<?php 
	session_start();

	$logged_in	= false;

	//Jika username belum dibuat atau kosong
	if (!isset($_SESSION['NIM']) || empty($_SESSION['NIM'])) {
		//Redirect ke halaman login
		header('location:login.php');
	} else {
		$logged_in	= true;
	}
 ?>