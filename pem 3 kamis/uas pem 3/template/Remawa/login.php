<?php 
    session_start();

    include_once('helper/config.php');
    if (!empty($_SESSION['username'])) {
    }
 ?>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Free Responsive Admin Theme - ZONTAL</title>
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME ICONS  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />
     <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    
    <!-- HEADER END-->
    <div class="navbar navbar-inverse set-radius-zero">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.php">

                    <img src="assets/img/logo.png" />
                </a>

            </div>

            <div class="left-div">
                <i class="fa fa-user-plus login-icon" ></i>
        </div>
            </div>
        </div>
    <!-- LOGO HEADER END-->
   
    <!-- MENU SECTION END-->
    <div class="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h4 class="page-head-line">LOGIN MAHASISWA </h4>

                </div>

            </div>

            <div class="row">
            <form role="form" action="helper/auth-index.php" method="post" >
                <div class="col-md-4">
                <?php
                    error_reporting(E_ALL ^ (E_NOTICE | E_WARNING));
                    $error =$_GET['error'];

                    if ($error == 1){
                        ?>
                        <div class="alert alert-danger">NIM dan Password Masih Kosong</div>
                        <?php }elseif ($error == 2) { ?>
                        <div class="alert alert-danger">NIM Kosong</div>
                        <?php }elseif ($error == 3) { ?>
                        <div class="alert alert-danger">Password Kosong</div>
                        <?php }elseif ($error == 4) { ?>
                        <div class="alert alert-danger">NIM dan Password Tidak Terdaftar</div>
                        <?php }elseif ($error == 5) { ?>
                        <div class="alert alert-danger">Maaf Anda Bukan Admin</div>
                        <?php } ?>
                    
                        <label>NIM : </label>
                        <input type="text" name="NIM" class="form-control" />
                        <label>Password :  </label>
                        <input type="password" name="password" class="form-control" />
                        <hr />
                        <button class="btn btn-info" type="submit"> <span class="glyphicon glyphicon-user"></span> &nbsp;Login </a>&nbsp;</button>
                </div>
            </form>
                <div class="col-md-8">
                    <div class="alert alert-info">
                        ORMAWA adalah Organisasi Mahasiswa yang beranggotakan mahasiswa untuk mewadahi bakat, minat
                        dan potensi mahasiswa yang dilaksanakan didalam kegiatan ko dan ekstra kurikuler. 
                        Pada dasarnya, Organisasi Mahasiswa adalah sebuah wadah berkumpulnya mahasiswa demi mencapai
                        tujuan bersama, namun harus tetap sesuai dengan koridor AD/ART yang disetujui oleh semua
                        anggota dan pengurus organisasi tersebut. 
                        <br />        
                    </div>
                    <div class="alert alert-success">
                         <strong> ORMAWA di Universitas Kanjuruhan Malang terbagi Menjadi 4 bagian, antara lain:</strong>
                        <ul>
                            <li>
                               Lembaga Tinggi Mahasiswa (LTM)
                            </li>
                            <li>
                                 Unit Kegiatan Mahasiswa (UKM)
                            </li>
                            <li>
                               Senat Mahasiswa Fakultas (SMF)
                            </li>
                            <li>
                                 Himpunan Mahasiswa Program Studi (HMPS)
                            </li>
                        </ul>
                       
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!-- CONTENT-WRAPPER SECTION END-->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    &copy; 2015 YourCompany | By : <a href="http://www.designbootstrap.com/" target="_blank">DesignBootstrap</a>
                </div>

            </div>
        </div>
    </footer>
    <!-- FOOTER SECTION END-->
    <!-- JAVASCRIPT AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="assets/js/bootstrap.js"></script>
</body>
</html>
