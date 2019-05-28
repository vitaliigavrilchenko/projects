CREATE SCHEMA `new_schema` ;
CREATE TABLE `new_schema`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pages` INT NULL,
  `author` VARCHAR(45) NULL,
  `colour` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));