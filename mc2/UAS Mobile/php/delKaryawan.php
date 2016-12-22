<?php
	include 'dbConnect.php';
	$id=$_POST['id'];
	$query="DELETE FROM tb_karyawan WHERE id_karyawan='$id'";
	$result=$con->query($query);
	if($result){
		echo "Terhapus";
		}else{
			echo "Hapus Gagal";
			}
?>