CREATE DATABASE  IF NOT EXISTS `sanitapp` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sanitapp`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sanitapp
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cita` (
  `idcita` bigint NOT NULL AUTO_INCREMENT,
  `idpaciente` bigint NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `idespecialidad` bigint NOT NULL,
  `estado` varchar(50) DEFAULT 'Pendiente',
  PRIMARY KEY (`idcita`),
  KEY `fk_paciente_idx` (`idpaciente`),
  KEY `fk_especialidad_idx` (`idespecialidad`),
  CONSTRAINT `fk_cita_especialidad` FOREIGN KEY (`idespecialidad`) REFERENCES `especialidad` (`idespecialidad`),
  CONSTRAINT `fk_cita_paciente` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` VALUES (1,1,'2021-05-13 00:00:00',1,'Pendiente de revisar'),(2,2,'2021-05-13 00:00:00',2,'Revisada'),(3,3,'2021-05-13 00:00:00',3,'Pendiente de revisar'),(4,1,'2021-05-13 00:00:00',4,'Pendiente de revisar'),(5,2,'2021-05-13 00:00:00',1,'Pendiente de revisar'),(6,3,'2021-05-13 00:00:00',2,'Pendiente de revisar'),(7,1,'2021-05-13 00:00:00',3,'Revisada'),(8,2,'2021-05-13 00:00:00',4,'Pendiente de revisar'),(9,5,'2021-05-26 00:00:00',4,'Cancelada'),(10,10,'2021-05-26 00:00:00',1,'Revisada'),(11,1,'2021-05-26 00:00:00',3,'Revisada'),(12,10,'2021-05-27 00:00:00',2,'Pendiente de revisar'),(13,8,'2021-05-24 00:00:00',1,'Revisada'),(14,5,'2021-05-18 00:00:00',1,'Revisada'),(15,5,'2021-05-19 00:00:00',3,'Pendiente de revisar');
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidad` (
  `idespecialidad` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idespecialidad`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` VALUES (1,'Acupuntura'),(3,'Fisioterapia'),(5,'Odontologia'),(2,'Osteopatia'),(4,'Quiromasaje');
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialista`
--

DROP TABLE IF EXISTS `especialista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialista` (
  `idespecialista` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `telefono` int DEFAULT NULL,
  `idespecialidad` bigint NOT NULL,
  `idusuario` bigint NOT NULL,
  PRIMARY KEY (`idespecialista`),
  UNIQUE KEY `dni_UNIQUE` (`dni`),
  KEY `fk_especialidad_idx` (`idespecialidad`),
  KEY `fk_especialista_usuario_idx` (`idusuario`),
  CONSTRAINT `fk_especialidad` FOREIGN KEY (`idespecialidad`) REFERENCES `especialidad` (`idespecialidad`),
  CONSTRAINT `fk_especialista_usuario` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialista`
--

LOCK TABLES `especialista` WRITE;
/*!40000 ALTER TABLE `especialista` DISABLE KEYS */;
INSERT INTO `especialista` VALUES (1,'Juan','78451212j',612212112,1,3),(2,'Axel','88451212j',613312112,2,4),(3,'Sandra','98451212j',612442112,3,5),(4,'Esther','08451212j',612552112,4,6),(5,'Maria','18451212j',612166112,1,7),(6,'Jose','28451212j',612117712,2,8),(7,'Fran','38451212j',612118812,3,9),(8,'Antonio García Garcia','22322321l',633252125,1,10);
/*!40000 ALTER TABLE `especialista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `idfactura` bigint NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `idpaciente` bigint NOT NULL,
  `importe` float NOT NULL,
  `idespecialista` bigint NOT NULL,
  PRIMARY KEY (`idfactura`),
  KEY `fk_factura_paciente1_idx` (`idpaciente`),
  KEY `fk_factura_especialista_idx` (`idespecialista`),
  CONSTRAINT `fk_factura_especialista` FOREIGN KEY (`idespecialista`) REFERENCES `especialista` (`idespecialista`),
  CONSTRAINT `fk_factura_paciente1` FOREIGN KEY (`idpaciente`) REFERENCES `paciente` (`idpaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,'2021-05-13 19:35:33',1,75,1),(2,'2021-05-13 19:35:51',4,25,5),(3,'2021-05-13 19:36:03',2,75,1),(4,'2021-05-13 19:36:14',1,75,4),(5,'2021-05-13 19:36:25',2,60,1),(6,'2021-05-15 15:58:26',9,75,8),(7,'2021-05-15 16:16:24',1,75,1),(8,'2021-05-15 16:28:33',8,50,2),(9,'2021-05-15 16:54:14',5,75,2);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura_tiene_productos`
--

DROP TABLE IF EXISTS `factura_tiene_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura_tiene_productos` (
  `idfactura` bigint NOT NULL,
  `idproducto` bigint NOT NULL,
  PRIMARY KEY (`idfactura`,`idproducto`),
  KEY `fk_factura_has_producto_producto1_idx` (`idproducto`),
  KEY `fk_factura_has_producto_factura_idx` (`idfactura`),
  CONSTRAINT `fk_factura_has_producto_factura` FOREIGN KEY (`idfactura`) REFERENCES `factura` (`idfactura`),
  CONSTRAINT `fk_factura_has_producto_producto1` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura_tiene_productos`
--

LOCK TABLES `factura_tiene_productos` WRITE;
/*!40000 ALTER TABLE `factura_tiene_productos` DISABLE KEYS */;
INSERT INTO `factura_tiene_productos` VALUES (1,1),(2,1),(4,1),(6,1),(7,1),(8,1),(9,1),(1,2),(6,2),(7,2),(8,2),(3,3),(4,3),(5,3),(6,3),(7,3),(9,3),(1,4),(3,4),(3,5),(4,5),(5,5),(9,5),(5,6);
/*!40000 ALTER TABLE `factura_tiene_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `idpaciente` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `telefono` int DEFAULT NULL,
  `diagnostico` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` datetime DEFAULT NULL,
  PRIMARY KEY (`idpaciente`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'Axel','12457845j',887887887,'Diagnóstico 5','2021-05-13 00:00:00'),(2,'Maria','22457845j',887887887,'Diagnostico2','2021-05-13 18:41:24'),(3,'Juan','13457845j',887887887,'Diagnostico3','2021-05-13 18:41:24'),(4,'Pepe','14457845j',887887887,'Diagnostico4','2021-05-13 18:41:24'),(5,'Antonio','12557845j',887887887,'diagnostico','2021-05-13 00:00:00'),(6,'Ana','12457875j',887887887,'Diagnostico6','2021-05-13 18:41:25'),(7,'Amparo','12467845j',887887887,'Diagnostico7','2021-05-13 18:41:25'),(8,'Rocío','12458845j',887887887,'hola hola','2021-05-13 00:00:00'),(9,'Fulanito','45454521u',665665665,'diagnostico 20','2021-05-02 00:00:00'),(10,'Juan Carlos','45454545h',995995995,'Diagnostico 4','2021-05-26 00:00:00');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idproducto` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `idproveedor` bigint DEFAULT NULL,
  PRIMARY KEY (`idproducto`),
  KEY `fk_proveedor_idx` (`idproveedor`),
  CONSTRAINT `fk_proveedor` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`idproveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Crema 1','Crema 1',25,1),(2,'Crema 2','Crema 2',25,2),(3,'Pastillas 1','Pastillas 1',25,3),(4,'Pastillas 2','Pastillas 2',25,1),(5,'Jarabe 1','Jarabe 1',25,2),(6,'Jarabe 5','Jarabe',10,2);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idproveedor` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `telefono` int DEFAULT NULL,
  PRIMARY KEY (`idproveedor`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Distribuciones JM','56568785K',445445446),(2,'Cremas S.A.','12457485k',445447745),(3,'Jose & CIA','33669988l',445445335),(4,'Proveedor 5','41412121k',887887887);
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sesion`
--

DROP TABLE IF EXISTS `sesion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sesion` (
  `idsesion` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `idcita` bigint NOT NULL,
  `idespecialista` bigint NOT NULL,
  `tratamiento` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idsesion`),
  UNIQUE KEY `idcita_UNIQUE` (`idcita`),
  KEY `fk_sesion_especialista_idx` (`idespecialista`),
  KEY `fk_sesion_cita_idx` (`idcita`),
  CONSTRAINT `fk_sesion_cita` FOREIGN KEY (`idcita`) REFERENCES `cita` (`idcita`),
  CONSTRAINT `fk_sesion_especialista` FOREIGN KEY (`idespecialista`) REFERENCES `especialista` (`idespecialista`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sesion`
--

LOCK TABLES `sesion` WRITE;
/*!40000 ALTER TABLE `sesion` DISABLE KEYS */;
INSERT INTO `sesion` VALUES (1,NULL,1,5,NULL),(2,'La sesión ha ido muy bien.',2,2,'tratamiento 12'),(3,'Ha ido muy mal.',7,7,'tratamiento 13'),(4,'Tratamiento muy chulo',10,8,'tratamiento 4'),(5,'Muy buena sesión.',11,7,'Tratamiento 10'),(6,NULL,12,2,NULL),(7,'La cita va anar chachi piruli',13,8,'Tratamiento 15'),(8,'hola holita',14,8,'Tratamiento 10'),(9,NULL,15,7,NULL),(10,NULL,8,4,NULL);
/*!40000 ALTER TABLE `sesion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idusuario` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(255) NOT NULL,
  `rol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE KEY `user_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','$2a$10$ZVzaTO0Uu1C7I6nhLJdTduNJ9bqHczL2yFnPSzDZWxjTyLoDmUUqm','ADMIN'),(2,'user','$2a$10$kL07abrZ05y8c/mrbUIS7eylFzopc.oCTHZFwCZkfrPEh1NWa6ATy','USER'),(3,'78451212j','$2a$10$cD/D5Iy4ufaOyUe4wc/APerf4msSB2jR3r8KrTjl17zlG5QizNx8y','JOB'),(4,'88451212j','$2a$10$DDkCmPqSn9uFDTin192DMO.FSPA4YHhx2w2sh/ImQgozZvfO7xHCy','JOB'),(5,'98451212j','$2a$10$gegeFFOe8.Zrjnqflx2Oq.BYeoYztg0FRN5wmokB48//bn4rHFqxS','JOB'),(6,'08451212j','$2a$10$M/dlalD2RDZbe0/fMR9kLe7viJha5S2qO.IP3u8jugIMKfTAMDC4W','JOB'),(7,'18451212j','$2a$10$VBhexhrOwNHY.lau4TG6P.hDJ7Vzbt8giyz09HiD9fWcqwgN3D75e','JOB'),(8,'28451212j','$2a$10$b22FKUxXA65b7/YYQgKR6eVwdhj9HrKpQ54GlJMX931zI7JmJploW','JOB'),(9,'38451212j','$2a$10$Bi6L4h.YhuXi53MXlgsOj.BtuM.mccUbs4b.Uz/DFQOCf1rl5Ktxe','JOB'),(10,'22322321l','$2a$10$F3s14GQqm9Qr.dlv98dfKOAct8ntpouLbyY65obE1.ZMZ27o3Z9Ji','JOB');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-18 20:18:28
