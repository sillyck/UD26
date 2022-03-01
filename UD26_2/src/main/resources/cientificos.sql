USE cientificos2;

CREATE TABLE IF NOT exists proyecto (
id int primary key auto_increment,
nombre nvarchar(255),
horas int
);

CREATE TABLE IF NOT EXISTS cientificos(
id int auto_increment,
dni varchar(9),
nom_apels nvarchar(255),
primary key (id)
);

CREATE TABLE IF NOT EXISTS asignado_a(
id int auto_increment,
cient_id int,
proyecto_id int,
primary key (id, cient_id, proyecto_id),
CONSTRAINT FK_cient FOREIGN KEY (cient_id) REFERENCES cientificos (id),
CONSTRAINT FK_pro FOREIGN KEY (proyecto_id) REFERENCES proyecto (id)
);

INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto1', 200);
INSERT INTO proyecto (nombre, horas) VALUES ('Proyecto2', 350);

INSERT INTO cientificos (dni, nom_apels) VALUES("33333333P", 'Eloy');
INSERT INTO cientificos (dni, nom_apels) VALUES("66666666P", 'Eloy');

INSERT INTO asignado_a (cient_id, proyecto_id) VALUES(1, 1);