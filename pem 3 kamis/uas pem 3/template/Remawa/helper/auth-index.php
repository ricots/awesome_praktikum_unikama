<?php 
	include('config.php');

	session_start();

	//Terima data dari form login login
	$NIM		= $_POST['NIM'];
	$password	= $_POST['password'];
	//$password	= md5($password);

	//Untuk mencegah sql injection
	$NIM		= mysql_real_escape_string($NIM);
	$password	= mysql_real_escape_string($password);

	//cek data yang dikirim. apakah kosong ataukah tidak
	if (empty($NIM) && empty($password)) {
		header('location:../login.php?error=1');
		break;
	} elseif (empty($NIM)) {
		header('location:../login.php?error=2');
		break;
	} elseif (empty($password)) {
		header('location:../login.php?error=3');
		break;
	}

	$query	= mysql_query("SELECT * from mahasiswa where NIM='$NIM' and password='$password'");
	
	$num 	= mysql_num_rows($query);

	if ($num > 0) {
		//Apabila nim dan password benar
		$_SESSION['NIM']		= $NIM;
		$_SESSION['password']	= $password;
		?>
		<script type="text/javascript">;
		document.location = '../index.php'
		</script>
		<?php 
			} else{
				header('location:../login.php?error=4');
			}
	
 ?>