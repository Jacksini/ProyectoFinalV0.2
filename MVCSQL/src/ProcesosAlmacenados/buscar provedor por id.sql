CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarProveedorid`(in id int)
BEGIN
select idProveedores ,proveedores.Nombre as Nombre,RFC,CorreoPro as Correo,CalleYNumero as calle,NombreColonia as colonia,NombreMunicipio as Municipio ,NombreEstado as Estado,TelefonoPro as Telefono,telefonospro.NombreTPro,Departamento,Tipo 
from proveedores inner join estado on Estado_idEstado=idEstado inner join colonia on idColonia=Colonia_idColonia
inner join Municipio on idMunicipio=Municipio_idMunicipio inner join telefonospro on
 Proveedores_idProveedores=idProveedores inner join tipotelefono on idTipoTelefono= TipoTelefono_idTipoTelefono inner join Correospro on correospro.Proveedores_idProveedores 
 where idProveedores=telefonospro.Proveedores_idProveedores and idProveedores=correospro.Proveedores_idProveedores and proveedores.idProveedores=id;
END