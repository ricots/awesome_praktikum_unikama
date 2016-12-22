<?php  

define('HOST', 'mysql.idhostinger.com');
define('USER', 'u856353322_uas05');
define('PASSWORD', 'mobile005');
define('DB', 'u856353322_mobil');


$koneksine =mysqli_connect(HOST,USER,PASSWORD,DB) or die(mysqli_error());

?>