CREATE DEFINER=`root`@`localhost` PROCEDURE `ModificarProveedor`(in id int,nombre varchar(45),RFc varchar(20),calle varchar(45),
telefono varchar(20),departamento varchar(30),nombrepro varchar(45),correo varchar(30),tipo int,estado int,municipio int,colonia int)
BEGIN
update  proveedores set Nombre=nombre, RFC=RFc,CalleYNumero=calle,Colonia_idColonia=colonia,Municipio_idMunicipio=municipio, Estado_idEstado=estado where idProveedores=id;
update telefonospro set NombreTPro=nombrepro,Departamento=departamento,TelefonoPro=telefono,TipoTelefono_idTipoTelefono=tipo where Proveedores_idProveedores=id ; 
update correospro set Correopro=correo where Proveedores_idProveedores =id;
END