create database db_alunos;

use db_alunos;

create table tb_alunos(
id_matricula bigint auto_increment,
nome varchar(255) not null,
idade int not null,
turno varchar(30) not null,
nota decimal(10,2) not null,
primary key (id_matricula)
);

insert into tb_alunos (nome, idade, turno, nota) values ("André",15,"Manhã",7.5);
insert into tb_alunos (nome, idade, turno, nota) values ("Gabriel",16,"Manhã",9.0);
insert into tb_alunos (nome, idade, turno, nota) values ("Michelly",17,"Noite",6.5);
insert into tb_alunos (nome, idade, turno, nota) values ("Thomas",17,"Noite",4.0);
insert into tb_alunos (nome, idade, turno, nota) values ("Jessica",16,"Manhã",8.5);
insert into tb_alunos (nome, idade, turno, nota) values ("Maria",17,"Noite",9.0);
insert into tb_alunos (nome, idade, turno, nota) values ("Jefferson",17,"Manhã",5.5);
insert into tb_alunos (nome, idade, turno, nota) values ("Thalita",17,"Noite",10.0);

select nome, idade, turno, nota from tb_alunos where nota > 7;
select nome, idade, turno, nota from tb_alunos where nota < 7;

update tb_alunos set nota = 6.00 where id_matricula = 4;

select * from tb_alunos;