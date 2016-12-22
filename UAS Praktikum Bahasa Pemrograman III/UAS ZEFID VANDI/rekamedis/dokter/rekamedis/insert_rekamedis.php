<?php
session_start();
include "../../connect.php";
$tgl_pemeriksaan = $_POST["tahun"].'-'.$_POST["bulan"].'-'.$_POST["tanggal"];
mysql_query("INSERT INTO rekamedis(no_RM,kd_tindakan,kd_obat,kd_user,no_pasien,diagnosa,resep,keluhan,tgl_pemeriksaan,ket)VALUES
							('$_POST[no_RM]',
							 '$_POST[kd_tindakan]',
							 '$_POST[kd_obat]',
							 '$_POST[kd_user]',
							 '$_POST[no_pasien]',
							 '$_POST[diagnosa]',
							 '$_POST[resep]',
							 '$_POST[keluhan]',
							 '$tgl_pemeriksaan',
							 '$_POST[ket]')");
header('location:form_rekamedis.php');							 
?>