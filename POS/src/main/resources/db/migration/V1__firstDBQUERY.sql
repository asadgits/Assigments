#
#
# DROP TABLE IF EXISTS `order_id_generate`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
# /*!50503 SET character_set_client = utf8mb4 */;
# CREATE TABLE `order_id_generate` (
#                                      `id` int NOT NULL AUTO_INCREMENT,
#                                      `date` date DEFAULT NULL,
#                                      PRIMARY KEY (`id`)
# ) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;
#
#
#
# DROP TABLE IF EXISTS `tbl_product`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
# /*!50503 SET character_set_client = utf8mb4 */;
# CREATE TABLE `tbl_product` (
#                                 `product_id` int NOT NULL AUTO_INCREMENT,
#                                 `product_name` varchar(255) DEFAULT NULL,
#                                 `product_quantity` int NOT NULL,
#                                 PRIMARY KEY (`product_id`)
# ) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;
#
#
# DROP TABLE IF EXISTS `order_in_detail`;
# /*!40101 SET @saved_cs_client     = @@character_set_client */;
# /*!50503 SET character_set_client = utf8mb4 */;
# CREATE TABLE `order_in_detail` (
#                                    `order_detail_id` int NOT NULL AUTO_INCREMENT,
#                                    `product_id_fk` int DEFAULT NULL,
#                                    `order_id_fk` int DEFAULT NULL,
#                                    PRIMARY KEY (`order_detail_id`),
#                                    KEY  (`product_id_fk`),
#                                    KEY  (`order_id_fk`)
# ) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
# /*!40101 SET character_set_client = @saved_cs_client */;




-- Table structure for table `order_id_generate`
DROP TABLE IF EXISTS `order_id_generate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_id_generate` (
                                     `id` int NOT NULL AUTO_INCREMENT,
                                     `date` date DEFAULT NULL,
                                     PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;




-- Table structure for table `order_in_detail`
DROP TABLE IF EXISTS `order_in_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_in_detail` (
                                   `order_detail_id` int NOT NULL AUTO_INCREMENT,
                                   `product_id_fk` int DEFAULT NULL,
                                   `product_quantity` int DEFAULT NULL,
                                   `order_id_fk` int DEFAULT NULL,
                                   PRIMARY KEY (`order_detail_id`),
                                   KEY  (`product_id_fk`,`product_quantity`),
                                   KEY  (`order_id_fk`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


-- Table structure for table `product`
DROP TABLE IF EXISTS `tbl_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_product` (
                           `product_id` int NOT NULL AUTO_INCREMENT,
                           `product_name` varchar(255) DEFAULT NULL,
                           `product_quantity` int DEFAULT NULL,
                           PRIMARY KEY (`product_id`),
                           UNIQUE KEY  (`product_id`,`product_quantity`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

