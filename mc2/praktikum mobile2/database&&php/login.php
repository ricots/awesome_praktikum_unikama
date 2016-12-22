<?php 
               

		if($_SERVER['REQUEST_METHOD']=='POST'){
			
			$Nama  	  = $_POST['Nama'];
			$Password = $_POST['Password'];


			if ($Nama == "" || $Password =="" ) {
				echo "Lengkapi form anda";
			}
			else{
				require_once('koneksi.php');

				$sql 		= "SELECT * FROM admin where Nama = '$Nama' AND Password='$Password'";
				$data		= mysqli_fetch_array(mysqli_query($koneksine, $sql));
				$validadmin     = mysqli_num_rows(mysqli_query($koneksine, $sql));
					
					if ($validadmin == 1) {
							
							if ($sql) {
								echo "Anda Berhasil Login";
							}
				   
							      }
					else {

					echo "Data Anda Salah";
					     }
						
                               }
                          mysqli_close($koneksine);
                       }
                 
		else {
			echo "gagal mengmabil data";
		}

				
                       
                 
		
		
?>