<h2>ADD Product (+)</h2>
	<a href=".?i=insert_item"><button class='btn btn-primary' align='center' style="margin-right:0%;">Add Product</button></a>
	<a href=".?i=product_list"><button class='btn btn-primary' align='center' style="margin-right:0%; margin-left:0%;">Product List</button></a>
	<a href=".?i=home&id=1"><button class='btn btn-primary' align='center' style="margin-right:0%; margin-left:0%;">Product preview</button></a><center>
<form action=".?i=insert_item" method="POST" enctype="multipart/form-data">
<?php 
	if(isset($_POST['ok']))
	{
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
				$category = $_POST['category'];
				$rate = $_POST['rate'];
				$future = $_POST['future'];
				$stok = $_POST['stok'];
				$table = "item";
				$value = "'','$code','$product', '$rate', '$future', '', '$nam', '$stok','$category'";
				$db->insert($table, $value);
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
					$category = $_POST['category'];
					$rate = $_POST['rate'];
					$future = $_POST['future'];
					$stok = $_POST['stok'];
					$table = "item";
					$value = "'','$code','$product', '$rate', '$future', '', 'default.jpg', '$stok','$category'";
					$db->insert($table, $value);
	}
	}
?>
	<table class="table-insert">
		<tr>
			<td rowspan=3 style="width:20px; padding:0; padding-top:3%;"><image src="images/image01.jpg"></td>
			<td>Product Name</td>
			<td colspan=2><input type="text" class="form-control" name="name_product" placeholder="Name of Product" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td>Code Product</td>
			<td colspan=2><input type="text" class="form-control" name="code_product" required placeholder="Code Product" style="width:  100%;"/></td>
		</tr>
		<tr>
			<td>Category</td>
			<td>
					<select name="category" required class="form-control" style="width:100%;">
					<?php
						$query = mysql_query("select * from category");
						$cek=mysql_num_rows($query);
						if($cek==0){
						
						}
						else{
							while($tampil=mysql_fetch_array($query)){
							?>
								<option value="<?php echo $tampil['id_kategori'];?>"><?php echo $tampil['nama_kategori'];?></option>
							<?php
							}
						}
					?>
					</select>
			</td>
			<td><a href=".?i=add_kat" class="btn btn-primary">+ Add Category</a></td>
		</tr>
		<tr>
			<td colspan=4 style="padding-left:0px;"><input type="file" name="gambar" accept="image/*" style="margin-top:10px; margin-bottom:10px;"></td>
		</tr>
		<tr>
			<td></td>
			<td colspan=3 align="center">Technical Specs</td>
		</tr>
		<tr>
			<td></td>
			<td>Spesification</td>
			<td colspan=2><textarea rows=5 cols=60 class="form-control" name="future" style="width: 100%; height: 107px; margin-top:10px; margin-bottom:10px;"></textarea></td>
		</tr>
		<tr><td></td>
			<td>Price Product</td>
			<td colspan=2><input type="text" class="form-control" name="rate" placeholder="XXX.XXX,XX" required style="width:  100%; margin-top:10px; margin-bottom:10px;"/></td>
		</tr>
		<tr>
		<td></td>
			<td>Stock</td>
			<td><input type="text" class="form-control" name="stok" placeholder="Stock Product" required style="width: 100%; margin-top:10px; margin-bottom:10px;"/></td><td style="padding-left:1%;"> Unit</td>
		</tr>
		<tr>
			<td colspan=4 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
	</table>
</form>
</center>