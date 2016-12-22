<h2>Update Profile</h2>
<form action=".?i=update_profile" method="POST">
	<?php
		if(isset($_POST['ok']))
		{ 	
			$username = $_POST['username'];
			$name = $_POST['name'];
			$pass = md5($_POST['password']);
			$gender = $_POST['gender']; 
			$birth = $_POST['birth']; 
			$phone = $_POST['phone']; 
			$address = $_POST['address']; 
			$email = $_POST['email']; 
			$table = "accounts";
			$kondisi = "where username='$username'";
			if(isset($_SESSION['admin'])){
				$value = "password='$pass', level='admin', name='$name', gender='$gender', birth='$birth', address='$address', phone='$phone', email='$email'";
				$db->update($table, $value, $kondisi);
			}
			else{
				$value = "password='$pass', level='user', name='$name', gender='$gender', birth='$birth', address='$address', phone='$phone', email='$email'";
				$db->update($table, $value, $kondisi);
			}
		}
		if(isset($_SESSION['admin'])){
		$username = $_SESSION['admin'];
		$tampil = mysql_fetch_array(mysql_query("select * from accounts where username='$username' and level='admin'"));
		}
		else{
		$username = $_SESSION['username'];
		$tampil = mysql_fetch_array(mysql_query("select * from accounts where username='$username' and level='user'"));
		}
	?>
	<table style="width:100%;">
		<tr>
			<td style="padding:2%;">Username :<input type="text" class="form-control" name="username" value="<?php echo $tampil['username'];?>" placeholder="Username" size="30" required style="width: 100%;" readonly /></td>
			<td style="padding:2%;">Password :<input type="password" class="form-control" name="password" placeholder="Password" size="30" required style="width: 100%;" /></td>
		</tr>
		<tr>
			<td style="padding:2%;">Full Name :<input type="text" class="form-control" name="name" value="<?php echo $tampil['name'];?>" placeholder="Full Name" size="30" required style="width: 100%;"/></td>
			<td style="padding:2%;">Email :<input type="text" class="form-control" name="email" value="<?php echo $tampil['email'];?>" placeholder="example@yahoo.co.id" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td style="padding:2%;">Date of Birth : <input type="text" class="form-control" name="birth" value="<?php echo $tampil['birth'];?>" placeholder="DD Month YYYY" size="30" style="width: 100%;"/></td>
			<td style="padding:2%;">Phone Number : <input type="text" class="form-control" name="phone" value="<?php echo $tampil['phone'];?>" placeholder="+62 xxx xxxx xxxx" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td style="padding:2%;">Address : <textarea  class="form-control" name="address" required style="width: 100%; height: 107px;"><?php echo $tampil['address'];?></textarea></td>
			<td style="padding:2%;">Gender :	
					<select name="gender" class="form-control" style="width:50%;" required>
						<option value="male" <?php if($tampil['gender']=='male'){ echo 'selected';}?>>Male</option>
						<option value="female" <?php if($tampil['gender']=='female'){ echo 'selected';}?>>Female</option>
					</select>
			</td>
		</tr>
		<tr>
			<td colspan=2 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
	</table>
</form>
	<?php
	?>