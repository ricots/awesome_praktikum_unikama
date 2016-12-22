<?php
session_start();
include "../../connect.php";
$tgl_kunjungan=$_POST["tahun"].'-'.$_POST["bulan"].'-'.$_POST["tanggal"];
mysql_query("UPDATE dokter SET 
							  kd_dokter 	= '$_POST[kd_dokter]',
							  kd_poli		= '$_POST[kd_poli]',
							  tgl_kunjungan	= '$tgl_kunjungan',
							  kd_user	 	= '$_POST[kd_user]',
							  nm_dokter 	= '$_POST[nm_dokter]',
							  SIP			= '$_POST[SIP]',
							  tmp_lahir 	= '$_POST[tmp_lahir]',
							  no_telp 		= '$_POST[no_telp]',
							  alamat 		= '$_POST[alamat]'
							  where kd_dokter = '$_POST[kd_dokter]'");
header('location:form_dokter.php');
?>