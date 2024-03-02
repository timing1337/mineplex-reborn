-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 02, 2024 at 06:15 AM
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
-- Database: `account`
--

-- --------------------------------------------------------

--
-- Table structure for table `accountcrowns`
--

CREATE TABLE `accountcrowns` (
  `accountId` int(11) NOT NULL,
  `crownCount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountcustomdata`
--

CREATE TABLE `accountcustomdata` (
  `accountId` int(11) NOT NULL,
  `customDataId` int(11) NOT NULL,
  `data` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountfavouritenano`
--

CREATE TABLE `accountfavouritenano` (
  `accountId` int(11) NOT NULL,
  `gameId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountfriend`
--

CREATE TABLE `accountfriend` (
  `id` int(11) NOT NULL,
  `uuidSource` varchar(100) DEFAULT NULL,
  `uuidTarget` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `favourite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountfrienddata`
--

CREATE TABLE `accountfrienddata` (
  `accountId` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `favourite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountignore`
--

CREATE TABLE `accountignore` (
  `uuidIgnorer` varchar(255) NOT NULL,
  `uuidIgnored` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountinventory`
--

CREATE TABLE `accountinventory` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `itemId` int(11) NOT NULL,
  `count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountkits`
--

CREATE TABLE `accountkits` (
  `accountId` int(11) NOT NULL,
  `kitId` int(11) NOT NULL,
  `active` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountkitstats`
--

CREATE TABLE `accountkitstats` (
  `accountId` int(11) NOT NULL,
  `kitId` int(11) NOT NULL,
  `statId` int(11) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountlevelreward`
--

CREATE TABLE `accountlevelreward` (
  `accountId` int(11) NOT NULL,
  `level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountmissions`
--

CREATE TABLE `accountmissions` (
  `accountId` int(11) NOT NULL,
  `missionId` int(11) NOT NULL,
  `length` int(11) NOT NULL,
  `x` int(11) NOT NULL,
  `y` int(11) NOT NULL,
  `startTime` bigint(11) NOT NULL,
  `progress` int(11) NOT NULL DEFAULT 0,
  `complete` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountpolls`
--

CREATE TABLE `accountpolls` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `pollId` int(11) NOT NULL,
  `value` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountpunishments`
--

CREATE TABLE `accountpunishments` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `category` varchar(255) NOT NULL,
  `sentence` varchar(255) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `duration` double NOT NULL,
  `admin` varchar(255) NOT NULL,
  `severity` int(11) NOT NULL,
  `Removed` tinyint(1) NOT NULL DEFAULT 0,
  `RemovedReason` varchar(255) DEFAULT NULL,
  `RemovedAdmin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountranks`
--

CREATE TABLE `accountranks` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `rankIdentifier` varchar(40) DEFAULT 'PLAYER',
  `primaryGroup` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `id` int(11) NOT NULL,
  `uuid` varchar(100) NOT NULL,
  `name` varchar(40) NOT NULL,
  `gems` int(11) NOT NULL DEFAULT 0,
  `coins` int(11) NOT NULL DEFAULT 0,
  `lastLogin` mediumtext DEFAULT NULL,
  `totalPlayTime` mediumtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountshardtransactions`
--

CREATE TABLE `accountshardtransactions` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `source` varchar(40) NOT NULL,
  `amount` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountstatsalltime`
--

CREATE TABLE `accountstatsalltime` (
  `accountId` int(11) NOT NULL,
  `statId` int(11) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accounttasks`
--

CREATE TABLE `accounttasks` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `taskId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountteamspeak`
--

CREATE TABLE `accountteamspeak` (
  `accountId` int(11) NOT NULL,
  `teamspeakId` int(11) NOT NULL,
  `linkDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountthanktransactions`
--

CREATE TABLE `accountthanktransactions` (
  `receiverId` int(11) NOT NULL,
  `senderId` int(11) NOT NULL,
  `thankAmount` int(11) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `ignoreCooldown` bit(1) NOT NULL,
  `claimed` bit(1) NOT NULL,
  `sentTime` time NOT NULL,
  `claimTime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accounttitle`
--

CREATE TABLE `accounttitle` (
  `accountId` int(11) NOT NULL,
  `trackName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accounttransactions`
--

CREATE TABLE `accounttransactions` (
  `id` int(11) NOT NULL,
  `accountId` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp(),
  `salesPackageName` text NOT NULL,
  `gems` int(11) NOT NULL,
  `coins` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `accountwinstreak`
--

CREATE TABLE `accountwinstreak` (
  `accountId` int(11) NOT NULL,
  `gameId` int(11) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `bonus`
--

CREATE TABLE `bonus` (
  `accountId` int(11) NOT NULL,
  `dailytime` timestamp NULL DEFAULT NULL,
  `clansdailytime` timestamp NULL DEFAULT NULL,
  `ranktime` date DEFAULT NULL,
  `votetime` date DEFAULT NULL,
  `clansvotetime` date DEFAULT NULL,
  `dailyStreak` int(11) NOT NULL DEFAULT 0,
  `maxDailyStreak` int(11) NOT NULL DEFAULT 0,
  `voteStreak` int(11) NOT NULL DEFAULT 0,
  `maxVoteStreak` int(11) NOT NULL DEFAULT 0,
  `tickets` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `botspam`
--

CREATE TABLE `botspam` (
  `id` int(11) NOT NULL,
  `text` varchar(200) NOT NULL,
  `punishments` int(11) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `createdBy` varchar(100) NOT NULL,
  `enabledBy` varchar(100) NOT NULL,
  `disabledBy` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `communities`
--

CREATE TABLE `communities` (
  `id` int(11) NOT NULL,
  `name` varchar(15) NOT NULL,
  `region` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `communityinvites`
--

CREATE TABLE `communityinvites` (
  `accountId` int(11) NOT NULL,
  `communityId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `communityjoinrequests`
--

CREATE TABLE `communityjoinrequests` (
  `accountId` int(11) NOT NULL,
  `communityId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `communitymembers`
--

CREATE TABLE `communitymembers` (
  `accountId` int(11) NOT NULL,
  `communityId` int(11) NOT NULL,
  `communityRole` varchar(20) NOT NULL,
  `readingChat` bit(1) NOT NULL DEFAULT b'1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `communitysettings`
--

CREATE TABLE `communitysettings` (
  `settingId` int(11) NOT NULL,
  `communityId` int(11) NOT NULL,
  `settingValue` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `customdata`
--

CREATE TABLE `customdata` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `elorating`
--

CREATE TABLE `elorating` (
  `accountId` int(11) NOT NULL,
  `gameType` int(11) NOT NULL,
  `elo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `eternalgiveaway`
--

CREATE TABLE `eternalgiveaway` (
  `accountId` int(11) NOT NULL,
  `uuid` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `forumlink`
--

CREATE TABLE `forumlink` (
  `accountId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `powerPlayStatus` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `hubnews`
--

CREATE TABLE `hubnews` (
  `newsId` int(11) NOT NULL,
  `newsValue` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `incognitostaff`
--

CREATE TABLE `incognitostaff` (
  `accountId` int(11) NOT NULL,
  `status` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `rarity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kitprogression`
--

CREATE TABLE `kitprogression` (
  `uuid` varchar(255) NOT NULL,
  `kitId` varchar(255) NOT NULL,
  `xp` int(11) NOT NULL,
  `level` int(11) NOT NULL,
  `upgrade_level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `newnpcsnew`
--

CREATE TABLE `newnpcsnew` (
  `id` int(11) NOT NULL,
  `entity_type` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `info` text DEFAULT NULL,
  `world` varchar(255) NOT NULL,
  `x` double NOT NULL,
  `y` double NOT NULL,
  `z` double NOT NULL,
  `yaw` int(11) NOT NULL,
  `pitch` int(11) NOT NULL,
  `in_hand` varchar(255) NOT NULL,
  `in_hand_data` tinyint(4) DEFAULT NULL,
  `helmet` varchar(255) DEFAULT NULL,
  `chestplate` varchar(255) DEFAULT NULL,
  `leggings` varchar(255) DEFAULT NULL,
  `boots` varchar(255) DEFAULT NULL,
  `metadata` varchar(255) NOT NULL,
  `skin_value` varchar(255) DEFAULT NULL,
  `skin_signature` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `npcs`
--

CREATE TABLE `npcs` (
  `id` int(11) NOT NULL,
  `server` varchar(50) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `world` varchar(50) NOT NULL,
  `x` float NOT NULL,
  `y` float NOT NULL,
  `z` float NOT NULL,
  `yaw` float NOT NULL,
  `pitch` float NOT NULL,
  `radius` float NOT NULL,
  `entityType` varchar(100) NOT NULL,
  `entityMeta` varchar(100) DEFAULT NULL,
  `adult` bit(1) NOT NULL DEFAULT b'1',
  `helmet` blob DEFAULT NULL,
  `chestplate` blob DEFAULT NULL,
  `leggings` blob DEFAULT NULL,
  `boots` blob DEFAULT NULL,
  `inHand` blob DEFAULT NULL,
  `info` blob DEFAULT NULL,
  `infoRadius` float DEFAULT NULL,
  `infoDelay` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `playermap`
--

CREATE TABLE `playermap` (
  `accountId` int(11) NOT NULL,
  `playerName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `polls`
--

CREATE TABLE `polls` (
  `id` int(11) NOT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `question` varchar(256) NOT NULL,
  `answerA` varchar(256) NOT NULL,
  `answerB` varchar(256) DEFAULT NULL,
  `answerC` varchar(256) DEFAULT NULL,
  `answerD` varchar(256) DEFAULT NULL,
  `coinReward` int(11) NOT NULL,
  `displayType` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `powerplayclaims`
--

CREATE TABLE `powerplayclaims` (
  `accountId` int(11) NOT NULL,
  `claimYear` int(11) NOT NULL,
  `claimMonth` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `powerplaysubs`
--

CREATE TABLE `powerplaysubs` (
  `accountId` int(11) NOT NULL,
  `startDate` date NOT NULL,
  `duration` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `preferences`
--

CREATE TABLE `preferences` (
  `accountId` int(11) NOT NULL,
  `preference` int(11) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `rankbenefits`
--

CREATE TABLE `rankbenefits` (
  `id` int(11) NOT NULL,
  `accountId` int(11) DEFAULT NULL,
  `benefit` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reportcategorytypes`
--

CREATE TABLE `reportcategorytypes` (
  `id` tinyint(4) UNSIGNED NOT NULL,
  `name` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reporthandlers`
--

CREATE TABLE `reporthandlers` (
  `reportId` bigint(20) NOT NULL,
  `handlerId` int(11) NOT NULL,
  `aborted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reportreasons`
--

CREATE TABLE `reportreasons` (
  `reportId` int(11) UNSIGNED NOT NULL,
  `reporterId` int(11) NOT NULL,
  `reason` varchar(100) NOT NULL,
  `server` varchar(50) NOT NULL,
  `weight` int(11) NOT NULL DEFAULT 0,
  `time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reportresults`
--

CREATE TABLE `reportresults` (
  `reportId` bigint(20) NOT NULL,
  `resultId` int(11) NOT NULL,
  `reason` text NOT NULL,
  `closedTime` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reportresulttypes`
--

CREATE TABLE `reportresulttypes` (
  `id` tinyint(4) UNSIGNED NOT NULL,
  `globalStat` tinyint(1) NOT NULL,
  `name` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

CREATE TABLE `reports` (
  `id` bigint(20) NOT NULL,
  `suspectId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL,
  `snapshotId` int(11) NOT NULL,
  `assignedTeam` int(11) NOT NULL,
  `region` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reportteammemberships`
--

CREATE TABLE `reportteammemberships` (
  `accountId` int(11) NOT NULL,
  `teamId` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reportteams`
--

CREATE TABLE `reportteams` (
  `id` tinyint(4) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `salesannouncements`
--

CREATE TABLE `salesannouncements` (
  `id` int(11) NOT NULL,
  `ranks` varchar(250) DEFAULT NULL,
  `message` varchar(256) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  `clans` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `snapshotmessagemap`
--

CREATE TABLE `snapshotmessagemap` (
  `snapshotId` int(11) NOT NULL,
  `messageId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `snapshotmessages`
--

CREATE TABLE `snapshotmessages` (
  `id` bigint(20) NOT NULL,
  `senderId` int(11) NOT NULL,
  `server` varchar(25) NOT NULL,
  `time` datetime NOT NULL DEFAULT current_timestamp(),
  `message` varchar(150) NOT NULL,
  `snapshotType` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `snapshotrecipients`
--

CREATE TABLE `snapshotrecipients` (
  `messageId` bigint(20) NOT NULL,
  `recipientId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `snapshots`
--

CREATE TABLE `snapshots` (
  `id` int(11) NOT NULL,
  `creator` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `snapshottypes`
--

CREATE TABLE `snapshottypes` (
  `id` tinyint(3) UNSIGNED NOT NULL,
  `name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `specificyoutube`
--

CREATE TABLE `specificyoutube` (
  `accountId` int(11) NOT NULL,
  `clicktime` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `stats`
--

CREATE TABLE `stats` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tasks`
--

CREATE TABLE `tasks` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `twofactor`
--

CREATE TABLE `twofactor` (
  `accountId` int(11) NOT NULL,
  `secretKey` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `twofactor_history`
--

CREATE TABLE `twofactor_history` (
  `accountId` int(11) NOT NULL,
  `ip` text NOT NULL,
  `loginTime` mediumtext NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `youtube`
--

CREATE TABLE `youtube` (
  `accountId` int(11) NOT NULL,
  `clicktime` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accountcrowns`
--
ALTER TABLE `accountcrowns`
  ADD PRIMARY KEY (`accountId`);

--
-- Indexes for table `accountfriend`
--
ALTER TABLE `accountfriend`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uuidIndex` (`uuidSource`,`uuidTarget`);

--
-- Indexes for table `accountinventory`
--
ALTER TABLE `accountinventory`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `accountItemIndex` (`accountId`,`itemId`),
  ADD KEY `itemId` (`itemId`);

--
-- Indexes for table `accountpolls`
--
ALTER TABLE `accountpolls`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `accountPollIndex` (`accountId`,`pollId`),
  ADD KEY `pollId` (`pollId`);

--
-- Indexes for table `accountpunishments`
--
ALTER TABLE `accountpunishments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `accountranks`
--
ALTER TABLE `accountranks`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `additionalIndex` (`accountId`,`rankIdentifier`,`primaryGroup`),
  ADD KEY `accountIndex` (`accountId`),
  ADD KEY `rankIndex` (`rankIdentifier`);

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uuidIndex` (`uuid`),
  ADD UNIQUE KEY `nameIndex` (`name`);

--
-- Indexes for table `accountshardtransactions`
--
ALTER TABLE `accountshardtransactions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `accounttasks`
--
ALTER TABLE `accounttasks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `accountteamspeak`
--
ALTER TABLE `accountteamspeak`
  ADD PRIMARY KEY (`accountId`);

--
-- Indexes for table `accounttransactions`
--
ALTER TABLE `accounttransactions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bonus`
--
ALTER TABLE `bonus`
  ADD PRIMARY KEY (`accountId`);

--
-- Indexes for table `botspam`
--
ALTER TABLE `botspam`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `communities`
--
ALTER TABLE `communities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `forumlink`
--
ALTER TABLE `forumlink`
  ADD PRIMARY KEY (`accountId`);

--
-- Indexes for table `hubnews`
--
ALTER TABLE `hubnews`
  ADD PRIMARY KEY (`newsId`);

--
-- Indexes for table `incognitostaff`
--
ALTER TABLE `incognitostaff`
  ADD PRIMARY KEY (`accountId`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `mameIndex` (`name`);

--
-- Indexes for table `newnpcsnew`
--
ALTER TABLE `newnpcsnew`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `polls`
--
ALTER TABLE `polls`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rankbenefits`
--
ALTER TABLE `rankbenefits`
  ADD PRIMARY KEY (`id`),
  ADD KEY `accountId` (`accountId`);

--
-- Indexes for table `reportcategorytypes`
--
ALTER TABLE `reportcategorytypes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reportreasons`
--
ALTER TABLE `reportreasons`
  ADD PRIMARY KEY (`reportId`,`reporterId`),
  ADD KEY `reportReasons_accounts_id_fk` (`reporterId`);

--
-- Indexes for table `reportresulttypes`
--
ALTER TABLE `reportresulttypes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reports`
--
ALTER TABLE `reports`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reportteammemberships`
--
ALTER TABLE `reportteammemberships`
  ADD PRIMARY KEY (`accountId`,`teamId`),
  ADD KEY `reportTeams_accountId_index` (`accountId`),
  ADD KEY `reportTeams_reportTeamTypes_id_fk` (`teamId`);

--
-- Indexes for table `reportteams`
--
ALTER TABLE `reportteams`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `salesannouncements`
--
ALTER TABLE `salesannouncements`
  ADD PRIMARY KEY (`id`),
  ADD KEY `typeIndex` (`clans`);

--
-- Indexes for table `snapshotmessagemap`
--
ALTER TABLE `snapshotmessagemap`
  ADD PRIMARY KEY (`snapshotId`,`messageId`),
  ADD KEY `snapshotMessageMap_snapshotMessages_id_fk` (`messageId`);

--
-- Indexes for table `snapshotmessages`
--
ALTER TABLE `snapshotmessages`
  ADD PRIMARY KEY (`id`),
  ADD KEY `reportChatLog_accounts_id_fk` (`senderId`),
  ADD KEY `reportChatMessages_reportMessageTypes_id_fk` (`snapshotType`);

--
-- Indexes for table `snapshotrecipients`
--
ALTER TABLE `snapshotrecipients`
  ADD PRIMARY KEY (`messageId`,`recipientId`),
  ADD KEY `reportMessageRecipients_accounts_id_fk` (`recipientId`);

--
-- Indexes for table `snapshots`
--
ALTER TABLE `snapshots`
  ADD PRIMARY KEY (`id`),
  ADD KEY `snapshots_accounts_id_fk` (`creator`);

--
-- Indexes for table `snapshottypes`
--
ALTER TABLE `snapshottypes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `reportMessageTypes_id_uindex` (`id`);

--
-- Indexes for table `stats`
--
ALTER TABLE `stats`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accountfriend`
--
ALTER TABLE `accountfriend`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accountinventory`
--
ALTER TABLE `accountinventory`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accountpolls`
--
ALTER TABLE `accountpolls`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accountpunishments`
--
ALTER TABLE `accountpunishments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accountranks`
--
ALTER TABLE `accountranks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accountshardtransactions`
--
ALTER TABLE `accountshardtransactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accounttasks`
--
ALTER TABLE `accounttasks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `accounttransactions`
--
ALTER TABLE `accounttransactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `bonus`
--
ALTER TABLE `bonus`
  MODIFY `accountId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `botspam`
--
ALTER TABLE `botspam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `communities`
--
ALTER TABLE `communities`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `hubnews`
--
ALTER TABLE `hubnews`
  MODIFY `newsId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `newnpcsnew`
--
ALTER TABLE `newnpcsnew`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `polls`
--
ALTER TABLE `polls`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rankbenefits`
--
ALTER TABLE `rankbenefits`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reports`
--
ALTER TABLE `reports`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `salesannouncements`
--
ALTER TABLE `salesannouncements`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `snapshotmessages`
--
ALTER TABLE `snapshotmessages`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `snapshots`
--
ALTER TABLE `snapshots`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `stats`
--
ALTER TABLE `stats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `accountcrowns`
--
ALTER TABLE `accountcrowns`
  ADD CONSTRAINT `accountcrowns_ibfk_1` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `accountinventory`
--
ALTER TABLE `accountinventory`
  ADD CONSTRAINT `accountinventory_ibfk_1` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`),
  ADD CONSTRAINT `accountinventory_ibfk_2` FOREIGN KEY (`itemId`) REFERENCES `items` (`id`);

--
-- Constraints for table `accountpolls`
--
ALTER TABLE `accountpolls`
  ADD CONSTRAINT `accountpolls_ibfk_1` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`),
  ADD CONSTRAINT `accountpolls_ibfk_2` FOREIGN KEY (`pollId`) REFERENCES `polls` (`id`);

--
-- Constraints for table `accountteamspeak`
--
ALTER TABLE `accountteamspeak`
  ADD CONSTRAINT `accountTeamspeak_accounts_null_fk` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `bonus`
--
ALTER TABLE `bonus`
  ADD CONSTRAINT `bonus_ibfk_1` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `rankbenefits`
--
ALTER TABLE `rankbenefits`
  ADD CONSTRAINT `rankbenefits_ibfk_1` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `reportreasons`
--
ALTER TABLE `reportreasons`
  ADD CONSTRAINT `reportReasons_accounts_id_fk ` FOREIGN KEY (`reporterId`) REFERENCES `accounts` (`id`);

--
-- Constraints for table `reportteammemberships`
--
ALTER TABLE `reportteammemberships`
  ADD CONSTRAINT `reportTeams_accounts_id_fk` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`),
  ADD CONSTRAINT `reportTeams_reportTeamTypes_id_fk` FOREIGN KEY (`teamId`) REFERENCES `reportteams` (`id`);

--
-- Constraints for table `snapshotmessagemap`
--
ALTER TABLE `snapshotmessagemap`
  ADD CONSTRAINT `snapshotMessageMap_snapshotMessages_id_fk` FOREIGN KEY (`messageId`) REFERENCES `snapshotmessages` (`id`),
  ADD CONSTRAINT `snapshotMessageMap_snapshots_id_fk` FOREIGN KEY (`snapshotId`) REFERENCES `snapshots` (`id`);

--
-- Constraints for table `snapshotmessages`
--
ALTER TABLE `snapshotmessages`
  ADD CONSTRAINT `reportChatLog_accounts_id_fk` FOREIGN KEY (`senderId`) REFERENCES `accounts` (`id`),
  ADD CONSTRAINT `reportChatMessages_reportMessageTypes_id_fk` FOREIGN KEY (`snapshotType`) REFERENCES `snapshottypes` (`id`);

--
-- Constraints for table `snapshotrecipients`
--
ALTER TABLE `snapshotrecipients`
  ADD CONSTRAINT `reportMessageRecipients_accounts_id_fk` FOREIGN KEY (`recipientId`) REFERENCES `accounts` (`id`),
  ADD CONSTRAINT `snapshotRecipients_snapshotMessages_id_fk` FOREIGN KEY (`messageId`) REFERENCES `snapshotmessages` (`id`);

--
-- Constraints for table `snapshots`
--
ALTER TABLE `snapshots`
  ADD CONSTRAINT `snapshots_accounts_id_fk` FOREIGN KEY (`creator`) REFERENCES `accounts` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;