-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 16 Des 2016 pada 08.55
-- Versi Server: 5.5.34
-- Versi PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `130090615070`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `accounts`
--

CREATE TABLE IF NOT EXISTS `accounts` (
  `id_acc` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(35) NOT NULL,
  `level` varchar(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `birth` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id_acc`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `accounts`
--

INSERT INTO `accounts` (`id_acc`, `username`, `password`, `level`, `name`, `gender`, `birth`, `address`, `phone`, `email`) VALUES
(1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin', 'Wahyu Pribadi', 'male', '16 Agustus 1996', 'Jl.Gondomono 19 Kepanjen', '089617547399', 'admin@yahoo.co.id'),
(2, 'user', 'ee11cbb19052e40b07aac0ca060c23ee', 'user', 'user', 'male', '28 December 1996', 'example2', '089123456789', 'user@yahoo.co.id'),
(4, 'kurniawan', '16ca55b4f29157780eabc6244f49d442', 'user', 'kuniawan', 'male', '12122012', 'dceve', '0854436356', 'kunr@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id_kategori` int(5) NOT NULL AUTO_INCREMENT,
  `nama_kategori` varchar(50) NOT NULL,
  PRIMARY KEY (`id_kategori`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data untuk tabel `category`
--

INSERT INTO `category` (`id_kategori`, `nama_kategori`) VALUES
(1, 'Raglan'),
(2, 'Jaket'),
(3, 'Kemeja');

-- --------------------------------------------------------

--
-- Struktur dari tabel `item`
--

CREATE TABLE IF NOT EXISTS `item` (
  `id_item` int(5) NOT NULL AUTO_INCREMENT,
  `kode_brg` varchar(20) NOT NULL,
  `name_product` varchar(30) NOT NULL,
  `rate_product` int(15) NOT NULL,
  `future` text NOT NULL,
  `spec` text NOT NULL,
  `image` varchar(30) NOT NULL,
  `stock` varchar(5) NOT NULL,
  `id_kategori` int(5) NOT NULL,
  PRIMARY KEY (`id_item`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data untuk tabel `item`
--

INSERT INTO `item` (`id_item`, `kode_brg`, `name_product`, `rate_product`, `future`, `spec`, `image`, `stock`, `id_kategori`) VALUES
(1, 'RG01', 'Kaos Polos', 60000, 'Bahan : CottonSize  : S, M, L, XL', '', 'kaos polos.png', '4', 1),
(2, 'Ko1', 'Kaos oblong', 45000, 'sembarangBahan : CottonSize  : S, M, L, XL', '', 'default.jpg', '10', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `style`
--

CREATE TABLE IF NOT EXISTS `style` (
  `id_style` varchar(5) NOT NULL,
  `title_about` varchar(50) NOT NULL,
  `title_contact` varchar(50) NOT NULL,
  `about` text NOT NULL,
  `contact` text NOT NULL,
  `logo` varchar(50) NOT NULL,
  `embed` text NOT NULL,
  `title_help` varchar(50) NOT NULL,
  `help` text NOT NULL,
  PRIMARY KEY (`id_style`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `style`
--

INSERT INTO `style` (`id_style`, `title_about`, `title_contact`, `about`, `contact`, `logo`, `embed`, `title_help`, `help`) VALUES
('1', 'About Us', 'Contact And Maps', 'PNJ 23 Store terletak di Perumahan Puri Nirwana Janti kota malang. toko ini menyediakan berbagai macam pakaian, baju, celana, kaos dll. barang yang di jual di PNJ 23 store 100% original.', 'Address : Kav. 23 Perumahan Puri Nirwana Janti\r\n          Kota Malang, Jawa Timur\r\n          Indonesia\r\nPhone   : (0341)-00000\r\nemail   : TIFam@Gmail.com', 'logo.png', '<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3950.9434702706494!2d112.62009831437493!3d-8.004766994235338!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2dd627ffae4d346d%3A0x42e0da2972353ccd!2sPuri+Nirwana+Janti!5e0!3m2!1sid!2sid!4v1481868799318" width="100%" height="400px" frameborder="0" style="border:0" allowfullscreen></iframe>', 'How to use website store', '1. Login :\r\n   Default login admin :\r\n        username  : admin\r\n        password  : admin\r\n2. Permintaan pelangan akan masuk dalam daftar antrian yang ada pada menu inbox saat admin \r\n   sudah login.\r\n3. Admin Mengecheck di email TIFam@Gmail.com, jika pembeli sudah melakukan transfer maka\r\n   admin merubah status menjadi sucsess dan memasukkan no resi barang kiriman yang di pesan.\r\n---------------------------------------------- //------------------------------------------------\r\nAdd Product :\r\n1. login sebagai admin terlebih dahulu.\r\n2. pilih menu product yang ada di sebelah kiri layar.\r\n3. setelah masuk di menu product. klik add product.\r\n4. kemudian masukkan product yang akan di tambahkan.\r\n5. upload foto product dengan resolusi 400 x 400\r\n6. save.\r\n------------------------------------------------------// -----------------------------------------\r\nadd admin :\r\n1. login sebagai admin.\r\n2. klik admin di menu sebelah kiri.\r\n3. masukkan biodata admin.\r\n4. klik simpan.');

-- --------------------------------------------------------

--
-- Struktur dari tabel `trans`
--

CREATE TABLE IF NOT EXISTS `trans` (
  `id_trans` int(11) NOT NULL AUTO_INCREMENT,
  `name_product` varchar(30) NOT NULL,
  `kode_brg` varchar(20) NOT NULL,
  `rate_product` int(15) NOT NULL,
  `total_purchase` int(5) NOT NULL,
  `username` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `status` varchar(10) NOT NULL,
  `resi` varchar(20) NOT NULL,
  `date` varchar(25) NOT NULL,
  `total_rate` int(11) NOT NULL,
  `transfer` varchar(100) NOT NULL,
  PRIMARY KEY (`id_trans`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `trans`
--

INSERT INTO `trans` (`id_trans`, `name_product`, `kode_brg`, `rate_product`, `total_purchase`, `username`, `name`, `address`, `phone`, `status`, `resi`, `date`, `total_rate`, `transfer`) VALUES
(1, 'Kaos Polos', 'RG01', 60000, 1, 'kurniawan', 'kuniawan', 'dfydfd', '08544444444', 'Success', '`12345678o', '16-12-2016', 60000, 'kaos polos.png');

--
-- Trigger `trans`
--
DROP TRIGGER IF EXISTS `stock`;
DELIMITER //
CREATE TRIGGER `stock` AFTER INSERT ON `trans`
 FOR EACH ROW begin
update item
set stock = stock-new.total_purchase
where kode_brg=new.kode_brg;
end
//
DELIMITER ;
DROP TRIGGER IF EXISTS `stock_kembali`;
DELIMITER //
CREATE TRIGGER `stock_kembali` AFTER DELETE ON `trans`
 FOR EACH ROW begin
update item
set stock = stock+old.total_purchase
where kode_brg=old.kode_brg;
end
//
DELIMITER ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
