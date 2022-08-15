CREATE DEFINER=`root`@`localhost` PROCEDURE `VerificadorPrecio`(in id int)
BEGIN
select NombreProducto,preciofinal from productos where idProductos=id;
END