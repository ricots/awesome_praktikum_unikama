-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2016 at 05:41 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_pdfor`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`id_admin` int(4) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL,
  `fullname` varchar(75) NOT NULL,
  `role` enum('admin','mahasiswa') NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`, `fullname`, `role`) VALUES
(1, 'admin', 'admin', 'admin nam', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `detail`
--

CREATE TABLE IF NOT EXISTS `detail` (
  `no_pend` int(11) NOT NULL,
  `Id_orm` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fakultas`
--

CREATE TABLE IF NOT EXISTS `fakultas` (
`id_fak` int(4) NOT NULL,
  `nama_fak` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `fakultas`
--

INSERT INTO `fakultas` (`id_fak`, `nama_fak`) VALUES
(1, 'Bahasa dan Sastraa'),
(2, 'Sains dan Teknologi'),
(3, 'Fakultas Pertanian');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `NIM` varchar(12) NOT NULL,
  `Tgl_lahir` date NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `tmpt_lahir` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `nope` varchar(14) NOT NULL,
  `email` varchar(50) NOT NULL,
  `semester` char(2) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `id_prd` varchar(4) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `Tgl_lahir`, `Nama`, `tmpt_lahir`, `gender`, `nope`, `email`, `semester`, `alamat`, `id_prd`, `password`) VALUES
('150403020001', '0000-00-00', 'Diana Agustin Purnama Asri', '', '', '', '', '', '', 'pd01', '123'),
('150403020002', '0000-00-00', 'Shofyatus Sholiqah', '', '', '', '', '', '', 'pd01', '1234'),
('150403020003', '0000-00-00', 'Ike Julia Kharisma', '', '', '', '', '', '', 'pd02', ''),
('150403020004', '0000-00-00', 'Fransiska Yuniarti Jelita T.', '', '', '', '', '', '', 'pd02', ''),
('150403020005', '0000-00-00', 'Eka Novita Sari', '', '', '', '', '', '', 'pd03', ''),
('150403020006', '0000-00-00', 'Andre Wahyu Hermawan', '', '', '', '', '', '', 'pd03', ''),
('150403020007', '0000-00-00', 'Ach. Irfan Ulum Ardianto', '', '', '', '', '', '', 'pd04', ''),
('150403020008', '0000-00-00', 'M. Zanky Addinu', '', '', '', '', '', '', 'pd04', ''),
('150403020009', '0000-00-00', 'Dimas Handoyo Kusuma P.', '', '', '', '', '', '', 'pd05', ''),
('150403020010', '0000-00-00', 'Nickyta Fikri Cendekiawan', '', '', '', '', '', '', 'pd05', ''),
('150403020011', '0000-00-00', 'Annurwan', '', '', '', '', '', '', 'pd06', ''),
('150403020012', '0000-00-00', 'Rizal Dwi Aprilia P.', '', '', '', '', '', '', 'pd06', ''),
('150403020013', '0000-00-00', 'Siprianus Kamuri', '', '', '', '', '', '', 'pd07', ''),
('150403020014', '0000-00-00', 'Yopi Firdha Pradana', '', '', '', '', '', '', 'pd07', ''),
('150403020015', '0000-00-00', 'Santoso', '', '', '', '', '', '', 'pd08', ''),
('150403020016', '0000-00-00', 'Petrus Kubito', '', '', '', '', '', '', 'pd08', ''),
('150403020017', '0000-00-00', 'Auldian Lating', '', '', '', '', '', '', 'pd09', ''),
('150403020018', '0000-00-00', 'Raditya Sholechan', '', '', '', '', '', '', 'pd09', ''),
('150403020019', '0000-00-00', 'Andry Hartanto', '', '', '', '', '', '', 'pd10', ''),
('150403020020', '0000-00-00', 'Ahmad Farid Husein', '', '', '', '', '', '', 'pd10', ''),
('150403020021', '0000-00-00', 'Fransiskus F. S. Arin', '', '', '', '', '', '', 'pd11', ''),
('150403020022', '0000-00-00', 'Jovi Ryan', '', '', '', '', '', '', 'pd11', ''),
('150403020023', '0000-00-00', 'Dedi Putra Widi U.', '', '', '', '', '', '', 'pd12', ''),
('150403020024', '0000-00-00', 'Angga Setiawan', '', '', '', '', '', '', 'pd12', ''),
('150403020025', '0000-00-00', 'Ahmad Izudin Makky', '', '', '', '', '', '', 'pd13', ''),
('150403020026', '0000-00-00', 'M. Sulton Irwinsyah', '', '', '', '', '', '', 'pd13', ''),
('150403020027', '0000-00-00', 'M. Ramadhani Al Fatih', '', '', '', '', '', '', 'pd14', ''),
('150403020028', '0000-00-00', 'Bakri', '', '', '', '', '', '', 'pd14', ''),
('150403020029', '0000-00-00', 'Jerry Malau', '', '', '', '', '', '', 'pd15', ''),
('150403020030', '0000-00-00', 'Imam Hidayat A.', '', '', '', '', '', '', 'pd15', '');

-- --------------------------------------------------------

--
-- Table structure for table `ormawa`
--

CREATE TABLE IF NOT EXISTS `ormawa` (
`Id_orm` int(4) NOT NULL,
  `nama_ormawa` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=31 ;

--
-- Dumping data for table `ormawa`
--

INSERT INTO `ormawa` (`Id_orm`, `nama_ormawa`) VALUES
(1, 'Mahkama Mahasiswa'),
(2, 'Majelis Permusyawaratan Mahasiswa'),
(3, 'Dewan Perwakilan Mahasiswa'),
(4, 'Badan Eksekutif Mahasiswa'),
(5, 'UKM KSR PMI'),
(6, 'UKM HIMPA'),
(7, 'UKM HIMPIS'),
(8, 'UKM GARANK'),
(9, 'UKM HMJF'),
(10, 'UKM PRAMUKA'),
(11, 'UKM PARAMA'),
(12, 'UKM PERISAI DIRI'),
(13, 'UKM PENALARAN'),
(14, 'SMF Ilmu Pendidikan'),
(15, 'SMF Bahasa dan Sastra'),
(16, 'SMF Sains dan Teknologi'),
(17, 'SMF Ekonomika dan Bisnis'),
(18, 'SMF Hukum'),
(19, 'SMF Peternakan'),
(20, 'HMPS Geografi'),
(21, 'HMPS Ekonomi'),
(22, 'HMPS Manajemen'),
(23, 'HMPS Sistem Informasi'),
(24, 'HMPS Teknik Informatika'),
(25, 'HMPS Matematika'),
(26, 'HMPS Fisika'),
(27, 'HMPS PGSD'),
(28, 'HMPS Akuntansi'),
(29, 'HMPS Sastrasia'),
(30, 'Al-Farabi');

-- --------------------------------------------------------

--
-- Table structure for table `pdf_ormawa`
--

CREATE TABLE IF NOT EXISTS `pdf_ormawa` (
`no_pend` int(11) NOT NULL,
  `Tahun_akademik` char(4) NOT NULL,
  `NIM` varchar(12),
  `Tanggal` date NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `pdf_ormawa`
--

INSERT INTO `pdf_ormawa` (`no_pend`, `Tahun_akademik`, `NIM`, `Tanggal`) VALUES
(1, '2015', '150403020007', '0000-00-00'),
(2, '2015', '150403020025', '0000-00-00'),
(3, '2015', '150403020019', '0000-00-00'),
(4, '2015', '150403020011', '0000-00-00'),
(5, '2016', '150403020007', '0000-00-00'),
(6, '2016', '150403020004', '0000-00-00'),
(7, '2016', '150403020004', '0000-00-00'),
(8, '2016', '150403020014', '0000-00-00'),
(9, '2016', '150403020025', '0000-00-00'),
(10, '2016', '150403020002', '0000-00-00'),
(11, '2016', '150403020002', '0000-00-00'),
(12, '2016', '150403020023', '0000-00-00'),
(13, '2015', '150403020009', '0000-00-00'),
(14, '2015', '150403020009', '0000-00-00'),
(15, '2015', '150403020005', '0000-00-00'),
(16, '2014', '150403020003', '0000-00-00'),
(17, '2014', '150403020018', '0000-00-00'),
(18, '2014', '150403020029', '0000-00-00'),
(19, '2014', '150403020008', '0000-00-00'),
(20, '2014', '150403020015', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `prodi`
--

CREATE TABLE IF NOT EXISTS `prodi` (
`id_prd` int(5) NOT NULL,
  `nama_prodi` varchar(50) NOT NULL,
  `id_fak` int(4) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=663 ;

--
-- Dumping data for table `prodi`
--

INSERT INTO `prodi` (`id_prd`, `nama_prodi`, `id_fak`) VALUES
(656, 'Bahasa Indonesia', 0),
(660, 'Sastra Inggris', 1),
(661, 'Matematika', 2),
(662, 'Fisika', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `detail`
--
ALTER TABLE `detail`
 ADD KEY `no_pend` (`no_pend`), ADD KEY `Id_orm` (`Id_orm`);

--
-- Indexes for table `fakultas`
--
ALTER TABLE `fakultas`
 ADD PRIMARY KEY (`id_fak`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
 ADD PRIMARY KEY (`NIM`), ADD KEY `id_prd` (`id_prd`);

--
-- Indexes for table `ormawa`
--
ALTER TABLE `ormawa`
 ADD PRIMARY KEY (`Id_orm`);

--
-- Indexes for table `pdf_ormawa`
--
ALTER TABLE `pdf_ormawa`
 ADD PRIMARY KEY (`no_pend`), ADD KEY `fk_3` (`NIM`);

--
-- Indexes for table `prodi`
--
ALTER TABLE `prodi`
 ADD PRIMARY KEY (`id_prd`), ADD KEY `id_fak` (`id_fak`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `id_admin` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `fakultas`
--
ALTER TABLE `fakultas`
MODIFY `id_fak` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ormawa`
--
ALTER TABLE `ormawa`
MODIFY `Id_orm` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=31;
--
-- AUTO_INCREMENT for table `pdf_ormawa`
--
ALTER TABLE `pdf_ormawa`
MODIFY `no_pend` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `prodi`
--
ALTER TABLE `prodi`
MODIFY `id_prd` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=663;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `pdf_ormawa`
--
ALTER TABLE `pdf_ormawa`
ADD CONSTRAINT `fk_3` FOREIGN KEY (`NIM`) REFERENCES `mahasiswa` (`NIM`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
