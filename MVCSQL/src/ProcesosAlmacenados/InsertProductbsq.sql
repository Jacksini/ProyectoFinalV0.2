CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertProductbsq`(in idproducto int,cantidad int)
BEGIN
insert into ticket values (idproducto,(select max(idFacturas)from facturas),cantidad,(select preciofinal from 
productos where idProductos=idproducto )*cantidad);
END