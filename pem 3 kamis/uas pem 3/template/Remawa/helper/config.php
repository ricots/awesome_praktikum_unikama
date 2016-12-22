<?php 
	$HOST 		= "localhost";
	$USER 		= "root";
	$PASS	 	= "";
	$DBHOST 	= "db_pdfor";

	$connect 	= mysql_connect($HOST, $USER, $PASS) or die(mysql_error());
	$dbSelect 	= mysql_select_db($DBHOST);
 ?>