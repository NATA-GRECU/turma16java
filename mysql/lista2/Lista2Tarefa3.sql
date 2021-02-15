create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
categoria varchar(255) not null,
marca varchar(255) not null,
tarja varchar(255) not null,
primary key(id)
);

insert into tb_categoria (categoria,marca,tarja) values ("Cosmetico","Vult","N/A");
insert into tb_categoria (categoria,marca,tarja) values ("Medicamento","Bayern","Vermelho");
insert into tb_categoria (categoria,marca,tarja) values ("Higiene","Pampers","N/A");
insert into tb_categoria (categoria,marca,tarja) values ("Higiene Bucal","Colgate","N/A");
insert into tb_categoria (categoria,marca,tarja) values ("Cremes","Nivea","N/A");

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
tamanho varchar(255) not null,
preco decimal(10,2) not null,
descricao varchar(255),
precisaDeReceita char,
id_categoria bigint not null,
primary key (id),
foreign key(id_categoria) references tb_categoria(id)
);

insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Pasta de dente","100g",3.99,"Um sorriso Lindo",'N',4);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Buscopan","8und.",10.99,"Para colicas abdominais",'N',2);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Escova-Dental","2und",9.99,"Um sorriso Lindo",'N',4);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Batom","1und",4.99,"",'N',1);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Creme para as mãos","150g",13.99,"",'N',5);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Fralda descartavel","10und.",43.99,"",'N',3);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Loratadina","10und",8.99,"",'N',2);
insert into tb_produto (nome,tamanho,preco,descricao,precisaDeReceita,id_categoria) values ("Fio dental","100g",7.99,"",'N',4);

update tb_produto set preco = 53.99 where id=6;
update tb_produto set preco = 1.99 where id=1;

select * from tb_produto where preco >= 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%B%";
select * from tb_categoria inner join tb_produto on tb_produto.id_categoria = tb_categoria.id;
select nome,marca,preco,tamanho, categoria from tb_categoria inner join tb_produto on tb_produto.id_categoria = tb_categoria.id where tb_produto.id_categoria = 4;





