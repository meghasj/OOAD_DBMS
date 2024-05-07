-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: employeewellness_db
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_firstname` varchar(20) NOT NULL,
  `employee_lastname` varchar(20) NOT NULL,
  `address` varchar(30) NOT NULL,
  `gender` enum('M','F') DEFAULT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_date` timestamp NOT NULL,
  `updated_date` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_created_by` (`created_by`),
  KEY `fk_updated_by` (`updated_by`),
  CONSTRAINT `fk_created_by` FOREIGN KEY (`created_by`) REFERENCES `employees` (`id`),
  CONSTRAINT `fk_updated_by` FOREIGN KEY (`updated_by`) REFERENCES `employees` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,'John','Doe','123 Main St','M',NULL,NULL,'2023-01-01 02:30:00','2024-05-01 11:01:37'),(2,'Jane','Smith','789 Elm St','F',1,1,'2023-06-20 10:15:00','2023-06-25 03:30:00'),(3,'Ram','Nath','789 New Delhi','F',1,1,'2023-07-20 12:15:00','2023-08-25 07:30:00'),(4,'Krishna','Kumar','Maveikkara Allepy','M',2,1,'2023-10-21 08:15:00','2023-01-27 03:40:23'),(5,'Nandini','Manohar','Edappally Ernakulam','F',3,1,'2023-10-21 10:06:12','2023-05-23 04:42:23'),(6,'Megha','Sukumaran','Agrima ','F',1,1,'2024-03-21 04:34:58','2024-03-27 05:35:05'),(7,'Revathy','Rajeevan','TVM Trivandrum','F',1,3,'2024-02-01 04:33:42','2024-03-03 17:39:55'),(8,'Padmajan','Jayaram','Ambalamukku Kowdiyar','M',1,2,'2023-09-14 20:04:55','2024-09-11 17:36:35'),(9,'Karthik','Sukumaran','Ernakulam','M',1,2,'2024-05-03 04:30:00','2024-05-03 04:30:00');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_activities`
--

DROP TABLE IF EXISTS `health_activities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `health_activities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `activity_name` varchar(30) NOT NULL,
  `organizer_id` int NOT NULL,
  `created_by` int NOT NULL DEFAULT '0',
  `updated_by` int NOT NULL DEFAULT '0',
  `created_date` timestamp NOT NULL,
  `updated_date` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `organizer_id` (`organizer_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `health_activities_ibfk_2` FOREIGN KEY (`organizer_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `health_activities_ibfk_3` FOREIGN KEY (`created_by`) REFERENCES `employees` (`id`),
  CONSTRAINT `health_activities_ibfk_4` FOREIGN KEY (`updated_by`) REFERENCES `employees` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_activities`
--

LOCK TABLES `health_activities` WRITE;
/*!40000 ALTER TABLE `health_activities` DISABLE KEYS */;
INSERT INTO `health_activities` VALUES (1,'Yoga Class',1,2,2,'2023-05-02 04:52:30','2023-06-21 04:30:00'),(2,'Running Club',2,1,1,'2023-11-02 05:51:34','2023-11-21 03:40:00'),(3,'Power Zumba',1,2,1,'2023-11-03 04:50:30','2023-11-28 03:40:11'),(4,'Meditation',2,3,2,'2024-01-02 21:54:38','2024-01-17 06:06:53'),(5,'Pranayama',3,2,1,'2024-02-21 04:54:38','2024-02-28 05:06:53');
/*!40000 ALTER TABLE `health_activities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `id` int NOT NULL AUTO_INCREMENT,
  `location_code` varchar(20) NOT NULL,
  `location_name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'TVM101','Trivandrum'),(2,'EKM102','Ernakulam'),(3,'PKD103','Palakkad'),(4,'KLM104','Kollam'),(5,'TSR105','Thrissur');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `participation_records`
--

DROP TABLE IF EXISTS `participation_records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `participation_records` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int NOT NULL,
  `activity_id` int NOT NULL,
  `start_date` timestamp NOT NULL,
  `end_date` timestamp NOT NULL,
  `status` enum('active','inactive','completed') DEFAULT NULL,
  `created_by` int NOT NULL DEFAULT '0',
  `updated_by` int NOT NULL DEFAULT '0',
  `created_date` timestamp NOT NULL,
  `updated_date` timestamp NOT NULL,
  `location_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  KEY `activity_id` (`activity_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  KEY `fk_constraint` (`location_id`),
  CONSTRAINT `fk_constraint` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`),
  CONSTRAINT `participation_records_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `participation_records_ibfk_2` FOREIGN KEY (`activity_id`) REFERENCES `health_activities` (`id`),
  CONSTRAINT `participation_records_ibfk_3` FOREIGN KEY (`created_by`) REFERENCES `employees` (`id`),
  CONSTRAINT `participation_records_ibfk_4` FOREIGN KEY (`updated_by`) REFERENCES `employees` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `participation_records`
--

LOCK TABLES `participation_records` WRITE;
/*!40000 ALTER TABLE `participation_records` DISABLE KEYS */;
INSERT INTO `participation_records` VALUES (1,1,1,'2023-07-15 04:30:00','2023-07-15 05:30:00','completed',2,1,'2023-07-15 04:30:00','2023-07-15 05:30:00',1),(2,2,2,'2023-07-16 03:30:00','2023-07-16 05:00:00','completed',1,2,'2023-07-16 03:30:00','2023-07-16 05:00:00',2),(3,3,3,'2023-07-17 08:30:00','2023-07-17 10:00:00','completed',3,3,'2023-07-17 08:30:00','2023-07-17 10:00:00',2),(4,4,4,'2023-07-18 04:30:00','2023-07-18 06:00:00','completed',4,4,'2023-07-18 04:30:00','2023-07-18 06:00:00',3),(5,5,5,'2023-07-19 04:00:00','2023-07-19 05:30:00','completed',5,5,'2023-07-19 04:00:00','2023-07-19 05:30:00',3),(6,2,3,'2023-07-20 07:30:00','2023-07-20 09:00:00','completed',2,2,'2023-07-20 07:30:00','2023-07-20 09:00:00',4),(7,3,1,'2023-07-21 05:30:00','2023-07-21 07:00:00','inactive',3,3,'2023-07-21 05:30:00','2023-07-21 07:00:00',4),(8,4,3,'2023-07-22 03:00:00','2023-07-22 04:30:00','active',4,4,'2023-07-22 03:00:00','2023-07-22 04:30:00',5),(9,5,3,'2023-07-23 09:30:00','2023-07-23 11:00:00','active',5,1,'2023-07-23 09:30:00','2023-07-23 11:00:00',5),(10,2,1,'2023-07-24 04:00:00','2023-07-24 05:30:00','active',2,2,'2023-07-24 04:00:00','2023-07-24 05:30:00',1),(11,3,4,'2023-07-25 08:30:00','2023-07-25 10:00:00','inactive',3,3,'2023-07-25 08:30:00','2023-07-25 10:00:00',3),(12,4,2,'2023-07-26 04:30:00','2023-07-26 06:00:00','active',3,1,'2023-07-26 04:30:00','2023-07-26 06:00:00',4);
/*!40000 ALTER TABLE `participation_records` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wellness_resources`
--

DROP TABLE IF EXISTS `wellness_resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wellness_resources` (
  `id` int NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(20) NOT NULL,
  `resource_type` varchar(20) NOT NULL,
  `uploaded_by_id` int NOT NULL,
  `activity_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `uploaded_by_id` (`uploaded_by_id`),
  KEY `activity_id` (`activity_id`),
  CONSTRAINT `wellness_resources_ibfk_1` FOREIGN KEY (`uploaded_by_id`) REFERENCES `employees` (`id`),
  CONSTRAINT `wellness_resources_ibfk_2` FOREIGN KEY (`activity_id`) REFERENCES `health_activities` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wellness_resources`
--

LOCK TABLES `wellness_resources` WRITE;
/*!40000 ALTER TABLE `wellness_resources` DISABLE KEYS */;
INSERT INTO `wellness_resources` VALUES (1,'Yoga Guide','Guide',1,1),(2,'Stretch exercises','Youtube video',2,2),(3,'Meditation Audio','Audio',3,4),(4,'Fitness Video','Video',4,3),(5,'StressRelief Tips','Tips',5,4);
/*!40000 ALTER TABLE `wellness_resources` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:16:04
