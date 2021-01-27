create database locadora;
use locadora;

create table tbl_filmes(
	id_filme int auto_increment primary key,
    nome_filme varchar(60) not null,
    categoria varchar(60) not null,
    id_filme_ator int,
    constraint foreign key FK_id_ator(id_filme_ator) references tbl_atores(id_ator)
);

create table tbl_atores(
	id_ator int primary key auto_increment,
    nome_ator varchar(60) not null,
    data_nascimento varchar(60) not null
);

insert into tbl_atores(nome_ator, data_nascimento) values("Megan Fox", "1995/04/01");
insert into tbl_filmes(nome_filme, categoria, id_filme_ator) values("Transformers", "Ação",  2);

select * from tbl_atores;
select * from tbl_filmes;

select nome_filme, nome_ator from tbl_filmes join tbl_atores where id_ator = 1 and id_filme_ator = 1 ;

update tbl_filmes set status_filme = '' where id_filme = 1;

alter table tbl_filmes change id_ator id_ator_filme int ;

create table tbl_dvd(
	id_dvd int auto_increment primary key,
    id_dvd_filme int,
	constraint foreign key FK_id_filme(id_dvd_filme) references tbl_filmes(id_filme),
    status_dvd varchar(15) default ''
);

create table tbl_usuarios(
	id_usuario int auto_increment primary key,
    nome varchar(60) not null,
    telefone varchar(15),
    celular varchar(15),
    rua varchar(40) not null,
    numero varchar(10) not null,
    bairro varchar(40) not null,
    cep varchar(10) not null
);

alter table tbl_usuarios add column senha varchar(20) not null ;

create table tbl_emprestimo(
	id_emprestimo int auto_increment primary key,
    data_emprestimo datetime default now(),
    data_devolução datetime default (now() + interval 5 day),
    id_emp_dvd int,
    constraint foreign key FK_id_dvd(id_emp_dvd) references tbl_dvd(id_dvd),
    id_emp_usuario int,
    constraint foreign key FK_id_usuario(id_emp_usuario) references tbl_usuarios(id_usuario)
);
Select day(now() + interval 3 day) Dia , month(now()) Mês ;

insert into tbl_dvd(id_dvd_filme) values(3);

insert into tbl_usuarios(nome, telefone, celular, rua, numero, bairro, cep) values("Rikelme", "47849873", "975843535", "Rua Araguaia", "49", "Sei la", "06826450");

insert into tbl_emprestimo(id_emp_dvd, id_emp_usuario) values(1, 1);

select * from tbl_dvd;
select id_dvd codigo , nome_filme Filme from tbl_dvd join tbl_filmes where id_filme = id_dvd_filme ;
select * from tbl_usuarios;
select * from tbl_emprestimo;





