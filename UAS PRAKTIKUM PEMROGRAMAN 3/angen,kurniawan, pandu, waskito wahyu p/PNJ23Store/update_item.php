<h2>Edit Product</h2>
<?php 
	$id=$_GET['aksi_id'];
		if(isset ($_POST['ok'])){
		//print_r($_FILES['gambar']);exit();
		if($_FILES['gambar']['name']) {
			if(is_uploaded_file($_FILES['gambar']['tmp_name'])) {
			$sourcePath = $_FILES['gambar']['tmp_name'];
			$nam = $_FILES['gambar']['name'];
			$targetPath = 'images/product/'.$nam;
			//echo $nam;exit();
				if(move_uploaded_file($sourcePath,$targetPath)) {
					$product = $_POST['name_product'];
					$code = $_POST['code_product'];
					$rate = $_POST['rate'];
					$future = $_POST['future'];
					$spec = $_POST['spec'];
					$stok = $_POST['stok'];
					$table = "item";
					$value = "kode_brg='$code', name_product='$product', rate_product='$rate', future='$future', spec='$spec', stock='$stok', image='$nam'";
					$kondisi = "where id_item='$id'";
					$db->update($table, $value, $kondisi);
				}
				else{
					?><div class="alert alert-danger alert-dismissible" role="alert">Upload Failed</div><?php
				}
			}
		}
		else
		{
			$product = $_POST['name_product'];
			$code = $_POST['code_product'];
			$rate = $_POST['rate'];
			$future = $_POST['future'];
			$spec = $_POST['spec'];
			$stok = $_POST['stok'];
			$table = "item";
			$value = "kode_brg='$code', name_product='$product', rate_product='$rate', future='$future', spec='$spec', stock='$stok'";
			$kondisi = "where id_item='$id'";
			$db->update($table, $value, $kondisi);
		}
	}	
	$tampil = mysql_fetch_array(mysql_query("select * from item where id_item='$id'"));
?>
<form action=".?i=update_item&aksi_id=<?php echo $id?>" method="POST" enctype="multipart/form-data">
	<table class="table-insert">
		<tr>
			<td rowspan=3 style="width:200px; padding:0; padding-top:3%;"><image src="images/product/<?php echo $tampil['image'];?>" style="width:200px; height:200px;"></td>
			<td>Product Name</td>
			<td><input type="text" class="form-control" name="name_product" value="<?php echo $tampil['name_product'];?>" placeholder="Name of Product" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td>Code Product</td>
			<td><input type="text" class="form-control" name="code_product" value="<?php echo $tampil['kode_brg'];?>" required placeholder="Code Product" style="width:  100%;"/></td>
		</tr>
		<tr>
			<td colspan=2 align="center">Technical Specs</td>
		</tr>
		<tr>
			<td colspan=4 style="padding-left:0px;"><input type="file" name="gambar" accept="image/*" style="margin-top:10px; margin-bottom:10px;"></td>
		</tr>
		<tr>
			<td></td>
			<td>Future</td>
			<td><textarea rows=5 cols=60 class="form-control" name="future" style="margin:0px;"><?php echo $tampil['future'];?></textarea></td>
		</tr>
		<tr>
			<td></td>
			<td>Spesification</td>
			<td><textarea rows=5 cols=60 class="form-control" name="spec" style="margin:0px;"><?php echo $tampil['spec'];?></textarea></td>
		</tr>
		<tr><td></td>
			<td>Price</td>
			<td><input type="text" class="form-control" name="rate" value="<?php echo $tampil['rate_product'];?>" placeholder="XXX.XXX,XX" required style="width:  100%;"/></td>
		</tr>
		<tr>
		<td></td>
			<td>Stock</td>
			<td><input type="text" class="form-control" name="stok" value="<?php echo $tampil['stock'];?>" placeholder="Stock Product" required style="width:  100%;"/></td>
		</tr>
		<tr>
			<td colspan=3 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
	</table>
</form>
