-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2016 at 11:35 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.5.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_gaji`
--

CREATE TABLE `tb_gaji` (
  `no_slip` varchar(15) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `pendapatan` double DEFAULT NULL,
  `potongan` double DEFAULT NULL,
  `gaji_bersih` double DEFAULT NULL,
  `nik` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_golongan`
--

CREATE TABLE `tb_golongan` (
  `id_golongan` varchar(15) NOT NULL,
  `gaji_pokok` double DEFAULT NULL,
  `tunj_anak` double DEFAULT NULL,
  `tunj_menikah` double DEFAULT NULL,
  `uang_makan` double DEFAULT NULL,
  `uang_transport` double DEFAULT NULL,
  `askes` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_golongan`
--

INSERT INTO `tb_golongan` (`id_golongan`, `gaji_pokok`, `tunj_anak`, `tunj_menikah`, `uang_makan`, `uang_transport`, `askes`) VALUES
('G001', 1500000, 75000, 150000, 20000, 15000, 30000),
('G002', 1750000, 100000, 175000, 20000, 20000, 30000),
('G003', 2000000, 125000, 200000, 30000, 25000, 30000),
('G004', 2250000, 150000, 225000, 30000, 30000, 30000),
('G005', 2500000, 175000, 250000, 40000, 35000, 30000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_jabatan`
--

CREATE TABLE `tb_jabatan` (
  `id_jabatan` varchar(15) NOT NULL,
  `nama_jabatan` varchar(25) DEFAULT NULL,
  `tunj_jabatan` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jabatan`
--

INSERT INTO `tb_jabatan` (`id_jabatan`, `nama_jabatan`, `tunj_jabatan`) VALUES
('J001', 'Staff', 250000),
('J002', 'Supervisor', 750000),
('J003', 'Manager', 1000000),
('J004', 'Technician', 500000),
('J005', 'Direktur', 2000000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `nik` varchar(15) NOT NULL,
  `nama_karyawan` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `status` varchar(25) DEFAULT NULL,
  `id_golongan` varchar(15) DEFAULT NULL,
  `id_jabatan` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`nik`, `nama_karyawan`, `alamat`, `status`, `id_golongan`, `id_jabatan`) VALUES
('K002', 'Andry Hartanto', 'Malang', 'Belum Menikah', 'G005', 'J005'),
('K003', 'Miko', 'Malang', 'Belum Menikah', 'G003', 'J001'),
('K004', 'Oki', 'Malang', 'Menikah', 'G003', 'J003');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pinjaman`
--

CREATE TABLE `tb_pinjaman` (
  `id_pinjaman` varchar(15) NOT NULL,
  `jenis_pinjaman` varchar(50) DEFAULT NULL,
  `jml_pinjaman` double DEFAULT NULL,
  `angsuran` varchar(10) DEFAULT NULL,
  `nominal_angsuran` double DEFAULT NULL,
  `status_angsuran` varchar(25) DEFAULT NULL,
  `nik` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_gaji`
--
ALTER TABLE `tb_gaji`
  ADD PRIMARY KEY (`no_slip`),
  ADD KEY `FK__tb_karyawan` (`nik`);

--
-- Indexes for table `tb_golongan`
--
ALTER TABLE `tb_golongan`
  ADD PRIMARY KEY (`id_golongan`);

--
-- Indexes for table `tb_jabatan`
--
ALTER TABLE `tb_jabatan`
  ADD PRIMARY KEY (`id_jabatan`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`nik`),
  ADD KEY `FK_tb_karyawan_tb_golongan` (`id_golongan`),
  ADD KEY `FK_tb_karyawan_tb_jabatan` (`id_jabatan`);

--
-- Indexes for table `tb_pinjaman`
--
ALTER TABLE `tb_pinjaman`
  ADD PRIMARY KEY (`id_pinjaman`),
  ADD KEY `FK_tb_pinjaman_tb_karyawan` (`nik`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_gaji`
--
ALTER TABLE `tb_gaji`
  ADD CONSTRAINT `FK__tb_karyawan` FOREIGN KEY (`nik`) REFERENCES `tb_karyawan` (`nik`);

--
-- Constraints for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD CONSTRAINT `FK_tb_karyawan_tb_golongan` FOREIGN KEY (`id_golongan`) REFERENCES `tb_golongan` (`id_golongan`),
  ADD CONSTRAINT `FK_tb_karyawan_tb_jabatan` FOREIGN KEY (`id_jabatan`) REFERENCES `tb_jabatan` (`id_jabatan`);

--
-- Constraints for table `tb_pinjaman`
--
ALTER TABLE `tb_pinjaman`
  ADD CONSTRAINT `FK_tb_pinjaman_tb_karyawan` FOREIGN KEY (`nik`) REFERENCES `tb_karyawan` (`nik`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
