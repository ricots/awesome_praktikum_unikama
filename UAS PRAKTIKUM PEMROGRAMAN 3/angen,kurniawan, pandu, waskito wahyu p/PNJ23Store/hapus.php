<?php 
if (isset($_POST['ok'])) {
	
	$id = $_GET['id'];
	
	$delete = mysql_query("DELETE FROM item WHERE id_item` ='$id'");
	echo '<div class="alert alert-success alert-dismissible" role="alert"><strong>Success!!!</strong></div>';
	header("location: .?i=product_list");
}

?>