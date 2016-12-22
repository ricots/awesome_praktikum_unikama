<?php
    include_once('dbConnect.php');
  $sql="select * from tb_karyawan";
$res=mysqli_query($con, $sql);

$number_of_rows=mysqli_num_rows($res);
$temp_array=array();

if($number_of_rows>0){
	while($row=mysqli_fetch_assoc($res)){
		$temp_array[]=$row;
	}
}

echo json_encode(array("Karyawan"=>$temp_array));

?>