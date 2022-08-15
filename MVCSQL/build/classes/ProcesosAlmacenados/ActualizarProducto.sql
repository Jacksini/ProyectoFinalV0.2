CREATE DEFINER=`root`@`localhost` PROCEDURE `ActualizarProducto`(in id int,in Codigo varchar(45),in nombre varchar(45),descripcion varchar(30),proveedor int,tipo int,preciocompra FLOAT,
ganancia float,departamento int,hay int,minimo int, maximo int,pedecero int,preciofinal float )
BEGIN

update productos set NombreProducto=nombre,CodigoBarras=Codigo,DescripcionProducto=descripcion,precioCompra=preciocompra,
Existencia=hay,Minimo=minimo,Maximo=maximo,Tipo_Producto_idTipo_Producto=tipo,Tipo_Producto_idTipo_Producto=proveedor,
Departamentos_idDepartamentos=departamento,Departamentos_idDepartamentos=pedecero,preciofinal= precio(preciocompra,ganancia,preciofinal),Ganancia=ganancia where idProductos=id ;
END