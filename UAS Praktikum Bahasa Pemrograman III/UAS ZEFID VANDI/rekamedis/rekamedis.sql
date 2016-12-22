-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 15, 2016 at 12:41 PM
-- Server version: 5.1.37
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rekamedis`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE IF NOT EXISTS `dokter` (
  `kd_dokter` varchar(5) NOT NULL,
  `kd_poli` varchar(5) NOT NULL,
  `tgl_kunjungan` date NOT NULL,
  `kd_user` varchar(5) NOT NULL,
  `nm_dokter` varchar(30) NOT NULL,
  `SIP` varchar(30) NOT NULL,
  `tmp_lahir` varchar(30) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  PRIMARY KEY (`kd_dokter`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `kd_poli`, `tgl_kunjungan`, `kd_user`, `nm_dokter`, `SIP`, `tmp_lahir`, `no_telp`, `alamat`) VALUES
('D0001', 'PO002', '2015-02-16', 'D0001', 'Samsul Arifin', '0001/1234', 'Jakarta', '0192109221', 'Jl.Keramat'),
('D0002', 'PO002', '2015-01-01', 'D0002', 'Hiskia Luke', '0002/1234', 'Bandung', '0918291019', 'Jl.Sunan Ampel'),
('D0003', 'PO003', '2014-01-01', 'D0003', 'Dwi Ghoni Ali', '0003/1234', 'Bogor', '0928291919', 'Jl.Cemara'),
('D0004', 'PO004', '2013-01-01', 'D0004', 'Maulana Noor Ikhsan', '0004/1234', 'Palembang', '0861727837', 'Jl.Kuningan'),
('D0005', 'PO005', '2015-07-01', 'D0005', 'Rizal Slamet', '0005/1234', 'Yogyakarta', '0982928393', 'Jl.Donomulyo'),
('D0006', 'PO006', '2015-03-04', 'D0006', 'Firlaksono', '0006/1234', 'Kalimantan', '08918283929', 'Jl.Mentaraman'),
('D0007', 'PO005', '2015-01-18', 'D0007', 'Hanifah', '0007/1234', 'Malang', '08193771829', 'Jl.Kenangan');

-- --------------------------------------------------------

--
-- Table structure for table `kunjungan`
--

CREATE TABLE IF NOT EXISTS `kunjungan` (
  `tgl_kunjungan` date NOT NULL,
  `no_pasien` varchar(5) NOT NULL,
  `kd_dokter` varchar(5) NOT NULL,
  `jam_kunjungan` time NOT NULL,
  PRIMARY KEY (`no_pasien`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kunjungan`
--

INSERT INTO `kunjungan` (`tgl_kunjungan`, `no_pasien`, `kd_dokter`, `jam_kunjungan`) VALUES
('2015-03-02', 'P0001', 'D0001', '14:42:20'),
('2015-05-10', 'P0005', 'D0004', '11:46:24'),
('2011-06-13', 'P0006', 'D0006', '11:47:43'),
('2013-06-05', 'P0004', 'D0005', '11:47:56'),
('2007-08-07', 'P0003', 'D0004', '11:48:07'),
('2014-03-04', 'P0002', 'D0006', '11:48:21');

-- --------------------------------------------------------

--
-- Table structure for table `laboratorium`
--

CREATE TABLE IF NOT EXISTS `laboratorium` (
  `kd_lab` varchar(5) NOT NULL,
  `no_RM` varchar(5) NOT NULL,
  `hasil_lab` varchar(30) NOT NULL,
  `ket` varchar(50) NOT NULL,
  PRIMARY KEY (`kd_lab`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laboratorium`
--

INSERT INTO `laboratorium` (`kd_lab`, `no_RM`, `hasil_lab`, `ket`) VALUES
('L0001', 'RM001', 'Positif Pusing', '-'),
('L0002', 'RM002', 'Bagus', 'Baik');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `kd_user` varchar(5) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL,
  `nama_lengkap` varchar(30) NOT NULL,
  `hak_akses` enum('superadmin','dokter','pasien') NOT NULL,
  PRIMARY KEY (`kd_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`kd_user`, `username`, `password`, `nama_lengkap`, `hak_akses`) VALUES
('U0001', 'khalid', '794761a765ceca759536a1bf39100142', 'khalid nabawi', 'superadmin'),
('D0001', 'samsul', '6ddcd35687be9a4415e4416a6dd6829e', 'Samsul Arifin', 'dokter'),
('P0001', 'Amin', '30ae43ad1aa0a416699051b73a3dfcf6', 'Khoirul Amin', 'pasien'),
('D0002', 'hiskia', '93dc9d7c31353e91095bd07c45aa2d01', 'Hiskia Luke', 'dokter'),
('D0003', 'ghoni', '5cf7138b82ef48d2465f02e0fb5af0c5', 'Dwi Ghoni Ali', 'dokter'),
('D0004', 'alan', '02558a70324e7c4f269c69825450cec8', 'Maulana Noor Ikhsan', 'dokter'),
('D0005', 'rizal', '150fb021c56c33f82eef99253eb36ee1', 'Rizal Slamet', 'dokter'),
('D0006', 'firla', 'c22badc0a1051f1ff57b744379a1a9e7', 'Firlaksono', 'dokter'),
('P0002', 'intan', 'b1098cab9c2db3eb9f576eb66c33449c', 'Intan Sari Dewi', 'pasien'),
('P0003', 'indah', 'f3385c508ce54d577fd205a1b2ecdfb7', 'Indah Maya', 'pasien'),
('P0004', 'heni', 'cd07a63af5f14ac0d51b5bbbf6e93ae9', 'Heni Dina Permata', 'pasien'),
('P0005', 'billy', '89c246298be2b6113fb10ba80f3c6956', 'Billy Fadly', 'pasien'),
('P0006', 'sugik', '1432cb2ac95751dce43c94c304dbbd3d', 'Sugianto', 'pasien'),
('D0007', 'hani', '76e105c3a61db1b3f13207774aeccc3c', 'Hanifah', 'dokter');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `kd_obat` varchar(5) NOT NULL,
  `nm_obat` varchar(30) NOT NULL,
  `jml_obat` int(5) NOT NULL,
  `ukuran` varchar(30) NOT NULL,
  `harga` int(10) NOT NULL,
  PRIMARY KEY (`kd_obat`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kd_obat`, `nm_obat`, `jml_obat`, `ukuran`, `harga`) VALUES
('OB001', ' Bodrexin', 20, 'Sedang', 1000),
('OB002', 'Bodrex', 10, 'Sedang', 2000),
('OB003', 'Ultra Flu', 10, 'Sedang', 2000),
('OB004', 'Tolak Angin', 30, 'Besar', 4000),
('OB005', 'Antangin JRG', 25, 'Sedang', 2500),
('OB006', 'Betadine', 5, 'Sedang', 4500),
('OB007', 'Oskadon', 40, 'Kecil', 2000),
('OB008', 'Ambeven', 20, 'Sedang', 5000),
('OB009', 'Koyo Cabai', 90, 'Kecil', 1000),
('OB010', 'Kalpanax', 10, 'Sedang', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE IF NOT EXISTS `pasien` (
  `no_pasien` varchar(5) NOT NULL,
  `nm_pasien` varchar(30) NOT NULL,
  `j_kel` varchar(10) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `usia` int(3) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `nm_kk` varchar(30) NOT NULL,
  `hub_kel` varchar(30) NOT NULL,
  PRIMARY KEY (`no_pasien`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`no_pasien`, `nm_pasien`, `j_kel`, `agama`, `alamat`, `tgl_lahir`, `usia`, `no_telp`, `nm_kk`, `hub_kel`) VALUES
('P0001', 'Khoirul Amin', 'Laki-Laki', 'islam', 'Malang', '1995-01-01', 20, '08129388939', 'Abdul', 'Anak Kandung'),
('P0002', 'Intan Sari Dewi', 'Perempuan', 'islam', 'Jl.Melaten', '1996-04-06', 19, '0212918291', 'Anton', 'Anak Kandung'),
('P0003', 'Indah Maya', 'Perempuan', 'islam', 'Jl.Kedung', '2002-01-01', 13, '01281219219', 'Sugeng', 'Saudara'),
('P0004', 'Heni Dina Permata', 'Perempuan', 'islam', 'Jl.Mangir', '2000-10-01', 15, '9219201901', 'Yanto', 'Anak Kandung'),
('P0005', 'Billy Fadly', 'Laki-Laki', 'islam', 'Jl.Gunung Kawi', '1998-09-12', 17, '0928293919', 'Sumanto', 'Lainnya'),
('P0006', 'Sugianto', 'Laki-Laki', 'kristen', 'Jl.Blitar', '1989-06-05', 26, '0293939019', 'Yono', 'Anak Kandung');

-- --------------------------------------------------------

--
-- Table structure for table `poliklinik`
--

CREATE TABLE IF NOT EXISTS `poliklinik` (
  `kd_poli` varchar(5) NOT NULL,
  `nm_poli` varchar(30) NOT NULL,
  `lantai` int(5) NOT NULL,
  PRIMARY KEY (`kd_poli`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `poliklinik`
--

INSERT INTO `poliklinik` (`kd_poli`, `nm_poli`, `lantai`) VALUES
('PO001', '  Poli Anak', 1),
('PO002', 'Poli Perut', 1),
('PO003', 'Poli Hidung', 1),
('PO004', 'Poli Mata', 1),
('PO005', 'Poli Jantung', 1),
('PO006', 'Poli Telinga', 2),
('PO007', 'Poli Gigi', 2),
('PO008', 'Poli Kepala', 2),
('PO009', 'Poli Kaki', 2),
('PO010', 'Poli Tangan', 2);

-- --------------------------------------------------------

--
-- Table structure for table `rekamedis`
--

CREATE TABLE IF NOT EXISTS `rekamedis` (
  `no_RM` varchar(5) NOT NULL,
  `kd_tindakan` varchar(5) NOT NULL,
  `kd_obat` varchar(5) NOT NULL,
  `kd_user` varchar(5) NOT NULL,
  `no_pasien` varchar(5) NOT NULL,
  `diagnosa` varchar(30) NOT NULL,
  `resep` varchar(30) NOT NULL,
  `keluhan` varchar(30) NOT NULL,
  `tgl_pemeriksaan` date NOT NULL,
  `ket` varchar(50) NOT NULL,
  PRIMARY KEY (`no_RM`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rekamedis`
--

INSERT INTO `rekamedis` (`no_RM`, `kd_tindakan`, `kd_obat`, `kd_user`, `no_pasien`, `diagnosa`, `resep`, `keluhan`, `tgl_pemeriksaan`, `ket`) VALUES
('RM001', 'T0003', 'OB001', 'D0001', 'P0001', 'Ringan', 'obat paramex', 'pusing', '2015-04-18', 'Rawat Inap'),
('RM002', 'T0002', 'OB001', 'D0001', 'P0001', 'sakit', 'obat bodrexin', 'panas', '2014-09-16', 'Rawat Inap'),
('RM003', 'T0002', 'OB008', 'D0003', 'P0003', 'Gejala', 'Minum Obat', 'sakit sakitan', '2015-04-01', 'Rawat Inap');

-- --------------------------------------------------------

--
-- Table structure for table `tindakan`
--

CREATE TABLE IF NOT EXISTS `tindakan` (
  `kd_tindakan` varchar(5) NOT NULL,
  `nm_tindakan` varchar(30) NOT NULL,
  `ket` varchar(50) NOT NULL,
  PRIMARY KEY (`kd_tindakan`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tindakan`
--

INSERT INTO `tindakan` (`kd_tindakan`, `nm_tindakan`, `ket`) VALUES
('T0001', 'Pencegahan', 'tahap awal'),
('T0002', 'Operasi', 'Tahap Lanjut'),
('T0003', 'Penyelamatan', 'Tahap Akhir');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
