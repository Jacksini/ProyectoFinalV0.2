CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrarfacturasventa`()
BEGIN
DECLARE id INT ;
set id=(select max(idFacturas)from facturas);
select CodigoBarras,NombreProducto,preciofinal,Cantidad from productos inner join ticket on idProductos=Productos_idProductos
inner join facturas on Facturas_idFacturas=idFacturas where idFacturas=id;
 
END