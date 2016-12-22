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
                                ^_^ ^_^ ^_^
                                <hr />
                                <a href="#" class="btn btn-info btn-sm">Full Profile</a>&nbsp; <a href="logout-admin.php" class="btn btn-danger btn-sm">Logout</a>

                            </div>
                        </li>
                    </ul>
                            
                    <!-- Welcome -->
                <div class="col-lg-12">
                        <?php 
                            error_reporting(E_ALL ^ (E_NOTICE | E_WARNING));
                            $message    = $_GTE['msg'];

                            if ($message == 'success') { ?>
                            <div class="alert alert-info">Success! You have successfully changed your password</div>
                            <?php } elseif ($message == 'failed') { ?>
                            <div class="alert alert-danger">Failed! The new password and confirm new password fields must be the same</div>
                            <?php } ?>
                </div>
                <!--end  Welcome -->
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>No.</th>
                                            <th>NIM</th>
                                            <th>Nama</th>
                                            <th>Tanggal Lahir</th>
                                            <th>Tempat Lahir</th>
                                            <th>Gender</th>
                                            <th>Nomor HP</th>
                                            <th>E-mail</th>
                                            <th>Semester</th>
                                            <th>Alamat</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <?php 
                                            $batas  = 10;
                                            $pg     = isset($_GET['pg']) ? $_GET['pg'] : "";

                                            if (empty($pg)) {
                                                $posisi = 0;
                                                $pg     = 1;
                                            } else {
                                                $posisi = ($pg - 1) * $batas;
                                            }

                                            $query  = mysql_query("SELECT 
                                                                     mhs.NIM,
                                                                     mhs.Nama,
                                                                     mhs.password,
                                                                     mhs.Tgl_lahir,
                                                                     mhs.tmpt_lahir,
                                                                     mhs.alamat,
                                                                     prodi.nama_prodi,
                                                                     mhs.semester,
                                                                     mhs.nope,
                                                                     mhs.email
                                                                FROM mahasiswa AS mhs LEFT JOIN prodi as prodi ON mhs.id_prd = prodi.id_prd LIMIT $posisi, $batas");

                                            $i = 1 + $posisi;

                                            while ($data = mysql_fetch_assoc($query)) {
                                         ?>
                                         <tr class="<?php if ($i % 2 == 0) { echo "odd"; } else { echo "even"; } ?>">
                                            <td><?php echo $i; ?></td>
                                            <td>
                                                <?php 
                                                   echo $data['NIM'];

                                                    if ($_SESSION['role'] == 'admin') {
                                                 ?>
                                                 <div class="">
                                                     <a href="mahasiswa-edit.php?nim=<?php echo $data['nim']; ?>" class="label label-info">Edit</a>
                                                     <?php if ($data['username'] != 'admin') { ?>
                                                     |
                                                     <a href="mahasiswa-delete.php?nim=<?php echo $data['nim']?>" class="label label-danger">Delete</a>
                                                     <?php } ?>
                                                 </div>
                                                 <?php } ?>
                                            </td>
                                            <td><?php echo $data['nama']; $data['password']; ?></td>
                                            <td><?php echo $data['Tgl_lahir']; ?></td>
                                            <td><?php echo $data['tmpt_lahir']; ?></td>
                                            <td><?php echo $data['alamat']; ?></td>
                                            <td><?php echo $data['nama_prodi']; ?></td>
                                            <td><?php echo $data['semester']; ?></td>
                                            <td><?php echo $data['nope']; ?></td>
                                            <td><?php echo $data['email']; ?></td>
                                        </tr>
                                            <?php $i++; } ?>

                                        </tbody>
                                    </table>

                                    <nav aria-label="...">
                                            <?php 
                                                //Menghitung jumlah data
                                                $jml_data   = mysql_num_rows(mysql_query("SELECT 
                                                                     mhs.nim,
                                                                     mhs.nama_mahasiswa,
                                                                     mhs.password,
                                                                     mhs.tgl_lahir,
                                                                     mhs.tempat_lahir,
                                                                     mhs.alamat_mahasiswa,
                                                                     prodi.nama_jurusan,
                                                                     mhs.semester,
                                                                     mhs.nope,
                                                                     mhs.email
                                                                FROM tbl_mahasiswa AS mhs LEFT JOIN tbl_jurusan as prodi ON mhs.id_jurusan = prodi.id_jurusan"));

                                                //Jumlah halaman
                                                //Ceil digunakan untuk pembulatan ke atas
                                                $jml_hal    = ceil($jml_data / $batas); 

                                                //Navigasi ke menu sebelumnya
                                                if ($pg > 1) {
                                                    $link = $pg - 1;
                                                    //&laquo;
                                                    $prev = "<a href='?pg=$link'>Previous</a>";
                                                } else {
                                                    $prev = "";
                                                }

                                                //Navigasi ke selanjutnya
                                                if ($pg < $jml_hal) {
                                                    $link = $pg + 1;
                                                    //&raquo;
                                                    $next = "<a href='?pg=$link'>Next</a>";
                                                } else {
                                                    $next = "";
                                                }
                                               
                                                echo "<ul class='pager'> <li class='previous'>". $prev . "</li><li class='next'>". $next . "<li></ul>";
                                             ?>
                                    </nav>
                            </div>
                            
                        </div>
                    </div>
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
                            <li><a class="../fakultas/fakultas.php">Fakultas</a></li>
                            <li><a href="../prodi/prodi.php">Prodi</a></li>
                            <li><a href="../ormawa/ormawa.php">Ormawa</a></li>
                             <li><a href="menu-top-active" href="mahasiswa.php">Mahasiswa</a></li>
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
                    <div class="col-md-4">
                        <form method="post" action="mahasiswa-insert.php">
                            <div class="form-group">
                                <label>Mahasiswa</label>
                                <input type="text" class="form-control" name="nama">
                                <input type="date" class="form-control" name="Tgl_lahir">
                                <input type="text" class="form-control" name="tmpt_lahir">
                                <input type="text" class="form-control" name="gender">
                                <input type="text" class="form-control" name="nope">
                                <input type="text" class="form-control" name="email">
                                <input type="text" class="form-control" name="semester">
                                <input type="text" class="form-control" name="alamat">
                                <input type="text" class="form-control" name="password">
                            </div>
                            <div class="form-group">
                                        </div>

                            <div class="form-group">
                                <button type="submit" class="btn btn-primary form-control" name="submit">Simpan</button>
                            </div>
                        </form>
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
    <script src="../assets/js/jquery-1.11.1.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="../assets/js/bootstrap.js"></script>
</body>
</html>
