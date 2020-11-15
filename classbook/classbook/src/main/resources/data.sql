insert into School(id,name,city,daycare) values (5,'Szent László gimnázium','Budapest',true);
insert into School_Class(id,name,school_Year,school_id) values (6,'a',9,5); 

insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (1,'Anna','anna','anna',12,false,0,6);
insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (2,'Béla','bela','bela',12,false,0,6);
insert into Student(id,name,username,password,age,sex,GPA,STUDENT_SCHOOL_CLASS_ID) values (3,'Cecil','cecil','cecil',12,false,0,6);

insert into Teacher(id,name,username,password,age,sex,subject) values (4,'Eszter','eszter','eszter',40,false,0);

insert into TEACHER_TEACHER_SCHOOL_CLASSES(teachers_id,TEACHER_SCHOOL_CLASSES_ID) values (4,6);

insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (7,'2014-11-11',0,0,1);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (8,'2014-11-12',1,3,1);
insert into GRADE(id,date,subject,value,GRADE_STUDENT_ID) values (9,'2013-12-13',2,2,1);
