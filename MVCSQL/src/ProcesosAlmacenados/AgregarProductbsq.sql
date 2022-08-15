CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarProductbsq`(in id int)
BEGIN
select NombreProducto,Existencia,Maximo,Minimo from productos where idProductos=id;
END