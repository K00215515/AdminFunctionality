-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 29, 2019 at 07:25 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gallerydatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `category_id` int(20) NOT NULL,
  `category_name` varchar(20) NOT NULL,
  `entry_id` int(20) NOT NULL,
  `show_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `comment_id` int(255) NOT NULL,
  `entry_id` int(20) NOT NULL,
  `user_id` int(10) NOT NULL,
  `comment` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `course_id` int(4) NOT NULL,
  `course_name` varchar(35) NOT NULL,
  `course_description` varchar(100) NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `entries`
--

CREATE TABLE `entries` (
  `entry_id` int(20) NOT NULL,
  `date_uploaded` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `entry_title` varchar(30) NOT NULL,
  `type` enum('img','vid','','') NOT NULL,
  `entry_description` varchar(30) NOT NULL,
  `price` varchar(20) NOT NULL,
  `user_id` int(10) DEFAULT NULL,
  `show_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entries`
--

INSERT INTO `entries` (`entry_id`, `date_uploaded`, `entry_title`, `type`, `entry_description`, `price`, `user_id`, `show_id`) VALUES
(1, '2019-01-23 13:24:43', 'Interactive', 'img', 'Interactive Digital Media', '20', 0, 0),
(2, '2019-01-23 13:26:15', 'Software', 'img', 'Software Development', '40', 0, 0),
(3, '2019-01-23 13:53:37', 'Art', 'img', 'Art Course', '100', 0, 0),
(4, '2019-01-29 17:46:58', 'software', 'img', 'software course', '200', NULL, 2),
(5, '2019-01-29 18:15:50', 'art work', 'img', 'Course work for art', '500', NULL, 5);

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `rating_id` int(20) NOT NULL,
  `entry_id` int(20) NOT NULL,
  `rating` int(100) NOT NULL,
  `comment` varchar(40) NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shows`
--

CREATE TABLE `shows` (
  `show_id` int(10) NOT NULL,
  `date_live` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `show_title` varchar(20) NOT NULL,
  `show_description` varchar(30) NOT NULL,
  `show_image` varchar(20) NOT NULL,
  `duration` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `live` varchar(10) NOT NULL,
  `user_id` int(10) DEFAULT NULL,
  `course_id` int(4) DEFAULT NULL,
  `entry_id` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shows`
--

INSERT INTO `shows` (`show_id`, `date_live`, `show_title`, `show_description`, `show_image`, `duration`, `live`, `user_id`, `course_id`, `entry_id`) VALUES
(1, '2018-12-11 11:15:39', 'Interactive Design', 'Interactive Design Assignments', 'interactive.jpg', '2018-12-11 11:15:39', 'true', 0, 0, 0),
(2, '2018-12-11 12:50:32', 'Software Development', 'software', 'art.jpg', '2018-12-11 12:50:32', 'true', 0, 0, 0),
(3, '2018-12-12 09:50:56', 'Broadcasting & Sound', 'broadcasting', 'interactive.jpg', '2018-12-12 09:50:56', 'false', 0, 0, 0),
(5, '2018-12-12 15:23:40', 'Art Show', 'Art show', 'art.jpg', '2018-12-12 15:23:40', 'true', 0, 0, 0),
(12, '2018-12-13 11:34:42', 'Creative Multimedia', 'multimedia ', 'interactive.jpg', '2018-12-13 11:34:42', 'false', 0, 0, 0),
(17, '2018-12-13 13:43:37', 'Sound', 'sound', 'interactive.jpg', '2018-12-13 13:43:37', 'true', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(10) NOT NULL,
  `F_name` varchar(11) NOT NULL,
  `L_name` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `username` varchar(11) NOT NULL,
  `profile_pic` varchar(20) DEFAULT NULL,
  `password` varchar(10) NOT NULL,
  `date_joined` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `account_type` enum('admin','student','viewer','') DEFAULT NULL,
  `bio` varchar(50) DEFAULT NULL,
  `course_id` int(4) DEFAULT NULL,
  `approved_username` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `F_name`, `L_name`, `email`, `username`, `profile_pic`, `password`, `date_joined`, `account_type`, `bio`, `course_id`, `approved_username`) VALUES
(2, 'John', 'Smith', 'johnsmith1@gmail.com', 'JohnSmith', NULL, 'john', '2018-12-10 10:32:33', 'admin', NULL, NULL, 0),
(3, 'Jade', 'J', 'jade@hotmail.com', 'Jade', NULL, 'jade', '2018-12-10 13:14:23', 'student', NULL, NULL, 0),
(4, 'Bob', 'Jones', 'K00213124@student.lit.ie', 'K00213124', NULL, 'bob', '2018-12-11 09:16:33', 'student', NULL, NULL, 0),
(5, 'James', 'Harvey', 'K00192094@student.lit.ie', 'K00192094', NULL, 'james', '2018-12-11 09:18:53', 'student', NULL, NULL, 0),
(6, 'Phil', 'Hardy', 'phil@gmail.com', 'Phil', NULL, 'phil', '2018-12-11 11:28:17', 'admin', NULL, NULL, 0),
(7, 'John', 'Philips', 'johnPhilips@gmail.com', 'John', NULL, 'john', '2018-12-11 15:32:06', 'student', NULL, NULL, 0),
(9, 'James', 'Nolan', 'james@gmail.com', 'JamesNolan', NULL, 'james', '2018-12-13 13:57:38', 'student', NULL, NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`category_id`),
  ADD KEY `show_id` (`show_id`),
  ADD KEY `entry_id` (`entry_id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`comment_id`),
  ADD KEY `entry_id` (`entry_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`course_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `entries`
--
ALTER TABLE `entries`
  ADD PRIMARY KEY (`entry_id`),
  ADD KEY `show_id` (`show_id`);

--
-- Indexes for table `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`rating_id`),
  ADD KEY `entry_id` (`entry_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `shows`
--
ALTER TABLE `shows`
  ADD PRIMARY KEY (`show_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `course_id` (`course_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `category_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `comment_id` int(255) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `course_id` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `entries`
--
ALTER TABLE `entries`
  MODIFY `entry_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `rating`
--
ALTER TABLE `rating`
  MODIFY `rating_id` int(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `shows`
--
ALTER TABLE `shows`
  MODIFY `show_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

--
-- Constraints for table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `courses_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

--
-- Constraints for table `rating`
--
ALTER TABLE `rating`
  ADD CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `courses` (`course_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
