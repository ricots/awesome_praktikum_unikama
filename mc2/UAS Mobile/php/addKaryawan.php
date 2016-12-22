<?php
	include 'dbConnect.php';
	if(isset($_POST['image'])){
		$now=DateTime::createFromFormat('U.u', microtime(true));
		$id=$now->format('YmdHisu');
		
		$upload_folder="image";
		$path="$upload_folder/$id.jpg";
		$url="http://uasmobile.pe.hu/";
		
		$nama_karyawan=$_POST['nama_karyawan'];
		$id_jabatan=$_POST['id_jabatan'];
		$jenis_kelamin=$_POST['jenis_kelamin'];
		$usia=$_POST['usia'];
		$alamat=$_POST['alamat'];
		$image=$_POST['image'];
		$lembur=0;
		
		if(file_put_contents($path, base64_decode($image))!=false){
			echo "Upload success";
			$query="INSERT INTO tb_karyawan VALUES('','$nama_karyawan','$id_jabatan','$jenis_kelamin','$usia','$alamat','$url$path','$lembur')";
			$result=$con->query($query);
			if($result){
				echo "Insert success";
			}else{
				echo "Insert failed";
			}
			exit;
		}else{
			echo "Upload failed";
			exit;
		}
		
	}else{
		echo "image error";
		exit;
	}
?>