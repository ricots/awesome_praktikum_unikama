<?php
session_start();
include "../../connect.php";
$jam = date("H:i:s");
$tgl_kunjungan = $_POST[tahun].'-'.$_POST[bulan].'-'.$_POST[tanggal];
mysql_query("INSERT INTO kunjungan(tgl_kunjungan,no_pasien,kd_dokter,jam_kunjungan)VALUES
							('$tgl_kunjungan',
							'$_POST[no_pasien]',
							'$_POST[kd_dokter]',
							'$jam')");
header('location:form_kunjungan.php');							 
?>