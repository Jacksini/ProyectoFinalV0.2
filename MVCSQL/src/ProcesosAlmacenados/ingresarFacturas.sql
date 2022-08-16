CREATE DEFINER=`root`@`localhost` PROCEDURE `ingresarFacturas`(in descripcion varchar(50),idcliente int, idempleado int)
BEGIN
insert into facturas values (null,descripcion,(select now()),idcliente,idempleado);
END