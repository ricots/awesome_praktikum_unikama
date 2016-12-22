<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../../config/style.css" rel="stylesheet" type="text/css" />
<title>PENCARIAN</title>
</head>

<body>

<?php include "../../menu_pasien.php"; ?>
<div id="atas"><?php include "search.php";?></div>
<div id="header">
<div id="content">
<h1>DOKTER</h1>
<?php  
include "../../connect.php";
$batas = 5;
$halaman = $_GET['halaman'];
if(empty($halaman)){
	$posisi=0;
	$halaman=1;
}
else{
	$posisi = ($halaman-1) * $batas;
}
 
	  if ( ! $_GET['input'] )
	  { $search = $_POST['txtsearch']; }
      else
	  { $search = $_GET['input']; }
	  if ( ! $_GET['kombo'] )
	  { $skripsi = $_POST['kategori']; }
      else
	  { $skripsi = $_GET['kombo'];}
      
   $sql = "SELECT * FROM dokter WHERE $skripsi LIKE '%$search%' ORDER BY kd_dokter ASC LIMIT $posisi,$batas ";
   $no=$posisi + 1;
   $result = mysql_query($sql) or die('Error, list skripsih failed. ' . mysql_error());  
      
   if (mysql_num_rows($result) == 0) {  
    echo 'Pencarian tidak ditemukan';  
   } else {  
    echo '<p></p>'; 
	?>
    
<table border="1">
<tr>
<th>No</th><th>Kd Dokter</th><th>Kd Poli</th><th>Tgl kunjungan</th><th>Nama</th><th>SIP</th><th>Tmp Lahir</th><th>No Telp</th><th>Alamat</th></tr>
	<?php
    while ($row = mysql_fetch_array($result)) {  
    extract($row);  
     
	echo "<tr>";
	echo "<td> $no </td> ";
	echo "<td> $row[kd_dokter] </td> ";
	echo "<td> $row[kd_poli] </td> ";
	echo "<td> $row[tgl_kunjungan] </td> ";
	echo "<td> $row[nm_dokter] </td> ";
	echo "<td> $row[SIP] </td> ";
	echo "<td> $row[tmp_lahir] </td> ";
	echo "<td> $row[no_telp] </td> ";
	echo "<td> $row[alamat] </td> ";
	echo "</tr>";
	 $no++;
     
    
    }
   }
    
  echo"</table>";
//Langkah ketiga:hitung total data dan halaman serta Link 1.2.3...
echo "<br>Halaman :&nbsp;";
	  if ( ! $_GET['input'] )
	  { $search = $_POST['txtsearch']; }
      else
	  { $search = $_GET['input']; }
	  if ( ! $_GET['kombo'] )
	  { $skripsi = $_POST['kategori']; }
      else
	  { $skripsi = $_GET['kombo'];}
$tampil2="SELECT * FROM dokter WHERE $skripsi LIKE '%$search%' ORDER BY kd_dokter ASC";
$hasil2=mysql_query($tampil2);
$jmldata=mysql_num_rows($hasil2);
$jmlhalaman=ceil($jmldata/$batas);
for($i=1;$i<=$jmlhalaman;$i++)
if($i!=$halaman)
{
	
	echo"<a href=$_SERVER[PHP_SELF]?halaman=$i&input=$search&kombo=$skripsi style=color:#000>$i</a> |";
}
else
{
	echo"<b>$i</b> |";
}
echo "<br>Total Pencarian dengan Kata <b>$search</b> :&nbsp;<b>$jmldata</b></p>";
?>


<br /><br />

</body>
</html>