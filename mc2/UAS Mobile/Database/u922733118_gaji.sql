
-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 19, 2016 at 07:52 PM
-- Server version: 10.0.20-MariaDB
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `u922733118_gaji`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE IF NOT EXISTS `tb_admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_cari`
--

CREATE TABLE IF NOT EXISTS `tb_cari` (
  `id` int(11) NOT NULL,
  `cari1` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cari2` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tb_cari`
--

INSERT INTO `tb_cari` (`id`, `cari1`, `cari2`) VALUES
(1, '', 'a');

-- --------------------------------------------------------

--
-- Table structure for table `tb_jabatan`
--

CREATE TABLE IF NOT EXISTS `tb_jabatan` (
  `id_jabatan` varchar(10) NOT NULL,
  `nama_jabatan` varchar(50) DEFAULT NULL,
  `gaji_pokok` int(11) DEFAULT NULL,
  `gaji_lembur` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_jabatan`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_jabatan`
--

INSERT INTO `tb_jabatan` (`id_jabatan`, `nama_jabatan`, `gaji_pokok`, `gaji_lembur`) VALUES
('jab1', 'atasan', 7000000, 700000),
('jab2', 'karyawan', 4000000, 400000),
('jab3', 'ob', 2000000, 200000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE IF NOT EXISTS `tb_karyawan` (
  `id_karyawan` int(11) NOT NULL AUTO_INCREMENT,
  `nama_karyawan` varchar(30) DEFAULT NULL,
  `id_jabatan` varchar(10) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `usia` varchar(2) DEFAULT NULL,
  `alamat_karyawan` varchar(30) DEFAULT NULL,
  `foto` varchar(100) DEFAULT NULL,
  `lembur` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_karyawan`),
  KEY `id_jabatan` (`id_jabatan`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `id_jabatan`, `jenis_kelamin`, `usia`, `alamat_karyawan`, `foto`, `lembur`) VALUES
(18, 'F Rozi', 'jab3', 'Wanita', '30', 'pandaan', 'http://uasmobile.pe.hu/image/20161220004904484000.jpg', 0),
(17, 'Fanani', 'jab1', 'Pria', '23', 'Mojokerto Kutorejo Kertosari', 'http://uasmobile.pe.hu/image/20161220002956051500.jpg', 0),
(14, 'Rio Bagus Rinanto Malsel', 'jab1', 'Pria', '31', 'Jln. Malang Selatan Kabupaten ', 'http://uasmobile.pe.hu/image/20161220001624402800.jpg', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
