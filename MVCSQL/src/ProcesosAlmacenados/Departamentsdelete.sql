CREATE DEFINER=`root`@`localhost` PROCEDURE `Departamentsdelete`(in id int)
BEGIN
delete from departamentos where idDepartamentos=id;
END