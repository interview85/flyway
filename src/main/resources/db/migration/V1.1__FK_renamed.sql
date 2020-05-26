# noinspection SqlResolveForFile

ALTER TABLE employee
    DROP FOREIGN KEY FKe18129hcd0klevt866ww22wnd;
alter table employee
    add constraint employee_department_fk foreign key (dep_id) references department (dep_id);

ALTER TABLE employee_project
    DROP FOREIGN KEY FK2edylp1b54fdmioq3lkv7ieud;
alter table employee_project
    add constraint employee_employee_project_fk foreign key (emp_id) references employee (emp_id);

ALTER TABLE employee_project
    DROP FOREIGN KEY FKtol4nnl050jmljy2ay61y9tg5;
alter table employee_project
    add constraint project_employee_project_fk foreign key (prj_id) references project (prj_id);
