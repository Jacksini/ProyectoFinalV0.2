CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarClientes`(in id int)
BEGIN
select idClientes,Nombres from clientes where idClientes=id; 
END