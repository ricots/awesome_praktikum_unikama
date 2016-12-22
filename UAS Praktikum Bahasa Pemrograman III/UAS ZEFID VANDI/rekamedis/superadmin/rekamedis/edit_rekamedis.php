<?php
session_start();
include "../../connect.php";
$tgl_pemeriksaan=$_POST["tahun"].'-'.$_POST["bulan"].'-'.$_POST["tanggal"];
mysql_query("UPDATE rekamedis SET 
							  no_RM 			= '$_POST[no_RM]',
							  kd_tindakan		= '$_POST[kd_tindakan]',
							  kd_obat			= '$_POST[kd_obat]',
							  kd_user 			= '$_POST[kd_user]',
							  no_pasien			= '$_POST[no_pasien]',
							  diagnosa 			= '$_POST[diagnosa]',
							  resep				= '$_POST[resep]',
							  keluhan 			= '$_POST[keluhan]',
							  tgl_pemeriksaan 	= '$tgl_pemeriksaan',
							  ket 				= '$_POST[ket]'
							  where no_RM = '$_POST[no_RM]'");
header('location:form_rekamedis.php');
?>