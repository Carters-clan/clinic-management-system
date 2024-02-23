-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: clinicmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `charges`
--

DROP TABLE IF EXISTS `charges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charges` (
  `desease` varchar(35) DEFAULT NULL,
  `medicine` varchar(25) DEFAULT NULL,
  `fare` varchar(15) DEFAULT NULL,
  `duration` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charges`
--

LOCK TABLES `charges` WRITE;
/*!40000 ALTER TABLE `charges` DISABLE KEYS */;
INSERT INTO `charges` VALUES ('Acne','tetracycline','1500/-','3 Months'),('Asthma','Inhaled corticosteroids','4500/-','6 Months'),('Anxiety','Benzodiazepines','1200/-','2 Weeks'),('Arthritis','NSAIDs ','9000/-','2 Months'),('Allergic rhinitis','Nonsedating oral','1600/-','18 Months'),('Anal cancer','fluorouracil','1800/-','13 Months'),('Bacterial vaginosis','metronidazole pills','17,500/-','16 Months'),('Bladder cancer','bacillus Calmette-Guérin','3600/-','8 Months'),('Brain tumours','Afinitor','1900/-','36 Months'),('Chest pain','Nitroglycerin','450/-','1 Week'),('Chickenpox','acyclovir','1,500/-','1 Month'),('Chronic kidney disease','ramipril','1,900/-','3 Months'),('Cold sore','docosanol','3,700/-','4 Months'),('Coma','pentobarbital','5000/-','8 Months'),('Congenital heart disease','Antiarrhythmics.','7000/-','18 Months'),('Coronavirus (COVID-19)','Tylenol.','600/-','2 Months'),('Cough','Mucinex DM.','200/-','10 Days'),('Dental abscess','Amoxicillin','800/-','24 Days'),('Depression','Celexa','1800/-','2 Months'),('Diabetes','Metformin ','13,50/-','4 Months'),('Epilepsy','carbamazepine ','1900/-','7 Months'),('Fever','acetaminophen ','250/-','3 Days'),('Flu','oseltamivir  ','360/-','3 Days'),('Food poisoning','loperamide link  ','680/-','5 Days'),('Gallstones','Actigall  ','9020/-','2 Months'),('Haemorrhoids (piles)','hemorrhoids   ','900/-','2 Months'),('Headaches','hemcsdchoids   ','9700/-','7 Months'),('Hearing loss','uscmcsdchoids   ','700/-','1 Months'),('Heart Failure','Alchhoids','1700/-','8 Months'),('HIV','sdsdoids','2500/-','3 Months'),('Kidney stones','Xyxloids','9,400/-','2.5 Months'),('Liver Desease','goluted','7000/-','5 Months'),('Malaria','heaheayd','500/-','1 Month'),('Migraine','eledyzds','5,800/-','16 Months'),('Sunburn','huddyzds','800/-','3 Months'),('Testicular cancer','chasax','4800/-','7 Months'),('Thyroid cancer','hasaxes','8,500/-','3 Months'),('Vaginal discharge','xessex','5,500/-','5 Months');
/*!40000 ALTER TABLE `charges` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-17 15:12:27
