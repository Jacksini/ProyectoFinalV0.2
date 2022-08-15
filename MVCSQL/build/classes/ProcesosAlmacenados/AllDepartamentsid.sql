CREATE DEFINER=`root`@`localhost` PROCEDURE `AllDepartamentsid`(in id int)
BEGIN
select* from departamentos where idDepartamentos=id;
END