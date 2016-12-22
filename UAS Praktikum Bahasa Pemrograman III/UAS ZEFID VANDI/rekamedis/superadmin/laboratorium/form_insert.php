<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>LABORATORIUM</title>
<link href="../../config/style.css" rel="stylesheet" type="text/css">
</head>

<body>
<?php include "../../menu.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h2>INPUT LABORATORIUM</h2>
<form method="post" action="insert_laboratorium.php">
<table border="0">
<tr><td>KD Lab</td>
<td>:<?php
include "../../connect.php";
$sql="SELECT MAX(kd_lab)FROM laboratorium";
$hasil=mysql_query($sql);
$data = mysql_fetch_array($hasil);
$hasil2 = mysql_query("SELECT * FROM laboratorium");
$no_urut=mysql_num_rows($hasil2)+1;
$max=$data[0];
$no_pinjam=(int)substr($max,2,3);
$no_pinjam++;
$newid = "L".sprintf("%04s",$no_urut);

$cari = mysql_query ("SELECT * FROM laboratorium WHERE kd_lab = '$newid'");
$tampil = mysql_num_rows($cari);
if($tampil>=1){
$no_urut2=$no_urut+1;
$newid2="L".sprintf("%04s",$no_urut2);
}
else{
$newid2=$newid;}

?>
<input type="text" name="kd_lab" value="<?php echo $newid2 ?>" readonly required /></td></tr>
<tr><td>No RM</td><td>:<select name="no_RM">
<option>--Pilih--</option>
<?php
include "../../connect.php";
$tampil=mysql_query("SELECT * FROM rekamedis ORDER BY no_RM ASC");
while($data=mysql_fetch_array($tampil)){
echo "<option value='$data[no_RM]'>$data[no_RM]</option>";
}
?>
</select>
</td></tr>
<tr><td>Hasil Lab</td><td>:<input type="text" name="hasil_lab" placeholder="Hasil Lab" required /></td></tr>
<tr><td>Ket</td><td>:<input type="text" name="ket" placeholder="ket" size="35" required /></td></tr>
<tr><td colspan="2"><input class="submit" type="submit" value="SIMPAN" />
		<input class="submit" type="button" value="BATAL" onclick="self.history.back()" /></td></tr>
</table>
</form>



