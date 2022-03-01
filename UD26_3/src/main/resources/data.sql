DROP table IF EXISTS venta;
DROP table IF EXISTS cajeros;
DROP table IF EXISTS productos;
DROP table IF EXISTS maquinas_registradoras;

create TABLE productos(
	id int auto_increment,
	nombre varchar(100),
	precio int,
	PRIMARY KEY (id)
);

create TABLE cajeros(
	id int auto_increment,
	NomApels varchar(100),
	PRIMARY KEY (id)
);

create TABLE maquinas_registradoras(
	id int auto_increment,
	piso int,
	PRIMARY KEY (id)
);

create TABLE venta(
	id int auto_increment,
	cajero int,
	maquina int,
	producto int,
	PRIMARY KEY (id),
	
	KEY productos_IDX(cajero),
	CONSTRAINT productos_IDX2 FOREIGN KEY (producto) REFERENCES productos (id),
	
	KEY cajero_IDX(cajero),
	CONSTRAINT cajero_IDX2 FOREIGN KEY (cajero) REFERENCES cajeros (id),
	
	KEY maquina_IDX(maquina),
	CONSTRAINT maquina_IDX2 FOREIGN KEY (maquina) REFERENCES maquinas_registradoras (id)
);

INSERT INTO productos (nombre, precio) values ('sofa',250);
INSERT INTO productos (nombre, precio) values ('butaca',120);
INSERT INTO productos (nombre, precio) values ('cochon',300);
INSERT INTO productos (nombre, precio) values ('mesa',70);

INSERT INTO cajeros (NomApels) values ('cajero1');
INSERT INTO cajeros (NomApels) values ('cajero2');
INSERT INTO cajeros (NomApels) values ('cajero3');
INSERT INTO cajeros (NomApels) values ('cajero4');

INSERT INTO maquinas_registradoras (piso) values (1);
INSERT INTO maquinas_registradoras (piso) values (3);
INSERT INTO maquinas_registradoras (piso) values (2);
INSERT INTO maquinas_registradoras (piso) values (1);

INSERT INTO venta (cajero, maquina, producto) values (1, 1, 1);
INSERT INTO venta (cajero, maquina, producto) values (2, 2, 2);
INSERT INTO venta (cajero, maquina, producto) values (3, 3, 3);
INSERT INTO venta (cajero, maquina, producto) values (4, 4, 4);