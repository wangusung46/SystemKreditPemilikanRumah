-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2021 at 04:24 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_system_kpr`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_data_bichecking`
--

CREATE TABLE `tb_data_bichecking` (
  `kode_bi` varchar(100) NOT NULL,
  `kode_nasabah` varchar(100) NOT NULL,
  `nama_nasabah` varchar(100) NOT NULL,
  `pinjaman_lain` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `nominal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_data_bichecking`
--

INSERT INTO `tb_data_bichecking` (`kode_bi`, `kode_nasabah`, `nama_nasabah`, `pinjaman_lain`, `status`, `nominal`) VALUES
('B00001', '131234348', 'Annisa', 'Tes 1', 'Lancar', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_data_jaminan`
--

CREATE TABLE `tb_data_jaminan` (
  `kode_jaminan` varchar(11) NOT NULL,
  `kode_nasabah` varchar(100) NOT NULL,
  `nama_nasabah` varchar(100) NOT NULL,
  `imb` varchar(100) NOT NULL,
  `sertifikat_tanah` varchar(100) NOT NULL,
  `skt` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_data_jaminan`
--

INSERT INTO `tb_data_jaminan` (`kode_jaminan`, `kode_nasabah`, `nama_nasabah`, `imb`, `sertifikat_tanah`, `skt`) VALUES
('1', '131234348', 'Annisa', '11', '22', '33');

-- --------------------------------------------------------

--
-- Table structure for table `tb_data_pemohon`
--

CREATE TABLE `tb_data_pemohon` (
  `id_pemohon` varchar(25) NOT NULL,
  `nama_pemohon` varchar(35) NOT NULL,
  `nik` varchar(100) NOT NULL,
  `alamat_pemohon` varchar(255) NOT NULL,
  `no_hp_pemohon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_data_pemohon`
--

INSERT INTO `tb_data_pemohon` (`id_pemohon`, `nama_pemohon`, `nik`, `alamat_pemohon`, `no_hp_pemohon`) VALUES
('131234348', 'Annisa', '123', 'Jakarta Selatan', '081241234');

-- --------------------------------------------------------

--
-- Table structure for table `tb_hasil_analisa`
--

CREATE TABLE `tb_hasil_analisa` (
  `id_analisa` varchar(100) NOT NULL,
  `kode_nasabah` varchar(100) NOT NULL,
  `nama_nasabah` varchar(100) NOT NULL,
  `nik` varchar(100) NOT NULL,
  `tempat_kerja` varchar(100) NOT NULL,
  `alamat_kerja` varchar(100) NOT NULL,
  `gaji` int(11) NOT NULL,
  `tenor` int(11) NOT NULL,
  `kesanggupan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_hasil_analisa`
--

INSERT INTO `tb_hasil_analisa` (`id_analisa`, `kode_nasabah`, `nama_nasabah`, `nik`, `tempat_kerja`, `alamat_kerja`, `gaji`, `tenor`, `kesanggupan`) VALUES
('A00001', '131234348', 'Annisa', '123', '123', '321', 123, 456, 789);

-- --------------------------------------------------------

--
-- Table structure for table `tb_perhitungan_bi_checking`
--

CREATE TABLE `tb_perhitungan_bi_checking` (
  `id_checking` varchar(100) NOT NULL,
  `kode_nasabah` varchar(100) NOT NULL,
  `nama_nasabah` varchar(100) NOT NULL,
  `nik` varchar(100) NOT NULL,
  `biaya` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_perhitungan_bi_checking`
--

INSERT INTO `tb_perhitungan_bi_checking` (`id_checking`, `kode_nasabah`, `nama_nasabah`, `nik`, `biaya`, `jumlah`, `status`) VALUES
('B00001', '131234348', 'Annisa', '123', 123, 123, 'Tidak Lancar');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` varchar(25) NOT NULL,
  `nama_user` varchar(35) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `nama_user`, `username`, `password`) VALUES
('1001001', 'Rafli Aldiansyah', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_data_bichecking`
--
ALTER TABLE `tb_data_bichecking`
  ADD PRIMARY KEY (`kode_bi`);

--
-- Indexes for table `tb_data_jaminan`
--
ALTER TABLE `tb_data_jaminan`
  ADD PRIMARY KEY (`kode_jaminan`);

--
-- Indexes for table `tb_data_pemohon`
--
ALTER TABLE `tb_data_pemohon`
  ADD PRIMARY KEY (`id_pemohon`);

--
-- Indexes for table `tb_hasil_analisa`
--
ALTER TABLE `tb_hasil_analisa`
  ADD PRIMARY KEY (`id_analisa`);

--
-- Indexes for table `tb_perhitungan_bi_checking`
--
ALTER TABLE `tb_perhitungan_bi_checking`
  ADD PRIMARY KEY (`id_checking`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
