<!doctype html>

    <html>
        <head>
            <title>web Jasa Laundry</title>
            <link rel="stylesheet" href="css/style.css">
            <link rel="stylesheet" href="css/bootstrap.css">
        </head>
        <body>
		
            <header>
                <h1><center>JASA LOUNDRY </center></a></h1>
				<h1><center>FAST AND CLEAN </center></a></h1>
            </header>
            <!--menu -->
			
            <nav>
                <ul>
				<center>
                    <li><a href="index.php">MENU</a>
                        <ul>
                            <li><a href="?page=barang">loundry</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Pembayaran loundry</a>
                        <ul>
                            <li><a href="?page=penjualan">Bayar</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
			</center>
            <br>
			</center>
            <div class="container">
                    <?php
                    include "db/koneksi.php";
                    $p=isset($_GET['page'])?$_GET['page']:null;
                    switch($p){
                        default:
                            
                            break;
                        case "barang":
                            include "barang.php";
                            break;                       
                        case "penjualan":
                            include "transaksi.php";
                            break;
                    }
                    ?>
            </div>
            </body>
    </html>