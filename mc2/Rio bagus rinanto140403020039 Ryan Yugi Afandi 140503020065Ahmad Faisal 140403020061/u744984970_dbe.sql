
-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 19, 2016 at 01:46 AM
-- Server version: 10.0.20-MariaDB
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `u744984970_dbe`
--

-- --------------------------------------------------------

--
-- Table structure for table `berita_prak`
--

CREATE TABLE IF NOT EXISTS `berita_prak` (
  `id_berita` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(50) NOT NULL,
  `detail` varchar(100) NOT NULL,
  `gambar` varchar(256) NOT NULL,
  PRIMARY KEY (`id_berita`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `berita_prak`
--

INSERT INTO `berita_prak` (`id_berita`, `judul`, `detail`, `gambar`) VALUES
(1, 'berita 1 edit', 'detail dari berita 1 dari hp', ''),
(2, 'berita 2 edit', 'detail dari berita 1 dari hp', ''),
(3, 'berita 3', 'detail dari berita', ''),
(4, 'judul berita 4 edit ', 'detail berita 4', ''),
(5, 'judul5', 'detail berita 5', ''),
(6, 'judul 6', 'berita 6', ''),
(7, 'hhvgddddzd. ccx', 'hjgt', ''),
(8, 'hahs', 'jshs', ''),
(9, 'fjbft', 'djdjd', ''),
(10, 'irhdxjhc', 'dhxhxhcjcjhc', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
