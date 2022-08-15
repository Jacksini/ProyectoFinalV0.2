CREATE DEFINER=`root`@`localhost` PROCEDURE `NuevoProveedor`(in Nombre varchar(45), in RFC varchar(13), in CalleyNumero varchar(40),
in telefono varchar(20),in tipo int, in NombreTel varchar(45),in Departamento varchar(45),in correo varchar(45),in estado int,in municipio int,in colonia int)
BEGIN
insert into proveedores  values(null,Nombre,RFC,CalleyNumero,colonia,municipio,estado);
insert into Telefonospro values (NombreTel,Departamento,telefono,tipo,(select max(idProveedores) from proveedores) );
insert into correospro values(correo,(select max(idProveedores) from proveedores));
END