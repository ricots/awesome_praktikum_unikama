<?php
include "../../connect.php";
$pswd = md5($_POST["password"]);
$tgl_lahir=$_POST["tahun"].'-'.$_POST["bulan"].'-'.$_POST["tanggal"];
$s ="INSERT INTO pasien(no_pasien,nm_pasien,j_kel,agama,alamat,tgl_lahir,usia,no_telp,nm_kk,hub_kel)VALUES
						('$_POST[no_pasien]',
						'$_POST[nm_pasien]',
						'$_POST[j_kel]',
						'$_POST[agama]',
						'$_POST[alamat]',
						'$tgl_lahir',
						'$_POST[usia]',
						'$_POST[no_telp]',
						'$_POST[nm_kk]',
						'$_POST[hub_kel]')";
$w = mysql_query($s);
if($w==1){
$s1 = "INSERT INTO login(kd_user,username,password,nama_lengkap,hak_akses)VALUES
						('$_POST[no_pasien]',
						'$_POST[username]',
						'$pswd',
						'$_POST[nm_pasien]',
						'pasien')";	
mysql_query($s1);
}
header("location:form_pasien.php");
?>