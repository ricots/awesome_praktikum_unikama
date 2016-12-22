<?php 

		if($_SERVER['REQUEST_METHOD']=='POST'){
			
			$id_status = $_POST['id_status'];

			if ($id_status == "" ) {
				echo "Lengkapi form anda";
			}
			else{
				require_once('koneksi.php');


				$sqlcek = "DELETE FROM tb_status WHERE id_status='$id_status'";

				$cek = mysqli_fetch_array(mysqli_query($koneksine, $sqlcek));

				mysqli_close($koneksine);
                       }
                 }
		else {
			echo "gagal mengmabil data";
		}
		
?>