-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2024 at 02:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mineplex_server_data`
--

-- --------------------------------------------------------

--
-- Table structure for table `bungeestats`
--

CREATE TABLE `bungeestats` (
  `id` int(11) NOT NULL,
  `address` varchar(25) DEFAULT NULL,
  `updated` mediumtext DEFAULT NULL,
  `players` int(11) DEFAULT NULL,
  `maxPlayers` int(11) DEFAULT NULL,
  `alive` tinyint(1) NOT NULL,
  `online` tinyint(1) NOT NULL,
  `US` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dedicatedserverstats`
--

CREATE TABLE `dedicatedserverstats` (
  `id` int(11) NOT NULL,
  `serverName` varchar(100) DEFAULT NULL,
  `address` varchar(25) DEFAULT NULL,
  `updated` mediumtext DEFAULT NULL,
  `cpu` tinyint(4) DEFAULT NULL,
  `ram` mediumint(9) DEFAULT NULL,
  `usedCpuPercent` double(4,2) DEFAULT NULL,
  `usedRamPercent` double(4,2) DEFAULT NULL,
  `US` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `networkstats`
--

CREATE TABLE `networkstats` (
  `id` int(11) NOT NULL,
  `updated` mediumtext DEFAULT NULL,
  `players` int(11) DEFAULT NULL,
  `totalNetworkCpuUsage` double(4,2) DEFAULT NULL,
  `totalNetworkRamUsage` double(4,2) DEFAULT NULL,
  `totalCpu` mediumint(9) DEFAULT NULL,
  `totalRam` mediumint(9) DEFAULT NULL,
  `US` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `servergroupstats`
--

CREATE TABLE `servergroupstats` (
  `id` int(11) NOT NULL,
  `serverGroup` varchar(100) DEFAULT NULL,
  `updated` mediumtext DEFAULT NULL,
  `players` int(11) DEFAULT NULL,
  `maxPlayers` int(11) DEFAULT NULL,
  `totalNetworkCpuUsage` double(4,2) DEFAULT NULL,
  `totalNetworkRamUsage` double(4,2) DEFAULT NULL,
  `totalCpu` mediumint(9) DEFAULT NULL,
  `totalRam` mediumint(9) DEFAULT NULL,
  `US` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bungeestats`
--
ALTER TABLE `bungeestats`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `dedicatedserverstats`
--
ALTER TABLE `dedicatedserverstats`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `networkstats`
--
ALTER TABLE `networkstats`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `servergroupstats`
--
ALTER TABLE `servergroupstats`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bungeestats`
--
ALTER TABLE `bungeestats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `dedicatedserverstats`
--
ALTER TABLE `dedicatedserverstats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `networkstats`
--
ALTER TABLE `networkstats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `servergroupstats`
--
ALTER TABLE `servergroupstats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
