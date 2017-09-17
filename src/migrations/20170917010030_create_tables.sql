-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 17, 2017 at 01:51 AM
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

-- --------------------------------------------------------

--
-- Table structure for table `applicationuser`
--

CREATE TABLE IF NOT EXISTS `applicationuser` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `OTHERNAMES` varchar(255) DEFAULT NULL,
  `PHONENO` varchar(255) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_APPLICATIONUSER_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `appuser`
--

CREATE TABLE IF NOT EXISTS `appuser` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACCOUNTLOCKED` tinyint(1) DEFAULT '0',
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `FAILEDLOGINATTEMPTS` int(11) DEFAULT NULL,
  `NAME` varchar(255) NOT NULL,
  `OTHERNAMES` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `PHONENO` varchar(255) NOT NULL,
  `REASONFORLOCKEDACCOUNT` varchar(255) DEFAULT NULL,
  `ROLEID` bigint(20) DEFAULT NULL,
  `ROLENAME` varchar(255) NOT NULL,
  `STATUS` varchar(255) NOT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `USERNAME` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_appuser_0` (`USERNAME`,`PHONENO`,`EMAIL`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

-- --------------------------------------------------------

--
-- Table structure for table `audit_cashexpensepostingsetup`
--

CREATE TABLE IF NOT EXISTS `audit_cashexpensepostingsetup` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACTION` varchar(1) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `CRGLACCOUNTID` bigint(20) DEFAULT NULL,
  `CRGLACCOUNTNAME` varchar(20) DEFAULT NULL,
  `CREATEDBY` varchar(30) DEFAULT NULL,
  `DBGLACCOUNTID` bigint(20) NOT NULL,
  `DBGLACCOUNTNAME` varchar(20) DEFAULT NULL,
  `ISUSERCASHACCOUNT` tinyint(1) NOT NULL DEFAULT '0',
  `NAME` varchar(20) DEFAULT NULL,
  `OBJECTID` bigint(20) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_AUDIT_CASHEXPENSEPOSTINGSETUP_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `audit_glaccounts`
--

CREATE TABLE IF NOT EXISTS `audit_glaccounts` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACCOUNTUSERNAME` varchar(20) DEFAULT NULL,
  `ACTION` varchar(1) DEFAULT NULL,
  `AMOUNT` varchar(20) DEFAULT NULL,
  `BASECATEGORY` varchar(10) DEFAULT NULL,
  `CATEGORY` varchar(30) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `CREATEDBY` varchar(30) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `GLCODE` varchar(8) DEFAULT NULL,
  `GLNAME` varchar(50) DEFAULT NULL,
  `OBJECTID` bigint(20) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `TYPE` varchar(20) DEFAULT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_AUDIT_GLACCOUNTS_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `audit_postingsetup`
--

CREATE TABLE IF NOT EXISTS `audit_postingsetup` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACTION` varchar(1) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `CREATEDBY` varchar(30) DEFAULT NULL,
  `GLID` bigint(20) DEFAULT NULL,
  `GLNAME` varchar(30) DEFAULT NULL,
  `OBJECTID` bigint(20) DEFAULT NULL,
  `POSTINGTYPE` varchar(4) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `VERSION` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_AUDIT_POSTINGSETUP_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `businessday`
--

CREATE TABLE IF NOT EXISTS `businessday` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `BUSINESSDATE` date NOT NULL,
  `BUSINESSDATESTRINGFORMAT` varchar(6) DEFAULT NULL,
  `BUSINESSSTATUS` varchar(1) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_BUSINESSDAY_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `cashexpenseposting`
--

CREATE TABLE IF NOT EXISTS `cashexpenseposting` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AMOUNT` decimal(15,2) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `INSTRUMENTNO` varchar(30) DEFAULT NULL,
  `NARRATION` varchar(200) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `TRANSACTIONREF` int(12) DEFAULT NULL,
  `POSTINGSETUP_ID` bigint(20) NOT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CASHEXPENSEPOSTING_POSTINGSETUP_ID` (`POSTINGSETUP_ID`),
  KEY `FK_CASHEXPENSEPOSTING_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `cashexpensepostingsetup`
--

CREATE TABLE IF NOT EXISTS `cashexpensepostingsetup` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `NAME` varchar(20) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `USERCASHACCOUNT` tinyint(1) NOT NULL DEFAULT '0',
  `CRGLACCOUNT_ID` bigint(20) DEFAULT NULL,
  `DBGLACCOUNT_ID` bigint(20) NOT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CASHEXPENSEPOSTINGSETUP_DBGLACCOUNT_ID` (`DBGLACCOUNT_ID`),
  KEY `FK_CASHEXPENSEPOSTINGSETUP_USER_ID` (`USER_ID`),
  KEY `FK_CASHEXPENSEPOSTINGSETUP_CRGLACCOUNT_ID` (`CRGLACCOUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `doubleentry`
--

CREATE TABLE IF NOT EXISTS `doubleentry` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AMOUNT` decimal(15,2) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `INSTRUMENTNO` varchar(30) DEFAULT NULL,
  `NARRATION` varchar(200) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `TRANSACTIONREF` int(12) DEFAULT NULL,
  `CRACCTS_ID` bigint(20) DEFAULT NULL,
  `DBACCTS_ID` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_DOUBLEENTRY_USER_ID` (`USER_ID`),
  KEY `FK_DOUBLEENTRY_CRACCTS_ID` (`CRACCTS_ID`),
  KEY `FK_DOUBLEENTRY_DBACCTS_ID` (`DBACCTS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `glaccounts`
--

CREATE TABLE IF NOT EXISTS `glaccounts` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACCOUNTUSERNAME` varchar(20) DEFAULT NULL,
  `BASECATEGORY` varchar(10) DEFAULT NULL,
  `CATEGORY` varchar(30) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `GLCODE` varchar(8) DEFAULT NULL,
  `GLNAME` varchar(50) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `TYPE` varchar(20) DEFAULT NULL,
  `ACCOUNTUSER_ID` bigint(20) DEFAULT NULL,
  `GLAMOUNT_ID` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_GLACCOUNTS_USER_ID` (`USER_ID`),
  KEY `FK_GLACCOUNTS_GLAMOUNT_ID` (`GLAMOUNT_ID`),
  KEY `FK_GLACCOUNTS_ACCOUNTUSER_ID` (`ACCOUNTUSER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `glamounts`
--

CREATE TABLE IF NOT EXISTS `glamounts` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AMOUNT` decimal(15,2) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_GLAMOUNTS_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `permissionentity`
--

CREATE TABLE IF NOT EXISTS `permissionentity` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACTION` varchar(255) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `perm_resource` varchar(255) DEFAULT NULL,
  `ROLE` varchar(255) DEFAULT NULL,
  `TYPE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=57 ;

-- --------------------------------------------------------

--
-- Table structure for table `postingsetup`
--

CREATE TABLE IF NOT EXISTS `postingsetup` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `POSTINGTYPE` varchar(4) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `GLACCOUNT_ID` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_POSTINGSETUP_USER_ID` (`USER_ID`),
  KEY `FK_POSTINGSETUP_GLACCOUNT_ID` (`GLACCOUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `resource`
--

CREATE TABLE IF NOT EXISTS `resource` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `ACTION` varchar(255) DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DISPLAYNAME` varchar(255) DEFAULT NULL,
  `MODULENAME` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_resource_0` (`NAME`,`DISPLAYNAME`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- --------------------------------------------------------

--
-- Table structure for table `role_appuser`
--

CREATE TABLE IF NOT EXISTS `role_appuser` (
  `Role_ID` bigint(20) NOT NULL,
  `user_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`Role_ID`,`user_ID`),
  KEY `FK_role_appuser_user_ID` (`user_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sequence`
--

CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE IF NOT EXISTS `transactions` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `BUSINESSDATE` date DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `CREDITAMOUNT` decimal(15,2) DEFAULT NULL,
  `DEBITAMOUNT` decimal(15,2) DEFAULT NULL,
  `FINALACCTBALANCE` decimal(15,2) DEFAULT NULL,
  `INITIALACCTBALANCE` decimal(15,2) DEFAULT NULL,
  `INSTRUMENTNO` varchar(30) DEFAULT NULL,
  `NARRATION` varchar(200) DEFAULT NULL,
  `REVERSED` tinyint(1) DEFAULT '0',
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `TRANSACTIONREF` int(12) DEFAULT NULL,
  `TRANSACTIONTYPE` varchar(4) DEFAULT NULL,
  `ACCTS_ID` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TRANSACTIONS_ACCTS_ID` (`ACCTS_ID`),
  KEY `FK_TRANSACTIONS_USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `trialbalance`
--

CREATE TABLE IF NOT EXISTS `trialbalance` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `AMOUNT` decimal(15,2) DEFAULT NULL,
  `BUSINESSDATE` date DEFAULT NULL,
  `CONSISTENCYVERSION` bigint(20) NOT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `SYSTEMCREATEDATE` date DEFAULT NULL,
  `SYSTEMCREATETIMESTAMP` datetime DEFAULT NULL,
  `GLACCOUNT_ID` bigint(20) DEFAULT NULL,
  `USER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TRIALBALANCE_USER_ID` (`USER_ID`),
  KEY `FK_TRIALBALANCE_GLACCOUNT_ID` (`GLACCOUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `applicationuser`
--
ALTER TABLE `applicationuser`
  ADD CONSTRAINT `FK_APPLICATIONUSER_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `audit_cashexpensepostingsetup`
--
ALTER TABLE `audit_cashexpensepostingsetup`
  ADD CONSTRAINT `FK_AUDIT_CASHEXPENSEPOSTINGSETUP_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `audit_glaccounts`
--
ALTER TABLE `audit_glaccounts`
  ADD CONSTRAINT `FK_AUDIT_GLACCOUNTS_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `audit_postingsetup`
--
ALTER TABLE `audit_postingsetup`
  ADD CONSTRAINT `FK_AUDIT_POSTINGSETUP_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `businessday`
--
ALTER TABLE `businessday`
  ADD CONSTRAINT `FK_BUSINESSDAY_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `cashexpenseposting`
--
ALTER TABLE `cashexpenseposting`
  ADD CONSTRAINT `FK_CASHEXPENSEPOSTING_POSTINGSETUP_ID` FOREIGN KEY (`POSTINGSETUP_ID`) REFERENCES `cashexpensepostingsetup` (`ID`),
  ADD CONSTRAINT `FK_CASHEXPENSEPOSTING_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `cashexpensepostingsetup`
--
ALTER TABLE `cashexpensepostingsetup`
  ADD CONSTRAINT `FK_CASHEXPENSEPOSTINGSETUP_CRGLACCOUNT_ID` FOREIGN KEY (`CRGLACCOUNT_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_CASHEXPENSEPOSTINGSETUP_DBGLACCOUNT_ID` FOREIGN KEY (`DBGLACCOUNT_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_CASHEXPENSEPOSTINGSETUP_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `doubleentry`
--
ALTER TABLE `doubleentry`
  ADD CONSTRAINT `FK_DOUBLEENTRY_CRACCTS_ID` FOREIGN KEY (`CRACCTS_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_DOUBLEENTRY_DBACCTS_ID` FOREIGN KEY (`DBACCTS_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_DOUBLEENTRY_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `glaccounts`
--
ALTER TABLE `glaccounts`
  ADD CONSTRAINT `FK_GLACCOUNTS_ACCOUNTUSER_ID` FOREIGN KEY (`ACCOUNTUSER_ID`) REFERENCES `applicationuser` (`ID`),
  ADD CONSTRAINT `FK_GLACCOUNTS_GLAMOUNT_ID` FOREIGN KEY (`GLAMOUNT_ID`) REFERENCES `glamounts` (`ID`),
  ADD CONSTRAINT `FK_GLACCOUNTS_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `glamounts`
--
ALTER TABLE `glamounts`
  ADD CONSTRAINT `FK_GLAMOUNTS_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `postingsetup`
--
ALTER TABLE `postingsetup`
  ADD CONSTRAINT `FK_POSTINGSETUP_GLACCOUNT_ID` FOREIGN KEY (`GLACCOUNT_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_POSTINGSETUP_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `role_appuser`
--
ALTER TABLE `role_appuser`
  ADD CONSTRAINT `FK_role_appuser_Role_ID` FOREIGN KEY (`Role_ID`) REFERENCES `role` (`ID`),
  ADD CONSTRAINT `FK_role_appuser_user_ID` FOREIGN KEY (`user_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `transactions`
--
ALTER TABLE `transactions`
  ADD CONSTRAINT `FK_TRANSACTIONS_ACCTS_ID` FOREIGN KEY (`ACCTS_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_TRANSACTIONS_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

--
-- Constraints for table `trialbalance`
--
ALTER TABLE `trialbalance`
  ADD CONSTRAINT `FK_TRIALBALANCE_GLACCOUNT_ID` FOREIGN KEY (`GLACCOUNT_ID`) REFERENCES `glaccounts` (`ID`),
  ADD CONSTRAINT `FK_TRIALBALANCE_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `appuser` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
