<h2>Home Page</h2>
<table class="home">
<tr>
	<td>
		<?php 
			$kat = mysql_query("select * from category") or die(mysql_error());
			while($tampil = mysql_fetch_array($kat)){
				?> <a href=".?i=home&id=<?php echo $tampil['id_kategori'];?>">
						<button class="btn btn-primary" style="margin:1px;"><?php echo $tampil['nama_kategori'];?></button>
					</a>
				<?php
			}
		?>
		</td>
</tr>
	<tr>
		<td>
<?php
	$batas=10;
	$page=@$_GET['page'];
	if(empty($page)){
		$page=1;
	}
	$of=$batas*($page-1);
	$id=$_GET['id'];
	if($id==1){
		$query = mysql_query("select * from item limit $of,$batas");
	}
	else{
		$query = mysql_query("select * from item where id_kategori = '$id' limit $of,$batas");
	}
	
	$cek = mysql_num_rows($query);
	if($cek == 0) 
	{
		?><div class="alert alert-danger alert-dismissible" role="alert">Data Kosong</div><?php
	}
	else
	{
		while($row=mysql_fetch_array($query)){
			if($row['stock']<=3){
				echo'
						<div class="item">
								<image src="images/product/'.$row[6].'">
								<h4>'.$row[1].'</h4>
								<p>Price  : SOLD OUT </p>
						</div>';
			}
			else{
				echo'
						<div class="item">
							<a href="?i=preview_item&id_pro='.$row[0].'">
								<image src="images/product/'.$row[6].'">
								<h4>'.$row[1].'</h4>
								<p>Price  : Rp '.$db->rupiah($row[3], 2).'</p>
							</a>
						</div>';
			}
		}
	}
	
?>
<center>
</td>
	</tr>
	<tr>
		<th>
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
			<a href=".?i=home&id=<?php echo $id;?>&page=<?php echo $u;?>" class="btn btn-primary"><?php echo $u;?></a>
<?php }?>
		</th>
	</tr>
</table>
</center>