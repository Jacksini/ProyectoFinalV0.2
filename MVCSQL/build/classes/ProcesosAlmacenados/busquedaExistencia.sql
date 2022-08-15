CREATE DEFINER=`root`@`localhost` PROCEDURE `busquedaExistencia`()
BEGIN
select idProductos,NombreProducto,CodigoBarras,PrecioCompra,preciofinal,Minimo,Maximo,Existencia,NombreDepartamento,Tipo,
 MaximaFechaVenta, Nombre from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where (select Existencia<=Minimo ) and idDepartamentos=Departamentos_idDepartamentos and 
 Proveedores_idProveedores=idProveedores;
END