<h2>Login</h2>
<?php
if(isset($_POST['ok'])){
	$username = $_POST['username'];
	$pass = md5($_POST['password']);
	$db->login($username, $pass);
}
?>
<form action=".?i=login" method="POST">
	<table class="table" style="margin-top:10%;">
		<tr>
			<td >Username </td>
			<td><input type="text" class="form-control" name="username" placeholder="Username" size="100" required style="width: 100%;"/></td>
		</tr>
		<tr>
			<td>Password </td>
			<td><input type="password" class="form-control" name="password" placeholder="Password" required style="width:  100%;"/></td>
		</tr>
		<tr>
			<td></td>
			<td align="right">
		<button type="submit" name="ok" class="btn btn-primary">Login</button></td>
		</tr>
	</table>
</form>
