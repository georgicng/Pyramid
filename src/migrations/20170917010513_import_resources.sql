-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2017 at 04:26 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ft`
--

-- --------------------------------------------------------

--
-- Dumping data for table `resource`
--

INSERT INTO `resource` (`ID`, `ACTION`, `CONSISTENCYVERSION`, `DESCRIPTION`, `DISPLAYNAME`, `MODULENAME`, `NAME`) VALUES
(1, 'Add', 1, 'Can Add a User Entity to the Application under Admin Module', 'Add User', 'A', 'Add User'),
(2, 'Edit', 1, 'Can Edit a User Entity Added to the Application under Admin Module', 'Edit User', 'A', 'Edit User'),
(3, 'View', 1, 'Can View User Entity Added to the Application under Admin Module', 'View User', 'A', 'View User'),
(4, 'Add', 1, 'Can Add a Role Entity to the Application under Admin Module', 'Add Role', 'A', 'Add Role'),
(5, 'Edit', 1, 'Can Edit a Role Entity to the Application under Admin Module', 'Edit Role', 'A', 'Edit Role'),
(6, 'View', 1, 'Can View a Role Entity to the Application under Admin Module', 'View Role', 'A', 'View Role'),
(7, 'Open', 1, 'Can Open a BusinessDay Entity to the Application under Admin Module', 'Open BusinessDay', 'A', 'Open BusinessDay'),
(8, 'Close', 1, 'Can Close a BusinessDay Entity Added to the Application under Admin Module', 'Close BusinessDay', 'A', 'Close BusinessDay'),
(9, 'Re-open', 1, 'Can Re-open BusinessDay Entity Added to the Application under Admin Module', 'Re-open BusinessDay', 'A', 'Re-open BusinessDay'),
(10, 'Run EOD', 1, 'Can Run EOD BusinessDay Entity Added to the Application under Admin Module', 'Run EOD BusinessDay', 'A', 'Run EOD BusinessDay'),
(11, 'Add', 1, 'Can Add a GL Account Entity to the Application under Account Module', 'Add GL Account', 'AS', 'Add GL Account'),
(12, 'Edit', 1, 'Can Edit a GL Account Entity to the Application under Account Module', 'Edit GL Account', 'AS', 'Edit GL Account'),
(13, 'View', 1, 'Can View a GL Account Entity to the Application under Account Module', 'View GL Account', 'AS', 'View GL Account'),
(14, 'View', 1, 'Can View Transactions Entity to the Application under Account Module', 'View Transactions', 'AC', 'View Transactions'),
(15, 'Add', 1, 'Can Add a Double Entry Entity to the Application under Posting Module', 'Add Double Entry', 'PS', 'Add Double Entry'),
(16, 'View', 1, 'Can View a Double Entry Entity to the Application under Posting Module', 'View Double Entry', 'PS', 'View Double Entry'),
(17, 'View', 1, 'Can View a GL Account History Entity to the Application under Account Module', 'View GL Account History', 'AC', 'View GL Account History'),
(18, 'Add', 1, 'Can Add a PostingSetUp Entity to the Application under Account SetUp Module', 'Add PostingSetUp', 'AS', 'Add PostingSetUp'),
(19, 'Edit', 1, 'Can Edit a PostingSetUp Entity to the Application under Account SetUp Module', 'EditPostingSetUp', 'AS', 'Edit PostingSetUp'),
(20, 'View', 1, 'Can View a PostingSetUp Entity to the Application under Account SetUp Module', 'View PostingSetUp', 'AS', 'View PostingSetUp'),
(21, 'Add', 1, 'Can Add a Cash Expense PostingSetUp Entity to the Application under Account SetUp Module', 'Add Cash Expense PostingSetUp', 'AS', 'Add Cash Expense PostingSetUp'),
(22, 'Edit', 1, 'Can Edit a Cash Expense PostingSetUp Entity to the Application under Account SetUp Module', 'Edit Cash Expense PostingSetUp', 'AS', 'Edit Cash Expense PostingSetUp'),
(23, 'View', 1, 'Can View a Cash Expense PostingSetUp Entity to the Application under Account SetUp Module', 'View Cash Expense PostingSetUp', 'AS', 'View Cash Expense PostingSetUp'),
(24, 'View', 1, 'Can View a Trial Balance Entity to the Application under Account Module', 'View Trial Balance', 'AC', 'View Trial Balance'),
(25, 'Add', 1, 'Can Add a Expense Posting Entity to the Application under Account Module', 'Add Expense Posting', 'AC', 'Add Expense Posting'),
(26, 'View', 1, 'Can View a Expense Posting Entity to the Application under Account Module', 'View Expense Posting', 'AC', 'View Expense Posting'),
(27, 'View', 1, 'Can View a Profit and Loss Entity to the Application under Account Module', 'View Profit and Loss Report', 'AC', 'View Profit and Loss Report'),
(28, 'View', 1, 'Can View a Balance Sheet Report under Account Module', 'View Balance Sheet Report', 'AC', 'View Balance Sheet');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
