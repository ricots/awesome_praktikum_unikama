<?php
header("Content-type: application/octet-stream");
header("Content-Disposition: attachment; filename=laporan_kunjungan.xls");//ganti nama sesuai keperluan
header("Pragma: no-cache");
header("Expires: 0");
?>
<center>
<h1>LAPORAN KUNJUNGAN PASIEN</h1><br>
<table border="1">
	    <tr>
    	<th>NO</th>
        <th>KODE PASIEN</th>
        <th>NAMA PASIEN</th>
        <th>AGAMA</th>
        <th>ALAMAT</th>
        <th>NAMA DOKTER</th>
        <th>TGL KUNJUNGAN</th>
        <th>JAM KUNJUNGAN</th>
       
      
    </tr>
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
$tampil=mysql_query("SELECT p.no_pasien,p.nm_pasien,p.agama,p.alamat,d.nm_dokter,k.tgl_kunjungan,k.jam_kunjungan
FROM pasien p, kunjungan k, dokter d
WHERE p.no_pasien = k.no_pasien AND d.kd_dokter = k.kd_dokter ORDER BY no_pasien ASC limit $posisi,$batas");
$no = $posisi + 1;
while($r = mysql_fetch_array($tampil))
{echo"
	<tr>
		<td>$no</td>
		<td>$r[no_pasien]</td>
		<td>$r[nm_pasien]</td>
		<td>$r[agama]</td>
		<td>$r[alamat]</td>
		<td>$r[nm_dokter]</td>
		<td>$r[tgl_kunjungan]</td>
		<td>$r[jam_kunjungan]</td>
		</tr>";
	$no++;
}
echo"</table>";
?>
</table></center>