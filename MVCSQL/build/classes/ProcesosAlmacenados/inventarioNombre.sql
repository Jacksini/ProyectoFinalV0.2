CREATE DEFINER=`root`@`localhost` PROCEDURE `inventarioNombre`(in nombre varchar (45))
BEGIN
select idProductos,NombreProducto,CodigoBarras,PrecioCompra,preciofinal,Minimo,Maximo,Existencia,NombreDepartamento,Tipo,
 MaximaFechaVenta, Nombre from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where idDepartamentos=(select idDepartamentos from departamentos where NombreDepartamento = nombre) 
 and Departamentos_idDepartamentos =idDepartamentos and Proveedores_idProveedores=idProveedores ;
END