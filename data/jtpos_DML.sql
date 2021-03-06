-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: jtpos_db
-- ------------------------------------------------------
-- Server version	5.7.21-1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `customer_purchase`
--

LOCK TABLES `customer_purchase` WRITE;
/*!40000 ALTER TABLE `customer_purchase` DISABLE KEYS */;
INSERT INTO `customer_purchase` VALUES (1960628524,'Vasline',23.99,5,137430470),(2088087540,'Nescafe Gold',46.99,10,137430470),(18816634,'Nola',34.99,3,378707896),(991363607,'Nescafe Gold',46.99,10,378707896),(946807444,'Nola',34.99,3,713371926),(925594626,'Nescafe Gold',46.99,10,713371926),(76003568,'Selati',15.99,3,32492545),(16418248,'Yum-Yum',58.99,5,32492545),(1411775533,'Lucky Star',25.99,5,67855965),(343367146,'Tomatoes',10.95,5,906979746),(1735901612,'Indomie',5.99,5,69783312),(362546095,'Indomie',5.99,5,37019679),(750404456,'Selati',15.99,7,51608386),(459398295,'Kellogs',58.99,5,81451784),(294429999,'Kellogs',58.99,5,8280299),(21400413,'Krush',28.99,9,263348123),(746959067,'Yum-Yum',58.99,5,65124068),(1111924380,'Yum-Yum',58.99,5,628418308);
/*!40000 ALTER TABLE `customer_purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (107),(107);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `login_detail`
--

LOCK TABLES `login_detail` WRITE;
/*!40000 ALTER TABLE `login_detail` DISABLE KEYS */;
INSERT INTO `login_detail` VALUES ('pass@','password');
/*!40000 ALTER TABLE `login_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (675620819,'12/02/2020','Indomie',5.99,'03/04/2020',400,'Instant Noodles'),(796576111,'12/03/2020','Milo-Cereals',39.99,'12/05/2020',300,'BreakFast-Cereals'),(788648285,'09/04/2020','Selati',15.99,'09/07/2020',290,'Gold-Brown-Sugar'),(1297489196,'11/03/2020','Kellogs',58.99,'30/09/2021',75,'BreakFast-Cereals'),(1621604262,'11/03/2020','Yum-Yum',58.99,'30/09/2021',185,'Peanut-Butter'),(2002648567,'12/02/2020','WELLINBTON\'S',38.99,'03/04/2020',85,'TOMATO SAUCE'),(79818745,'12/03/2020','Koo',39.99,'12/05/2020',300,'Mixed Vegetables in hot sauce'),(219499730,'2020-08-05','Krush',28.99,'2020-07-14',80,'Blend Mangoes Juices'),(990975129,'12/01/2020','Blue-Ribbon',14.99,'12/04/2020',60,'Brown-Bread'),(826036643,'11/03/2020','Blue Ribbon',15.99,'30/09/2021',85,'white bread'),(1775657425,'11/03/2020','Lucky Star',25.99,'30/09/2021',195,'Light Meat Tuna Chunks'),(39887764,'11/03/2020','Sun flower ',43.99,'30/09/2021',200,'Cooking Oil'),(55538802,'11/03/2020','Lucky Star',25.99,'30/09/2021',200,'Pilchard In Tomatoes'),(1336520740,'11/03/2020','Nola',34.99,'30/09/2021',79,'Mayonaise'),(1396623340,'11/03/2020','Nescafe Gold',46.99,'30/09/2021',570,'Cappuccino Milky Bar'),(711926886,'12/02/2020','Wellington\'s',34.99,'03/04/2020',50,'Tomato-Sauce Chilli Sauce'),(649346777,'12/03/2020','Vasline',23.99,'12/05/2020',295,'Blue Seal pure petroleum jelly'),(1233999480,'09/04/2020','Dove',15.99,'09/07/2020',300,'Cotton Buds'),(1881068348,'12/01/2020','Albany',14.99,'12/04/2020',60,'White-Bread'),(753990830,'11/03/2020','Albany',16.99,'30/09/2021',85,'Brown Bread'),(362910765,'11/03/2020','Lucky Star',25.99,'30/09/2021',250,'Chilli Tomato Sauce'),(92030864,'11/03/2020','Sun Bake',33.99,'30/09/2021',150,'Baking Flour'),(1474402551,'11/03/2020','Launch Bar',25.99,'30/09/2021',700,'caramel chocolate'),(1262018829,'11/03/2020','Jacobs',58.99,'30/09/2021',85,'Cappuccino'),(927359318,'11/03/2020','Twin Saver',33.99,'30/09/2021',60,'Toilet Paper'),(157376369,'12/03/2020','Sasko',13.99,'15/03/2020',50,'White Bread'),(1677302565,'12/03/2020','Sasko-Bread',12.95,'15/03/2020',35,'Brown Bread'),(1620048955,'2020-07-13','MED LEMON',50.99,'2021-09-05',70,'Cold And Flu Medication'),(142414223,'2020-07-13','Pringles',29.99,'2024-07-13',90,'Flavoured Savoury Snack'),(253192319,'2003-02-13','DOOM',19.58,'2020-07-13',250,'INSECTICIDE'),(137281295,'2023-07-31','Garri',30,'2020-07-14',35,'Grind Casava'),(1161590767,'19/07/2020','Krush',33.99,'15/05/2020',650,'Guava Fruit Juice Blend'),(85407453,'2024-07-31','ELIS BROWN',38.55,'2020-07-15',250,'Coffee Creamer'),(666594785,'2024-07-31','FIVE ROSES ',38.55,'2020-07-15',250,'Smooth Cylon Blend');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `receipt`
--

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;
INSERT INTO `receipt` VALUES (137430470,469.90000000000003),(378707896,469.90000000000003),(713371926,469.90000000000003),(32492545,294.95),(67855965,129.95),(906979746,54.75),(69783312,29.950000000000003),(37019679,29.950000000000003),(51608386,111.93),(81451784,294.95),(8280299,294.95),(263348123,260.90999999999997),(65124068,294.95),(628418308,294.95);
/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `receipt_purchases`
--

LOCK TABLES `receipt_purchases` WRITE;
/*!40000 ALTER TABLE `receipt_purchases` DISABLE KEYS */;
INSERT INTO `receipt_purchases` VALUES (137430470,2088087540),(137430470,1960628524),(137430470,18816634),(137430470,991363607),(713371926,925594626),(713371926,946807444),(32492545,16418248),(32492545,76003568),(67855965,1411775533),(906979746,343367146),(69783312,1735901612),(37019679,362546095),(51608386,750404456),(51608386,459398295),(263348123,21400413),(263348123,746959067),(628418308,1111924380);
/*!40000 ALTER TABLE `receipt_purchases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_detail`
--

LOCK TABLES `user_detail` WRITE;
/*!40000 ALTER TABLE `user_detail` DISABLE KEYS */;
INSERT INTO `user_detail` VALUES (106,12347895698,'xyz@gmail.com','Prinsloo','Choco','Biz','pass@');
/*!40000 ALTER TABLE `user_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-15 20:15:20
