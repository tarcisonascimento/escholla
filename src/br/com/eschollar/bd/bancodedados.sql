create database escholla;
use escholla;

create table usuarios(
iduso int primary key auto_increment not null,
uso_nome varchar(200) not null,
uso_endereco varchar(200),
uso_cidade varchar(100),
uso_celular varchar(50) not null,
uso_observacao varchar(400),
uso_datacontrato varchar(50) not null,
uso_usuario varchar(50) not null,
uso_senha varchar(50) not null,
uso_perfil varchar(50),
uso_cpf varchar(20)
);
insert into usuarios (uso_nome,uso_endereco,uso_cidade,uso_celular,uso_observacao,uso_cpf,uso_datacontrato,uso_usuario,uso_senha,uso_perfil)
values ("Tarciso Nascimento Bezerra","Rua Presidente Prudente de Morais","Ariquemes/RO","(69) 9.9209-9315","digite aqui as informaçoes adicionais","983.284.252-20","01/05/2010","admin","admin","Administrador");
