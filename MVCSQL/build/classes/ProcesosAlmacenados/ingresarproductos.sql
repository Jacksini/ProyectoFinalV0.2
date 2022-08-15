CREATE DEFINER=`root`@`localhost` PROCEDURE `ingresarproductos`(in codigo varchar(20),Nombre varchar(30),Descripcion varchar(50),Proveedor int, tipo int,
 pedecedero int,precioCompra float,ganancia float,departamento int,hay int,minimo int,maximo int,preciofinal float)
BEGIN
insert into productos values(null,Nombre,Descripcion,codigo,precioCompra,hay,minimo,maximo,ganancia,
 precio(precioCompra,ganancia,preciofinal),departamento,Proveedor,tipo,pedecedero);

END