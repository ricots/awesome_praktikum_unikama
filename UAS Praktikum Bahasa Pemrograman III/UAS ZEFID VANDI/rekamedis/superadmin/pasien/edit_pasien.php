<?php
session_start();
include "../../connect.php";
$tgl_lahir=$_POST["tahun"].'-'.$_POST["bulan"].'-'.$_POST["tanggal"];
mysql_query("UPDATE pasien SET 
							  no_pasien 	= '$_POST[no_pasien]',
							  nm_pasien		= '$_POST[nm_pasien]',
							  j_kel	 		= '$_POST[j_kel]',
							  agama 		= '$_POST[agama]',
							  alamat		= '$_POST[alamat]',
							  tgl_lahir 	= '$tgl_lahir',
							  usia			= '$_POST[usia]',
							  no_telp 		= '$_POST[no_telp]',
							  nm_kk 		= '$_POST[nm_kk]',
							  hub_kel 		= '$_POST[hub_kel]'
							  where no_pasien = '$_POST[no_pasien]'");
header('location:form_pasien.php');
?>