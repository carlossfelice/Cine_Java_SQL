Create database Cine;
use Cine;

CREATE TABLE Peliculas 
(
    idPelicula INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(50),
    anoLanzamiento VARCHAR(50),
    genero VARCHAR(50),
    duracion VARCHAR(50),
    sinopsis VARCHAR(50),
    calificacion VARCHAR(50)
);
create table  Usuario
(
idUsuario int auto_increment,
    nombre VARCHAR(50) not null ,
    apellido  VARCHAR(50) not null ,
    correoElectronico VARCHAR(50) not null ,
    contraseña VARCHAR(50) not null 
);

CREATE TABLE Boleto (
    idBoleto INT NOT NULL AUTO_INCREMENT,
    idUsuario INT NOT NULL,
    idPelicula INT NOT NULL,
    asiento VARCHAR(50) NOT NULL,
    sala INT NOT NULL,
    fechaCompra VARCHAR(50) NOT NULL,
    precio DOUBLE NOT NULL
);

