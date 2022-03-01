DROP table IF EXISTS suministra;
DROP table IF EXISTS proveedores;
DROP table IF EXISTS piezas;

create table piezas(
	Id int auto_increment,
	Nombre nvarchar(100),
	PRIMARY KEY (id)
);

create TABLE proveedores(
	Id char(4),
	Nombre nvarchar(100),
	PRIMARY KEY (id)
);

create table suministra(
	Id int auto_increment,
	CodigoPieza int,
	IdProveedor char(4),
	Precio int,
	PRIMARY KEY (id),
    KEY CodigoPieza_idx (CodigoPieza),
    CONSTRAINT CodigoPieza_idx FOREIGN KEY (CodigoPieza) REFERENCES piezas (Id),
    KEY IdProveedor_idx (IdProveedor),
    CONSTRAINT IdProveedor_idx FOREIGN KEY (IdProveedor) REFERENCES proveedores (Id)
);

INSERT INTO `piezas_proveedores`.`piezas` (`Id`, `Nombre`) VALUES (1, "Procesador");
INSERT INTO `piezas_proveedores`.`proveedores` (`Id`, `Nombre`) VALUES ("abcd", "Intel");
INSERT INTO `piezas_proveedores`.`suministra` (`Id`, `CodigoPieza`, `IdProveedor`, `Precio`) VALUES (1, 1, "abcd", 350);