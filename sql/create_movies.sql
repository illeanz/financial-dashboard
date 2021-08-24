CREATE TABLE `conygre`.`movies` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(200) NOT NULL,
  `director` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`));
  
  insert into movies values(12345, 'Blend W', "Snoop");