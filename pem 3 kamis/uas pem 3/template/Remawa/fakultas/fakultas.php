<?php
    include_once('../helper/config.php');
    include('../helper/cek-login.php');
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
    <link href="../assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME ICONS  -->
    <link href="../assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="../assets/css/style.css" rel="stylesheet" />
     <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div>
        <?php
        $username           = $_SESSION['username'];
        $query_user_login   = mysql_query(" SELECT * FROM admin WHERE username='$username'");
        $user_login         = mysql_fetch_array($query_user_login);
        ?>
    </div>
    
    <!-- HEADER END-->
    <div class="navbar navbar-inverse set-radius-zero">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="../dashboard-admin.php">

                    <img src="../assets/img/logo.png" />
                </a>

            </div>

            <div class="left-div">
                <div class="user-settings-wrapper">
                    <ul class="nav">

                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                                <span class="glyphicon glyphicon-user" style="font-size: 25px;"></span>
                            </a>
                            <div class="dropdown-menu dropdown-settings">
                                <div class="media">
                                    <a class="media-left" href="#">
                                        <img src="../assets/img/64-64.jpg" alt="" class="img-rounded" />
                                    </a>
                                    <div class="media-body">
                                        <h4 class="media-heading"><?php echo $user_login['fullname']; ?></h4>
                                        <h5>Developer & Designer</h5>

                                    </div>
                                </div>
                                <hr />
                                <h5><strong>Personal Bio : </strong></h5>
                                Anim pariatur cliche reprehen derit.
                                <hr />
                                <a href="#" class="btn btn-info btn-sm">Full Profile</a>&nbsp; <a href="logout-admin.php" class="btn btn-danger btn-sm">Logout</a>

                            </div>
                        </li>


                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- LOGO HEADER END-->
    <section class="menu-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="navbar-collapse collapse ">
                        <ul id="menu-top" class="nav navbar-nav navbar-right">
                            <li><a  href="../dashboard-admin.php">Dashboard</a></li>
                            <li><a class="menu-top-active" href="fakultas.php">Fakultas</a></li>
                            <li><a href="../prodi/prodi.php">Prodi</a></li>
                            <li><a href="../ormawa/ormawa.php">Ormawa</a></li>
                             <li><a href="../mahasiswa/mahasiswa.php">Mahasiswa</a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!-- MENU SECTION END-->
    <div class="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h4 class="page-head-line">Dashboard</h4>

                    <!-- Section Table Views -->
                    <div class="panel-body">                    
                    <div class="table-responsive">
                        <div class="form-group">
                                <?php 
                                    error_reporting(E_ALL ^ (E_NOTICE | E_WARNING));
                                    $message = $_GET['msg'];
                                    if ($message == 'success') { ?>
                                        <div class="alert alert-info">Success</div>
                                    <?php } elseif ($message == 'failed') { ?>
                                    <div class="alert alert-warning">Failed</div>
                                <?php } ?>
                            </div>

                        <div class="col-md-4">
                            <button type="button" class="btn btn-primary" onclick="location.href='fakultas-add.php'">Tambah Fakultas</button>
                        </div>
                        <h1 class="panel-body"></h1>
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>No.</th>
                                <th>Aksi</th>
                                <th>Nama Fakultas</th>
                            </tr>
                        </thead>
                        <tbody>
                            <?php 
                                $batas  = 5;
                                $pg     = isset($_GET['pg']) ? $_GET['pg'] : "";

                                if (empty($pg)) {
                                    $posisi = 0;
                                    $pg     = 1;
                                }else{
                                    $posisi = ($pg - 1) * $batas;
                                }

                                $query = mysql_query("SELECT * FROM fakultas LIMIT $posisi, $batas");

                                $i = 1 + $posisi;

                                while ($data = mysql_fetch_array($query)) {
                             ?>

                             <tr class="<?php if($i % 2 == 0) { echo "odd";} else { echo "even";} ?>">
                                 <td><?php echo $i; ?></td>
                                 <td>
                                     <?php 
                                        $data['id_fak'];

                                        if($_SESSION['role'] == 'admin'){
                                      ?>
                                      <div>
                                          <a href="fakultas-edit.php?id_fak=<?php echo $data['id_fak']; ?>" class="label label-info">Edit</a>
                                          |
                                          <a href="fakultas-delete.php?id_fak=<?php echo $data['id_fak']; ?>" class="label label-danger">Delete</a>
                                          
                                      </div>
                                      <?php } ?>
                                 </td>
                                 <td><?php echo $data['nama_fak']; ?></td>
                             </tr>
                             <?php $i++; } ?>
                        </tbody>
                        </table>

                        <nav aria-label="...">
                            <?php
                                $jml_data   = mysql_num_rows(mysql_query("SELECT * FROM fakultas"));
                                $jml_hal    = ceil($jml_data / $batas);

                                if ($pg > 1) {
                                    $link = $pg - 1;
                                    $prev = "<a href='?pg=$link'>Previous</a>";
                                } else {
                                    $prev = "";
                                }

                                if ($pg < $jml_hal) {
                                    $link = $pg + 1;
                                    $next = "<a href='?pg=$link'>Next</a>";
                                } else {
                                    $next = "";
                                }
                                echo "<ul class='pager'> <li class='previous'>" . $prev . "</li><li class='next'>" . $next . "<li></ul>";
                             ?>
                        </nav>
                    </div>
                </div>
                <!-- END Section Table Views -->
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
    <script src="../assets/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="../assets/js/bootstrap.js"></script>
</body>
</html>
