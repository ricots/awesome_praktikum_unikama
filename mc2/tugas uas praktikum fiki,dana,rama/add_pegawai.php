?php
if($_SERVER['REQUEST_METHOD']=='POST'){
	$Nip = $_POST['Nip'];
	$Nama = $_POST['Nama'];
	$Jabatan = $_POST['Jabatan'];
	$phone = $_POST['phone'];
	
	require_once('dbconect.php');

	$sql ="SELECT pegawai FROM berita_praktikum ORDER BY pegawai ASC";
	
	$res = mysqli_query($con,$sql);

	$pegawai = 0;
	
	while($row = mysqli_fetch_array($res)){
		$pegawai = $row['pegawai'];
	}

	$path = "praktikum/$pegawai.png";
	$actualpath = hosting kita ;*/

	$sql = "INSERT INTO berita_praktikum (Nip,Nama,Jabatan,phone) VALUES ('$Nip','$detail','$actualpath')";

	if(mysqli_query)($con,$sql)){
		file_put_contents($path,base64,decode($gambar));
		echo "successfully"

	}
	
	mysqli_close($con);

     }else{

	   echo "error";
	}

?>