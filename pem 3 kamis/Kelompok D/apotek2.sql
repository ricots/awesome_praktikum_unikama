-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2016 at 05:38 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `apotek2`
--

-- --------------------------------------------------------

--
-- Stand-in structure for view `detail_penjualan`
--
CREATE TABLE IF NOT EXISTS `detail_penjualan` (
`id_penjualan` int(10)
,`nama_petugas` varchar(30)
,`kode_transaksi` varchar(30)
,`tgl_transaksi` varchar(30)
,`jumlah_obat` varchar(30)
,`total_harga` int(30)
,`total_bayar` int(30)
);
-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `id_obat` varchar(30) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `stok_obat` int(30) NOT NULL,
  `hbeli_obat` int(30) NOT NULL,
  `hjual_obat` int(30) NOT NULL,
  `tgl_masuk` varchar(30) NOT NULL,
  `tgl_expired` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `nama_obat`, `stok_obat`, `hbeli_obat`, `hjual_obat`, `tgl_masuk`, `tgl_expired`) VALUES
('OB-0001', 'Demacolin', 10, 12000, 13000, '12 Mei 2016', '12 Juni 2016'),
('OB-0002', 'Laserin', 29, 10000, 11500, '12 Mei 2016', '12 Juni 2016'),
('OB-0003', 'Amoxilin', 10, 9000, 9600, '12 Mei 2016', '12 Juni 2016'),
('OB-0004', 'Novalgin', 15, 10000, 12000, '12 Mei 2016', '12 Juni 2016'),
('OB-0005', 'Neozep', 15, 12000, 12600, '12 Mei 2016', '12 Juni 2016'),
('OB-0006', 'Amoxan', 22, 20000, 21000, '12 Mei 2016', '12 Juni 2016');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE IF NOT EXISTS `pembelian` (
`id_pembelian` int(10) NOT NULL,
  `id_petugas` int(10) NOT NULL,
  `id_obat` varchar(30) NOT NULL,
  `kode_transaksi` varchar(30) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `hjual_obat` int(30) NOT NULL,
  `jumlah_beli` int(30) NOT NULL,
  `total_harga` int(30) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id_pembelian`, `id_petugas`, `id_obat`, `kode_transaksi`, `nama_obat`, `hjual_obat`, `jumlah_beli`, `total_harga`) VALUES
(1, 1, 'OB-0002', 'PJ-101220160001', 'Laserin', 11500, 2, 23000),
(2, 1, 'OB-0004', 'PJ-101220160001', 'Novalgin', 12000, 2, 24000),
(3, 1, 'OB-0003', 'PJ-151220160002', 'Amoxilin', 9600, 2, 19200),
(4, 1, 'OB-0004', 'PJ-151220160002', 'Novalgin', 12000, 2, 24000),
(5, 1, 'OB-0004', 'PJ-151220160003', 'Novalgin', 12000, 3, 36000),
(6, 1, 'OB-0005', 'PJ-151220160003', 'Neozep', 12600, 2, 25200);

--
-- Triggers `pembelian`
--
DELIMITER //
CREATE TRIGGER `kurangiStok` AFTER INSERT ON `pembelian`
 FOR EACH ROW UPDATE obat SET stok_obat=stok_obat-NEW.jumlah_beli

 WHERE id_obat=NEW.id_obat
//
DELIMITER ;
DELIMITER //
CREATE TRIGGER `tambahStok` AFTER DELETE ON `pembelian`
 FOR EACH ROW UPDATE obat SET stok_obat=stok_obat+OLD.jumlah_beli

 WHERE id_obat=OLD.id_obat
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
`id_penjualan` int(10) NOT NULL,
  `id_petugas` int(10) NOT NULL,
  `kode_transaksi` varchar(30) NOT NULL,
  `tgl_transaksi` varchar(30) NOT NULL,
  `jumlah_obat` varchar(30) NOT NULL,
  `total_bayar` int(30) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=48 ;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
`id_petugas` int(10) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nama_petugas` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telp` varchar(20) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `username`, `password`, `nama_petugas`, `jenis_kelamin`, `email`, `telp`, `alamat`) VALUES
(1, 'as', 'as', 'Andre Wahyu', 'Laki-Laki', 'wahyuandre007@gmail.com', '0341', 'Malang'),
(2, 'wahyu', '123', 'Wahyu', 'Laki-Laki', 'qwe', '123', 'mlg'),
(3, 'asd', 'nnm', 'qwe', 'Perempuan', 'qweeqw', '12313', 'mhh');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE IF NOT EXISTS `supplier` (
  `id_supplier` varchar(30) NOT NULL,
  `nama_supplier` varchar(30) NOT NULL,
  `telp` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `telp`, `email`, `alamat`) VALUES
('SP-0001', 'Andre', '123', 'wahyuandre@gmail.com', 'malang'),
('SP-0002', 'Lisayang', '111', 'qwe', 'pasuruan'),
('SP-0003', 'Fikri', '222', 'zxc', 'mojokerto'),
('SP-0004', 'Wahyu', '333', 'rty', 'jambi');

-- --------------------------------------------------------

--
-- Structure for view `detail_penjualan`
--
DROP TABLE IF EXISTS `detail_penjualan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `detail_penjualan` AS select `penjualan`.`id_penjualan` AS `id_penjualan`,`petugas`.`nama_petugas` AS `nama_petugas`,`penjualan`.`kode_transaksi` AS `kode_transaksi`,`penjualan`.`tgl_transaksi` AS `tgl_transaksi`,`penjualan`.`jumlah_obat` AS `jumlah_obat`,`pembelian`.`total_harga` AS `total_harga`,`penjualan`.`total_bayar` AS `total_bayar` from ((`penjualan` join `petugas`) join `pembelian` on(((`penjualan`.`id_petugas` = `petugas`.`id_petugas`) and (`penjualan`.`kode_transaksi` = `pembelian`.`kode_transaksi`))));

--
-- Indexes for dumped tables
--

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
 ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
 ADD PRIMARY KEY (`id_pembelian`), ADD KEY `kode_transaksi` (`kode_transaksi`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
 ADD PRIMARY KEY (`id_penjualan`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
 ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
 ADD PRIMARY KEY (`id_supplier`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
MODIFY `id_pembelian` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
MODIFY `id_penjualan` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=48;
--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
MODIFY `id_petugas` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
