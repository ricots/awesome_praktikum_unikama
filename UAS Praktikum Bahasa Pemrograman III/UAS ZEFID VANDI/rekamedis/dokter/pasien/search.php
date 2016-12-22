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
<option value="nm_pasien">Nama</option>  
<option value="agama">Agama</option>
<option value="alamat">alamat</option>    
</select>  
<input class="submitcari" type="submit" value="Cari" name="submit"/>
</form>
</body>  
</html>
