

DROP TABLE IF EXISTS `order_id_generate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_id_generate` (
                                     `id` int NOT NULL AUTO_INCREMENT,
                                     `date` date DEFAULT NULL,
                                     PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;



DROP TABLE IF EXISTS `tbl_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_category` (
                                `category_id` int NOT NULL AUTO_INCREMENT,
                                `category_name` varchar(255) DEFAULT NULL,
                                PRIMARY KEY (`category_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


DROP TABLE IF EXISTS `order_in_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_in_detail` (
                                   `order_detail_id` int NOT NULL AUTO_INCREMENT,
                                   `category_id_fk` int DEFAULT NULL,
                                   `order_id_fk` int DEFAULT NULL,
                                   PRIMARY KEY (`order_detail_id`),
                                   KEY `FK633k6qn7blu6u1148dv9gbym0` (`category_id_fk`),
                                   KEY `FKbra93fw7lpghprdiq9e1r6wex` (`order_id_fk`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
