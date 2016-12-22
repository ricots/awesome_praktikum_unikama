<h2>Order Pending</h2>
<?php

	if(isset($_GET['aksi_id'])){
		$id = $_GET['aksi_id'];
		$table="trans";
		$kondisi="where id_trans='$id'";
		$db->delete($table, $kondisi);
	}
$query = mysql_query("select * from trans where username = '".$_SESSION['username']."' and status='Process'");
?>
<table class="table" style="width:95%; margin-top:2%;" border="1px">
	<tr>
		<th>No</th>
		<th align="left">Product Name</th>
		<th align="left">Code Product</th>
		<th align="center">Total Purchase</th>
		<th>Price</th>
		<th>Total Price</th>
		<th>Menu</th>
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
				<td>
					<a href='.?i=update_trans&id_trans=<?php echo $tampil['id_trans'];?>'>
						<button class='btn btn-primary' align='center' data-toggle="dropdown">Edit</button>
					</a>
					<a href='.?i=chart&aksi_id=<?php echo $tampil['id_trans'];?>' onclick="return confirm('Apakah anda yakin akan menghapus data ini?')">
						<button class='btn btn-primary' align='center' data-toggle="dropdown">Delete</button>
					</a>
				</td>
			</tr>
		<?php
		$no=$no+1;
		}
		$totall=mysql_fetch_array(mysql_query("select sum(total_rate) from trans where status='process' and username='".$_SESSION['username']."'"))or die(mysql_error());
		$total = $totall['0'];
	?>
	<tr>
		<td colspan=4></td>
		<td align="right">Total : </td>
		<td align="right">Rp <?php echo $db->rupiah($total, 2);?></td>
	</tr>
</table>