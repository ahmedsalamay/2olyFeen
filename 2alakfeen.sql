-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 18, 2015 at 04:47 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `2alakfeen`
--
CREATE DATABASE IF NOT EXISTS `2alakfeen` DEFAULT CHARACTER SET utf32 COLLATE utf32_unicode_ci;
USE `2alakfeen`;

-- --------------------------------------------------------

--
-- Table structure for table `checkins_posts`
--

CREATE TABLE IF NOT EXISTS `checkins_posts` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IDplace` int(11) NOT NULL,
  `IDuser` int(11) NOT NULL,
  `Text` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=2 ;

--
-- Dumping data for table `checkins_posts`
--

INSERT INTO `checkins_posts` (`ID`, `IDplace`, `IDuser`, `Text`) VALUES
(1, 3, 24, 'happy');

-- --------------------------------------------------------

--
-- Table structure for table `friends`
--

CREATE TABLE IF NOT EXISTS `friends` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `sender` int(11) NOT NULL,
  `reciever` int(11) NOT NULL,
  `bool` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=8 ;

--
-- Dumping data for table `friends`
--

INSERT INTO `friends` (`ID`, `sender`, `reciever`, `bool`) VALUES
(7, 24, 20, 0);

-- --------------------------------------------------------

--
-- Table structure for table `places`
--

CREATE TABLE IF NOT EXISTS `places` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `rate` double NOT NULL DEFAULT '0',
  `description` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `checkInNO` int(11) DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=9 ;

--
-- Dumping data for table `places`
--

INSERT INTO `places` (`ID`, `name`, `rate`, `description`, `checkInNO`) VALUES
(3, 'hamza', 5, 'gamedfashkh', 1),
(4, 'antar', 0, 'msh byshb3', 0),
(5, 'alban swesra', 0, 'alaah', 0),
(6, 'alban swes', 0, '', 0),
(7, 'smsma', 0, 'gamedd yasta', 0),
(8, 'akhersa3a', 0, 'wes5', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `creditcard` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=27 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `uname`, `password`, `type`, `email`, `creditcard`) VALUES
(14, 'ahmed', '123456', 'male', 'ahmed_nasser', '463514'),
(20, 'eslam', '653', 'male', 'eslam_eslam', '54165'),
(21, 'serag', '526', 'male', 'serag_ahmed', '846565'),
(24, 'be3ooo', '123456', 'male', 'rabe_be3o', '123456789');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
