<h2>Order</h2>
	<?php
		if(isset($_SESSION['username'])){
			$id=$_GET['id_pro'];
			$tampil = mysql_fetch_array(mysql_query("select * from item where id_item='$id'"));
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
							$date = date('d-m-Y');
							$username = $_SESSION['username'];
							$product = $_POST['product_name'];  
							$name = $_POST['name'];
							$code = $_POST['code_product']; 
							$phone = $_POST['phone']; 
							$price = $_POST['price_product']; 
							$address = $_POST['address'];
							$total = $_POST['total'];
							$hitung = $price*$total;
							
							$table = "trans";
							$value = "'', '$product', '$code', '$price', '$total', '$username', '$name', '$address', '$phone', 'Process','','$date','$hitung','$nam'";
							
							$query = mysql_fetch_array(mysql_query("Select stock from item where id_item='$id'"));
							$stock = $query['stock'];
							if($total>$stock){
								echo '<div class="alert alert-danger alert-dismissible" role="alert">Sold Out / Total Purchase > Stock</div>';
							}
							elseif($total<=0){
								echo '<div class="alert alert-danger alert-dismissible" role="alert">Total Purchase harus lebih dari 1</div>';
							}
							else
							{
								$db->insert($table, $value);
							}
						}
						else{
							?><div class="alert alert-danger alert-dismissible" role="alert">Upload Failed</div><?php
						}
					}
				}
				else
				{
					$date = date('d-m-Y');
					$username = $_SESSION['username'];
					$product = $_POST['product_name'];  
					$name = $_POST['name'];
					$code = $_POST['code_product']; 
					$phone = $_POST['phone']; 
					$price = $_POST['price_product']; 
					$address = $_POST['address'];
					$total = $_POST['total'];
					$hitung = $price*$total;
					
					$table = "trans";
					$value = "'', '$product', '$code', '$price', '$total', '$username', '$name', '$address', '$phone', 'Process','','$date','$hitung','default.jpg'";
					
					$query = mysql_fetch_array(mysql_query("Select stock from item where id_item='$id'"));
					$stock = $query['stock'];
					if($total>$stock){
						echo '<div class="alert alert-danger alert-dismissible" role="alert">Sold Out / Total Purchase > Stock</div>';
					}
					elseif($total<=0){
						echo '<div class="alert alert-danger alert-dismissible" role="alert">Total Purchase harus lebih dari 1</div>';
					}
					else
					{
						$db->insert($table, $value);
					}
				}
			}
		}
		else{
			$id=$_GET['id_pro'];
			header('location:.?i=login');
		}
	?>
<form action=".?i=buy&id_pro=<?php echo $id ?>" method="POST" enctype="multipart/form-data">
	<table style="width:100%;">
		<tr>
			<td style="padding:2%;">Product Name :<input type="text" class="form-control" name="product_name" value="<?php echo $tampil['name_product'];?>" placeholder="Product Name" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Name :<input type="text" class="form-control" name="name" placeholder="Full Name" size="30" required style="width: 100%;" /></td>
		</tr>
		<tr>
			<td style="padding:2%;">Code Product :<input type="text" class="form-control" name="code_product" value="<?php echo $tampil['kode_brg'];?>" placeholder="Code Product" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Phone Number : <input type="text" class="form-control" name="phone" placeholder="+62 xxx xxxx xxxx" size="30" required style="width: 100%;"/></td>

		</tr>
		<tr>
			<td style="padding:2%;">Price Product : <input type="text" class="form-control" name="price_product" value="<?php echo $tampil['rate_product'];?>" placeholder="Price" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;" rowspan=2>Address : <textarea  class="form-control" name="address" required style="width: 100%; height: 107px;"></textarea></td>		
		</tr>
		<tr>
			<td style="padding:2%;">Total Purchase : <input type="text" class="form-control" name="total" placeholder="Total <= 100" size="30" style="width: 100%;"/></td>
			<td></td>
		</tr>
		<tr>
			<td colspan=2 align="center"><h2> Transfer</h2></td>
		</tr>
		<tr>
			<td style="padding:2%;" colspan=2>Transfer Receipt / Bukti Transfer : 
			<input type="file" name="gambar" accept="image/*" style="margin-top:10px; margin-bottom:10px;"></td>
		</tr>
		<tr>
			<td colspan=2 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
	</table>
</form>