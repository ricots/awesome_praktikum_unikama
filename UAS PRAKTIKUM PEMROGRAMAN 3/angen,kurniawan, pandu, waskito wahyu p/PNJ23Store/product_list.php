<h2>Product List</h2>
	<a href=".?i=insert_item"><button class='btn btn-primary' align='center' style="margin-right:0%;">Add Product</button></a>
	<a href=".?i=product_list"><button class='btn btn-primary' align='center' style="margin-right:0%; margin-left:0%;">Product List</button></a>
	<a href=".?i=home&id=1"><button class='btn btn-primary' align='center' style="margin-right:0%; margin-left:0%;">Product preview</button></a>
<?php
	$batas=10;
	$page=@$_GET['page'];
	if(empty($page)){
		$page=1;
	}
	$of=$batas*($page-1);
	if(isset($_GET['aksi_id'])){
		$id=$_GET['aksi_id'];
		$table="item";
		$kondisi="where id_item='$id'";
		$db->delete($table, $kondisi);
	}
	$query = mysql_query("select * from item order by id_item desc limit $of,$batas")or die (mysql_error());
	$cek = mysql_num_rows($query);
	if($cek == 0) 
	{
		?><div class="alert alert-danger alert-dismissible" role="alert">Data Kosong</div><?php
	}
	else
	{
		echo"	<center>
					<table class='table' border='1px' style='width:95%;margin-top:4%;'>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Code Product</th>
							<th>Price</th>
							<th>Stock</th>
							<th>Menu</th>
						</tr>";
			while($row=mysql_fetch_array($query)){
			?>	<tr>
					<td><?php echo $row[0];?></td>
					<td><?php echo $row[2];?></td>
					<td><?php echo $row[1];?></td>
					<td><?php echo "Rp ".$db->rupiah($row[3], 2);?></td>
					<td><?php echo $row[7];?> Unit</td>
					<td align='center'>
						<a href='.?i=update_item&aksi_id=<?php echo $row[0];?>'>
							<button class='btn btn-primary' align='center'>Edit</button>
						</a>
						<a href='.?i=product_list&aksi_id=<?php echo $row[0];?>' onclick="return confirm('Apakah anda yakin akan menghapus data ini?')">
							<button class='btn btn-primary' align='center' data-toggle="dropdown">Delete</button>
						</a>
					</td>
				</tr><?php
			} ?></table>
			<table class='table' style='width:70%;margin-top:0%;'><center>
				<tr border="0px">
					<td colspan=6 align="center">
			<?php
			$y=mysql_query("select * from item")or die(mysql_error());
			$je=mysql_num_rows($y);
			$jum=ceil($je/$batas);
			for($u=1;$u<=$jum;$u++){
				if($u==$page){
					$cl="";
				}else{
					$cl="";
				}
			?>
					<a href=".?i=product_list&page=<?php echo $u;?>" class="btn btn-primary"><?php echo $u;?></a>
			<?php }?>
					</td>
				</tr>
			</center>
	<?php
		echo"		</table>
				</center>";
	}
?>