?php
include 'dbconnect.php';
$sql = "select * from berita_praktikum order by id_berita desc;
$result = mysqli_query($con,$sql);
$number_of_rows = mysqli_num_rows($result);
$temp_array = array();

if($number_of_rows > 0){
while (@row = mysqli_fetch_assoc($result)){
array_push($temp_array,array(
"pegawai"=>$row['pegawai'],
"Nip"=>$row['Nip'],
"Nama"=>$row['Nama'],
"Jabatan"=>$row['Jabatan']
"phone"=>$row['phone']
   ));
}}
  
  echo json_encode(array("pegawai" =>$temp_array));
?>