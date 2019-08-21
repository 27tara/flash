-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.17 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for boot2
CREATE DATABASE IF NOT EXISTS `boot2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `boot2`;

-- Dumping structure for table boot2.course
CREATE TABLE IF NOT EXISTS `course` (
  `id` int(11) NOT NULL,
  `duration` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table boot2.course: ~5 rows (approximately)
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
REPLACE INTO `course` (`id`, `duration`, `name`) VALUES
	(1, '6 months', 'Java'),
	(3, '2 months', 'jpa'),
	(4, '1 months', 'spring security'),
	(8, '1 month', 'hibernate'),
	(9, '2 months', 'hibernate');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;

-- Dumping structure for table boot2.enquiry
CREATE TABLE IF NOT EXISTS `enquiry` (
  `id` int(11) NOT NULL,
  `enquirer_contact_number` int(11) NOT NULL,
  `enquirer_email` varchar(255) DEFAULT NULL,
  `enquirer_name` varchar(255) DEFAULT NULL,
  `is_available` varchar(255) DEFAULT NULL,
  `query` varchar(255) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKikwh71k4u3pn9w2n5tgh0miwb` (`course_id`),
  CONSTRAINT `FKikwh71k4u3pn9w2n5tgh0miwb` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table boot2.enquiry: ~6 rows (approximately)
/*!40000 ALTER TABLE `enquiry` DISABLE KEYS */;
REPLACE INTO `enquiry` (`id`, `enquirer_contact_number`, `enquirer_email`, `enquirer_name`, `is_available`, `query`, `course_id`, `created_at`, `updated_at`) VALUES
	(1, 983876, '27tarang@gmail.com', 'Tarang', NULL, 'We are 5 students to opt for this course, when can we expect to enroll in.', 3, '2019-08-21 02:51:06', '2019-08-21 02:51:17'),
	(2, 983876, '27tarang@gmail.com', 'LMP', NULL, 'We are 5 students to opt for this course, when can we expect to enroll in.', 3, '2019-08-21 02:51:07', '2019-08-21 02:51:17'),
	(7, 983876, '27tarang@gmail.com', 'PQR', NULL, 'We are 5 students to opt for this course, when can we expect to enroll in.', 3, '2019-08-21 02:51:08', '2019-08-21 02:51:16'),
	(10, 983876, '27tarang@gmail.com', 'LMP', 'Yes', 'Reolved', 3, '2019-08-21 02:51:09', '2019-08-21 02:51:14'),
	(11, 983876, '27tarang@gmail.com', 'quack', NULL, 'We are 5 students waiting for this course to start, when can we expect to enroll in this.', 3, '2019-08-21 02:51:09', '2019-08-21 02:51:12'),
	(12, 983876, '27tarang@gmail.com', 'quack quack', NULL, 'We are 5 students waiting for this course to start, when can we expect to enroll in this.', 1, '2019-08-21 19:14:59', '2019-08-21 19:15:00');
/*!40000 ALTER TABLE `enquiry` ENABLE KEYS */;

-- Dumping structure for table boot2.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table boot2.hibernate_sequence: ~2 rows (approximately)
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
REPLACE INTO `hibernate_sequence` (`next_val`) VALUES
	(13),
	(13);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
