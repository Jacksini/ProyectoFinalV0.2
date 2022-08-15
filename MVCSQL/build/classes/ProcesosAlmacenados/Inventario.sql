CREATE DEFINER=`root`@`localhost` PROCEDURE `Inventario`(in id int)
BEGIN
select idProductos,NombreProducto,CodigoBarras,PrecioCompra,preciofinal,Minimo,Maximo,Existencia,NombreDepartamento,Tipo,
 MaximaFechaVenta, Nombre from productos inner join  caducidad inner join departamentos 
 inner join tipo_producto inner join proveedores where idProductos=id and Productos_idProductos=idProductos and Proveedores_idProveedores=idProveedores
 and idTipo_Producto=Tipo_Producto_idTipo_Producto and idDepartamentos=Departamentos_idDepartamentos;

END