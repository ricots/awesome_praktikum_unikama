<h2>Proses</h2>
	<?php
			$id=$_GET['id_pro'];
			$tampil = mysql_fetch_array(mysql_query("select * from trans where id_trans='$id'"));
			if(isset($_POST['ok'])){
				$status = $_POST['status'];
				$resi = $_POST['resi'];
				$table = "trans";
				$value = "status='$status', resi='$resi'";
				$kondisi = "where id_trans='$id'";
				$db->update($table, $value, $kondisi);
			
			}
	?>
<form action=".?i=open_inbox&id_pro=<?php echo $id ?>" method="POST">
	<table style="width:100%;">
		<tr>
			<td style="padding:2%; width:45%;">Product Name :<input type="text" class="form-control" name="product_name" value="<?php echo $tampil['name_product'];?>" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Name :<input type="text" class="form-control" name="name" value="<?php echo $tampil['name']?>" placeholder="Username" size="30" style="width: 100%;" readonly /></td>
		</tr>
		<tr>
			<td style="padding:2%;">Code Product :<input type="text" class="form-control" name="code_product" value="<?php echo $tampil['kode_brg'];?>" size="30" style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Phone Number : <input type="text" class="form-control" name="phone" value="<?php echo $tampil['phone']?>" size="30" style="width: 100%;" readonly /></td>

		</tr>
		<tr>
			<td style="padding:2%;">
				Price Product : <input type="text" class="form-control" name="price_product" value="<?php echo $tampil['rate_product'];?>" size="30" style="width: 100%; margin-bottom:4%;" readonly />
				Total Purchase : <input type="text" class="form-control" value="<?php echo $tampil['total_purchase'];?>" size="30" style="width: 100%; margin-bottom:4%;" readonly />
				Date : <input type="text" class="form-control" name="date" value="<?php echo $tampil['date']; ?>" size="30" style="width: 100%;" readonly />
			</td>
			<td style="padding:2%;">Address : <textarea  class="form-control" name="address" style="width: 100%; height: 190px;" readonly ><?php echo $tampil['address']?></textarea></td>		
		</tr>
		<tr>
			<td style="padding:2%;">
				Status :	
					<select name="status" class="form-control" style="width:50%;">
						<option value="Process" <?php if($tampil['status']=='Process'){ echo 'selected';}?>>Proses</option>
						<option value="Success" <?php if($tampil['status']=='Success'){ echo 'selected';}?>>Sucsess</option>
					</select>
			</td>
			<td style="padding:2%;" colspan=2>
				Resi Number : <input type="text" class="form-control" name="resi" size="30" style="width: 100%;" />
			</td>
		</tr>
		<tr>
			<td style="padding:2%;" colspan=2>Bukti Transfer : </br><img src="images/buktitrans/<?php echo $tampil['transfer'];?>" style="width:500px; height:auto;"/></td>
			<td style="padding:2%;"></td>
		</tr>
		<tr>
			<td colspan=2 align="right" style="padding:2%;"><button type="submit" name="ok" class="btn btn-primary">Update</button></td>
		</tr>
	</table>
</form>
	