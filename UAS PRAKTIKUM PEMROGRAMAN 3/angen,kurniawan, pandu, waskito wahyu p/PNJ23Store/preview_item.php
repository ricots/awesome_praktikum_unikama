<h2>SPESIFICATION</h2>
<?php
	$id=$_GET['id_pro'];
	$query = mysql_query("select * from item where id_item='$id'")or die (mysql_error());
	$cek = mysql_num_rows($query);
	
	if($cek == 0) 
	{
		?><div class="alert alert-danger alert-dismissible" role="alert">Data Kosong</div><?php
	}
	else
	{
		if(isset($_SESSION['admin'])){
		while($row=mysql_fetch_array($query)){
			echo  '	<center>
						<table class="table-spec">
							<tr>
								<th rowspan=4><image src="images/product/'.$row[6].'"></th>
							</tr>
							<tr>
								<td style="padding-top:0; padding-bottom:0;">
									<h1 style="margin-top:0; margin-bottom:0;">'.$row[2].'</h1>
									<h4 style="margin-top:0; margin-bottom:0; margin-left:10%;">Code : '.$row[1].'</h4>
								</td>
							</tr>
							<tr>
								<td>
									<h2>SPESIFICATION</h2>
									<p>'.$row[4].'</p>
								</td>
							</tr>
							<tr>
								<td>
									<h1>Stock : '.$row[7].'<h1>
								</td>
							</tr>
							<tr>
								<td>
									<h1>Rp '.$db->rupiah($row[3], 2).'<h1>
								</td>
							</tr>';
			}
		
		
		}else{
		while($row=mysql_fetch_array($query)){
			echo  '	<center>
						<table class="table-spec">
							<tr>
								<th rowspan=5><image src="images/product/'.$row[6].'"></th>
							</tr>
							<tr>
								<td style="padding-top:0; padding-bottom:0;">
									<h1 style="margin-top:0; margin-bottom:0;">'.$row[2].'</h1>
									<h4 style="margin-top:0; margin-bottom:0; margin-left:10%;">Code : '.$row[1].'</h4>
								</td>
							</tr>
							<tr>
								<td>
									<h2>FEATURES</h2>
									<p>'.$row[4].'</p>
								</td>
							</tr>
							<tr>
								<td>
									<h1>Stock : '.$row[7].'<h1>
								</td>
							</tr>
							<tr>
								<td>
									<h1>Rp '.$db->rupiah($row[3], 2).'<h1>
									<a href=".?i=buy&id_pro='.$row[0].'"><button class="btn btn-primary" align="center">Buy Now</button></a>
								</td>
							</tr>';
			}
		
		
		
		
		}
		echo '</table></center>';
	}
?>