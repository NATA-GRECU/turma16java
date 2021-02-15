create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
origemAnimal varchar(30) not null,
qualidadeDaCarne varchar(30) not null,
finalidade varchar(30) not null,
primary key(id)
);

insert into tb_categoria (origemAnimal,qualidadeDaCarne,finalidade) values ("Boi","Primeira","Churrasco");
insert into tb_categoria (origemAnimal,qualidadeDaCarne,finalidade) values ("Porco","Primeira","Casual");
insert into tb_categoria (origemAnimal,qualidadeDaCarne,finalidade) values ("Frango","Primeira","Casual");
insert into tb_categoria (origemAnimal,qualidadeDaCarne,finalidade) values ("Vaca","Primeira","Churrasco");
insert into tb_categoria (origemAnimal,qualidadeDaCarne,finalidade) values ("Vaca","Primeira","Casual");

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal(10,2) not null,
tipo varchar(255) not null,
qtde decimal(10,2) not null,
id_categoria bigint not null,
primary key (id),
foreign key(id_categoria) references tb_categoria(id)
);

insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Alcatra",29.00,"Filé",1.50,5);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Picanha",55.00,"Filé",1.00,1);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Coxa",23.00,"Und",1.00,3);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Acem",25.00,"Moída",1.00,5);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Bacon",20.00,"Und",1.00,2);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Asa-de-Frango",25.00,"Und",1.00,3);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Barriga",27.00,"Peça",1.00,2);
insert into tb_produto (nome,preco,tipo,qtde,id_categoria) values ("Fraldinha",39.00,"Filé",1.00,4);

select * from tb_produto where preco >= 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%C%";
select * from tb_categoria inner join tb_produto on tb_produto.id_categoria = tb_categoria.id;
select tb_produto.nome,tb_produto.preco,tb_produto.tipo,tb_categoria.origemAnimal,tb_categoria.qualidadeDaCarne from tb_categoria inner join tb_produto on tb_produto.id_categoria = tb_categoria.id where tb_categoria.id = 5;




