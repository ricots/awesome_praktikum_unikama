<?php  
include "../../connect.php";  
?>  
<html>  
<head>  
<title>Pencarian Berdasarkan Kategori</title>  
<link href="../../config/style.css" rel="stylesheet" type="text/css" />
</head>  
<body>
<form method="POST" action="hasil.php" id="form">  
<label for="txtsearch"><input type="text" name="txtsearch" placeholder="Search" required>  
<select name="kategori">  
<option value="">-- Cari Berdasarkan --</option>
<option value="no_pasien">Kode Pasien</option>  
<option value="kd_dokter">Kode Dokter</option>  
</select>  
<input class="submitcari" type="submit" value="Cari" name="submit"/>
</form>
</body>  
</html>