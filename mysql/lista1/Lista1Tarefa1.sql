use db_servico_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
cargo varchar(100),
setor varchar(100),
ativo boolean,
primary key(id)
);

insert into tb_funcionarios (nome,idade,salario,cargo,setor) values ("Raphael",25,3000,"junior","t.i");
insert into tb_funcionarios (nome,idade,salario,cargo,setor) values ("Rafão",29,3800,"pleno","t.i");
insert into tb_funcionarios (nome,idade,salario,cargo,setor) values ("Natã",19,3500,"junior","t.i");
insert into tb_funcionarios (nome,idade,salario,cargo,setor) values ("Maria",25,3600,"junior","t.i");
insert into tb_funcionarios (nome,idade,salario,cargo,setor) values ("Paola",22,3300,"junior","t.i");

update tb_funcionarios set salario = 1900 where id = 1;

select * from tb_funcionarios;

select nome,idade,salario,cargo,setor from tb_funcionarios where salario > 2000;
select nome,idade,salario,cargo,setor from tb_funcionarios where salario < 2000;
update tb_funcionarios set salario = 1500 where id = 3;

