DROP table IF EXISTS articulos;
DROP table IF EXISTS fabricantes;

create table fabricantes(
    codigo int auto_increment,
    nombre varchar(250),
    PRIMARY KEY (codigo)
);

create table articulos(
    codigo int auto_increment,
    nombre varchar(250),
    precio int,
    codigo_Fabricante int,
    PRIMARY KEY (codigo),
    FOREIGN KEY (codigo_Fabricante) REFERENCES fabricantes(codigo)
);

insert into fabricantes (nombre)values('fabricante1');
insert into fabricantes (nombre)values('fabricante2');
insert into fabricantes (nombre)values('fabricante3');

insert into articulos (nombre, precio, codigo_Fabricante)values('articulo1', 100, 1);
insert into articulos (nombre, precio, codigo_Fabricante)values('articulo2', 75, 1);
insert into articulos (nombre, precio, codigo_Fabricante)values('articulo3', 50, 2);
