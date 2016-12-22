<!DOCTYPE html>
<html lang="en">
<head>
    <link href="css/bootstrap.css" rel="stylesheet">
    <title>UAS Pemrograman III</title>
	<h3>Update Data</h3>
    <hr />
	<?php 
    include_once('connection.php');
	$kode = $_GET['kode'];
    $query = "SELECT * FROM barang WHERE kode='$kode'";
	$exequery = mysqli_query($konek,$query);
	while($baris = mysqli_fetch_assoc($exequery)){
	?>
	<form class="form-horizontal" method="post" action="update.php">
            <div class="form-group">
                <label class="col-sm-2 control-label">KODE</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_kode" class="form-control" value="<?php echo $baris['kode'] ?>" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">TIPE</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_tipe" class="form-control" value="<?php echo $baris['tipe'] ?>" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">MEREK</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_merek" class="form-control" value="<?php echo $baris['merek'] ?>" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">NAMA</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_nama" class="form-control" value="<?php echo $baris['nama'] ?>" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">HARGA</label>
                <div class="col-sm-4">
                    <input type="number" name="inp_harga" class="form-control" value="<?php echo $baris['harga'] ?>" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">KONDISI</label>
                <div class="col-sm-4">
                    <input type="text" name="inp_kondisi" class="form-control" value="<?php echo $baris['kondisi'] ?>" required>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label"></label>
                <div class="col-sm-4">
                    <input type="submit" name="submit" class="btn btn-default" value="SAVE DATA">
                </div>
            </div>
        </form>
	<?php } ?>

</head>
<body>

</body>
</html>