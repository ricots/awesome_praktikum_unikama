<?php
include "../../connect.php";
$pswd = md5($_POST["password"]);
$tgl_kunjungan=$_POST["tahun"].'-'.$_POST["bulan"].'-'.$_POST["tanggal"];
$s ="INSERT INTO dokter(kd_dokter,kd_poli,tgl_kunjungan,kd_user,nm_dokter,SIP,tmp_lahir,no_telp,alamat)VALUES
						('$_POST[kd_dokter]',
						'$_POST[kd_poli]',
						'$tgl_kunjungan',
						'$_POST[kd_user]',
						'$_POST[nm_dokter]',
						'$_POST[SIP]',
						'$_POST[tmp_lahir]',
						'$_POST[no_telp]',
						'$_POST[alamat]')";
$w = mysql_query($s);
if($w==1){
$s1 = "INSERT INTO login(kd_user,username,password,nama_lengkap,hak_akses)VALUES
						('$_POST[kd_dokter]',
						'$_POST[username]',
						'$pswd',
						'$_POST[nm_dokter]',
						'dokter')";	
mysql_query($s1);
}
header("location:form_dokter.php");
?>