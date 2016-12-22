<h2>Inbox</h2>
<?php 
	if(isset($_GET['aksi_id'])){
		$id=$_GET['aksi_id'];
		$table="trans";
		$kondisi="where id_trans='$id'";
		$db->delete($table, $kondisi);
	}
	$query = mysql_query("select * from trans where status='Process' order by date DESC")or die (mysql_error());
	$cek = mysql_num_rows($query);
	if($cek == 0) 
	{
		?><div class="alert alert-danger alert-dismissible" role="alert">Empty Request</div><?php
	}
	else
	{
		echo"	<center>
					<table class='table' border='1px' style='width:95%;margin-top:4%;'>
						<tr>
							<th>Date</th>
							<th>Email</th>
							<th>Code Product</th>
							<th>Transfer</th>
							<th colspan=3>Menu</th>
						</tr>";
		while($row=mysql_fetch_array($query)){
			?>	<tr>
					<td><?php echo $row['date'];?></td>
					<td><?php echo $row['name'];?></td>
					<td><?php echo $row['kode_brg'];?></td>
					<td align="center"><img src="images/buktitrans/<?php echo $row['transfer'];?>" style="width:100px; height:auto;"/></td>
					<td align='center'>
						<a href='.?i=open_inbox&id_pro=<?php echo $row[0];?>'>
							<button class='btn btn-primary' align='center'><?php echo $row[9];?></button>
						</a>
						<a href='.?i=inbox&aksi_id=<?php echo $row[0];?>' onclick="return confirm('Apakah anda yakin akan menghapus data ini?')">
							<button class='btn btn-primary' align='center'>Delete</button>
						</a>
					</td>
				</tr><?php
		}
		echo"		</table>
				</center>";
	}
?>