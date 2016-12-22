<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OBAT</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h2>INPUT OBAT</h2>
<form method="post" action="insert_obat.php">
<table border="0">
<tr><td>KD Obat</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(kd_obat)FROM obat";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM obat");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,3,4);
$no_pinjam++;
$newid = "OB".sprintf("%03s",$no_urut);

$cari = mysql_query ("SELECT * FROM obat WHERE kd_obat = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="OB".sprintf("%03s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="kd_obat" value="<?php echo $newid2 ?>" readonly required /></td></tr>
<tr><td>Nama Obat</td><td>:<input type="text" name="nm_obat" placeholder="Nama obat" size="35" required /></td></tr>
<tr><td>Jumlah Obat</td><td>:<input type="text" name="jml_obat" placeholder="Jumlah Obat" size="35" required /></td></tr>
<tr><td>Ukuran</td><td>:<select name="ukuran">
<option>--Pilih--</option>
<option value="Kecil">Kecil</option>
<option value="Sedang">Sedang</option>
<option value="Besar">Besar</option>
</select>
</td></tr>
<tr><td>Harga</td><td>:<input type="text" name="harga" placeholder="Harga" size="35" required /></td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="SIMPAN" />
		<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>
</form>



