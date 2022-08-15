CREATE DEFINER=`root`@`localhost` PROCEDURE `ticket`(in id int)
BEGIN
select ticket.Cantidad,ticket.PrecioDeVenta,productos.DescripcionProducto from ticket inner join
 productos where idProductos=id and ticket.Productos_idProductos=idProductos  ;
END