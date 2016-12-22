-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Des 2016 pada 22.45
-- Versi Server: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dream_computer`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
  `kode` varchar(15) NOT NULL,
  `tipe` varchar(20) NOT NULL,
  `merek` varchar(25) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `harga` int(15) NOT NULL,
  `kondisi` varchar(20) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode`, `tipe`, `merek`, `nama`, `harga`, `kondisi`, `tanggal`) VALUES
('LPT002', 'Laptop', 'ASUS', 'X45M', 3925000, 'Baru', '0000-00-00'),
('VGA001', 'VGA', 'NVidia MSi', 'GeForce GTX 960 TI', 4960000, 'Baru', '0000-00-00'),
('VGA002', 'VGA', 'NVidia EVGA', 'GeForce GTX 690 TI', 5360000, 'Bekas', '0000-00-00'),
('PSP002', 'Power Supply', 'Corsair', 'VS450', 525000, 'Baru', '0000-00-00'),
('VGA003', 'VGA', 'NVidia OEM', 'GeForce GTX 780 TI', 3300000, 'Bekas', '0000-00-00'),
('PRC001', 'Processor', 'Intel', 'Core i7-5960X LGA 2011', 15400000, 'Baru', '0000-00-00'),
('PRC002', 'Processor', 'Intel', 'Core i7-6700K LGA 1151', 4850000, 'Baru', '0000-00-00'),
('MTB001', 'Mainboard', 'ASUS', 'ROG Maximus VII Hero', 3790000, 'Baru', '0000-00-00'),
('MTB002', 'Mainboard', 'GIGABYTE', 'GA-H97-HD3', 1590000, 'Baru', '0000-00-00'),
('MTB003', 'Mainboard', 'MSI', 'Z97A GAMING 7', 3990000, 'Baru', '0000-00-00'),
('PRC003', 'Processor', 'Intel', 'Core i5-4460 LGA 1150', 2390000, 'Baru', '0000-00-00'),
('MTB004', 'Mainboard', 'MSI', 'B85-G41 PC MATE', 925000, 'Bekas', '0000-00-00'),
('CAS001', 'Casing', 'Corsair', 'Carbide SPEC-03', 900000, 'Baru', '0000-00-00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `level` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`, `level`) VALUES
('Dreamfiendx', '-', 'admin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
