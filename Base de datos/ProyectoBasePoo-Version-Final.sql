CREATE DATABASE  IF NOT EXISTS `proyectobasepoo` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `proyectobasepoo`;
SET GLOBAL log_bin_trust_function_creators = 1;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: proyectobasepoo
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `caducidad`
--

DROP TABLE IF EXISTS `caducidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `caducidad` (
  `FechaCompra` date DEFAULT NULL COMMENT 'campo para ingresar la fecha de compra del producto',
  `MaximaFechaVenta` date DEFAULT NULL COMMENT 'Campo para ingresar la fecha maxima permitida de venta',
  `TipoPerecederoNoPerecedero_IdTipoPerecederoNoPerecederocol` varchar(45) NOT NULL COMMENT 'relacion de tabla tipo pedecedero o no pedecedero',
  `Productos_idProductos` int NOT NULL COMMENT 'relacion con Identificador de productos en la tabla productos',
  KEY `fk_Caducidad_TipoPerecederoNoPerecedero1_idx` (`TipoPerecederoNoPerecedero_IdTipoPerecederoNoPerecederocol`),
  KEY `fk_Caducidad_Productos1_idx` (`Productos_idProductos`),
  CONSTRAINT `fk_Caducidad_Productos1` FOREIGN KEY (`Productos_idProductos`) REFERENCES `productos` (`idProductos`),
  CONSTRAINT `fk_Caducidad_TipoPerecederoNoPerecedero1` FOREIGN KEY (`TipoPerecederoNoPerecedero_IdTipoPerecederoNoPerecederocol`) REFERENCES `tipoperecederonoperecedero` (`IdTipoPerecederoNoPerecederocol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caducidad`
--

LOCK TABLES `caducidad` WRITE;
/*!40000 ALTER TABLE `caducidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `caducidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idClientes` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de cliente',
  `Nombres` varchar(45) DEFAULT NULL COMMENT 'Guarda los nombres de nuestro cliente',
  `Apellidos` varchar(45) DEFAULT NULL COMMENT 'Guarda los apellidos de nuestro cliente',
  `CodigoPostal` varchar(10) DEFAULT NULL COMMENT 'Guarda el codigo postal de nuestro cliente',
  `Correo` varchar(45) DEFAULT NULL COMMENT 'Guarda el correo del cliente',
  `Municipio_idMunicipio` int NOT NULL COMMENT 'Relacion del atributo identificador municipio de la tabla Municipio',
  `Estado_idEstado` int NOT NULL COMMENT 'Relacion del atributo Identificador estado de la tabla Estado',
  `Colonia_idColonia` int NOT NULL COMMENT 'Relacion del atributo Identificador colonia de la tabla colonia',
  PRIMARY KEY (`idClientes`),
  KEY `fk_Clientes_Municipio1_idx` (`Municipio_idMunicipio`),
  KEY `fk_Clientes_Estado1_idx` (`Estado_idEstado`),
  KEY `fk_Clientes_Colonia1_idx` (`Colonia_idColonia`),
  CONSTRAINT `fk_Clientes_Colonia1` FOREIGN KEY (`Colonia_idColonia`) REFERENCES `colonia` (`idColonia`),
  CONSTRAINT `fk_Clientes_Estado1` FOREIGN KEY (`Estado_idEstado`) REFERENCES `estado` (`idEstado`),
  CONSTRAINT `fk_Clientes_Municipio1` FOREIGN KEY (`Municipio_idMunicipio`) REFERENCES `municipio` (`idMunicipio`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Kevin','Alexis','82127','test@test.com',1,1,1),(3,'juan','lopez','82155','test@hottest.com',1,1,1),(4,'juan','lopez','82155','test@hottest.com',1,1,1);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colonia`
--

DROP TABLE IF EXISTS `colonia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colonia` (
  `idColonia` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de colonia',
  `NombreColonia` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar las colonias',
  PRIMARY KEY (`idColonia`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colonia`
--

LOCK TABLES `colonia` WRITE;
/*!40000 ALTER TABLE `colonia` DISABLE KEYS */;
INSERT INTO `colonia` VALUES (1,'Viva villa'),(2,'20 Noviembre'),(3,'Villa union'),(4,'Fco Villa'),(5,'Livertad');
/*!40000 ALTER TABLE `colonia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correosemp`
--

DROP TABLE IF EXISTS `correosemp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `correosemp` (
  `Correo` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el correo del empleado',
  `Empleados_idEmpleados` int NOT NULL COMMENT 'Relacion del atributo identificador empleados de la tabla Empleados',
  KEY `fk_CorreosEmp_Empleados1_idx` (`Empleados_idEmpleados`),
  CONSTRAINT `fk_CorreosEmp_Empleados1` FOREIGN KEY (`Empleados_idEmpleados`) REFERENCES `empleados` (`idEmpleados`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correosemp`
--

LOCK TABLES `correosemp` WRITE;
/*!40000 ALTER TABLE `correosemp` DISABLE KEYS */;
/*!40000 ALTER TABLE `correosemp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correospro`
--

DROP TABLE IF EXISTS `correospro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `correospro` (
  `CorreoPro` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el Correo del proveedor ',
  `Proveedores_idProveedores` int NOT NULL COMMENT 'Relacion del atributo idProveedor de la tabla Proveedores',
  KEY `fk_CorreosPro_Proveedores1_idx` (`Proveedores_idProveedores`),
  CONSTRAINT `fk_CorreosPro_Proveedores1` FOREIGN KEY (`Proveedores_idProveedores`) REFERENCES `proveedores` (`idProveedores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correospro`
--

LOCK TABLES `correospro` WRITE;
/*!40000 ALTER TABLE `correospro` DISABLE KEYS */;
INSERT INTO `correospro` VALUES ('PDF@test.com',2);
/*!40000 ALTER TABLE `correospro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos` (
  `idDepartamentos` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de departamento ',
  `NombreDepartamento` varchar(45) DEFAULT NULL COMMENT 'Guarda el nombre del departamento',
  PRIMARY KEY (`idDepartamentos`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'Abarrotes'),(2,'Lacteos'),(3,'Panaderia'),(4,'Lala'),(5,'Cremeria'),(6,'Sabritas');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `idEmpleados` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de empleados',
  `Nombre` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el nombre del empleado',
  `Apellidos` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el apellidos de los empleados',
  `FechaNacimiento` date DEFAULT NULL COMMENT 'Campo para ingresar la fecha de nacimiento del empleado',
  `Contrato` date DEFAULT NULL COMMENT 'campo para ingresar la fecha de contrato del empleado',
  `Usuario` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el usuario del empleado',
  `Contraseña` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar la contraseña del empleado',
  `CalleyNumero` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar calle y numero del empleado',
  `Colonia_idColonia` int NOT NULL COMMENT 'Relacion del atributo Identificador de colonia de la tabla Colonia',
  `Puesto_idPuesto` int NOT NULL COMMENT 'Relacion del atributo Identificador de puesto de la tabla Puesto',
  `Municipio_idMunicipio` int NOT NULL COMMENT 'Relacion del atributo Identificador de Municipio de la tabla Municipio',
  `Estado_idEstado` int NOT NULL COMMENT 'Relacion del atributo Identificador de Estado de la tabla Estado',
  `Turnos_idTurnos` int NOT NULL COMMENT 'Relacion del atributo Identificador de Turno de la tabla Turnos',
  PRIMARY KEY (`idEmpleados`),
  KEY `fk_Empleados_Colonia1_idx` (`Colonia_idColonia`),
  KEY `fk_Empleados_Puesto1_idx` (`Puesto_idPuesto`),
  KEY `fk_Empleados_Municipio1_idx` (`Municipio_idMunicipio`),
  KEY `fk_Empleados_Estado1_idx` (`Estado_idEstado`),
  KEY `fk_Empleados_Turnos1_idx` (`Turnos_idTurnos`),
  CONSTRAINT `fk_Empleados_Colonia1` FOREIGN KEY (`Colonia_idColonia`) REFERENCES `colonia` (`idColonia`),
  CONSTRAINT `fk_Empleados_Estado1` FOREIGN KEY (`Estado_idEstado`) REFERENCES `estado` (`idEstado`),
  CONSTRAINT `fk_Empleados_Municipio1` FOREIGN KEY (`Municipio_idMunicipio`) REFERENCES `municipio` (`idMunicipio`),
  CONSTRAINT `fk_Empleados_Puesto1` FOREIGN KEY (`Puesto_idPuesto`) REFERENCES `puesto` (`idPuesto`),
  CONSTRAINT `fk_Empleados_Turnos1` FOREIGN KEY (`Turnos_idTurnos`) REFERENCES `turnos` (`idTurnos`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Luis','Arellano','2001-11-22','2022-08-10','Administrador','Admin','Viva villa 36',1,1,1,1,1);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado`
--

DROP TABLE IF EXISTS `estado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado` (
  `idEstado` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de Estados',
  `NombreEstado` varchar(25) DEFAULT NULL COMMENT 'Campo para guardar los estados',
  PRIMARY KEY (`idEstado`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado`
--

LOCK TABLES `estado` WRITE;
/*!40000 ALTER TABLE `estado` DISABLE KEYS */;
INSERT INTO `estado` VALUES (1,'Sinaloa'),(2,'DF'),(3,'Nuevo Leon'),(4,'Guadalajara'),(5,'Durango');
/*!40000 ALTER TABLE `estado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturas` (
  `idFacturas` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador Facturas',
  `Descripcion` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar uan descripcio de para la factura',
  `Fecha` date DEFAULT NULL COMMENT 'Campo para ingresar la fecha de la factura',
  `Clientes_idClientes` int NOT NULL COMMENT 'Relacion del atributo Identificador Clientes de la tabla Clientes',
  `Empleados_idEmpleados` int NOT NULL COMMENT 'Relacion del atributo Identificador Empleados de la tabla Empleados',
  PRIMARY KEY (`idFacturas`),
  KEY `fk_Facturas_Clientes1_idx` (`Clientes_idClientes`),
  KEY `fk_Facturas_Empleados1_idx` (`Empleados_idEmpleados`),
  CONSTRAINT `fk_Facturas_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`),
  CONSTRAINT `fk_Facturas_Empleados1` FOREIGN KEY (`Empleados_idEmpleados`) REFERENCES `empleados` (`idEmpleados`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` VALUES (1,'Venta 1','2022-08-10',1,1);
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `municipio`
--

DROP TABLE IF EXISTS `municipio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `municipio` (
  `idMunicipio` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de Municipio',
  `NombreMunicipio` varchar(25) DEFAULT NULL COMMENT 'Campo para ingresar los Municipio',
  PRIMARY KEY (`idMunicipio`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `municipio`
--

LOCK TABLES `municipio` WRITE;
/*!40000 ALTER TABLE `municipio` DISABLE KEYS */;
INSERT INTO `municipio` VALUES (1,'Mazatlan'),(2,'Culiacan'),(3,'Mocirito'),(4,'Badiraguato'),(5,'Cuautla');
/*!40000 ALTER TABLE `municipio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `idProductos` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de productos',
  `NombreProducto` varchar(25) DEFAULT NULL COMMENT 'Guarda el nombre de nuestro producto',
  `DescripcionProducto` varchar(45) DEFAULT NULL COMMENT 'Guarda la descripcion del producto',
  `CodigoBarras` varchar(20) DEFAULT NULL COMMENT 'Guarda el codigo de barras del producto',
  `PrecioCompra` float DEFAULT NULL COMMENT 'Campo para ingresar el precio al que fue comprado el producto',
  `Existencia` int DEFAULT NULL COMMENT 'Guarda la existencia en inventario',
  `Minimo` float DEFAULT NULL COMMENT 'Campo para ingresar la cantidad minima permitida de un producto',
  `Maximo` float DEFAULT NULL COMMENT 'Campo para ingresar la cantidad Maxima permitida del prodcuto',
  `Ganancia` float DEFAULT NULL COMMENT 'campo para ingresar la Ganancia desea para el producto',
  `preciofinal` float DEFAULT NULL,
  `Departamentos_idDepartamentos` int NOT NULL COMMENT 'Relacion del atributo Identificador Departamento de la tabla Deparatamentos',
  `Proveedores_idProveedores` int NOT NULL COMMENT 'Relacion del atributo Identificador Proveedores de la tabla Proveedores',
  `Tipo_Producto_idTipo_Producto` int NOT NULL COMMENT 'Relacion del atributo Identificador Tipo Producto de la tabla Tipo Proucto',
  `TipoPerecederoNoPerecedero_IdTipoPerecederoNoPerecederocol` varchar(45) NOT NULL COMMENT 'Relacion del atributo Identificador pedecederos o no pedecederos de la tabla  pedecederos o no pedecederos',
  PRIMARY KEY (`idProductos`),
  KEY `fk_Productos_Departamentos1_idx` (`Departamentos_idDepartamentos`),
  KEY `fk_Productos_Proveedores1_idx` (`Proveedores_idProveedores`),
  KEY `fk_Productos_Tipo_Producto1_idx` (`Tipo_Producto_idTipo_Producto`),
  KEY `fk_Productos_TipoPerecederoNoPerecedero1_idx` (`TipoPerecederoNoPerecedero_IdTipoPerecederoNoPerecederocol`),
  CONSTRAINT `fk_Productos_Departamentos1` FOREIGN KEY (`Departamentos_idDepartamentos`) REFERENCES `departamentos` (`idDepartamentos`),
  CONSTRAINT `fk_Productos_Proveedores1` FOREIGN KEY (`Proveedores_idProveedores`) REFERENCES `proveedores` (`idProveedores`),
  CONSTRAINT `fk_Productos_Tipo_Producto1` FOREIGN KEY (`Tipo_Producto_idTipo_Producto`) REFERENCES `tipo_producto` (`idTipo_Producto`),
  CONSTRAINT `fk_Productos_TipoPerecederoNoPerecedero1` FOREIGN KEY (`TipoPerecederoNoPerecedero_IdTipoPerecederoNoPerecederocol`) REFERENCES `tipoperecederonoperecedero` (`IdTipoPerecederoNoPerecederocol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Jabon','Jabon de baño','Jabbñ1',10.5,20,5,30,1.2,NULL,1,1,1,'1'),(2,'Pepino','Es un pepino','2',25,20,5,30,0.2,30,1,1,1,'1');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `idProveedores` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de proveedores',
  `Nombre` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar nombre del proveedor',
  `RFC` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar RFC del proveedor',
  `CalleYNumero` varchar(40) DEFAULT NULL COMMENT 'Campo para ingresar la calle y numero del proveedor',
  `Colonia_idColonia` int NOT NULL COMMENT 'Relacion del atributo IdColonia de la tabla colonia',
  `Municipio_idMunicipio` int NOT NULL COMMENT 'Relacion del atributo IdMunicipio de la tabla Municipios',
  `Estado_idEstado` int NOT NULL COMMENT 'Relacion del atributo Estado de la tabla Estados',
  PRIMARY KEY (`idProveedores`),
  KEY `fk_Proveedores_Colonia1_idx` (`Colonia_idColonia`),
  KEY `fk_Proveedores_Municipio1_idx` (`Municipio_idMunicipio`),
  KEY `fk_Proveedores_Estado1_idx` (`Estado_idEstado`),
  CONSTRAINT `fk_Proveedores_Colonia1` FOREIGN KEY (`Colonia_idColonia`) REFERENCES `colonia` (`idColonia`),
  CONSTRAINT `fk_Proveedores_Estado1` FOREIGN KEY (`Estado_idEstado`) REFERENCES `estado` (`idEstado`),
  CONSTRAINT `fk_Proveedores_Municipio1` FOREIGN KEY (`Municipio_idMunicipio`) REFERENCES `municipio` (`idMunicipio`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'Juan','JDK','Nuevo Juan',1,2,1),(2,'Pedro','PDF','Dias 22',1,2,1),(3,'Lala','LLA','Viva quelite',2,1,1),(4,'Sabritas','SBR','Juan escutia',5,3,2),(5,'Unica','UNC','Pradera sur',1,5,1);
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puesto`
--

DROP TABLE IF EXISTS `puesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puesto` (
  `idPuesto` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de puesto',
  `Puesto` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el puesto',
  `Sueldo` float DEFAULT NULL COMMENT 'Campo para ingresar el sueldo ',
  PRIMARY KEY (`idPuesto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puesto`
--

LOCK TABLES `puesto` WRITE;
/*!40000 ALTER TABLE `puesto` DISABLE KEYS */;
INSERT INTO `puesto` VALUES (1,'Jefe',4500),(2,'Gerente',3200),(3,'Cajero',2400);
/*!40000 ALTER TABLE `puesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tablaerrores`
--

DROP TABLE IF EXISTS `tablaerrores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tablaerrores` (
  `idError` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador Errores',
  `NumeroError` varchar(20) DEFAULT NULL COMMENT 'Campo para guardar el numero del error',
  `MensajeError` varchar(45) DEFAULT NULL COMMENT 'Campo para guardar el mensaje creador por el error',
  `FechaError` datetime DEFAULT NULL COMMENT 'Campo para guardar la fecha de generacion del error',
  PRIMARY KEY (`idError`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablaerrores`
--

LOCK TABLES `tablaerrores` WRITE;
/*!40000 ALTER TABLE `tablaerrores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tablaerrores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonoscliente`
--

DROP TABLE IF EXISTS `telefonoscliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonoscliente` (
  `NumTelefono` varchar(20) DEFAULT NULL COMMENT 'Guardamos el numero celular del cliente',
  `Clientes_idClientes` int NOT NULL COMMENT 'Relacion del atributo Identificador Clientes de la tabla Clientes',
  `TipoTelefono_idTipoTelefono` int NOT NULL COMMENT 'Relacion del atributo Identificador Telefono de la tabla TipoTelefono',
  KEY `fk_Telefonos_Clientes1_idx` (`Clientes_idClientes`),
  KEY `fk_Telefonos_TipoTelefono1_idx` (`TipoTelefono_idTipoTelefono`),
  CONSTRAINT `fk_Telefonos_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`),
  CONSTRAINT `fk_Telefonos_TipoTelefono1` FOREIGN KEY (`TipoTelefono_idTipoTelefono`) REFERENCES `tipotelefono` (`idTipoTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonoscliente`
--

LOCK TABLES `telefonoscliente` WRITE;
/*!40000 ALTER TABLE `telefonoscliente` DISABLE KEYS */;
INSERT INTO `telefonoscliente` VALUES ('669245544',3,1),('669245544',4,1);
/*!40000 ALTER TABLE `telefonoscliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonosemp`
--

DROP TABLE IF EXISTS `telefonosemp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonosemp` (
  `NumTelefono` varchar(20) DEFAULT NULL COMMENT 'Guardamos el numero Telefonor del empleado',
  `Empleados_idEmpleados` int NOT NULL COMMENT 'Relacion del atributo Identificador de empleados de la tabla Empleados',
  `TipoTelefono_idTipoTelefono` int NOT NULL COMMENT 'Relacion del atributo Identificador de telefono de la tabla TipoTelefono',
  KEY `fk_TelefonosEmp_Empleados1_idx` (`Empleados_idEmpleados`),
  KEY `fk_TelefonosEmp_TipoTelefono1_idx` (`TipoTelefono_idTipoTelefono`),
  CONSTRAINT `fk_TelefonosEmp_Empleados1` FOREIGN KEY (`Empleados_idEmpleados`) REFERENCES `empleados` (`idEmpleados`),
  CONSTRAINT `fk_TelefonosEmp_TipoTelefono1` FOREIGN KEY (`TipoTelefono_idTipoTelefono`) REFERENCES `tipotelefono` (`idTipoTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonosemp`
--

LOCK TABLES `telefonosemp` WRITE;
/*!40000 ALTER TABLE `telefonosemp` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonosemp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonospro`
--

DROP TABLE IF EXISTS `telefonospro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonospro` (
  `Nombre` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el nombre de la persona que le corresponde el telefono',
  `Departamento` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar el nombre del departamento ',
  `TelefonoPro` varchar(20) DEFAULT NULL COMMENT 'Guardamos el numero celular del proveedor',
  `TipoTelefono_idTipoTelefono` int NOT NULL COMMENT 'Relacion del atributo identificador de tipo de telefono de la tabla TipoTelefono',
  `Proveedores_idProveedores` int NOT NULL COMMENT 'Relacion del atributo identificador de proveedor de la tabla Proveedores',
  KEY `fk_TelefonosPro_Proveedores1_idx` (`Proveedores_idProveedores`),
  KEY `fk_TelefonosPro_TipoTelefono1_idx` (`TipoTelefono_idTipoTelefono`),
  CONSTRAINT `fk_TelefonosPro_Proveedores1` FOREIGN KEY (`Proveedores_idProveedores`) REFERENCES `proveedores` (`idProveedores`),
  CONSTRAINT `fk_TelefonosPro_TipoTelefono1` FOREIGN KEY (`TipoTelefono_idTipoTelefono`) REFERENCES `tipotelefono` (`idTipoTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonospro`
--

LOCK TABLES `telefonospro` WRITE;
/*!40000 ALTER TABLE `telefonospro` DISABLE KEYS */;
INSERT INTO `telefonospro` VALUES ('Pedro','Contabilidad','6692456354',1,2);
/*!40000 ALTER TABLE `telefonospro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `Productos_idProductos` int NOT NULL COMMENT 'Relacion del atributo Identificador Productos de la tabla Prodcutos',
  `Facturas_idFacturas` int NOT NULL COMMENT 'Relacion del atributo Identificador Facturas de la tabla Facturas',
  `Cantidad` int DEFAULT NULL COMMENT 'campo para ingresarr la cantidad del producto comprado',
  `PrecioDeVenta` float DEFAULT NULL COMMENT 'Campo para ingresar el precio al que se vendio el prodcuto',
  KEY `fk_Productos_has_Facturas_Facturas1_idx` (`Facturas_idFacturas`),
  KEY `fk_Productos_has_Facturas_Productos1_idx` (`Productos_idProductos`),
  CONSTRAINT `fk_Productos_has_Facturas_Facturas1` FOREIGN KEY (`Facturas_idFacturas`) REFERENCES `facturas` (`idFacturas`),
  CONSTRAINT `fk_Productos_has_Facturas_Productos1` FOREIGN KEY (`Productos_idProductos`) REFERENCES `productos` (`idProductos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (2,1,5,150),(2,1,2,60),(2,1,10,300),(2,1,3,90);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_producto`
--

DROP TABLE IF EXISTS `tipo_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_producto` (
  `idTipo_Producto` int NOT NULL AUTO_INCREMENT COMMENT 'Identificasdor de tipo de producto',
  `Tipo` varchar(45) DEFAULT NULL COMMENT '''Tipo de  producto (unidad o peso)''',
  PRIMARY KEY (`idTipo_Producto`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_producto`
--

LOCK TABLES `tipo_producto` WRITE;
/*!40000 ALTER TABLE `tipo_producto` DISABLE KEYS */;
INSERT INTO `tipo_producto` VALUES (1,'Kilo'),(2,'Unidad');
/*!40000 ALTER TABLE `tipo_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoperecederonoperecedero`
--

DROP TABLE IF EXISTS `tipoperecederonoperecedero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipoperecederonoperecedero` (
  `IdTipoPerecederoNoPerecederocol` varchar(45) NOT NULL COMMENT 'Identificador de tipo perecedero o no pedecedero',
  `Tipo` varchar(45) DEFAULT NULL COMMENT 'seleccionar pedecedero o no pedecedero',
  `TipoPerecederoNoPerecederocol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdTipoPerecederoNoPerecederocol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoperecederonoperecedero`
--

LOCK TABLES `tipoperecederonoperecedero` WRITE;
/*!40000 ALTER TABLE `tipoperecederonoperecedero` DISABLE KEYS */;
INSERT INTO `tipoperecederonoperecedero` VALUES ('1','Perecedero','Perecedero'),('2','No Perecedero','No Perecedero');
/*!40000 ALTER TABLE `tipoperecederonoperecedero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipotelefono`
--

DROP TABLE IF EXISTS `tipotelefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipotelefono` (
  `idTipoTelefono` int NOT NULL COMMENT 'Identificador de tipos de telefonos',
  `Tipo` varchar(30) DEFAULT NULL COMMENT 'Campo para ingresar el tipo de telefono (Celular o telefono de casa)',
  PRIMARY KEY (`idTipoTelefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipotelefono`
--

LOCK TABLES `tipotelefono` WRITE;
/*!40000 ALTER TABLE `tipotelefono` DISABLE KEYS */;
INSERT INTO `tipotelefono` VALUES (1,'Celular'),(2,'Casa'),(3,'Emergencia');
/*!40000 ALTER TABLE `tipotelefono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turnos`
--

DROP TABLE IF EXISTS `turnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `turnos` (
  `idTurnos` int NOT NULL AUTO_INCREMENT COMMENT 'Identificador de Turnos',
  `NombreTurno` varchar(45) DEFAULT NULL COMMENT 'Campo para ingresar los turnos existentes',
  `HoraEntrada` time DEFAULT NULL COMMENT 'Campo para ingresar la hora de entra del turno',
  `HoraSalida` time DEFAULT NULL COMMENT 'Campo para ingresar la hora de salida del turno',
  PRIMARY KEY (`idTurnos`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turnos`
--

LOCK TABLES `turnos` WRITE;
/*!40000 ALTER TABLE `turnos` DISABLE KEYS */;
INSERT INTO `turnos` VALUES (1,'Matutino','07:00:00','12:30:00'),(2,'Vespertino','13:00:00','09:30:00');
/*!40000 ALTER TABLE `turnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'proyectobasepoo'
--

--
-- Dumping routines for database 'proyectobasepoo'
--
/*!50003 DROP FUNCTION IF EXISTS `precio` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `precio`(compra float,ganancia float,preciofinal float) RETURNS float
BEGIN
if(preciofinal=0)then
return compra*(ganancia+1);
else 
set ganancia=0; 
return preciofinal;

end if;
RETURN 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ActualizarProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarProducto`(in id int,in Codigo varchar(45),in nombre varchar(45),descripcion varchar(30),proveedor int,tipo int,preciocompra FLOAT,
ganancia float,departamento int,hay int,minimo int, maximo int,pedecero int,preciofinal float )
BEGIN

update productos set NombreProducto=nombre,CodigoBarras=Codigo,DescripcionProducto=descripcion,precioCompra=preciocompra,
Existencia=hay,Minimo=minimo,Maximo=maximo,Tipo_Producto_idTipo_Producto=tipo,Tipo_Producto_idTipo_Producto=proveedor,
Departamentos_idDepartamentos=departamento,Departamentos_idDepartamentos=pedecero,preciofinal= precio(preciocompra,ganancia,preciofinal),Ganancia=ganancia where idProductos=id ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarProduct` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarProduct`(in id int,can int)
BEGIN
update productos set Existencia=Existencia+can where idProductos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AgregarProductbsq` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarProductbsq`(in id int)
BEGIN
select NombreProducto,Existencia,Maximo,Minimo from productos where idProductos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `AllDepartamentsid` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AllDepartamentsid`(in id int)
BEGIN
select* from departamentos where idDepartamentos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscadorProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscadorProducto`(in id int )
BEGIN
select NombreProducto,preciofinal,Existencia from productos where idProductos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscaEliminarProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscaEliminarProducto`(in id int)
BEGIN
select NombreProducto,Tipo,PrecioCompra,preciofinal,NombreDepartamento,Existencia
 from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where idProductos=id and Productos_idProductos=idProductos and Proveedores_idProveedores=idProveedores
 and idTipo_Producto=Tipo_Producto_idTipo_Producto and idDepartamentos=Departamentos_idDepartamentos;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscarClientes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarClientes`(in id int)
BEGIN
select idClientes,Nombres from clientes where idClientes=id; 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarProveedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarProveedor`(in id varchar(45))
BEGIN
select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as calle,NombreColonia as colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,telefonospro.Nombre,Departamento,Tipo 
from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia
inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on
 Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores 
 where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores and proveedores.Nombre=id  ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscarProveedorid` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarProveedorid`(in id int)
BEGIN
select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as calle,NombreColonia as colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,telefonospro.NombreTPro,Departamento,Tipo 
from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia
inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on
 Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores 
 where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores and proveedores.idProveedores=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarProveedorNombre` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarProveedorNombre`(in id varchar(45))
BEGIN
select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as calle,NombreColonia as colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,telefonospro.NombreTPro,Departamento,Tipo 
from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia
inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on
 Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores 
 where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores and proveedores.Nombre=id  ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `busquedaExistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `busquedaExistencia`()
BEGIN
select idProductos,NombreProducto,CodigoBarras,PrecioCompra,preciofinal,Minimo,Maximo,Existencia,NombreDepartamento,Tipo,
 MaximaFechaVenta, Nombre from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where (select Existencia<=Minimo ) and idDepartamentos=Departamentos_idDepartamentos and 
 Proveedores_idProveedores=idProveedores;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Departamentsdelete` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Departamentsdelete`(in id int)
BEGIN
delete from departamentos where idDepartamentos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarCliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarCliente`(in id int)
BEGIN
declare t int;
set t= (select idFacturas from facturas where Clientes_idClientes=id);
delete from ticket where Facturas_idFacturas=t;
delete from facturas  where Clientes_idClientes=id;
delete from telefonoscliente where Clientes_idClientes=id;
delete from clientes where idClientes=id;


END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EliminarProducto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarProducto`(in id int)
BEGIN
delete from caducidad where Productos_idProductos=id;
delete from productos where idProductos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ingresarFacturas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ingresarFacturas`(in descripcion varchar(50),idcliente int, idempleado int)
BEGIN
insert into facturas values (null,descripcion,(select now()),idcliente,idempleado);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ingresarproductos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ingresarproductos`(in codigo varchar(20),Nombre varchar(30),Descripcion varchar(50),Proveedor int, tipo int,
 pedecedero int,precioCompra float,ganancia float,departamento int,hay int,minimo int,maximo int,preciofinal float)
BEGIN
insert into productos values(null,Nombre,Descripcion,codigo,precioCompra,hay,minimo,maximo,ganancia,
 precio(precioCompra,ganancia,preciofinal),departamento,Proveedor,tipo,pedecedero);

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarCliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarCliente`(in nombre varchar(45),Apellidos varchar(45),Telefono varchar(45),colonia int,municipio int,
Codigo varchar(20) ,tipo int,correo varchar(45),estado int)
BEGIN
insert into clientes values (null,nombre,Apellidos,Codigo,correo,municipio,estado,colonia);
insert into  telefonoscliente values (telefono, (select max(idClientes )from clientes),tipo);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertDepartaments` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertDepartaments`(in nombre varchar(45))
BEGIN
insert into departamentos values (null,nombre);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertProductbsq` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertProductbsq`(in idproducto int,cantidad int)
BEGIN
insert into ticket values (idproducto,(select max(idFacturas)from facturas),cantidad,(select preciofinal from 
productos where idProductos=idproducto )*cantidad);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Inventario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Inventario`(in id int)
BEGIN
select idProductos,NombreProducto,CodigoBarras,PrecioCompra,preciofinal,Minimo,Maximo,Existencia,NombreDepartamento,Tipo,
 MaximaFechaVenta, Nombre from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where idProductos=id and Productos_idProductos=idProductos and Proveedores_idProveedores=idProveedores
 and idTipo_Producto=Tipo_Producto_idTipo_Producto and idDepartamentos=Departamentos_idDepartamentos;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `inventarioNombre` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `inventarioNombre`(in nombre varchar (45))
BEGIN
select idProductos,NombreProducto,CodigoBarras,PrecioCompra,preciofinal,Minimo,Maximo,Existencia,NombreDepartamento,Tipo,
 MaximaFechaVenta, Nombre from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where idDepartamentos=(select idDepartamentos from departamentos where NombreDepartamento = nombre) 
 and Departamentos_idDepartamentos =idDepartamentos and Proveedores_idProveedores=idProveedores ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ModificarProveedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarProveedor`(in id int,nombre varchar(45),RFc varchar(20),calle varchar(45),
telefono varchar(20),departamento varchar(30),nombrepro varchar(45),correo varchar(30),tipo int,estado int,municipio int,colonia int)
BEGIN
update  proveedores set Nombre=nombre, RFC=RFc,CalleYNumero=calle,Colonia_idColonia=colonia,Municipio_idMunicipio=municipio, Estado_idEstado=estado where idProveedores=id;
update telefonospro set NombreTPro=nombrepro,Departamento=departamento,TelefonoPro=telefono,TipoTelefono_idTipoTelefono=tipo where Proveedores_idProveedores=id ; 
update correospro set Correopro=correo where Proveedores_idProveedores =id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `mostrarfacturasventa` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarfacturasventa`()
BEGIN
DECLARE id INT ;
set id=(select max(idFacturas)from facturas);
select CodigoBarras,NombreProducto,Cantidad,preciofinal from productos inner join ticket on idProductos=Productos_idProductos
inner join facturas on Facturas_idFacturas=idFacturas where idFacturas=id;
 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MostrarProveedores` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MostrarProveedores`()
BEGIN
select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as calle,NombreColonia as colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,telefonospro.NombreTPro,Departamento,Tipo 
from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia
inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on
 Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores 
 where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores  ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `NuevoProveedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `NuevoProveedor`(in Nombre varchar(45), in RFC varchar(13), in CalleyNumero varchar(40),
in telefono varchar(20),in tipo int, in NombreTel varchar(45),in Departamento varchar(45),in correo varchar(45),in estado int,in municipio int,in colonia int)
BEGIN
insert into proveedores  values(null,Nombre,RFC,CalleyNumero,colonia,municipio,estado);
insert into Telefonospro values (NombreTel,Departamento,telefono,tipo,(select max(idProveedores) from proveedores) );
insert into correospro values(correo,(select max(idProveedores) from proveedores));
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ticket` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ticket`(in id int)
BEGIN
select ticket.Cantidad,ticket.PrecioDeVenta,productos.DescripcionProducto from ticket inner join
 productos where idProductos=id and ticket.Productos_idProductos=idProductos  ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VerificadorPrecio` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VerificadorPrecio`(in id int)
BEGIN
select NombreProducto,preciofinal from productos where idProductos=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-16 19:57:46
