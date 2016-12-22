<?php
    include 'dbConnect.php';
    $cari=$_POST['cari1'];
    $query="UPDATE tb_cari SET cari1='$cari' where id=1";
    $con->query($query);
?>