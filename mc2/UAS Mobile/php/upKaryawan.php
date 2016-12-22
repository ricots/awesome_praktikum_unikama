<?php
	include 'dbConnect.php';
	$id_karyawan=$_POST['id_karyawan'];
		$nama_karyawan=$_POST['nama_karyawan'];
		$id_jabatan=$_POST['id_jabatan'];
		$jenis_kelamin=$_POST['jenis_kelamin'];
		$usia=$_POST['usia'];
		$alamat=$_POST['alamat'];
	if(isset($_POST['image'])){
		$now=DateTime::createFromFormat('U.u', microtime(true));
		$id=$now->format('YmdHisu');
		
		$upload_folder="image";
		$path="$upload_folder/$id.jpg";
		$url="http://uasmobile.pe.hu/";
		
		$image=$_POST['image'];
		$lembur=0;
		
		if(file_put_contents($path, base64_decode($image))!=false){
			echo "Upload success";
			$query="UPDATE tb_karyawan SET nama_karyawan='$nama_karyawan', id_jabatan='$id_jabatan', jenis_kelamin='$jenis_kelamin',
			usia='$usia', alamat_karyawan='$alamat', foto='$url$path' where id_karyawan='$id_karyawan'";
			$result=$con->query($query);
			if($result){
				echo "Update success";
			}else{
				echo "Update failed";
			}
			exit;
		}else{
			echo "Upload failed";
			exit;
		}
		
	}else if(isset($_POST['images'])){
		$query="UPDATE tb_karyawan SET nama_karyawan='$nama_karyawan', id_jabatan='$id_jabatan', jenis_kelamin='$jenis_kelamin',
			usia='$usia', alamat_karyawan='$alamat' where id_karyawan='$id_karyawan'";
			$result=$con->query($query);
			if($result){
				echo "Update success";
			}else{
				echo "Update failed";
			}
	}
?>