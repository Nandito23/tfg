-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-03-2018 a las 04:28:49
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tfg`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coches`
--

CREATE TABLE `coches` (
  `id_coches` int(11) NOT NULL,
  `matricula` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `color` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `precio` float NOT NULL,
  `estado` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `marca` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `modelo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `combustible` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `num_plazas` int(11) NOT NULL,
  `num_kms` int(11) NOT NULL,
  `potencia` int(11) NOT NULL,
  `id_garaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `coches`
--

INSERT INTO `coches` (`id_coches`, `matricula`, `color`, `precio`, `estado`, `marca`, `modelo`, `combustible`, `num_plazas`, `num_kms`, `potencia`, `id_garaje`) VALUES
(1, 'SE9867ZX', 'Rojo', 140, 'Libre', 'Opel', 'Corsa', 'Diesel', 5, 10000, 90, 1),
(2, 'SE2222JH', 'Azul', 190, 'Libre', 'Audi', 'A3', 'Diesel', 5, 12000, 140, 3),
(3, 'SE3456CK', 'Negro', 130, 'Libre', 'BMW', 'M4', 'Gasolina', 5, 12000, 140, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `garaje`
--

CREATE TABLE `garaje` (
  `id_garaje` int(11) NOT NULL,
  `ubicacion` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `garaje`
--

INSERT INTO `garaje` (`id_garaje`, `ubicacion`) VALUES
(1, 'Nervion Plaza'),
(2, 'San Bernardo'),
(3, 'Los Remedios'),
(4, 'La Palmera'),
(6, 'San Juan');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL,
  `lugar_recogida` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_recogida` date NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `lugar_devolucion` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `cuota_total` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_coche` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `dni` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `tlfno` int(10) NOT NULL,
  `email` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `pass` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `tipo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `dni`, `nombre`, `apellidos`, `direccion`, `tlfno`, `email`, `pass`, `tipo`) VALUES
(1, '26434567k', 'francisca', 'marisco aguila', 'los bermejales', 123456789, 'fran@hotmail.com', '123', 1),
(2, '12345678u', 'fer', 'pejime', 'carmona', 123456789, 'erpejime@hotmail.es', '111', 1),
(3, '22222222h', 'manu', 'japon iglesias', 'la cartuja', 333333333, 'manu@hotmail.com', '444', 1),
(4, '66666666t', 'pepe', 'lopez pedrerol', 'los palacios', 234567987, 'pepe@hotmail.com', '000', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `coches`
--
ALTER TABLE `coches`
  ADD PRIMARY KEY (`id_coches`),
  ADD KEY `id_garaje` (`id_garaje`);

--
-- Indices de la tabla `garaje`
--
ALTER TABLE `garaje`
  ADD PRIMARY KEY (`id_garaje`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `id_coche` (`id_coche`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `coches`
--
ALTER TABLE `coches`
  MODIFY `id_coches` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `garaje`
--
ALTER TABLE `garaje`
  MODIFY `id_garaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `coches`
--
ALTER TABLE `coches`
  ADD CONSTRAINT `coches_ibfk_3` FOREIGN KEY (`id_garaje`) REFERENCES `garaje` (`id_garaje`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`id_coche`) REFERENCES `coches` (`id_coches`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
