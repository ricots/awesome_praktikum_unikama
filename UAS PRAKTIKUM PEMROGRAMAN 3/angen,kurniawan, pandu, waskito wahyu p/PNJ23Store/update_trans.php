	<?php
		$id=$_GET['id_trans'];
		if(isset($_SESSION['username'])){
			$tampil = mysql_fetch_array(mysql_query("select * from trans where id_trans='$id'"));	
			if(isset($_POST['ok']))
			{

				//print_r($_FILES['gambar']);exit();
				if($_FILES['gambar']['name']) {
					if(is_uploaded_file($_FILES['gambar']['tmp_name'])) {
					$sourcePath = $_FILES['gambar']['tmp_name'];
					$nam = $_FILES['gambar']['name'];
					$targetPath = 'images/buktitrans/'.$nam;
					//echo $nam;exit();
						if(move_uploaded_file($sourcePath,$targetPath)) {
							$id=$_GET['id_trans'];
							$name = $_POST['name'];
							$address = $_POST['address'];
							$phone = $_POST['phone']; 
							
							$table = "trans";
							$value = "name='$name', address='$address', phone='$phone',transfer='$nam'";
							$kondisi = "where id_trans='$id'";
							$db->update($table, $value, $kondisi);
							header("location:.?i=update_trans&id_trans=".$id."");
							
						}
						else{
							?><div class="alert alert-danger alert-dismissible" role="alert">Upload Failed</div><?php
						}
					}
				}
				else
				{
					$id=$_GET['id_trans'];
					$name = $_POST['name'];
					$address = $_POST['address'];
					$phone = $_POST['phone']; 
							
					$table = "trans";
					$value = "name='$name', address='$address', phone='$phone'";
					$kondisi = "where id_trans='$id'";
					$db->update($table, $value, $kondisi);
					header('location:.?i=update_trans&id_trans='.$id.'');
				}
			}
		}
		else{
			$id=$_GET['id_pro'];
			header('location:.?i=login');
		}
	?>
<form action=".?i=update_trans&id_trans=<?php echo $id ?>" method="POST" enctype="multipart/form-data">
	<table style="width:100%;">
		<tr>
			<td colspan=2 align="center"><h2> Transfer</h2></td>
		</tr>
		<tr>
			<td style="padding:2%;">Transfer Receipt / Bukti Transfer : </br>
			<input type="file" name="gambar" accept="image/*" style="margin-top:10px; margin-bottom:10px;"/></td>
			<td style="padding:2%">
				<img src="images/buktitrans/<?php echo $tampil['transfer'];?>" style="width:auto; height:200px;">
			</td>
		</tr>
		<tr>
			<td colspan=2 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
		<tr>
			<td colspan=2 align="center"><h2>Detail Order</h2></td>
		</tr>
		<tr>
			<td style="padding:2%;">Product Name :<input type="text" class="form-control" name="product_name" value="<?php echo $tampil['name_product'];?>" placeholder="Product Name" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Name :<input type="text" class="form-control" name="name" placeholder="Full Name" value="<?php echo $tampil['name'];?>" size="30" required style="width: 100%;" /></td>
		</tr>
		<tr>
			<td style="padding:2%;">Code Product :<input type="text" class="form-control" name="code_product" value="<?php echo $tampil['kode_brg'];?>" placeholder="Code Product" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Phone Number : <input type="text" class="form-control" name="phone" placeholder="+62 xxx xxxx xxxx" value="<?php echo $tampil['phone'];?>" size="30" required style="width: 100%;"/></td>

		</tr>
		<tr>
			<td style="padding:2%;">Price Product : <input type="text" class="form-control" name="price_product" value="<?php echo $tampil['rate_product'];?>" placeholder="Price" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;" rowspan=2>Address : <textarea  class="form-control" name="address" required style="width: 100%; height: 107px;"><?php echo $tampil['address'];?></textarea></td>		
		</tr>
		<tr>
			<td style="padding:2%;">Total Purchase : <input type="text" class="form-control" name="total" value="<?php echo $tampil['total_purchase'];?>" placeholder="Total <= 100" size="30" style="width: 100%;" readonly /></td>
			<td></td>
		</tr>
	</table>
</form>