<?php
include 'dbConnect.php';
$username=$_POST['username'];
$password=$_POST['password'];

$sql="SELECT * FROM tb_admin where username='$username' and password='$password'";
$hasil=$con->query($sql);
$row=mysqli_fetch_array($hasil,MYSQLI_ASSOC);
if(mysqli_num_rows($hasil) == 1){
    echo "berhasil";
}else{
    echo "gagal";
}

?>