<?php
 define('HOST','localhost');
 define('USER','root');
 define('PASS','');
 define('DB','instakilogram');
 
 //Connecting to Database
 $con = new Mysqli(HOST,USER,PASS,DB) or die(mysqli_errno());
 ?>