CREATE DEFINER=`root`@`localhost` PROCEDURE `insertDepartaments`(in nombre varchar(45))
BEGIN
insert into departamentos values (null,nombre);
END