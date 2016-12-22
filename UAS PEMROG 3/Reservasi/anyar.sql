-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2016 at 12:45 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `anyar`
--

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `id_kamar` varchar(6) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `kelas` varchar(20) DEFAULT NULL,
  `nomor` varchar(6) DEFAULT NULL,
  `keterangan` varchar(10) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `id_ruang` varchar(6) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `kapasitas` int(11) DEFAULT NULL,
  `kelas` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tamu`
--

CREATE TABLE `tamu` (
  `id_tamu` varchar(6) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `cek_in` date DEFAULT NULL,
  `id_kamar` varchar(6) DEFAULT NULL,
  `cek_out` date DEFAULT NULL,
  `no_tlp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tamuol`
--

CREATE TABLE `tamuol` (
  `id_tamuol` varchar(6) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tamuol`
--

INSERT INTO `tamuol` (`id_tamuol`, `email`, `password`) VALUES
('jovi', 'ryan', 'yuangga'),
('jovs', 'shit@yahoo.com', 'jovi'),
('kocu', 'kocu', 'kocu'),
('kriyuk', 'kryk', 'jancok'),
('qwdj', 'ajsdiw', 'asdajs');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_trans` varchar(6) NOT NULL,
  `id_tamu` varchar(6) DEFAULT NULL,
  `id_kamar` varchar(6) DEFAULT NULL,
  `id_res` varchar(6) DEFAULT NULL,
  `total` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`id_kamar`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`id_ruang`);

--
-- Indexes for table `tamu`
--
ALTER TABLE `tamu`
  ADD PRIMARY KEY (`id_tamu`),
  ADD KEY `FK_tamu_kamar` (`id_kamar`);

--
-- Indexes for table `tamuol`
--
ALTER TABLE `tamuol`
  ADD PRIMARY KEY (`id_tamuol`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kd_trans`),
  ADD KEY `FK_transaksi_tamu` (`id_tamu`),
  ADD KEY `FK_transaksi_kamar` (`id_kamar`),
  ADD KEY `FK_transaksi_resepsionis` (`id_res`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tamu`
--
ALTER TABLE `tamu`
  ADD CONSTRAINT `FK_tamu_kamar` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`id_kamar`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `FK_transaksi_kamar` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`id_kamar`),
  ADD CONSTRAINT `FK_transaksi_resepsionis` FOREIGN KEY (`id_res`) REFERENCES `tamuol` (`id_tamuol`),
  ADD CONSTRAINT `FK_transaksi_tamu` FOREIGN KEY (`id_tamu`) REFERENCES `tamu` (`id_tamu`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
