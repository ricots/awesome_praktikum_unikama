<h2>Sign Up</h2>
<form action=".?i=signup" method="POST">
	<?php
		if(isset($_POST['ok']))
		{
			$username = $_POST['username']; 
			$password = md5($_POST['password']); 
			$name = $_POST['name'];
			$gender = $_POST['gender']; 
			$birth = $_POST['birth']; 
			$phone = $_POST['phone']; 
			$address = $_POST['address']; 
			$email = $_POST['email']; 
			$table = "accounts";
			$query = mysql_query("select * from accounts where username='$username'");
			$cek = mysql_num_rows($query);
			if ($cek==0){
				if(isset($_SESSION['admin'])){
					$value ="'', '$username', '$password', 'admin', '$name', '$gender', '$birth', '$address', '$phone', '$email'";
					$db->insert($table, $value);
				}
				else{
					$value = "'', '$username', '$password', 'user', '$name', '$gender', '$birth', '$address', '$phone','$email'";
					$db->insert($table, $value);
				}			
			}
			else{
				echo '<div class="alert alert-danger alert-dismissible" role="alert">Username already exists !!!</div>';
			}
		}
	?>
	<table style="width:100%;">
		<tr>
			<td style="padding:2%;">Username :<input type="text" class="form-control" name="username" placeholder="Username" size="30" required style="width: 100%;"/></td>
			<td style="padding:2%;">Password * :<input type="password" class="form-control" name="password" placeholder="Password" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td style="padding:2%;">Full Name :<input type="text" class="form-control" name="name" placeholder="Full Name" size="30" required style="width: 100%;"/></td>
			<td style="padding:2%;">E-mail :<input type="text" class="form-control" name="email" placeholder="example@yahoo.co.id" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td style="padding:2%;">Date of Birth : <input type="text" class="form-control" name="birth" placeholder="DD Month YYYY" size="30" required style="width: 100%;"/></td>
			<td style="padding:2%;">Phone Number : <input type="text" class="form-control" name="phone" placeholder="+62 xxx xxxx xxxx" size="30" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td style="padding:2%;">Address : <textarea  class="form-control" name="address" required style="width: 100%; height: 107px;"></textarea></td>
			<td style="padding:2%;">Gender :	
					<select name="gender" required class="form-control">
						<option>--Your Gender--</option>
						<option value="male">Male</option>
						<option value="female">Female</option>
					</select>
			</td>
		</tr>
		<tr>
			<td colspan=2 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
	</table>
</form>
