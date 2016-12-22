<?php 
 if($_SERVER['REQUEST_METHOD']=='POST'){
 
 //Getting values
 $username = $_POST['username'];
 $password = $_POST['password'];
 $address = $_POST['address'];
 $email = $_POST['email'];
 
 //Creating an sql query
 $sql = "INSERT INTO register (username,password,address,email) VALUES ('$username','$password','$address','$email')";
 
 //Importing our db connection script
 require_once('dbConnect.php');
 
 //Executing query to database
 if(mysqli_query($con,$sql)){
 echo 'Daftar Berhasil';
 }else{
 echo 'Tidak dapat Daftar';
 }
 
 //Closing the database 
 mysqli_close($con);
 }
 ?>