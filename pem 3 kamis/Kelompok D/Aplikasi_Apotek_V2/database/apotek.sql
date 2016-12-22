-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2016 at 05:35 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `apotek`
--

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `id_obat` varchar(30) NOT NULL,
  `id_supplier` varchar(30) NOT NULL,
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

INSERT INTO `obat` (`id_obat`, `id_supplier`, `nama_obat`, `stok_obat`, `hbeli_obat`, `hjual_obat`, `tgl_masuk`, `tgl_expired`) VALUES
('OB-0001', 'SP-0001', 'Demacolin', 10, 12000, 13000, '12 Mei 2016', '12 Juni 2016'),
('OB-0002', 'SP-0004', 'Laserin', 20, 10000, 11500, '12 Mei 2016', '12 Juni 2016'),
('OB-0003', 'SP-0002', 'Amoxilin', 10, 9000, 9600, '12 Mei 2016', '12 Juni 2016'),
('OB-0004', 'SP-0003', 'Novalgin', 16, 10000, 12000, '12 Mei 2016', '12 Juni 2016'),
('OB-0005', 'SP-0004', 'Neozep', 14, 12000, 12600, '12 Mei 2016', '12 Juni 2016');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=92 ;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id_pembelian`, `id_petugas`, `id_obat`, `kode_transaksi`, `nama_obat`, `hjual_obat`, `jumlah_beli`, `total_harga`) VALUES
(82, 1, 'OB-0002', 'PB-0001', 'Laserin', 11500, 3, 34500),
(83, 1, 'OB-0002', 'PB-0002', 'Laserin', 11500, 6, 69000),
(84, 1, 'OB-0002', 'PB-0002', 'Laserin', 11500, 2, 23000),
(87, 1, 'OB-0005', 'PB-0004', 'Neozep', 12600, 2, 25200),
(88, 1, 'OB-0003', 'PB-0005', 'Amoxilin', 9600, 2, 19200),
(89, 1, 'OB-0004', 'PB-0005', 'Novalgin', 12000, 3, 36000),
(90, 1, 'OB-0004', 'PB-0006', 'Novalgin', 12000, 3, 36000),
(91, 1, 'OB-0005', 'PB-0006', 'Neozep', 12600, 1, 12600);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `id_petugas`, `kode_transaksi`, `tgl_transaksi`, `jumlah_obat`, `total_bayar`) VALUES
(29, 1, 'PB-0001', '2016-05-14', '3', 34500),
(30, 1, 'PB-0002', '2016-05-15', '8', 92000),
(32, 1, 'PB-0005', '2016-05-15', '5', 55200),
(33, 1, 'PB-0006', '2016-05-15', '4', 48600);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `username`, `password`, `nama_petugas`, `jenis_kelamin`, `email`, `telp`, `alamat`) VALUES
(1, 'as', 'as', 'Andre Wahyu', 'Laki-Laki', 'wahyuandre007@gmail.com', '0341', 'Malang'),
(2, 'wahyu', '123', 'Wahyu', 'Laki-Laki', 'qwe', '123', 'mlg'),
(3, 'asd', 'nnm', 'qwe', 'Laki-Laki', 'qweeqw', '12313', 'mhh'),
(4, '', '', '', '', '', '', '');

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
MODIFY `id_pembelian` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=92;
--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
MODIFY `id_penjualan` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
MODIFY `id_petugas` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
