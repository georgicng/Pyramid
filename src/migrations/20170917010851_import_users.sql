-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 17, 2017 at 02:10 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pyramid`
--

--
-- Dumping data for table `appuser`
--

INSERT INTO `appuser` (`ID`, `ACCOUNTLOCKED`, `CONSISTENCYVERSION`, `EMAIL`, `FAILEDLOGINATTEMPTS`, `NAME`, `OTHERNAMES`, `PASSWORD`, `PHONENO`, `REASONFORLOCKEDACCOUNT`, `ROLEID`, `ROLENAME`, `STATUS`, `SYSTEMCREATEDATE`, `SYSTEMCREATETIMESTAMP`, `USERNAME`) VALUES
(1, NULL, 1, 'sylng@areete.services', NULL, 'Sylvanus', 'Ikpugbu', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', '0808690385', NULL, NULL, 'admin', 'A', NULL, NULL, 'admin'),
(2, NULL, 1, 'guest@mail.ru', NULL, 'Guest', 'Account', '84983c60f7daadc1cb8698621f802c0d9f9a3c3c295c810748fb048115c186ec', '089043334', NULL, NULL, 'guest', 'A', NULL, NULL, 'guest');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
