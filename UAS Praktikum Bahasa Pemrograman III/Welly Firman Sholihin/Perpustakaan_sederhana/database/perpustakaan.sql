-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2015 at 02:06 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_anggota` varchar(100) DEFAULT NULL,
  `tanggal_join` datetime DEFAULT NULL,
  `no_hp` varchar(100) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `tempat_lahir` varchar(50) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id`, `nama_anggota`, `tanggal_join`, `no_hp`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`) VALUES
(2, 'Granika', '2015-12-12 19:45:55', '0856363662', 'Perempuan', 'Salatiga', '1992-03-02'),
(3, 'Yanuar', '2015-12-12 19:47:32', '024 93489898', 'Laki Laki', 'Salatiga', '1987-01-01'),
(4, 'Eunike', '2015-12-14 20:01:03', '-', 'Perempuan', 'Salatiga', '1994-08-01'),
(5, 'Windy', '2015-12-14 20:05:00', '08892929292', 'Perempuan', 'Salatiga', '1994-08-01');

-- --------------------------------------------------------

--
-- Table structure for table `data_buku`
--

CREATE TABLE IF NOT EXISTS `data_buku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_buku` varchar(200) DEFAULT NULL,
  `penerbit` varchar(100) DEFAULT NULL,
  `tahun` int(11) DEFAULT NULL,
  `pengarang` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT 'ada',
  `id_pinjam` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `data_buku`
--

INSERT INTO `data_buku` (`id`, `nama_buku`, `penerbit`, `tahun`, `pengarang`, `status`, `id_pinjam`) VALUES
(2, 'Buku 2', 'Gramedia', 2010, 'Jason2', 'ada', NULL),
(3, 'Buku 3', 'Gramedia', 2014, 'Windy', 'ada', NULL),
(4, 'Buku 4', 'Gramedia', 2014, 'Guma', 'Dipinjam', NULL),
(5, 'Harry Potter', 'Gramedia', 1998, 'Sam', 'ada', NULL),
(6, 'Turun Hujan', 'Gramedia', 2009, 'Tere Liye', 'ada', NULL),
(7, 'Cinta Di Langit Taj Mahal', 'Comgrafis', 2001, 'Indah', 'ada', NULL),
(8, 'Buku 5', 'Gramedia', 1998, 'Tes', 'ada', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE IF NOT EXISTS `kelas` (
  `id_kelas` int(2) NOT NULL,
  `gedung` varchar(1) NOT NULL,
  `angka` varchar(4) NOT NULL,
  PRIMARY KEY (`id_kelas`),
  UNIQUE KEY `id_kelas` (`id_kelas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `gedung`, `angka`) VALUES
(0, 'a', 'sd'),
(2, 'b', 'A2'),
(3, 'c', 'A3'),
(4, 'd', 'A4'),
(5, 'e', 'A5'),
(6, 'f', 'A6'),
(7, 'g', 'A7'),
(8, 'h', 'A8');

-- --------------------------------------------------------

--
-- Table structure for table `pinjam`
--

CREATE TABLE IF NOT EXISTS `pinjam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal_pinjam` datetime DEFAULT NULL,
  `id_buku` int(11) DEFAULT NULL,
  `nama_buku` varchar(200) DEFAULT NULL,
  `pengarang` varchar(100) DEFAULT NULL,
  `tahun` int(11) DEFAULT NULL,
  `penerbit` varchar(100) DEFAULT NULL,
  `id_anggota` int(11) DEFAULT NULL,
  `nama_anggota` varchar(100) DEFAULT NULL,
  `tanggal_kembali` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=41 ;

--
-- Dumping data for table `pinjam`
--

INSERT INTO `pinjam` (`id`, `tanggal_pinjam`, `id_buku`, `nama_buku`, `pengarang`, `tahun`, `penerbit`, `id_anggota`, `nama_anggota`, `tanggal_kembali`) VALUES
(1, '2015-12-13 11:25:23', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 3, NULL, '2015-12-13 12:34:13'),
(2, '2015-12-13 11:41:22', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:14'),
(3, '2015-12-13 11:42:58', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:15'),
(4, '2015-12-13 11:45:28', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:16'),
(5, '2015-12-13 11:49:25', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:16'),
(6, '2015-12-13 11:57:18', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:17'),
(7, '2015-12-13 11:57:35', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:17'),
(8, '2015-12-13 11:59:49', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:18'),
(9, '2015-12-13 12:05:14', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:18'),
(10, '2015-12-13 12:06:26', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:19'),
(11, '2015-12-13 12:06:59', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:19'),
(12, '2015-12-13 12:07:33', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 3, NULL, '2015-12-13 12:34:20'),
(13, '2015-12-13 12:10:54', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 3, NULL, '2015-12-13 12:34:20'),
(14, '2015-12-13 12:13:18', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:21'),
(15, '2015-12-13 12:13:22', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:21'),
(16, '2015-12-13 12:14:06', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:21'),
(17, '2015-12-13 12:15:18', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 3, NULL, '2015-12-13 12:34:22'),
(18, '2015-12-13 12:15:21', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:22'),
(19, '2015-12-13 12:16:00', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:23'),
(20, '2015-12-13 12:16:25', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:23'),
(21, '2015-12-13 12:16:43', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:24'),
(22, '2015-12-13 12:17:08', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 3, NULL, '2015-12-13 12:34:24'),
(23, '2015-12-13 12:17:17', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:24'),
(24, '2015-12-13 12:17:27', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:25'),
(25, '2015-12-13 12:17:36', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:25'),
(26, '2015-12-13 12:17:45', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:26'),
(27, '2015-12-13 12:18:05', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, NULL, '2015-12-13 12:34:26'),
(28, '2015-12-13 12:21:48', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 2, 'Granika', '2015-12-13 12:34:27'),
(29, '2015-12-13 12:22:45', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, 'Yanuar', '2015-12-13 12:34:27'),
(30, '2015-12-13 12:30:51', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 3, 'Yanuar', '2015-12-13 12:34:27'),
(31, '2015-12-13 12:34:32', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, 'Yanuar', '2015-12-13 12:34:39'),
(32, '2015-12-13 12:35:19', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 2, 'Granika', '2015-12-13 12:57:26'),
(33, '2015-12-13 12:35:25', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 2, 'Granika', '2015-12-13 12:57:27'),
(34, '2015-12-13 12:54:21', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', NULL, NULL, NULL),
(35, '2015-12-13 12:55:49', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', NULL, NULL, NULL),
(36, '2015-12-13 12:56:04', 2, 'Buku 2', 'Jason', 2010, 'Gramedia', 2, 'Granika', '2015-12-13 12:57:27'),
(37, '2015-12-13 13:05:04', 3, 'Buku 3', 'Windy', 2014, 'Gramedia', 3, 'Yanuar', '2015-12-14 20:01:15'),
(38, '2015-12-13 13:05:15', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 2, 'Granika', '2015-12-14 20:01:16'),
(39, '2015-12-14 20:03:21', 4, 'Buku 4', 'Guma', 2014, 'Gramedia', 3, 'Yanuar', NULL),
(40, '2015-12-14 20:05:08', 6, 'Turun Hujan', 'Tere Liye', 2009, 'Gramedia', 4, 'Eunike', '2015-12-14 20:05:23');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(25) NOT NULL,
  `pass` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `user`, `pass`, `name`) VALUES
(1, 'tes', '9aa6e5f2256c17d2d430b100032b997c', 'windy'),
(3, 'a', '0cc175b9c0f1b6a831c399e269772661', 'a');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
