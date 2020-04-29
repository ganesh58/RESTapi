create database student;

use student;




CREATE TABLE student.student_details (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);



INSERT INTO `student`.`student_details`
(`id`,`name`,`age`)
VALUES
(100,'Ganesh',25);

INSERT INTO `student`.`student_details`
(`id`,`name`,`age`)
VALUES
(101,'test',26);


SELECT *  from  student.student_details;

