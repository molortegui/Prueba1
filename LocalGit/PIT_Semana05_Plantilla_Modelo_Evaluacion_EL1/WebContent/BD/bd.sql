create database pit_modelo_el1;
use pit_modelo_el1;
create table tb_marca
(
 cod_marca int primary key,
 nom_marca varchar(30)
);
insert into tb_marca values(1,'HP');
insert into tb_marca values(2,'SAMSUNG');
insert into tb_marca values(3,'DELL');
insert into tb_marca values(4,'IBM');
create table tb_producto
(
 cod_pro int auto_increment primary key,
 des_pro varchar(30),
 stock_pro int,
 pre_pro double,
 fec_fab date,
 cod_marca int references tb_marca
);