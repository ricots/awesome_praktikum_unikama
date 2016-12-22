<?php 
define('HOSTNAME', 'localhost');
define('USERNAME', 'root');
define('PASSWORD', '');
define('DB_SELECT', 'dream_computer');

$konek = new Mysqli(HOSTNAME,USERNAME,PASSWORD,DB_SELECT) or die(mysqli_errno());


 ?>