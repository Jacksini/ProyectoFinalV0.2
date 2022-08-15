CREATE DEFINER=`root`@`localhost` PROCEDURE `EliminarCliente`(in id int)
BEGIN
declare t int;
set t= (select idFacturas from facturas where Clientes_idClientes=id);
delete from ticket where Facturas_idFacturas=t;
delete from facturas  where Clientes_idClientes=id;
delete from telefonoscliente where Clientes_idClientes=id;
delete from clientes where idClientes=id;


END