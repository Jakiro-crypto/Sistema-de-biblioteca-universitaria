-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.32-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando estructura para tabla bibli_02.bibliotecario
CREATE TABLE IF NOT EXISTS `bibliotecario` (
  `ID_Bibliotecario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Telefono` int(11) NOT NULL,
  PRIMARY KEY (`ID_Bibliotecario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.bibliotecario: ~3 rows (aproximadamente)
INSERT INTO `bibliotecario` (`ID_Bibliotecario`, `Nombres`, `Apellidos`, `Telefono`) VALUES
	(1, 'Carlos Enrique', 'Ramírez Quispe', 987654321),
	(2, 'María Luz', 'Flores García', 912345678),
	(3, 'Ana Lucía', 'Mendoza Salazar', 965432187);

-- Volcando estructura para tabla bibli_02.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `ID_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `Nom_categoria` varchar(50) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.categoria: ~10 rows (aproximadamente)
INSERT INTO `categoria` (`ID_categoria`, `Nom_categoria`, `Descripcion`) VALUES
	(11, 'Matemáticas', 'Libros sobre álgebra, cálculo, estadística, y teoría de números'),
	(12, 'Ingeniería', 'Obras relacionadas con diversas ramas de la ingeniería'),
	(13, 'Ciencias Sociales', 'Libros sobre sociología, antropología, y estudios culturales'),
	(14, 'Ciencias de la Salud', 'Textos sobre medicina, enfermería, y biología médica'),
	(15, 'Derecho', 'Obras legales, jurisprudencia, y códigos normativos'),
	(16, 'Economía', 'Libros sobre teoría económica, finanzas, y comercio'),
	(17, 'Ciencias Computacionales', 'Libros sobre programación, bases de datos, y desarrollo de software'),
	(18, 'Psicología', 'Libros sobre teorías psicológicas, terapias, y estudios del comportamiento'),
	(19, 'Filosofía', 'Obras sobre filosofía clásica, contemporánea, y ética'),
	(20, 'Arquitectura', 'Textos sobre diseño arquitectónico, urbanismo, y construcción');

-- Volcando estructura para tabla bibli_02.devolucion
CREATE TABLE IF NOT EXISTS `devolucion` (
  `ID_Devolucion` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Prestamo` int(11) NOT NULL,
  `Fecha_entregado` date NOT NULL,
  `Estado_libro` varchar(50) NOT NULL,
  `Observaciones` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_Devolucion`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.devolucion: ~11 rows (aproximadamente)
INSERT INTO `devolucion` (`ID_Devolucion`, `ID_Prestamo`, `Fecha_entregado`, `Estado_libro`, `Observaciones`) VALUES
	(1, 1, '2024-11-06', 'Bueno', 'Devuelto a tiempo'),
	(2, 2, '2024-09-29', 'Dañado', 'Páginas rasgadas'),
	(3, 4, '2024-11-11', 'Perdido', 'No ha sido encontrado'),
	(4, 8, '2024-11-01', 'Perdido', 'Informar a biblioteca central'),
	(5, 12, '2024-12-04', 'Perdido', 'Revisar sección de libros perdidos'),
	(6, 15, '2024-10-20', 'Perdido', 'Consultar con otros usuarios'),
	(7, 17, '2024-11-12', 'Dañado', 'Rotura en la portada'),
	(8, 20, '2024-10-20', 'Dañado', 'Hojas sueltas'),
	(9, 23, '2024-12-06', 'Dañado', 'Páginas arrugadas'),
	(10, 26, '2024-11-16', 'Bueno', 'Devuelto a tiempo'),
	(12, 3, '2024-12-22', 'Bueno', 'xzczx');

-- Volcando estructura para tabla bibli_02.editorial
CREATE TABLE IF NOT EXISTS `editorial` (
  `ID_Editorial` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Contacto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID_Editorial`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.editorial: ~15 rows (aproximadamente)
INSERT INTO `editorial` (`ID_Editorial`, `Nombre`, `Direccion`, `Contacto`) VALUES
	(1, 'Editorial Amazónica', 'Av. La Merced 120, Iquitos, Loreto', 'contacto@amazonicape.edu.pe'),
	(2, 'Editorial Andina', 'Jr. Arequipa 526, Ayacucho', 'info@editorialandina.pe'),
	(3, 'Editorial Cienciana', 'Calle Mariscal Cáceres 345, Cusco', 'info@editorialcienciana.pe'),
	(4, 'Editorial Científica Peruana', 'Av. La Marina 2100, San Miguel, Lima', 'info@cientificaperuana.pe'),
	(5, 'Editorial Continental', 'Jr. Huancavelica 360, Huancayo, Junín', 'info@editorialcontinental.pe'),
	(6, 'Editorial Pacífico', 'Calle Schell 451, Miraflores, Lima', 'editorial@pacifico.edu.pe'),
	(7, 'Editorial San Ignacio', 'Av. La Fontana 550, La Molina, Lima', 'contacto@editorialsanignacio.pe'),
	(8, 'Editorial UCV', 'Av. Larco 1770, Trujillo, La Libertad', 'editorial@ucv.edu.pe'),
	(9, 'Editorial UDEP', 'Av. Ramón Mugica s/n, Piura', 'contacto@udep.edu.pe'),
	(10, 'Editorial UNALM', 'Av. La Molina s/n, La Molina, Lima', 'editorial@unalmedu.pe'),
	(11, 'Editorial UPC', 'Av. Primavera 2398, Santiago de Surco, Lima', 'info@editorialupc.pe'),
	(12, 'Fondo Editorial PUCP', 'Av. Universitaria 1801, San Miguel, Lima', 'contacto@fondoeditorialpucp.edu.pe'),
	(13, 'Fondo Editorial Universidad de Lima', 'Jr. Manuel del Pino 234, Lince, Lima', 'editorial@ulima.edu.pe'),
	(14, 'Fondo Editorial UPAO', 'Av. América Sur 710, Trujillo, La Libertad', 'editorial@upao.edu.pe'),
	(15, 'Universidad Nacional Mayor de San Marcos', 'Av. Venezuela s/n, Cercado de Lima, Lima', 'editorial@unmsm.edu.pe');

-- Volcando estructura para procedimiento bibli_02.EliminarDevolucion
DELIMITER //
CREATE PROCEDURE `EliminarDevolucion`(
    IN p_ID_Devolucion INT,
    IN p_ID_Prestamo INT
)
BEGIN
    DECLARE v_Num_de_ejemplares INT;
    DECLARE v_Cod_libro INT;

    -- Obtener el número de ejemplares actuales y el código del libro relacionado al préstamo
    SELECT l.Num_de_ejemplares, l.Cod_libro
    INTO v_Num_de_ejemplares, v_Cod_libro
    FROM libro l
    JOIN prestamo p ON l.Cod_libro = p.Cod_libro
    WHERE p.ID_Prestamo = p_ID_Prestamo;

    -- Eliminar la devolución
    DELETE FROM devolucion WHERE ID_Devolucion = p_ID_Devolucion;

    -- Actualizar el número de ejemplares (reducir en 1)
    UPDATE libro
    SET Num_de_ejemplares = v_Num_de_ejemplares - 1
    WHERE Cod_libro = v_Cod_libro;
END//
DELIMITER ;

-- Volcando estructura para procedimiento bibli_02.EliminarPrestamo
DELIMITER //
CREATE PROCEDURE `EliminarPrestamo`(
    IN IDPrestamo INT,
    IN cod_libro VARCHAR(20)
)
BEGIN

    -- Verificar si el préstamo existe
    IF EXISTS (SELECT 1 FROM prestamo WHERE ID_Prestamo = IDPrestamo) THEN
        -- Eliminar el préstamo
        DELETE FROM prestamo WHERE ID_Prestamo = IDPrestamo;

        -- Actualizar el número de ejemplares del libro
        UPDATE libro
        SET Num_de_ejemplares = Num_de_ejemplares + 1
        WHERE Cod_libro = cod_libro;

    ELSE
        -- Manejo de error si el préstamo no existe
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'El préstamo con el ID especificado no existe.';
    END IF;
END//
DELIMITER ;

-- Volcando estructura para tabla bibli_02.estudiante
CREATE TABLE IF NOT EXISTS `estudiante` (
  `DNI` varchar(8) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Carrera` varchar(50) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Estado` varchar(10) NOT NULL COMMENT 'ESTADO PARA SABER SI ES APTO DE PRESTAMO',
  `Fecha_registro` date NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.estudiante: ~27 rows (aproximadamente)
INSERT INTO `estudiante` (`DNI`, `Nombres`, `Apellidos`, `Carrera`, `Telefono`, `Direccion`, `Correo`, `Estado`, `Fecha_registro`) VALUES
	('01234567', 'patricia sofía', 'morales núñez', 'Gestión Pública y Desarrollo Social', 987654330, 'Calle de la Paz 159', 'patricia.morales@example.com', 'Activo', '2023-04-15'),
	('01234578', 'alberto rubén', 'figueroa castro', 'Gestión Pública y Desarrollo Social', 987654339, 'Calle del Progreso 159', 'alberto.figueroa@example.com', 'Activo', '2023-05-20'),
	('12345678', 'juan carlos', 'pérez gómez', 'Ingeniería de Sistemas e Informática', 987654321, 'Av. Los Incas 123', 'juan.perez@example.com', 'Activo', '2023-06-10'),
	('12345689', 'silvia leticia', 'cáceres alvarado', 'Ingeniería de Sistemas e Informática', 987654340, 'Av. Los Chancas 852', 'silvia.caceres@example.com', 'Activo', '2023-07-05'),
	('23456780', 'ricardo andrés', 'cruz mendoza', 'Ingeniería de Sistemas e Informática', 987654331, 'Av. Central 852', 'ricardo.cruz@example.com', 'Activo', '2023-08-25'),
	('23456789', 'ana maría', 'garcía lópez', 'Gestión Pública y Desarrollo Social', 987654322, 'Calle del Sol 456', 'ana.garcia@example.com', 'Activo', '2023-09-30'),
	('23456791', 'javier enrique', 'paz lizarzaburu', 'Ingeniería de Minas', 987654341, 'Calle de la Victoria 753', 'javier.paz@example.com', 'Activo', '2023-10-10'),
	('34567801', 'elena valeria', 'salas gonzales', 'Ingeniería de Minas', 987654332, 'Calle Libertad 753', 'elena.salas@example.com', 'Activo', '2023-11-15'),
	('34567802', 'marisol andrea', 'mena silva', 'Ingeniería Ambiental', 987654342, 'Calle Nueva 159', 'marisol.mena@example.com', 'Activo', '2024-01-22'),
	('34567890', 'luis fernando', 'martínez ruiz', 'Ingeniería de Minas', 987654323, 'Av. de la República 789', 'luis.martinez@example.com', 'Activo', '2024-02-10'),
	('45678901', 'maría elena', 'hernández díaz', 'Ingeniería Ambiental', 987654324, 'Calle San Martín 321', 'maria.hernandez@example.com', 'Activo', '2024-03-12'),
	('45678912', 'fernando miguel', 'soto palacios', 'Ingeniería Ambiental', 987654333, 'Calle Independencia 159', 'fernando.soto@example.com', 'Activo', '2024-04-18'),
	('45678913', 'arturo luis', 'sanchez león', 'Ingeniería Agroindustrial', 987654343, 'Calle de la Libertad 654', 'arturo.sanchez@example.com', 'Activo', '2024-05-06'),
	('56789012', 'josé antonio', 'lópez sánchez', 'Ingeniería Agroindustrial', 987654325, 'Av. Universitaria 654', 'jose.lopez@example.com', 'Activo', '2024-06-25'),
	('56789023', 'gabriela teresa', 'quispe castro', 'Ingeniería Agroindustrial', 987654334, 'Av. Santa Rosa 654', 'gabriela.quispe@example.com', 'Activo', '2024-07-13'),
	('56789024', 'luz margarita', 'villanueva silva', 'Ingeniería Pesquera', 987654344, 'Av. de los Ángeles 321', 'luz.villanueva@example.com', 'Activo', '2024-08-08'),
	('67890123', 'laura isabel', 'gonzález ruiz', 'Ingeniería Pesquera', 987654326, 'Calle de la Luz 987', 'laura.gonzalez@example.com', 'Activo', '2024-09-01'),
	('67890134', 'andrés felipe', 'aldana vázquez', 'Ingeniería Pesquera', 987654335, 'Calle de la Esperanza 321', 'andres.aldana@example.com', 'Activo', '2024-10-15'),
	('67890135', 'jorge luis', 'rosales quiroz', 'Ingeniería Civil', 987654345, 'Calle del Triunfo 987', 'jorge.rosales@example.com', 'Activo', '2024-09-30'),
	('78901234', 'carlos alberto', 'ramírez herrera', 'Ingeniería Civil', 987654327, 'Av. del Ejército 159', 'carlos.ramirez@example.com', 'Activo', '2023-10-25'),
	('78901245', 'verónica judith', 'alvarado rojas', 'Ingeniería Civil', 987654336, 'Av. Los Olivos 987', 'veronica.alvarado@example.com', 'Activo', '2024-02-14'),
	('78901246', 'claudia patricia', 'ponce medina', 'Administración', 987654346, 'Av. Santa Ana 852', 'claudia.ponce@example.com', 'Activo', '2024-03-19'),
	('89012345', 'isabel cristina', 'mendoza salas', 'Administración', 987654328, 'Calle de los Ríos 852', 'isabel.mendoza@example.com', 'Activo', '2023-12-10'),
	('89012356', 'nicolás javier', 'cañahuacho vargas', 'Administración', 987654337, 'Calle de la Amistad 852', 'nicolas.canahuacho@example.com', 'Activo', '2024-04-05'),
	('89012357', 'césar augusto', 'tello cornejo', 'Medicina', 987654347, 'Calle de la Vida 753', 'cesar.tello@example.com', 'Activo', '2023-11-18'),
	('90123456', 'diego armando', 'fernández cruz', 'Medicina', 987654329, 'Av. Las Flores 753', 'diego.fernandez@example.com', 'Activo', '2024-09-20'),
	('90123467', 'sandra luz', 'bravo estrella', 'Medicina', 987654338, 'Av. Las Violetas 753', 'sandra.bravo@example.com', 'Activo', '2024-07-01');

-- Volcando estructura para procedimiento bibli_02.InsertarDevolucion
DELIMITER //
CREATE PROCEDURE `InsertarDevolucion`(
    IN p_ID_Prestamo INT,
    IN p_Fecha_entregado DATE,
    IN p_Estado_libro VARCHAR(50),
    IN p_Observaciones TEXT
)
BEGIN
    DECLARE v_Num_de_ejemplares INT;
    DECLARE v_Cod_libro INT;

    -- Insertar la devolución
    INSERT INTO devolucion (ID_Prestamo, Fecha_entregado, Estado_libro, Observaciones)
    VALUES (p_ID_Prestamo, p_Fecha_entregado, p_Estado_libro, p_Observaciones);

    -- Obtener el número de ejemplares actuales y el código del libro relacionado al préstamo
    SELECT l.Num_de_ejemplares, l.Cod_libro
    INTO v_Num_de_ejemplares, v_Cod_libro
    FROM libro l
    JOIN prestamo p ON l.Cod_libro = p.Cod_libro
    WHERE p.ID_Prestamo = p_ID_Prestamo;

    -- Actualizar el número de ejemplares
    UPDATE libro
    SET Num_de_ejemplares = v_Num_de_ejemplares + 1
    WHERE Cod_libro = v_Cod_libro;
    
END//
DELIMITER ;

-- Volcando estructura para procedimiento bibli_02.InsertarPrestamo
DELIMITER //
CREATE PROCEDURE `InsertarPrestamo`(
	IN `cod_libro` VARCHAR(20),
	IN `DNIN` VARCHAR(20),
	IN `ID_Bibliotecario` INT,
	IN `hora_prestamo` TIME,
	IN `fecha_prestamo` DATE,
	IN `fecha_limite` DATE
)
BEGIN
    -- Insertar el préstamo en la tabla prestamo
   INSERT INTO prestamo (Cod_libro, DNI, ID_Bibliotecario, Hora_Prestamo, Fecha_prestamo, Fecha_limite)
   VALUES (cod_libro, DNIN, ID_Bibliotecario, hora_prestamo, fecha_prestamo, fecha_limite);

    -- Actualizar el número de ejemplares del libro
    UPDATE libro
    SET Num_de_ejemplares = Num_de_ejemplares - 1
    WHERE Cod_libro = cod_libro;

    -- Verificar si el número de ejemplares es negativo y revertir en caso de error
    IF (SELECT Num_de_ejemplares FROM libro WHERE Cod_libro = cod_libro) < 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'No hay suficientes ejemplares disponibles.';
    END IF;
END//
DELIMITER ;

-- Volcando estructura para tabla bibli_02.libro
CREATE TABLE IF NOT EXISTS `libro` (
  `Cod_libro` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(100) NOT NULL,
  `Autor` varchar(50) NOT NULL,
  `ID_Categoria` int(11) NOT NULL,
  `Num_de_ejemplares` int(11) NOT NULL,
  `Estado` varchar(20) NOT NULL,
  `ID_editorial` int(11) NOT NULL,
  `Fecha_publicacion` date NOT NULL,
  PRIMARY KEY (`Cod_libro`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.libro: ~30 rows (aproximadamente)
INSERT INTO `libro` (`Cod_libro`, `Titulo`, `Autor`, `ID_Categoria`, `Num_de_ejemplares`, `Estado`, `ID_editorial`, `Fecha_publicacion`) VALUES
	(1, 'Cálculo Diferencial e Integral', 'George Thomas', 1, 9, 'Disponible', 3, '2005-09-15'),
	(2, 'Introducción a la Ingeniería', 'John Smith', 2, 4, 'Disponible', 2, '2010-06-20'),
	(3, 'Teoría Sociológica Moderna', 'Anthony Giddens', 3, 7, 'Disponible', 5, '1998-03-12'),
	(4, 'Fundamentos de Biología', 'Neil Campbell', 4, 11, 'Disponible', 6, '2000-07-18'),
	(5, 'Derecho Constitucional Peruano', 'Luis Huerta Guerrero', 5, 4, 'Disponible', 4, '2015-02-25'),
	(6, 'Macroeconomía', 'Gregory Mankiw', 6, 8, 'Disponible', 1, '2007-11-30'),
	(7, 'Algoritmos en C', 'Robert Sedgewick', 7, 6, 'Disponible', 9, '2012-08-10'),
	(8, 'Introducción a la Psicología', 'Richard Atkinson', 8, 3, 'Disponible', 10, '2009-01-14'),
	(9, 'Filosofía Antigua', 'Frederick Copleston', 9, 2, 'Disponible', 12, '1990-10-23'),
	(10, 'Diseño Arquitectónico Contemporáneo', 'Peter Cook', 10, 5, 'Disponible', 11, '2018-04-11'),
	(11, 'Ecuaciones Diferenciales', 'Dennis Zill', 1, 6, 'Disponible', 3, '2003-05-19'),
	(12, 'Mecánica de Materiales', 'Russell Hibbeler', 2, 5, 'Disponible', 7, '2008-09-07'),
	(13, 'Historia del Perú Republicano', 'Carlos Contreras', 3, 9, 'Disponible', 14, '2014-03-28'),
	(14, 'Anatomía Humana', 'Henry Gray', 4, 7, 'Disponible', 8, '1995-12-15'),
	(15, 'Derecho Penal', 'Carlos Caro Coria', 5, 3, 'Disponible', 15, '2016-06-05'),
	(16, 'Microeconomía Aplicada', 'David Besanko', 6, 2, 'Disponible', 5, '2013-02-14'),
	(17, 'Inteligencia Artificial', 'Stuart Russell', 7, 11, 'Disponible', 1, '2020-07-23'),
	(18, 'Psicología Social', 'David Myers', 8, 4, 'Disponible', 6, '2011-09-01'),
	(19, 'Historia de la Filosofía', 'Bertrand Russell', 9, 5, 'Disponible', 12, '1999-11-27'),
	(20, 'Construcción Sostenible', 'Ian Bentley', 10, 6, 'Disponible', 14, '2021-05-30'),
	(21, 'Álgebra Lineal y sus Aplicaciones', 'David Lay', 1, 8, 'Disponible', 9, '2006-10-16'),
	(22, 'Termodinámica en Ingeniería', 'Yunus Çengel', 2, 3, 'Disponible', 3, '2017-03-19'),
	(23, 'Antropología Cultural', 'Marvin Harris', 3, 6, 'Disponible', 8, '1993-04-09'),
	(24, 'Biología Molecular de la Célula', 'Bruce Alberts', 4, 10, 'Disponible', 7, '2001-02-25'),
	(25, 'Derecho Procesal Civil', 'Jorge Rodríguez', 5, 4, 'Disponible', 4, '2019-08-13'),
	(26, 'Econometría Básica', 'Damodar Gujarati', 6, 3, 'Disponible', 10, '2004-12-20'),
	(27, 'Ciencias de la Computación', 'Andrew Tanenbaum', 7, 5, 'Disponible', 13, '1997-06-30'),
	(28, 'Psicología Evolutiva', 'David Myers', 8, 7, 'Disponible', 11, '2002-07-18'),
	(29, 'Filosofía Contemporánea', 'Jürgen Habermas', 9, 6, 'Disponible', 12, '1996-09-22'),
	(30, 'Diseño Estructural', 'Mario Salvadori', 10, 5, 'Disponible', 15, '2018-11-15');

-- Volcando estructura para tabla bibli_02.multa
CREATE TABLE IF NOT EXISTS `multa` (
  `ID_Multa` int(11) NOT NULL AUTO_INCREMENT,
  `DNI` varchar(8) NOT NULL,
  `Motivo` varchar(100) NOT NULL,
  `Monto` double NOT NULL,
  `Estado` varchar(50) NOT NULL,
  PRIMARY KEY (`ID_Multa`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.multa: ~15 rows (aproximadamente)
INSERT INTO `multa` (`ID_Multa`, `DNI`, `Motivo`, `Monto`, `Estado`) VALUES
	(1, '01234567', 'Devolución tardía', 5, 'Pendiente'),
	(2, '12345678', 'Devolución tardía', 3, 'Pagada'),
	(3, '23456789', 'Daño al libro', 10, 'Pendiente'),
	(4, '34567801', 'Pérdida del libro', 20, 'Pendiente'),
	(5, '45678901', 'Devolución tardía', 2, 'Pagada'),
	(6, '56789012', 'Devolución tardía', 4, 'Pendiente'),
	(7, '67890123', 'Daño al libro', 8, 'Pendiente'),
	(8, '78901234', 'Pérdida del libro', 15, 'Pendiente'),
	(9, '89012345', 'Devolución tardía', 1, 'Pagada'),
	(10, '90123456', 'Daño al libro', 6, 'Pendiente'),
	(11, '01234567', 'Pérdida del libro', 25, 'Pendiente'),
	(12, '12345678', 'Devolución tardía', 3.5, 'Pagada'),
	(13, '23456789', 'Daño al libro', 9, 'Pendiente'),
	(14, '34567801', 'Pérdida del libro', 18, 'Pendiente'),
	(15, '45678901', 'Devolución tardía', 2.5, 'Pagada');

-- Volcando estructura para tabla bibli_02.prestamo
CREATE TABLE IF NOT EXISTS `prestamo` (
  `ID_Prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `Cod_libro` int(11) NOT NULL,
  `DNI` varchar(8) NOT NULL,
  `ID_Bibliotecario` int(11) NOT NULL,
  `Hora_Prestamo` time NOT NULL,
  `Fecha_prestamo` date NOT NULL,
  `Fecha_limite` date NOT NULL,
  PRIMARY KEY (`ID_Prestamo`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Volcando datos para la tabla bibli_02.prestamo: ~31 rows (aproximadamente)
INSERT INTO `prestamo` (`ID_Prestamo`, `Cod_libro`, `DNI`, `ID_Bibliotecario`, `Hora_Prestamo`, `Fecha_prestamo`, `Fecha_limite`) VALUES
	(1, 5, '01234567', 1, '13:33:59', '2024-12-22', '2025-01-15'),
	(2, 22, '89012345', 3, '01:15:40', '2024-09-27', '2024-11-04'),
	(3, 24, '45678901', 3, '07:13:02', '2024-09-25', '2024-09-28'),
	(4, 12, '01234567', 1, '05:38:52', '2024-11-09', '2024-10-27'),
	(5, 26, '67890123', 2, '12:13:43', '2024-11-15', '2024-11-10'),
	(6, 2, '23456789', 3, '02:33:56', '2024-11-20', '2024-11-17'),
	(7, 19, '01234578', 2, '21:06:40', '2024-11-21', '2024-09-22'),
	(8, 20, '89012357', 3, '11:21:19', '2024-09-20', '2024-10-23'),
	(9, 26, '89012356', 3, '03:35:12', '2024-11-14', '2024-10-31'),
	(10, 29, '12345689', 1, '14:49:41', '2024-11-18', '2024-09-26'),
	(11, 18, '89012345', 2, '05:47:51', '2024-10-03', '2024-10-25'),
	(12, 6, '89012356', 2, '16:43:01', '2024-10-31', '2024-10-17'),
	(13, 18, '56789024', 1, '07:39:40', '2024-11-30', '2024-12-02'),
	(14, 27, '56789012', 3, '12:15:08', '2024-11-12', '2024-10-27'),
	(15, 24, '90123456', 3, '05:20:02', '2024-10-07', '2024-11-06'),
	(16, 14, '34567802', 2, '05:47:27', '2024-10-02', '2024-10-18'),
	(17, 8, '78901234', 1, '12:57:30', '2024-10-24', '2024-10-29'),
	(18, 15, '01234567', 3, '04:03:11', '2024-09-04', '2024-11-10'),
	(19, 1, '45678912', 3, '15:25:36', '2024-10-04', '2024-11-15'),
	(20, 14, '67890123', 3, '06:31:30', '2024-11-29', '2024-11-17'),
	(21, 12, '12345678', 1, '00:18:01', '2024-09-08', '2024-10-18'),
	(22, 10, '45678901', 1, '22:54:46', '2024-11-06', '2024-10-27'),
	(23, 10, '78901246', 3, '06:55:35', '2024-09-03', '2024-12-08'),
	(24, 17, '45678913', 3, '05:50:15', '2024-09-05', '2024-12-04'),
	(25, 30, '12345678', 2, '16:00:25', '2024-09-10', '2024-10-24'),
	(26, 3, '56789023', 3, '19:40:59', '2024-10-29', '2024-11-08'),
	(27, 20, '67890123', 3, '09:00:49', '2024-11-05', '2024-11-15'),
	(28, 19, '89012356', 3, '17:00:50', '2024-12-01', '2024-09-25'),
	(29, 21, '45678901', 3, '15:09:25', '2024-09-12', '2024-10-25'),
	(30, 16, '56789024', 1, '22:20:05', '2024-11-11', '2024-11-14'),
	(33, 6, '01234578', 2, '16:10:16', '2024-12-22', '2025-05-16');

-- Volcando estructura para disparador bibli_02.fecha de devolución no sea anterior a la fecha de préstamo
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `fecha de devolución no sea anterior a la fecha de préstamo` BEFORE UPDATE ON `prestamo` FOR EACH ROW begin
    if new.Fecha_limite < new.Fecha_Prestamo then
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'La fecha de devolucion no puede ser anterior a la fecha de prestamo.';
    end if;
end//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador bibli_02.minusculas
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `minusculas` BEFORE INSERT ON `estudiante` FOR EACH ROW begin 
  	set new.Nombres = LOWER(new.Nombres);
    set new.Apellidos = LOWER(new.Apellidos);
end//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

-- Volcando estructura para disparador bibli_02.Num_de_ejemplares no negativos
SET @OLDTMP_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';
DELIMITER //
CREATE TRIGGER `Num_de_ejemplares no negativos` BEFORE INSERT ON `libro` FOR EACH ROW begin
   if new.Num_de_ejemplares<0 then
      set new.Num_de_ejemplares=0;
   end if;
end//
DELIMITER ;
SET SQL_MODE=@OLDTMP_SQL_MODE;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
