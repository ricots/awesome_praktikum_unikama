<?php
class database{
	//properti
	private $dbHost="localhost";
	private $dbUser="root";
	private $dbPass = "";
	private $dbName = "130090615070";

	//method koneksi mySQL
	function connectMySQL(){
		mysql_connect($this->dbHost, $this->dbUser, $this->dbPass);
		mysql_select_db($this->dbName) or die("database tidak ada");
	}
	function login($username, $pass){
		$querycustomer=mysql_query('select * from accounts where username="'.$username.'" and password="'.$pass.'" and level="user"') or die(mysql_error());
		$cek=mysql_num_rows($querycustomer);
		if($cek==0){
			$queryadmin=mysql_query('select * from accounts where username="'.$username.'" and password="'.$pass.'" and level="admin"') or die(mysql_error());
			$cek1=mysql_num_rows($queryadmin);
			if($cek1==0){
			echo '<div class="alert alert-danger alert-dismissible" role="alert">Cek your username or password!!!</div>';
			}
			else{
				$_SESSION['admin']=$username;
				header('location:.?i=inbox');
			}
		}
		else
		{
			$_SESSION['username']=$username;
			header('location:.?i=home&id=1');
		}
	}
	//insert item
	function insert($table, $value){
		$query = mysql_query("insert into $table values($value)") or die(mysql_error());
		echo '<div class="alert alert-success alert-dismissible" role="alert"><strong>Success!!!</strong></div>';
	}
	function update($table, $value, $kondisi){
		$query = mysql_query("update $table set $value $kondisi") or die(mysql_error());
		if($query){
				echo '<div class="alert alert-success alert-dismissible" role="alert"><strong>Success!!!</strong></div>';	
		}
		else{
			echo '<div class="alert alert-danger alert-dismissible" role="alert">Update Failed</div>';
		}
	}
	function delete($table, $kondisi){
		$query = mysql_query("delete from $table $kondisi") or die (mysql_error());
		echo '<div class="alert alert-success alert-dismissible" role="alert"><strong>Success!!!</strong></div>';	

	}
	function rupiah($nilai, $pecahan = 0) {
		return number_format($nilai, $pecahan, ',', '.');
	}
}
?>
