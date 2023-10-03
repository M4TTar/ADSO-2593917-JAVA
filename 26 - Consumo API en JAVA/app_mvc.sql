-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-09-2023 a las 18:29:09
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `app_mvc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `foto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `email`, `foto`) VALUES
(718, 'esteban', 'arboleda', '3108', 'calle 21', 'esteban@gmail.com', 'default.png'),
(1004, 'juanes', 'marin', '3107', 'calle 20', 'juanes@gmail.com', 'default.png'),
(108808, 'quito', 'mendez', '355789', 'que le importa', 'quitoo@gmail.com', 'default.png'),
(108809, 'quito', 'mendez', '3224545', 'que le importa', 'quito@gmail.com', 'default.png'),
(108810, 'michii', 'bedoya', '3374444', 'el campo', 'mayer@gmail.com', 'default.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `cedula` bigint(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `tipo` enum('ADMIN','VENDEDOR','','') NOT NULL,
  `estado` enum('ACTIVO','INACTIVO','','') NOT NULL DEFAULT 'ACTIVO'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `cedula`, `email`, `password`, `tipo`, `estado`) VALUES
(1, 1004, 'juanes@gmail.com', '81dc9bdb52d04dc20036dbd8313ed055', 'ADMIN', 'ACTIVO'),
(2, 718, 'esteban@gmail.com', '827ccb0eea8a706c4c34a16891f84e7b', 'VENDEDOR', 'ACTIVO'),
(3, 108810, 'mayer@gmail.com', '827ccb0eea8a706c4c34a16891f84e7b', 'ADMIN', 'ACTIVO'),
(4, 108809, 'quito@gmail.com', '2ae7e7be66bd8170691375f636b59111', 'ADMIN', 'ACTIVO'),
(5, 108808, 'quitoo@gmail.com', 'd0a4a9f9239060b6294f1ac82bd2a56e', 'ADMIN', 'ACTIVO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `cedula` (`cedula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`cedula`) REFERENCES `personas` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
