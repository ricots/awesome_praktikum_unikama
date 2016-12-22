<?php
    include_once('dbConnect.php');
	
	$query="SELECT * FROM tb_cari";
	$hasil=$con->query($query);
	$row=$hasil->fetch_assoc();
	$cariData=$row['cari1'];
	
	$sql="select * from tb_karyawan where nama_karyawan like '%$cariData%'";
	$res=$con->query($sql);

	$number_of_rows=mysqli_num_rows($res);
	$temp_array=array();

	if($number_of_rows>0){
		while($row=mysqli_fetch_assoc($res)){
			$temp_array[]=$row;
		}
	}

	echo json_encode(array("Karyawan"=>$temp_array));

?>