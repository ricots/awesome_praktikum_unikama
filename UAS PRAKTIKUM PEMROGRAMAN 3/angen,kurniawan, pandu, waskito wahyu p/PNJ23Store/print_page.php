<html>
<head>
	<title>IKA WATCH</title>
	<script type="text/javascript">window.print()</script>
	<link href="css/style.css" rel="stylesheet">
</head>
<body>
<?php
session_start(); 
include 'config/function.php';
// instance objek db
$db = new database();

// koneksi ke MySQL via method
$db->connectMySQL();
$id=$_GET['id_trans'];
$query = mysql_query("select * from trans where id_trans='$id' and username = '".$_SESSION['username']."'");
?>
<center>
<table class="table" style="width:75%; margin-top:2%;" border="1px">
	<tr>
		<th colspan=6><img src="images/logo.png" style="width:30%;"></th>
	</tr>
	<tr>
		<th>No</th>
		<th align="left">Product Name</th>
		<th align="left">Code Product</th>
		<th align="center">Total Purchase</th>
		<th>Price</th>
		<th>Total Price</th>
	</tr>
	<?php
		$no=1;
		while($tampil=mysql_fetch_array($query)){
		?>	<tr>
				<td><?php echo $no;?></td>
				<td><?php echo $tampil['name_product'];?></td>
				<td><?php echo $tampil['kode_brg'];?></td>
				<td align="center"><?php echo $tampil['total_purchase'];?></td>
				<td align="right">Rp <?php echo $db->rupiah($tampil['rate_product'], 2);?></td>
				<td align="right">Rp <?php echo $db->rupiah($tampil['total_rate'], 2);?></td>
			</tr>
		<?php
		$no=$no+1;
		}
		$totall=mysql_fetch_array(mysql_query("select sum(total_rate) from trans where username='".$_SESSION['username']."'"))or die(mysql_error());
		$total = $totall['0'];
	?>
	<tr>
		<td colspan=4></td>
		<td align="right">Total : </td>
		<td align="right">Rp <?php echo $db->rupiah($total, 2);?></td>
	</tr>
	<tr>
		<th colspan=6>Copyright by Ika Watch Store</th>
	</tr>
</table>
</center>
</body>
</html>