-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versi server:                 10.1.10-MariaDB - mariadb.org binary distribution
-- OS Server:                    Win32
-- HeidiSQL Versi:               9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for uas
CREATE DATABASE IF NOT EXISTS `uas` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `uas`;


-- Dumping structure for table uas.data
CREATE TABLE IF NOT EXISTS `data` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `tgl_lhr` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Alamat` varchar(50) DEFAULT NULL,
  `nomerhp` varchar(50) DEFAULT NULL,
  `norekening` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table uas.data: ~2 rows (approximately)
/*!40000 ALTER TABLE `data` DISABLE KEYS */;
REPLACE INTO `data` (`Username`, `Password`, `Nama`, `tgl_lhr`, `Email`, `Alamat`, `nomerhp`, `norekening`) VALUES
	('jajal1', '12345', 'aejfqe', 'ewfe', 'x cds', 'ees', 'sfc', 'wqe'),
	('unyu2unyu', '1234', 'rama', '28 januari 1997', 'rama@mail.com', 'mlg', '085xxxxxxxxx', '12313');
/*!40000 ALTER TABLE `data` ENABLE KEYS */;


-- Dumping structure for table uas.db
CREATE TABLE IF NOT EXISTS `db` (
  `nomerurut` varchar(50) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `donasi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nomerurut`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table uas.db: ~2 rows (approximately)
/*!40000 ALTER TABLE `db` DISABLE KEYS */;
REPLACE INTO `db` (`nomerurut`, `tanggal`, `nama`, `alamat`, `donasi`) VALUES
	('sw-0001', '2016-12-14', 'hgfhgf', 'jhgjh', '7676576'),
	('sw-0002', '2016-12-14', 'sadqw', 'wqewq', '1234123');
/*!40000 ALTER TABLE `db` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
