-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: spcbl_osp
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `printingstatus`
--

DROP TABLE IF EXISTS `printingstatus`;
/*!50001 DROP VIEW IF EXISTS `printingstatus`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `printingstatus` AS SELECT 
 1 AS `id`,
 1 AS `mc_name`,
 1 AS `item_name`,
 1 AS `deno`,
 1 AS `fo`,
 1 AS `date`,
 1 AS `dprinting`,
 1 AS `total_printing`,
 1 AS `pending`,
 1 AS `mc_status`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `tbl_dpr`
--

DROP TABLE IF EXISTS `tbl_dpr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_dpr` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `mc_name` varchar(10) DEFAULT NULL,
  `item_name` varchar(100) DEFAULT NULL,
  `deno` varchar(10) DEFAULT NULL,
  `total_printed` int DEFAULT NULL,
  `mc_status` varchar(100) DEFAULT NULL,
  `fo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=723 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dpr`
--

LOCK TABLES `tbl_dpr` WRITE;
/*!40000 ALTER TABLE `tbl_dpr` DISABLE KEYS */;
INSERT INTO `tbl_dpr` VALUES (630,'2022-09-13','MR-1','NJS','25 Tk',50000,'','1862-1866'),(631,'2022-09-13','MR-1','','',NULL,'',''),(632,'2022-09-13','MR-1','','',NULL,'',''),(633,'2022-09-13','MR-1','','',NULL,'',''),(634,'2022-09-13','MR-2','NJS','100 Tk',75000,'','13176.0'),(635,'2022-09-13','MR-2','','',NULL,'','13177-13178'),(636,'2022-09-13','MR-2','','',NULL,'','13184-13185'),(637,'2022-09-13','MR-2','','',NULL,'','13186.0'),(638,'2022-09-13','MR-2','','',NULL,'','13186.0'),(639,'2022-09-13','MR-2','','',NULL,'','13187-13188'),(640,'2022-09-13','MR-2','','',NULL,'',''),(641,'2022-09-13','JD','','',NULL,'Under Maintenance',''),(642,'2022-09-13','JD','','',NULL,'',''),(643,'2022-09-13','JD-4','PO-100','',40000,'','11.0'),(644,'2022-09-13','JD-4','','',NULL,'','12.0'),(645,'2022-09-13','JD-4','','',NULL,'','13.0'),(646,'2022-09-13','JD-4','','',NULL,'','14.0'),(647,'2022-09-13','JD-4','','',NULL,'',''),(648,'2022-09-13','SO','Sonali B','RQ',27000,'Job Change Plate Change Blanket Change',''),(649,'2022-09-13','SO','','PO-50',NULL,'','13.0'),(650,'2022-09-13','SO','','',NULL,'',''),(651,'2022-09-13','SO','','',NULL,'',''),(652,'2022-09-13','SO','','',NULL,'',''),(653,'2022-09-13','YP-1','','',0,'Machine Problem Maintenance No Work',''),(654,'2022-09-13','YP-1','','',NULL,'',''),(655,'2022-09-13','YP-1','','',NULL,'',''),(656,'2022-09-13','YP-1','','',NULL,'',''),(657,'2022-09-13','YP-2','NJS','100 Tk',50000,'','13179-13183'),(658,'2022-09-13','YP-2','','',NULL,'',''),(659,'2022-09-13','YP-2','','',NULL,'',''),(660,'2022-09-13','YP-2','','',NULL,'',''),(661,'2022-09-13','YP-2','','',NULL,'',''),(662,'2022-09-13','HN-1','BIWTA','35 Tk',4000,'','17.0'),(663,'2022-09-13','HN-1','','',NULL,'',''),(664,'2022-09-13','HN-1','','',NULL,'',''),(665,'2022-09-13','HN-1','','',NULL,'',''),(666,'2022-09-13','HN-2','NJS','25 Tk',19000,'Chain Board Problem','1854.0'),(667,'2022-09-13','HN-2','','',NULL,'','1856.0'),(668,'2022-09-13','HN-2','','',NULL,'',''),(669,'2022-09-13','HN-2','','',NULL,'',''),(670,'2022-09-13','HCN','SBS (3F)','10tk',16000,'','1842.0'),(671,'2022-09-13','HCN','','',NULL,'','1843.0'),(672,'2022-09-13','HCN','','',NULL,'',''),(673,'2022-09-13','HCN','','',NULL,'',''),(674,'2022-09-13','X-SEEN-1','NJS','25 Tk',10000,'Gripper Problem','1853.0'),(675,'2022-09-13','X-SEEN-1','','',NULL,'',''),(676,'2022-09-13','X-SEEN-1','','',NULL,'',''),(677,'2022-09-13','X-SEEN-1','','',NULL,'',''),(678,'2022-09-13','X-SEEN-2','NJS','100 Tk',30000,'','13166.0'),(679,'2022-09-13','X-SEEN-2','','',NULL,'','13168.0'),(680,'2022-09-13','X-SEEN-2','','',NULL,'','13170.0'),(681,'2022-09-13','X-SEEN-2','','',NULL,'',''),(682,'2022-09-13','X-SEEN-2','','',NULL,'',''),(683,'2022-09-13','Smart-1','NJS','100 Tk',30000,'','13165.0'),(684,'2022-09-13','Smart-1','','',NULL,'','13167.0'),(685,'2022-09-13','Smart-1','','',NULL,'','13169.0'),(686,'2022-09-13','Smart-1','','',NULL,'','13171.0'),(687,'2022-09-13','Smart-1','','',NULL,'',''),(688,'2022-09-13','Smart-1','','',NULL,'',''),(689,'2022-09-13','Smart-2','EPB/SAFTA','',6375,'','12.0'),(690,'2022-09-13','Smart-2','','',NULL,'','12.0'),(691,'2022-09-13','Smart-2','','',NULL,'','12.0'),(692,'2022-09-13','Smart-2','','',NULL,'','12.0'),(693,'2022-09-13','Smart-2','','',NULL,'','12.0'),(694,'2022-09-13','DELPHEX','','',0,'',''),(695,'2022-09-13','DELPHEX','','',NULL,'',''),(696,'2022-09-13','XEROX','','',0,'Under Maintenance',''),(697,'2022-09-13','XEROX','','',NULL,'',''),(698,'2022-09-13','XEROX','','',NULL,'',''),(699,'2022-09-13','RICOH-1','Janata B','SB-20',NULL,'Machine Problem','8800.0'),(700,'2022-09-13','','','',NULL,'',''),(701,'2022-09-13','','','',NULL,'',''),(702,'2022-09-13','','','',NULL,'',''),(703,'2022-09-13','RICOH-2','Sonali B','SB-10',47640,'',''),(704,'2022-09-13','RICOH-2','','CD-100',NULL,'',''),(705,'2022-09-13','RICOH-2','Agrani B','SB-10',NULL,'',''),(706,'2022-09-13','RICOH-2','Janata B','SB-20',NULL,'',''),(707,'2022-09-13','RICOH-2','Rupali B','CD-50',NULL,'',''),(708,'2022-09-13','RICOH-2','','CD-100',NULL,'',''),(709,'2022-09-13','RICOH-2','','PO-100',NULL,'',''),(710,'2022-09-13','RICOH-2','Sonali B','PO-100',NULL,'',''),(711,'2022-09-13','RICOH-2','Janata B','CD-50',NULL,'',''),(712,'2022-09-13','RICOH-2','','',NULL,'',''),(713,'2022-09-13','WEB','BBR','25.0',20000,'Machine Problem Maintenance',''),(714,'2022-09-13','','','',NULL,'',''),(715,'2022-09-13','','','',NULL,'',''),(716,'2022-09-13','Cutting','BBR','25.0',60000,'',''),(717,'2022-09-13','','','',NULL,'',''),(718,'2022-09-13','','','',NULL,'',''),(719,'2022-09-13','Packing','B','58.0',0,'',''),(720,'2022-09-13','','','',NULL,'',''),(721,'2022-09-13','','','',NULL,'',''),(722,'2022-09-13','','','',NULL,'','');
/*!40000 ALTER TABLE `tbl_dpr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_roles`
--

DROP TABLE IF EXISTS `tbl_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_roles` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_roles`
--

LOCK TABLES `tbl_roles` WRITE;
/*!40000 ALTER TABLE `tbl_roles` DISABLE KEYS */;
INSERT INTO `tbl_roles` VALUES (1,'USER'),(2,'CREATOR'),(3,'EDITOR'),(4,'ADMIN');
/*!40000 ALTER TABLE `tbl_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_users`
--

DROP TABLE IF EXISTS `tbl_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `full_name` varchar(45) NOT NULL,
  `password` varchar(64) NOT NULL,
  `enabled` tinyint DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_users`
--

LOCK TABLES `tbl_users` WRITE;
/*!40000 ALTER TABLE `tbl_users` DISABLE KEYS */;
INSERT INTO `tbl_users` VALUES (1,'admin','prasunhowlader@yahoo.com','Prasun Kanti Howlader','$2a$10$IqTJTjn39IU5.7sSCDQxzu3xug6z/LPU6IF0azE/8CkHCwYEnwBX.',1);
/*!40000 ALTER TABLE `tbl_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_users_roles`
--

DROP TABLE IF EXISTS `tbl_users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_users_roles` (
  `user_id` int NOT NULL,
  `role_id` int NOT NULL,
  KEY `user_fk_idx` (`user_id`),
  KEY `role_fk_idx` (`role_id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `tbl_roles` (`role_id`),
  CONSTRAINT `user_fk` FOREIGN KEY (`user_id`) REFERENCES `tbl_users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_users_roles`
--

LOCK TABLES `tbl_users_roles` WRITE;
/*!40000 ALTER TABLE `tbl_users_roles` DISABLE KEYS */;
INSERT INTO `tbl_users_roles` VALUES (1,4);
/*!40000 ALTER TABLE `tbl_users_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_wpr`
--

DROP TABLE IF EXISTS `tbl_wpr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_wpr` (
  `id` int NOT NULL AUTO_INCREMENT,
  `machine_name` varchar(20) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `total_printing` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_wpr`
--

LOCK TABLES `tbl_wpr` WRITE;
/*!40000 ALTER TABLE `tbl_wpr` DISABLE KEYS */;
INSERT INTO `tbl_wpr` VALUES (48,'MR-1','2022-09-11','2022-09-17',170000),(49,'2 Colour','2022-09-11','2022-09-17',230000),(50,'MR-2 ','2022-09-11','2022-09-17',280000),(51,'2 Colour','2022-09-11','2022-09-17',0),(52,'JD','2022-09-11','2022-09-17',0),(53,'2 Colour','2022-09-11','2022-09-17',0),(54,'YP-1','2022-09-11','2022-09-17',90000),(55,'2 Colour','2022-09-11','2022-09-17',0),(56,'YP-2','2022-09-11','2022-09-17',280000),(57,'2 Colour','2022-09-11','2022-09-17',0),(58,'JD','2022-09-11','2022-09-17',40000),(59,'4 Color','2022-09-11','2022-09-17',80000),(60,'','2022-09-11','2022-09-17',40000),(61,'SO','2022-09-11','2022-09-17',50000),(62,'1 Colour','2022-09-11','2022-09-17',150000),(63,'','2022-09-11','2022-09-17',0),(64,'HCN','2022-09-11','2022-09-17',75000),(65,'','2022-09-11','2022-09-17',0),(66,'HN-1','2022-09-11','2022-09-17',85000),(67,'','2022-09-11','2022-09-17',0),(68,'HN-2','2022-09-11','2022-09-17',170000),(69,'','2022-09-11','2022-09-17',0),(70,'Xsheen-1','2022-09-11','2022-09-17',170000),(71,'','2022-09-11','2022-09-17',0),(72,'Xsheen-2','2022-09-11','2022-09-17',170000),(73,'','2022-09-11','2022-09-17',0),(74,'Smart-1','2022-09-11','2022-09-17',30000),(75,'','2022-09-11','2022-09-17',75000),(76,'Smart-2','2022-09-11','2022-09-17',60000),(77,'','2022-09-11','2022-09-17',10000),(78,'','2022-09-11','2022-09-17',0),(79,'WEB-','2022-09-11','2022-09-17',0),(80,'2 Color','2022-09-11','2022-09-17',0),(81,'WEB-','2022-09-11','2022-09-17',225000),(82,'3 Color','2022-09-11','2022-09-17',0),(83,'Cutting','2022-09-11','2022-09-17',0),(84,'','2022-09-11','2022-09-17',0),(85,'','2022-09-11','2022-09-17',0),(86,'Delphax','2022-09-11','2022-09-17',0),(87,'','2022-09-11','2022-09-17',0),(88,'Xerox','2022-09-11','2022-09-17',83000),(89,'','2022-09-11','2022-09-17',0),(90,'Richo-1','2022-09-11','2022-09-17',116000),(91,'','2022-09-11','2022-09-17',0),(92,'Richo-1','2022-09-11','2022-09-17',116000),(93,'','2022-09-11','2022-09-17',0),(94,NULL,'2022-09-11','2022-09-17',NULL);
/*!40000 ALTER TABLE `tbl_wpr` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `printingstatus`
--

/*!50001 DROP VIEW IF EXISTS `printingstatus`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `printingstatus` AS select uuid() AS `id`,`d`.`mc_name` AS `mc_name`,`d`.`item_name` AS `item_name`,`d`.`deno` AS `deno`,`d`.`fo` AS `fo`,`d`.`date` AS `date`,sum(`d`.`total_printed`) AS `dprinting`,`w`.`total_printing` AS `total_printing`,(`w`.`total_printing` - sum(`d`.`total_printed`)) AS `pending`,`d`.`mc_status` AS `mc_status` from (`tbl_dpr` `d` join `tbl_wpr` `w`) where ((`d`.`mc_name` = `w`.`machine_name`) and (`d`.`date` between `w`.`start_date` and `w`.`end_date`)) group by `d`.`mc_name`,`d`.`date` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-06  8:11:07
