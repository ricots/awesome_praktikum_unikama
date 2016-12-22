<h2>History</h2>
<?php
	if(isset($_SESSION['admin'])){
		?><form action=".?i=history" method="POST">
			<table style="width:50%; margin-left:2%; margin-bottom:0px; margin-top:3%;">
				<tr>
					<td>
						<select name="month" required class="form-control" style="width:300px;">
							<option>Select Month</option>
							<option value="-01-">January</option>
							<option value="-02-">February</option>
							<option value="-03-">March</option>
							<option value="-04-">April</option>
							<option value="-05-">May</option>
							<option value="-06-">June</option>
							<option value="-07-">July</option>
							<option value="-08-">Agust</option>
							<option value="-09-">September</option>
							<option value="-10-">October</option>
							<option value="-11-">November</option>
							<option value="-12-">December</option>
						</select>
					</td>
					<td>
						<input type="number" class="form-control" name="year" required style="width:100%;" value="2015" placeholder="20xx">
					</td>
					<td>
						<input type="submit" class="btn btn-primary" name="sub" value="Search">
					</td>
					<td>
						<?php if(isset($_POST['sub'])){
							$month = $_POST['month'];
							$year = $_POST['year'];
						?>
						<a href="print_bulanan.php?month=<?php echo $month;?>&year=<?php echo $year;?>" target="_blank" class="btn btn-primary" style="padding-top:11%; padding-bottom:11%;">
							Print
						</a> <?php } ?>

					</td>
				</tr>
			</table>
			</form>
		<?php
		if(isset($_POST['sub'])){
			$month = $_POST['month'];
			$year = $_POST['year'];
			$query = mysql_query("select * from trans where status='Success' and date like '%$month%' and date like '%$year%' ORDER BY status DESC")or die (mysql_error());
			$cek = mysql_num_rows($query);
			if($cek == 0) 
			{
				?><div class="alert alert-danger alert-dismissible" role="alert">Empty Record</div><?php
			}
			else
			{
				echo"	<center>
							<table class='table' border='1px' style='width:95%;margin-top:1%;'>
								<tr>
									<th>Date</th>
									<th>Name</th>
									<th>Address</th>
									<th>Phone</th>
									<th>Code Product</th>
									<th>Menu</th>
								</tr>";
				$no=1;
				while($row=mysql_fetch_array($query)){
					echo "		<tr>
									<td align='center'>".$row['date']."</td>
									<td>".$row[6]."</td>
									<td>".$row[7]."</td>
									<td>".$row[8]."</td>
									<td>".$row[2]."</td>
									<td align='center'><a href='.?i=open_inbox&id_pro=".$row[0]."'><button class='btn btn-primary' align='center'>".$row[9]."</button></a></td>
								</tr>
						";
				$no=$no+1;
				}
				echo"		</table>
						</center>";
			}
		}
		else{
			$query = mysql_query("select * from trans where status='Success' ORDER BY status DESC")or die (mysql_error());
			$cek = mysql_num_rows($query);
			if($cek == 0) 
			{
				?><div class="alert alert-danger alert-dismissible" role="alert">Empty Record</div><?php
			}
			else
			{
				echo"	<center>
							<table class='table' border='1px' style='width:95%;margin-top:1%;'>
								<tr>
									<th>Date</th>
									<th>Name</th>
									<th>Address</th>
									<th>Phone</th>
									<th>Code Product</th>
									<th>Menu</th>
								</tr>";
				$no=1;
				while($row=mysql_fetch_array($query)){
					echo "		<tr>
									<td align='center'>".$row['date']."</td>
									<td>".$row[6]."</td>
									<td>".$row[7]."</td>
									<td>".$row[8]."</td>
									<td>".$row[2]."</td>
									<td align='center'><a href='.?i=open_inbox&id_pro=".$row[0]."'><button class='btn btn-primary' align='center'>".$row[9]."</button></a></td>
								</tr>
						";
				$no=$no+1;
				}
				echo"		</table>
						</center>";
			}
		
		
		}
	}
	else {
		$query = mysql_query("select * from trans where username='".$_SESSION['username']."' and status='Success' ORDER BY status ASC")or die (mysql_error());
		$cek = mysql_num_rows($query);
		if($cek == 0) 
		{
			?><div class="alert alert-danger alert-dismissible" role="alert">Empty Record</div><?php
		}
		else
		{
			echo"	<center>
						<table class='table' border='1px' style='width:95%;margin-top:4%;'>
							<tr>
								<th>ID</th>
								<th>Product Name</th>
								<th>Code Product</th>
								<th>Resi Number</th>
								<th>Menu</th>
							</tr>";
			$no=1;
			while($row=mysql_fetch_array($query)){
				echo "		<tr>
								<td align='center'>".$no."</td>
								<td>".$row[1]."</td>
								<td>".$row[2]."</td>
								<td>".$row[10]."</td>
								<td align='center'>
									<button class='btn btn-primary' align='center'>".$row[9]."</button>
									<a href='print_page.php?id_trans=".$row[0]."' target='_blank'>
										<button class='btn btn-primary' align='center'>Print</button>
									</a>
								</td>
							</tr>
					";
				$no=$no+1;
			}
			echo"		</table>
					</center>";
		}
	}
?>