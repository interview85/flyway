# noinspection SqlResolveForFile

/*------------------------------EMPTY-----------------------------*/

delete from employee_project;

delete from employee;
ALTER TABLE employee AUTO_INCREMENT = 1;

delete from department;
ALTER TABLE department AUTO_INCREMENT = 1;

delete from project;
ALTER TABLE project AUTO_INCREMENT = 1;

delete from domain;
ALTER TABLE domain AUTO_INCREMENT = 1;

/*------------------------------INSERT-----------------------------*/

INSERT INTO department (name) VALUES ('Test department');

INSERT INTO domain (name) VALUES ('Test domain');

INSERT INTO project (name, dom_id) VALUES ('Test project#1', 1);
INSERT INTO project (name, dom_id) VALUES ('Test project#2', 1);
INSERT INTO project (name, dom_id) VALUES ('Test project#3', 1);
INSERT INTO project (name, dom_id) VALUES ('Test project#4', 1);

INSERT INTO employee (name, dep_id) VALUES ('Andrey P.', 1);
INSERT INTO employee (name, dep_id) VALUES ('Denis W.', 1);
INSERT INTO employee (name, dep_id) VALUES ('John D.', 1);

INSERT INTO employee_project (prj_id, emp_id) VALUES (1, 1);
INSERT INTO employee_project (prj_id, emp_id) VALUES (1, 2);

INSERT INTO employee_project (prj_id, emp_id) VALUES (2, 1);
INSERT INTO employee_project (prj_id, emp_id) VALUES (2, 3);

INSERT INTO employee_project (prj_id, emp_id) VALUES (3, 1);
INSERT INTO employee_project (prj_id, emp_id) VALUES (3, 2);
INSERT INTO employee_project (prj_id, emp_id) VALUES (3, 3);