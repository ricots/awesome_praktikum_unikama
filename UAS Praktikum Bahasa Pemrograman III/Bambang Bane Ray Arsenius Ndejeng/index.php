<?php 
	include_once('connection.php');
	$query = "SELECT * FROM barang";
	$exequery = mysqli_query($konek,$query);
 ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="css/bootstrap.css" rel="stylesheet">
    <title>UAS Pemrograman III</title>
</head>
<body>
	<div class="container" style="margin-top: 50px">
        <h1>Gudang Computer</h1>
        <hr />
        <form class="form-horizontal" method="post" action="insert.php">
            <div class="form-group">
                <label class="col-sm-2 control-label">KODE</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_kode" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">TIPE</label>
                <div class="col-sm-4">
                    <select name="inp_tipe" class="form-control">
                        <option>Casing</option>
                        <option>Cooler</option>
                        <option>HDD ODD SSD</option>
                        <option>Laptop</option>
                        <option>Keyboard</option>
                        <option>Mainboard</option>
                        <option>Memory</option>
                        <option>Monitor</option>
                        <option>Mouse</option>
                        <option>Power Supply</option>
                        <option>Processor</option>
                        <option>VGA</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">MEREK</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_merek" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">NAMA</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_nama" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">HARGA</label>
                <div class="col-sm-4">
                    <input type="number" name="inp_harga" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">KONDISI</label>
                <div class="col-sm-4">
                    <select name="inp_kondisi" class="form-control">
                        <option>Baru</option>
                        <option>Bekas</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label"></label>
                <div class="col-sm-4">
                    <input type="submit" name="submit" class="btn btn-default" value="INPUT DATA">
                </div>
            </div>
        </form>

<?php
/*
error_reporting(0);
$kode    = $konek->real_escape_string($_POST['inp_kode']);
$tipe    = $konek->real_escape_string($_POST['inp_tipe']);
$merek   = $konek->real_escape_string($_POST['inp_merek']);
$nama    = $konek->real_escape_string($_POST['inp_nama']);
$harga   = $konek->real_escape_string($_POST['inp_harga']);
$kondisi = $konek->real_escape_string($_POST['inp_kondisi']);

if($_POST['submit']){
$input = $konek->query("INSERT INTO barang (kode,tipe,merek,nama,harga,kondisi) VALUES ('$kode','$tipe','$merek','$nama','$harga','$kondisi')") or die($konek->error);
if($input){
echo '<div class="alert alert-success">Data berhasil disimpan >_<</div>';
echo "<a href='appear.php'>Refresh dulu ..</a>";
}else{
echo '<div class="alert alert-warning">Data gagal disimpan !!!</div>';
}
}
*/
?>
<?php

require_once('connection.php');
$query="select * from barang order by kode";
$exequery = mysqli_query($konek,$query);
$pola='asc';
$polabaru='asc';
if(isset($_GET['orderby'])){
    $orderby=$_GET['orderby'];
    $pola=$_GET['pola'];
    
    $query="SELECT * FROM barang order by $orderby $pola ";
    if($pola=='asc'){
        $polabaru='desc';
        
    }else{
        $polabaru='asc';
    }
}
?>
    <h2>Data Barang</h2>
    <hr />
    <table border="2" class="table-condensed" style="margin-bottom: 50px">
        <tr>
            <th>KODE</th>
            <th>TIPE</th>
            <th>MEREK</th>
            <th>NAMA</th>
            <th>HARGA</th>
            <th>KONDISI</th>
            <th>ACTION</th>
        </tr>
        <?php 
        while($baris = mysqli_fetch_assoc($exequery)){
         ?>
         <tr>
            <td><?php echo $baris['kode']; ?></td>
            <td><?php echo $baris['tipe']; ?></td>
            <td><?php echo $baris['merek']; ?></td>
            <td><?php echo $baris['nama']; ?></td>
            <td><?php echo $baris['harga']; ?></td>
            <td><?php echo $baris['kondisi']; ?></td>
            <td><a href="delete.php?kode=<?php echo $baris['kode'];?>">Delete |</a><a href="chance.php?kode=<?php echo $baris['kode'];?>">| Update</a></td>
         </tr>
         <?php } ?>
    </table>
</body>
</html>