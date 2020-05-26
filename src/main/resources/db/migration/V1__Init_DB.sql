create table department
(
    dep_id bigint not null auto_increment,
    name   varchar(50),
    primary key (dep_id)
) engine = InnoDB;
create table employee
(
    emp_id bigint not null auto_increment,
    name   varchar(50),
    dep_id bigint,
    primary key (emp_id)
) engine = InnoDB;
create table employee_project
(
    prj_id bigint not null,
    emp_id bigint not null,
    primary key (emp_id, prj_id)
) engine = InnoDB;
create table project
(
    prj_id bigint not null auto_increment,
    name   varchar(50),
    primary key (prj_id)
) engine = InnoDB;

alter table employee
    add constraint FKe18129hcd0klevt866ww22wnd foreign key (dep_id) references department (dep_id);
alter table employee_project
    add constraint FK2edylp1b54fdmioq3lkv7ieud foreign key (emp_id) references employee (emp_id);
alter table employee_project
    add constraint FKtol4nnl050jmljy2ay61y9tg5 foreign key (prj_id) references project (prj_id);
