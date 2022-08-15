CREATE DEFINER=`root`@`localhost` PROCEDURE `buscadorProducto`(in id int )
BEGIN
select NombreProducto,preciofinal,Existencia from productos where idProductos=id;
END