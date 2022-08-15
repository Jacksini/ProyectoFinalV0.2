CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarProducto`(in id int)
BEGIN
delete from caducidad where Productos_idProductos=id;
delete from productos where idProductos=id;
END