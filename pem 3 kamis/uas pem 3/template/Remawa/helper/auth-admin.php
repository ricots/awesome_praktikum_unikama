<?php 
	include('../helper/config.php');

	session_start();

	$username	= $_POST['username'];
	$password	= $_POST['password'];
	//$password	= md5($password);

	$username	= mysql_real_escape_string($username);
	$password	= mysql_real_escape_string($password);

	if (empty($username) && empty($password)) {
		header('location:../admin.php?error=1');
		break;
	} elseif (empty($username)) {
		header('location:../admin.php?error=2');
		break;
	} elseif (empty($password)) {
		header('location:../admin.php?error=3');
		break;
	} 

	$query	= mysql_query("SELECT * FROM admin WHERE username='$username' AND password='$password'");
	$data	= mysql_fetch_array($query);

	if(mysql_num_rows($query) == 1) {
		$_SESSION['username'] = $data['username'];
		$_SESSION['role'] = $data['role'];

		if ($data['role'] == 'admin') {
			header('location:../dashboard-admin.php');		
		}elseif ($data['role'] == 'mahasiswa') {
			header('location:../admin.php?error=5');
		}
	}else{
		header('location:../admin.php?error=4');
	}
 ?>