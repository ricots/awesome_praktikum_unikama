<?php 
 if($_SERVER['REQUEST_METHOD']=='POST'){
 
 //Getting values
 $ikistatus = $_POST['ikistatus'];

 
 //Creating an sql query
 $sql = "INSERT INTO status (ikistatus) VALUES ('$ikistatus')";
 
 //Importing our db connection script
 require_once('dbConnect.php');
 
 //Executing query to database
 if(mysqli_query($con,$sql)){
 echo 'Status Terupdate';
 }else{
 echo 'Status tidak dapat diunggah';
 }
 
 //Closing the database 
 mysqli_close($con);
 }
 ?>