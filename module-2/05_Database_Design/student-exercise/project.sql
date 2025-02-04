BEGIN TRANSACTION;


CREATE TABLE department
(
        department_id SERIAL NOT NULL PRIMARY KEY,
        department_name VARCHAR(30),
        number_of_employees INTEGER
);
CREATE TABLE employee
(
        employee_id SERIAL NOT NULL PRIMARY KEY,
        first_name VARCHAR(30),
        last_name VARCHAR(30),
        job_title VARCHAR(30),
        department_id INTEGER NOT NULL,
        gender VARCHAR(5),
        date_of_birth VARCHAR(30),
        date_of_hire DATE,
        
        CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES department (department_id)
);
CREATE TABLE project
(
        project_id SERIAL NOT NULL PRIMARY KEY,
        project_name VARCHAR(30),
        start_date DATE,
        number_of_employees INTEGER
);
CREATE TABLE employee_project
(
        employee_id INTEGER NOT NULL,
        project_id INTEGER NOT NULL,
        
        CONSTRAINT fk_employee FOREIGN KEY (employee_id) REFERENCES employee (employee_id),
        CONSTRAINT fk_project FOREIGN KEY (project_id) REFERENCES project (project_id)
);

COMMIT TRANSACTION;
        
-- Populate the tables with data for at least four projects, three departments, and eight employees.

INSERT INTO project (project_name, start_date, number_of_employees)
        VALUES('Project 1', '2020-02-14', 1);      
INSERT INTO project (project_name, start_date, number_of_employees)
        VALUES('Project 2', '2020-02-14', 1); 
INSERT INTO project (project_name, start_date, number_of_employees)
        VALUES('Project 3', '2020-02-14', 1);
INSERT INTO project (project_name, start_date, number_of_employees)
        VALUES('Project 4', '2020-02-14', 1);   
INSERT INTO department (department_name, number_of_employees)
        VALUES('Department 1', 2);          
INSERT INTO department (department_name, number_of_employees)
        VALUES('Department 2', 2);  
            
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Jim', 'Jones', 'Secretary', 1, 'M', '1970-12-18', '2020-02-14');  
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Jim', 'Beam', 'Clerk', 1, 'M', '1969-11-19', '2020-02-14');          
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Jack', 'Daniel', 'Salesman', 1, 'M', '1920-01-17', '2020-02-14');            
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Captain', 'Morgan', 'Manager', 1, 'M', '1910-10-01', '2020-02-14');          
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Daisy', 'Duke', 'Customer Care', 2, 'F', '1980-02-18', '2020-02-14');   
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Rosie', 'Riveter', 'Saleswoman', 2, 'F', '1920-03-02', '2020-02-14');  
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Princess', 'Peach', 'Marketing', 2, 'F', '2001-01-16', '2020-02-14');  
INSERT INTO employee (first_name, last_name, job_title, department_id, gender, date_of_birth, date_of_hire)
        VALUES('Betty', 'Boop', 'Secretary', 2, 'F', '1910-04-05', '2020-02-14');   
--Make sure each project has at least one employee assigned to it, and each department has at least two employees. 
INSERT INTO employee_project (employee_id, project_id)
        VALUES((SELECT employee_id FROM employee WHERE last_name = 'Beam'), 
        (SELECT project_id FROM project WHERE project_name = 'Project 1'));
INSERT INTO employee_project (employee_id, project_id)
        VALUES((SELECT employee_id FROM employee WHERE last_name = 'Duke'), 
        (SELECT project_id FROM project WHERE project_name = 'Project 2'));
INSERT INTO employee_project (employee_id, project_id)
        VALUES((SELECT employee_id FROM employee WHERE last_name = 'Morgan'), 
        (SELECT project_id FROM project WHERE project_name = 'Project 3'));
INSERT INTO employee_project (employee_id, project_id)
        VALUES((SELECT employee_id FROM employee WHERE last_name = 'Boop'), 
        (SELECT project_id FROM project WHERE project_name = 'Project 4'));
        
BEGIN TRANSACTION;


CREATE TABLE department_employee
(
        department_id INTEGER NOT NULL,
        employee_id INTEGER NOT NULL,
        CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES department (department_id),
        CONSTRAINT fk_employee FOREIGN KEY (employee_id) REFERENCES employee (employee_id)

);
COMMIT TRANSACTION;

-- DELETE FROM employee WHERE department_id IS NOT NULL;

INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Jones'), 
        (SELECT department_id from department WHERE department_name = 'Department 1'));
INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Beam'), 
        (SELECT department_id from department WHERE department_name = 'Department 1'));

INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Daniel'), 
        (SELECT department_id from department WHERE department_name = 'Department 1'));        
INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Morgan'), 
        (SELECT department_id from department WHERE department_name = 'Department 1'));   
INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Duke'), 
        (SELECT department_id from department WHERE department_name = 'Department 2'));
INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Riveter'), 
        (SELECT department_id from department WHERE department_name = 'Department 2'));
INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Peach'), 
        (SELECT department_id from department WHERE department_name = 'Department 2'));
INSERT INTO department_employee (employee_id, department_id) 
        VALUES ((SELECT employee_id FROM employee WHERE last_name = 'Boop'), 
        (SELECT department_id from department WHERE department_name = 'Department 2'));  
        
UPDATE department SET number_of_employees = (select count(*) FROM employee WHERE department_name = 'Department_1')
WHERE department_name = 'Department_1';
UPDATE department SET number_of_employees = (select count(*) FROM employee WHERE department_name = 'Department_2')
WHERE department_name = 'Department_2'; 

DELETE FROM department_employee;

UPDATE project SET number_of_employees = (select count(*) FROM employee_project WHERE project_name = 'Project_1')
WHERE project_name = 'Project_1'; 
UPDATE project SET number_of_employees = (select count(*) FROM employee_project WHERE project_name = 'Project_2')
WHERE project_name = 'Project_2';
UPDATE project SET number_of_employees = (select count(*) FROM employee_project WHERE project_name = 'Project_3')
WHERE project_name = 'Project_3';  
UPDATE project SET number_of_employees = (select count(*) FROM employee_project WHERE project_name = 'Project_4')
WHERE project_name = 'Project_4'; 

DROP TABLE department_employee;