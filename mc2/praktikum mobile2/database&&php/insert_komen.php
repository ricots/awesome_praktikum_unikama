<?php 

		if($_SERVER['REQUEST_METHOD']=='POST'){
			
			$komentar = $_POST['komentar'];
			$id_status = $_POST['id_status'];

			if ($komentar =="" ) {
				echo "Lengkapi form anda";
			}
			else{
				require_once('koneksi.php');


				$sqlcek = "UPDATE tb_status SET komentar='$komentar' WHERE id_status='$id_status'";

				$cek = mysqli_fetch_array(mysqli_query($koneksine, $sqlcek));

				mysqli_close($koneksine);
                                echo "berhasil";


                       }
                 }
		else {
			echo "gagal mengmabil data";
		}
		
?>		