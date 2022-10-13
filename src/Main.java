

/*create table company(
        companyId serial primary key,
        company_name varchar(250) not null,
        located_country varchar(250) not null
        );
        insert into company (companyId, company_name, located_country) values (1, 'Livetube', 'Browsezoom');
        insert into company (companyId, company_name, located_country) values (2, 'Browsebug', 'Kimia');
        insert into company (companyId, company_name, located_country) values (3, 'Fadeo', 'Chatterbridge');
        insert into company (companyId, company_name, located_country) values (4, 'Mymm', 'Zoomlounge');
        insert into company (companyId, company_name, located_country) values (5, 'Zoomcast', 'Tagopia');
        insert into company (companyId, company_name, located_country) values (6, 'Zoomcast6', 'Tagopia6');
        insert into company (companyId, company_name, located_country) values (7, 'Zoomcast7', 'Tagopia7');
        insert into company (companyId, company_name, located_country) values (8, 'Zoomcast8', 'Tagopia8');
        insert into company (companyId, company_name, located_country) values (9, 'Zoomcast9', 'Tagopia9');
        insert into company (companyId, company_name, located_country) values (10, 'Zoomcast10', 'Tagopia10');
        insert into company (companyId, company_name, located_country) values (11, 'Zoomcast11', 'Tagopia11');


        create table course(
        courseId serial primary key,
        course_name varchar(250) not null,
        duration varchar(250) not null,
        company_id int references company(companyId)
        );

        insert  into  course(course_name, duration, company_id) VALUES ('Java','9-month',2);
        insert  into  course(course_name, duration, company_id) VALUES ('Js','3-month',1);
        insert  into  course(course_name, duration, company_id) VALUES ('Python','4-month',3);
        insert  into  course(course_name, duration, company_id) VALUES ('C++','10-month',3);
        insert  into  course(course_name, duration, company_id) VALUES ('SC','2-month',3);
        insert  into  course(course_name, duration, company_id) VALUES ('SC1','2-month',9);
        insert  into  course(course_name, duration, company_id) VALUES ('SC2','2-month',10);
        insert  into  course(course_name, duration, company_id) VALUES ('SC3','2-month',11);
        insert  into  course(course_name, duration) VALUES ('SC5','2-month');

        create table student(
        studentId serial primary key,
        first_name varchar(250) not null,
        last_name varchar(250) not null,
        email varchar(250) not null,
        study_format varchar(250) not null
        );

        insert into student(first_name, last_name, email, study_format) VALUES ('Azimbek','Abdivaliev','azimbek@gmail.com','OFFLINE');
        insert into student(first_name, last_name, email, study_format) VALUES ('Aisalbek','Abdykaryrov','aisalbek@gmail.com','OFFLINE');
        insert into student(first_name, last_name, email, study_format) VALUES ('Argen','Abdymomunov','argen@gmail.com','ONLINE');
        insert into student(first_name, last_name, email, study_format) VALUES ('Bakai','Koichubaev','bakai@gmail.com','OFFLINE');
        insert into student(first_name, last_name, email, study_format) VALUES ('Nursultan','Osorov','nursultan@gmail.com','ONLINE');

        create table groupa(
        groupaId serial primary key,
        group_name varchar(250) not null,
        date_of_start DATE not null,
        date_of_finish DATE not null,
        course_id int references course(courseId),
        student_id int references student(studentId)
        );

        insert into groupa(group_name, date_of_start, date_of_finish, course_id, student_id) VALUES ('Java-1','15.10.2022','15.10.2023',2,3);
        insert into groupa(group_name, date_of_start, date_of_finish, course_id, student_id) VALUES ('Java-2','13.09.2018','15.10.2019',1,2);
        insert into groupa(group_name, date_of_start, date_of_finish, course_id, student_id) VALUES ('Java-3','14.06.2023','04.05.2024',3,1);
        insert into groupa(group_name, date_of_start, date_of_finish, course_id, student_id) VALUES ('Java-4','12.02.2011','12.9.2012',1,2);
        insert into groupa(group_name, date_of_start, date_of_finish, course_id, student_id) VALUES ('Java-5','11.12.2012','16.11.2013',3,1);

        create table teacher(
        teacherId serial primary key,
        first_name varchar(250) not null,
        last_name varchar(250) not null,
        email varchar(250) not null,
        course_id int references course(courseId)
        );
        insert into teacher(first_name, last_name, email, course_id) VALUES ('Muhamed','Alanov','alanov@gmai.com',3);
        insert into teacher(first_name, last_name, email, course_id) VALUES ('Aijamal','Asangazieva','aijamal@gmai.com',1);
        insert into teacher(first_name, last_name, email, course_id) VALUES ('Nurisa','Mamiraimova','nurisa@gmai.com',2);
        insert into teacher(first_name, last_name, email, course_id) VALUES ('Maksat','Akylov','maksat@gmai.com',5);
        insert into teacher(first_name, last_name, email, course_id) VALUES ('Rahim','Kurbanov','rahim@gmai.com',4);

        SELECT companyId ,courseid FROM company INNER JOIN course ON company.companyId = course.company_id;
        SELECT course_name,company_name FROM company INNER JOIN course ON company.companyId = course.company_id order by course.course_name;
        SELECT companyId ,courseid FROM company FULL JOIN  course ON company.companyId = course.company_id;
        SELECT companyId ,courseid FROM company RIGHT JOIN course ON company.companyId = course.company_id;
        SELECT companyId ,courseid FROM company left join  course ON company.companyId = course.company_id;
        select cars.car_id,user_id from users cross join cars;



        create table cars (
        car_id serial primary key ,
        car_name varchar(250) not null
        );
        create  table users(
        user_id serial primary key,
        user_name varchar(250) not null,
        car_id int references cars(car_id)
        );

        insert into cars(car_name)
        VALUES ('Car1'),
        ('Car2'),
        ('Car3');
        insert into users (user_name, car_id) values ('User1',3);
        insert into users (user_name, car_id) values ('User1',2);
        insert into users (user_name, car_id) values ('User1',1);*/