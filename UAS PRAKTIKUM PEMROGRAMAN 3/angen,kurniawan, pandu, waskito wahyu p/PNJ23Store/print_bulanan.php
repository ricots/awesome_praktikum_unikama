<html>
<head>
	<title>IKA WATCH</title>
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
$date = date('d F Y');
$month = $_GET['month'];
$year = $_GET['year'];
$query = mysql_query("select distinct(date),sum(total_purchase) as total_purchase,sum(total_rate) as total_rate from trans where status='Success' and date like '%$month%' and date like '%$year%'");
?>
<table class="table" style="width:1000px;">
	<tr>
		<td colspan=6><h2 style="margin:0px;left:0;">Monthly Report</h2></td>
	</tr>
	<tr>
		
	</tr>
	<tr>
		<td colspan=2><h3>IKA WATCH</h3></td>
		<td align="center"><p style="margin-left:5%;"><?php echo $date;?></p></td>
	</tr>
	<tr>
		<th>Date</th>
		<th>Total Purchase</th>
		<th>Total Payment</th>
	</tr>
	<?php 
	while($tampil=mysql_fetch_array($query)){
		?>
		<tr>
			<td align="center"><?php echo $tampil['date'];?></td>
			<td align="center"><?php echo $tampil['total_purchase'];?></td>
			<td align="right">Rp. <?php echo $tampil['total_rate'];?></td>
		</tr>
		<?php
	}
	?>
	<tr>
		<td colspan=99 align="center">
			Copyright by Companny Profile 2015
		</td>
	</tr>
</table>
</body>
</html>