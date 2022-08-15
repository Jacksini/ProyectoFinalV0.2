CREATE DEFINER=`root`@`localhost` PROCEDURE `AgregarProduct`(in id int,can int)
BEGIN
update productos set Existencia=Existencia+can where idProductos=id;
END