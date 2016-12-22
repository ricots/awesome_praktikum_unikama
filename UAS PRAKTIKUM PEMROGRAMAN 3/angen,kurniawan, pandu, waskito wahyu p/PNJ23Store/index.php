<!DOCTYPE>
<html>
<?php 
error_reporting(0);
session_start(); 
include 'config/function.php';
// instance objek db
$db = new database();

// koneksi ke MySQL via method
$db->connectMySQL();
?>
<head><title>Store</title>
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="header">
<?php
	$image = mysql_query("select * from style");
	$imgheader = mysql_fetch_array($image);
	echo "<a href='index.php'><image style='height:60px; width:auto;' src='images/".$imgheader['logo']."'	/></a>";
if(isset($_SESSION['admin'])){
		$query = mysql_query("select name from accounts where username='".$_SESSION['admin']."' and level='admin'");
		$cek = mysql_num_rows($query);
		if($cek == 0) 
		{
			?><div class="alert alert-danger alert-dismissible" role="alert">Data Kosong</div><?php
		}
		else
		{
					while($row=mysql_fetch_array($query))
					{
						echo '	<a style="float:right;  margin-top:1.8%; margin-right:1%;">
									<button class="btn btn-primary" >'.$row[0].'</button>
								</a>';
					}
		}
	?>
</div>
<div class="sidebar-left">
	<p>General</p>
	<a href=".?i=inbox"><h3>Inbox</h3></a>
	<a href=".?i=history"><h3>History</h3></a>
	<p>Add</p>
	<a href=".?i=product_list"><h3>Product</h3></a>
	<a href=".?i=signup"><h3>Admin</h3></a>
	<p>Setting</p>
	<a href=".?i=about"><h3>Company Profile</h3></a>
	<a href=".?i=update_profile"><h3>Update Profile</h3></a>
	<a href=".?i=help"><h3>Help</h3></a>
	<a href=".?i=logout"><h3>Logout</h3></a>
</div><?php }
elseif(isset($_SESSION['username'])){?>
	<?php
		$hitung = mysql_num_rows(mysql_query("select * from trans where status='process' and username='".$_SESSION['username']."'"));
	
		$query = mysql_query("select name from accounts where username='".$_SESSION['username']."' and level='user'");
		$cek = mysql_num_rows($query);
		if($cek == 0) 
		{
			?><div class="alert alert-danger alert-dismissible" role="alert">Data Kosong</div><?php
		}
		else
		{
					while($row=mysql_fetch_array($query))
					{
						echo '	
								<a style="float:right;  margin-top:1.8%; margin-right:1%;">
									<button class="btn btn-primary" >'.$row[0].'</button>
								</a>
								<a href=".?i=chart" style="float:right;  margin-top:1.8%; margin-right:2%;"><button class="btn btn-primary" >Cart : '.$hitung.'</button></a>';
					}
					
		}
	?>
</div>
<div class="sidebar-left">
	<a href=".?i=home&id=1"><h3>Home</h3></a>
	<a href=".?i=history"><h3>History</h3></a>
	<a href=".?i=chart"><h3>Transfer Receipt</h3></a>
	<a href=".?i=update_profile"><h3>Profile</h3></a>
	<a href=".?i=about"><h3>Information</h3></a>
	<a href=".?i=logout"><h3>Logout</h3></a>
</div><?php }
else{ ?>
	<a href=".?i=signup" style="float:right;  margin-top:1.8%; margin-right:1%;"><button class="btn btn-primary" >Sign Up</button></a>
	<a href=".?i=login" style="float:right;  margin-top:1.8%; margin-right:0%;"><button class="btn btn-primary" >Login</button></a>
</div>
<div class="sidebar-left">
	<a href=".?i=home&id=1"><h3>Home</h3></a>
	<a href=".?i=about"><h3>Information</h3></a>
</div>
<?php }
?>	

<div class="sidebar-right">
	<?php
	if(isset ($_GET['i'])){
		$page = $_GET['i'];
		include $page.".php";
	}
	else{
		header('location:.?i=home&id=1');
	}
	?>
</div>
</body>
</html>