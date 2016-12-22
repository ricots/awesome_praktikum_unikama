<?php 
$id = "1";
if(isset($_SESSION['admin'])){
	if(isset($_POST['ok'])){
		//print_r($_FILES['gambar']);exit();
		if($_FILES['gambar']['name']) {
			if(is_uploaded_file($_FILES['gambar']['tmp_name'])) {
			$sourcePath = $_FILES['gambar']['tmp_name'];
			$nam = $_FILES['gambar']['name'];
			$targetPath = 'images/'.$nam;
			//echo $nam;exit();
				if(move_uploaded_file($sourcePath,$targetPath)) {				
					$title_about = $_POST['title_about'];
					$title_contact = $_POST['title_contact'];
					$title_help = $_POST['title_help'];
					$about = $_POST['about'];
					$contact = $_POST['contact'];
					$embed = $_POST['embed'];
					$help = $_POST['help'];
					$table = "style";
					$value = "title_about='$title_about', title_contact='$title_contact', about='$about',logo='$nam', embed='$embed', contact='$contact', title_help='$title_help', help='$help'";
					$kondisi = "where id_style='$id'";
					$db->update($table, $value, $kondisi);
				}
				else{
					?><div class="alert alert-danger alert-dismissible" role="alert">Upload Failed</div><?php
				}
			}
		}
		else
		{
			$title_about = $_POST['title_about'];
			$title_contact = $_POST['title_contact'];
			$title_help = $_POST['title_help'];
			$about = $_POST['about'];
			$contact = $_POST['contact'];
			$embed = $_POST['embed'];
			$help = $_POST['help'];
			$table = "style";
			$value = "title_about='$title_about', title_contact='$title_contact', about='$about', embed='$embed', contact='$contact', title_help='$title_help', help='$help'";
			$kondisi = "where id_style='$id'";
			$db->update($table, $value, $kondisi);
		}
	}
$query = mysql_query("select * from style");
$tampil = mysql_fetch_array($query);
?>
<form action=".?i=about" method="POST" enctype="multipart/form-data">
	<table style="width:100%;">
		<tr>
			<td colspan=2><h2><?php echo $tampil['title_about'];?></h2></td>
		</tr>
		<tr>
			<td style="width:20%;">Title About</td>
			<td><input type="text" name="title_about" required class="form-control" style="width:100%;" value="<?php echo $tampil['title_about'];?>"></td>
		</tr>
		<tr>
			<td>About Us</td>
			<td><textarea  class="form-control" name="about" required style="width: 100%; height: 207px;"><?php echo $tampil['about'];?></textarea></td>
		</tr>
		<tr>
			<td>Logo Header</td>
			<td><input type="file" name="gambar" accept="image/*" style="margin-top:10px; margin-bottom:10px;"></td>
		</tr>
		<tr>
			<td colspan=2 style="padding-top:3%;"><h2><?php echo $tampil['title_contact'];?></h2></td>
		</tr>
		<tr>
			<td>Title Contact</td>
			<td><input type="text" name="title_contact" required class="form-control" style="width:100%;" value="<?php echo $tampil['title_contact'];?>"></td>
		</tr>
		<tr>
			<td>Contact Person</td>
			<td><textarea  class="form-control" name="contact" required style="width: 100%; height: 207px;"><?php echo $tampil['contact'];?></textarea></td>
		</tr>
		<tr>
			<td>Embed Maps</td>
			<td><textarea  class="form-control" name="embed" placeholder="Size : 300px x 300px" required style="width: 100%; height: 107px;"><?php echo $tampil['embed'];?></textarea></td>
		</tr>
		<tr>
			<td colspan=2 style="padding-top:3%;"><h2><?php echo $tampil['title_help'];?></h2></td>
		</tr>
		<tr>
			<td style="width:20%;">Title Help</td>
			<td><input type="text" name="title_help" required class="form-control" style="width:100%;" value="<?php echo $tampil['title_help'];?>"></td>
		</tr>
		<tr>
			<td>Help</td>
			<td><textarea  class="form-control" name="help" required style="width: 100%; height: 207px;"><?php echo $tampil['help'];?></textarea></td>
		</tr>
	</table>
	<table style="width:100%;">
		<tr>
			<td colspan=2 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
	</table>
</form>
<?php
}
else{
$query = mysql_query("select * from style");
$tampil = mysql_fetch_array($query);
	?>
	<h2><?php echo $tampil['title_about'];?></h2>
		<table border="20px" style="border-color:#ff7200; width:95%; height:auto; margin-bottom:10%; padding:2%;margin-left:3%; margin-top:3%;">
			<tr>
				<td align="center" style="text-align:justify;">
					<?php echo $tampil['about'];?>
				</td>
			</tr>
		</table>
	<h2><?php echo $tampil['title_contact'];?></h2>
	<center>
	<table style="width:95%;margin-bottom:15%;">
		<tr>
			<td width="65%">
				<?php echo $tampil['embed'];?>
			</td>
			<td style="padding:2%;">
				<pre><?php echo $tampil['contact'];?></pre>
			</td>
		</tr>
	</table></center>
	<?php 
} 
	?>