-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2016 at 05:46 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.5.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `absensi_siswa_smp`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_absen`
--

CREATE TABLE `tb_absen` (
  `Kd_absen` int(5) NOT NULL,
  `keterangan` varchar(50) DEFAULT NULL,
  `kd_jadwal` int(11) DEFAULT NULL,
  `nis` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_absen`
--

INSERT INTO `tb_absen` (`Kd_absen`, `keterangan`, `kd_jadwal`, `nis`) VALUES
(2, 'sakit', 1, 101),
(3, 'hadir', 2, 102),
(4, 'Ijin', 3, 103),
(5, 'Tanpa Berita', 4, 104);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail`
--

CREATE TABLE `tb_detail` (
  `Kd_absen` int(5) DEFAULT NULL,
  `nis` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_detail`
--

INSERT INTO `tb_detail` (`Kd_absen`, `nis`) VALUES
(3, 103);

-- --------------------------------------------------------

--
-- Table structure for table `tb_guru`
--

CREATE TABLE `tb_guru` (
  `nik` int(11) NOT NULL,
  `Nama_Guru` varchar(50) DEFAULT NULL,
  `Alamat` varchar(50) DEFAULT NULL,
  `No_Hp` int(12) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_guru`
--

INSERT INTO `tb_guru` (`nik`, `Nama_Guru`, `Alamat`, `No_Hp`, `Email`, `password`) VALUES
(123, 'yanto usman', 'Labuan Bajo', 2147483647, 'yanto@yaho.com', 'maria'),
(124, 'Joni Hambur', 'Sernaru', 2147483647, 'jony@yaho.com', 'maria'),
(125, 'Gusti Narto', 'Lancang', 2147483647, 'gusty@yaho.com', 'chelsy'),
(126, 'Chelsy Yulitha', 'Golo Koe', 2147483647, 'chelsy@yaho.com', 'chelsy'),
(127, 'yuni', 'ruteng', 86543221, 'yuni@yaho.con', 'maria');

-- --------------------------------------------------------

--
-- Table structure for table `tb_jadwal`
--

CREATE TABLE `tb_jadwal` (
  `kd_jadwal` int(11) NOT NULL,
  `nik` int(11) DEFAULT NULL,
  `kd_mapel` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jadwal`
--

INSERT INTO `tb_jadwal` (`kd_jadwal`, `nik`, `kd_mapel`) VALUES
(1, 123, 11),
(2, 124, 12),
(3, 125, 13),
(4, 126, 14);

-- --------------------------------------------------------

--
-- Table structure for table `tb_kelas`
--

CREATE TABLE `tb_kelas` (
  `kd_kelas` int(11) NOT NULL,
  `tingkat` varchar(50) NOT NULL,
  `nik` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kelas`
--

INSERT INTO `tb_kelas` (`kd_kelas`, `tingkat`, `nik`) VALUES
(1, '1', 123),
(21, '1', 123),
(22, '2', 124),
(23, '3', 125),
(24, '4', 126);

-- --------------------------------------------------------

--
-- Table structure for table `tb_mapel`
--

CREATE TABLE `tb_mapel` (
  `kd_mapel` int(11) NOT NULL,
  `mapel` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_mapel`
--

INSERT INTO `tb_mapel` (`kd_mapel`, `mapel`) VALUES
(11, 'matematika'),
(12, 'Bahasa Inggris'),
(13, 'Fisika'),
(14, 'Biologi'),
(16, 'sejarah');

-- --------------------------------------------------------

--
-- Table structure for table `tb_siswa`
--

CREATE TABLE `tb_siswa` (
  `nis` int(11) NOT NULL,
  `nama_siswa` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `nama_wali` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_siswa`
--

INSERT INTO `tb_siswa` (`nis`, `nama_siswa`, `alamat`, `nama_wali`) VALUES
(34, 'NOVI', 'PACAR', 'YUVEN'),
(101, 'Angelo', 'Labuan Bajo', 'Iwan'),
(102, 'Carissa', 'lancang', 'yanto'),
(103, 'Rizzky', 'Sernaru', 'Filo'),
(104, 'Bino', 'Dalong', 'Domi'),
(123, 'erik', 'panjura', 'ibu kos'),
(201, 'maria', 'malang', 'mana'),
(1234, 'ike', 'bjn', 'sd'),
(1243, 'rery', 'malang', 'fgis'),
(1256, 'yuni', 'ruteng', 'riung');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_absen`
--
ALTER TABLE `tb_absen`
  ADD PRIMARY KEY (`Kd_absen`),
  ADD KEY `kd_jadwal` (`kd_jadwal`),
  ADD KEY `nis` (`nis`);

--
-- Indexes for table `tb_detail`
--
ALTER TABLE `tb_detail`
  ADD KEY `nis` (`nis`),
  ADD KEY `Kd_absen` (`Kd_absen`);

--
-- Indexes for table `tb_guru`
--
ALTER TABLE `tb_guru`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `tb_jadwal`
--
ALTER TABLE `tb_jadwal`
  ADD PRIMARY KEY (`kd_jadwal`),
  ADD KEY `nis` (`nik`),
  ADD KEY `kd_mapel` (`kd_mapel`);

--
-- Indexes for table `tb_kelas`
--
ALTER TABLE `tb_kelas`
  ADD PRIMARY KEY (`kd_kelas`),
  ADD KEY `nik` (`nik`);

--
-- Indexes for table `tb_mapel`
--
ALTER TABLE `tb_mapel`
  ADD PRIMARY KEY (`kd_mapel`);

--
-- Indexes for table `tb_siswa`
--
ALTER TABLE `tb_siswa`
  ADD PRIMARY KEY (`nis`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_absen`
--
ALTER TABLE `tb_absen`
  ADD CONSTRAINT `tb_absen_ibfk_4` FOREIGN KEY (`kd_jadwal`) REFERENCES `tb_jadwal` (`kd_jadwal`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_absen_ibfk_5` FOREIGN KEY (`nis`) REFERENCES `tb_siswa` (`nis`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `tb_detail`
--
ALTER TABLE `tb_detail`
  ADD CONSTRAINT `tb_detail_ibfk_1` FOREIGN KEY (`nis`) REFERENCES `tb_siswa` (`nis`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_detail_ibfk_2` FOREIGN KEY (`Kd_absen`) REFERENCES `tb_absen` (`Kd_absen`);

--
-- Constraints for table `tb_jadwal`
--
ALTER TABLE `tb_jadwal`
  ADD CONSTRAINT `tb_jadwal_ibfk_1` FOREIGN KEY (`kd_mapel`) REFERENCES `tb_mapel` (`kd_mapel`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_jadwal_ibfk_2` FOREIGN KEY (`nik`) REFERENCES `tb_guru` (`nik`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `tb_kelas`
--
ALTER TABLE `tb_kelas`
  ADD CONSTRAINT `tb_kelas_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `tb_guru` (`nik`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
