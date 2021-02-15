create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
nome varchar (255) not null,
ataque bigint,
defesa bigint,
primary key(id)
);

insert into tb_classe (nome,ataque,defesa) values ("Suporte",15,20);
insert into tb_classe (nome,ataque,defesa) values ("Rush",25,10);
insert into tb_classe (nome,ataque,defesa) values ("Tank",10,25);

create table tb_personagem(
id bigint auto_increment,
nome varchar(255) not null,
nomeSuper varchar(255) not null,
alcanceAtaque decimal(10,2) not null,
defesa int,
velocidade decimal(10,2),
classificacao_id bigint not null,
primary key(id),
foreign key(classificacao_id) references tb_classe (id)
);

insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Link","Feixe de luz",1300,1500,10.00,1);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Ash","Chuva de flechas",1600,700,15.00,2);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Caveira","Silenciosa",1550,950,25.00,1);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Castle","Armadura",1000,1500,10.00,3);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Montanha","Escudo",960,1800,10.00,3);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Bjorn","Super Força",2000,1500,10.00,2);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Ragnar","GOD",10000,5000,10.00,1);
insert into tb_personagem (nome,nomeSuper,alcanceAtaque,defesa,velocidade,classificacao_id) values ("Lexus","Espada magica",1800,1000,10.00,1);

select * from tb_personagem;
select * from tb_personagem where alcanceAtaque >= 2000;
select * from tb_personagem where defesa between 1000 and 2000;
select * from tb_personagem where nome like "%C%";
select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classificacao_id;
select tb_personagem.nome,tb_classe. nome from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classificacao_id like "%1%" ;

