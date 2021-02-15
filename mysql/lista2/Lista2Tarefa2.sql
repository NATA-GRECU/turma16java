create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
produto varchar(255) not null,
promocao boolean not null,
sabor varchar(255) not null,
primary key(id)
);

insert into tb_categoria (produto,promocao,sabor) values ("Pizza",true,"Salgada");
insert into tb_categoria (produto,promocao,sabor) values ("Pizza",false,"Doce");
insert into tb_categoria (produto,promocao,sabor) values ("Refrigerante",true,"Coca");
insert into tb_categoria (produto,promocao,sabor) values ("Suco",false,"Laranja");
insert into tb_categoria (produto,promocao,sabor) values ("Bebidas",true,"Cerveja");

create table tb_pizza(
id bigint auto_increment,
preco decimal(10,2) not null,
nome varchar(255) not null,
ingredientes varchar(255) not null,
borda varchar(255) not null,
tamanho varchar(255) not null,
id_categoria bigint not null,
primary key(id),
foreign key(id_categoria) references tb_categoria (id)
);

insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (30.99,"Portuguesa","Palmito, presunto, bacon e etc.","Catupery","Grande",1);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (30.99,"Calabresa","Calabresa e cebola","Catupery","Grande",1);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (30.99,"Romeu e Julieta","Chocolate e morango","Chocolate","Grande",2);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (30.99,"M&M","Chocolate e M&Ms","Chocolate","Grande",2);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (6.50,"Coca-cola","Refrigerante","","2L",3);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (5.00,"Guarana Antartica","Refrigerante","","2L",3);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (2.99,"Suco","Laranja e açucar","","700Ml",4);
insert into tb_pizza (preco,nome,ingredientes,borda,tamanho,id_categoria) values (1.34,"Cerveja Skol","Cevada","","250Ml",5);

update tb_pizza set preco = 47.00 where id = 1;
update tb_pizza set preco = 45.00 where id = 4;

select * from tb_pizza where preco >= 45;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where nome like "%C%";
select * from tb_categoria inner join tb_pizza on tb_pizza.id_categoria = tb_categoria.id;
select tb_pizza.nome,tb_pizza.preco,tb_pizza.borda,tb_pizza.tamanho,tb_categoria.produto from tb_categoria inner join tb_pizza on tb_pizza.id_categoria = tb_categoria.id where tb_categoria.id =3










