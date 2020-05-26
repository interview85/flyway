# noinspection SqlResolveForFile

create table domain
(
    dom_id bigint not null auto_increment,
    name   varchar(50),
    primary key (dom_id)
) engine = InnoDB;

ALTER TABLE project
    ADD dom_id bigint NOT NULL AFTER name;

alter table project
    add constraint project_domain_fk foreign key (dom_id) references domain (dom_id);

