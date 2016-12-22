<?php
session_start();
include"connect.php";
$nama = $_SESSION["user"];
$level = $_SESSION["level"];
if($level == 'superadmin' OR $level =='dokter'){
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>HOME</title>
<link href="config/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="menu">
<ul>
		<ul>
        	<li><a href="dokter.php">&raquo;&nbsp;HOME</a></li>
			<li><a href="dokter/poliklinik/form_poliklinik.php">&raquo;&nbsp;POLIKLINIK</a></li>
			<li><a href="dokter/dokter/form_dokter.php">&raquo;&nbsp;DOKTER</a></li>
			<li><a href="dokter/pasien/form_pasien.php">&raquo;&nbsp;PASIEN</a></li>
            <li><a href="dokter/obat/form_obat.php">&raquo;&nbsp;OBAT</a></li>
			<li><a href="dokter/rekamedis/form_rekamedis.php">&raquo;&nbsp;REKAMEDIS</a></li>
			<li><a href="dokter/kunjungan/form_kunjungan.php">&raquo;&nbsp;KUNJUNGAN</a></li>
			<li><a href="dokter/tindakan/form_tindakan.php">&raquo;&nbsp;TINDAKAN</a></li>
			<li><a href="dokter/laboratorium/form_laboratorium.php">&raquo;&nbsp;LABORATORIUM</a></li>
            <li><a href="dokter/Laporan/laporan_kunjungan.php"> &raquo;&nbsp;LAPORAN KUNJUNGAN</a></li>
            <li><a href="logout.php"> &raquo;&nbsp;LOGOUT</a></li>
        </ul>
            
</ul>
</div>
</div>
<div id="atassuper"></div>
<div id="header">
<div id="home">
<div id="content">
<p>SELAMAT DATANG : Dr. <?php echo $nama; ?></p>
<p>Website ini memudahkan anda dalam melakukan pengobatan
dan pelayanan yang baik terhadap para pasien rumah sakit
semoga anda nyaman selama berada di rumah sakit ini</p>


</p>
</div></div></div>

<?php
}
else{
?>
<script>alert("MAAF ANDA TIDAK MEMILIKI HAK AKSES HALAMAN INI");</script>
<script>window.location='index.php';</script>
<?php
}
?>
</body>