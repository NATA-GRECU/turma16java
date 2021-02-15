create database db_ecommerce;
use db_ecommerce;
create table tb_produtos
(
id bigint auto_increment,
nome varchar(250),
preco decimal(10,2),
marca varchar(30),
cor varchar(30),
primary key(id)
);

insert into tb_produtos (nome,preco,marca,cor) values ("Tenis",899.99,"Air Jordan","Preto/Branco/Vermelho");
insert into tb_produtos (nome,preco,marca,cor) values ("Tenis",219.00,"Nike","Preto");
insert into tb_produtos (nome,preco,marca,cor) values ("Camisa",180.00,"High","Branca");
insert into tb_produtos (nome,preco,marca,cor) values ("Chinelo",60.00,"Havaianas","Branco");
insert into tb_produtos (nome,preco,marca,cor) values ("Meia",12.99,"Lupo","Preto");
insert into tb_produtos (nome,preco,marca,cor) values ("Blusa",230.00,"Adidas","Cinza");
insert into tb_produtos (nome,preco,marca,cor) values ("Tenis",1099.00,"Mizuno","Preto/Cinza");
insert into tb_produtos (nome,preco,marca,cor) values ("Camisa Polo",2060.00,"Versacce","Branca/Dourada");

select * from tb_produtos;
select nome,preco,marca,cor from tb_produtos where preco > 500;
select nome,preco,marca,cor from tb_produtos where preco < 500;

update tb_produtos set cor = "Branco" where id = 6 ;