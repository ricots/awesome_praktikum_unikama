-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Des 2016 pada 05.49
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 7.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bioskop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `film`
--

CREATE TABLE `film` (
  `id_film` varchar(50) NOT NULL,
  `judul_film` varchar(50) NOT NULL,
  `jenis_film` varchar(50) NOT NULL,
  `durasi` varchar(50) NOT NULL,
  `tahun` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `film`
--

INSERT INTO `film` (`id_film`, `judul_film`, `jenis_film`, `durasi`, `tahun`) VALUES
('Film-0001', 'war', 'perang', '1 jam ', '2014'),
('Film-0002', 'Warkop DKI', 'komedi', '2 jam', '2015'),
('Film-0003', 'naruto the movie', 'kartun', '2 jam', '2013');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penonton`
--

CREATE TABLE `penonton` (
  `id_penonton` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telpon` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `pilihan_film` varchar(50) NOT NULL,
  `id_film` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penonton`
--

INSERT INTO `penonton` (`id_penonton`, `nama`, `alamat`, `no_telpon`, `jenis_kelamin`, `pilihan_film`, `id_film`) VALUES
('Penonton-0001', 'dfguhjk', 'ftgyuihuojipko', '098765878675', 'Laki-laki', 'Warkop DKI', 'Film-0002');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(50) NOT NULL,
  `nama_petugas` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telpon` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `admin` varchar(50) NOT NULL,
  `pass_admin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `nama_petugas`, `jenis_kelamin`, `alamat`, `no_telpon`, `email`, `admin`, `pass_admin`) VALUES
('Petugas-0001', 'jerry malau', 'Laki-laki', 'malang', '08914567876', 'jerrymalau.@gmail.ci.id', 'jerry', '2808'),
('Petugas-0002', 'petrus kubito', 'Laki-laki', 'malang', '08984959687', 'petrus.kubito@gmail.com', 'bito', '1707'),
('Petugas-0003', 'bakri', 'Laki-laki', 'malang', '08516287387', 'bakri@gmail.com', 'bakri', '1296');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE `ruangan` (
  `id_ruangan` varchar(50) NOT NULL,
  `nama_ruangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(50) NOT NULL,
  `id_penonton` varchar(50) NOT NULL,
  `id_petugas` varchar(50) NOT NULL,
  `pilihan_film` varchar(50) NOT NULL,
  `ruangan` varchar(50) NOT NULL,
  `no_kursi` varchar(50) NOT NULL,
  `harga_tiket` varchar(50) NOT NULL,
  `jumlah_tiket` varchar(50) NOT NULL,
  `jumlah_harga` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id_film`);

--
-- Indexes for table `penonton`
--
ALTER TABLE `penonton`
  ADD PRIMARY KEY (`id_penonton`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`id_ruangan`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
