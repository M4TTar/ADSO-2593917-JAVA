-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-09-2023 a las 18:28:17
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
-- Base de datos: `datos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `id` int(11) NOT NULL,
  `documento` int(15) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `habilidades` varchar(255) DEFAULT NULL,
  `perfil` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `grado` varchar(255) DEFAULT NULL,
  `edad` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`id`, `documento`, `nombre`, `apellido`, `correo`, `direccion`, `genero`, `habilidades`, `perfil`, `usuario`, `password`, `grado`, `edad`) VALUES
(1, 108806, 'johan', 'cardenas', 'johan@gmail.com', 'el parque', 'masculino', 'python', 'hay mas', 'johanc', '12345', NULL, '2017-06-13'),
(2, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', NULL, '2023-11-22'),
(3, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', NULL, '2023-11-22'),
(4, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', NULL, '2023-11-22'),
(5, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', NULL, '2023-11-22'),
(7, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', NULL, NULL),
(8, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', NULL, NULL),
(9, 108800, 'michi', 'bedoya', 'mayer@gmail.com', 'el campo', 'masculino', 'php', 'no hay mucho', 'michiib', '12345', '2023-11-22', NULL),
(10, 108801, 'quito', 'mendez', 'quito@gmail.com', 'el hoyo', 'masculino', 'python', 'nose mas', 'quito', '12345', 'opcion1', '2023-08-30'),
(11, 108801, 'quito', 'mendez', 'quito@gmail.com', 'el hoyo', 'masculino', 'python', 'nose mas', 'quito', '12345', 'opcion1', '2023-08-30'),
(12, 108802, 'kley', 'cardenas', 'mate@gmail.com', 'el campo', 'masculino', 'java', 'masno', 'johanc', '12345', '2024', '2023-08-14'),
(13, 108803, 'jhon', 'cardona', 'cardo@gmail.com', 'perdido', 'masculino', 'java', 'kjhhffg', 'michiib', '123456', '2025', '2023-08-01'),
(14, 108803, 'jhon', 'cardona', 'cardo@gmail.com', 'perdido', 'masculino', 'java', 'kjhhffg', 'michiib', '123456', '2025', '2023-08-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `valor` bigint(20) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `valor`, `cantidad`) VALUES
(1, 'platano', 'verde', 15000, 10),
(2, 'platano', 'verde', 15000, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `username`, `email`, `password`, `estado`) VALUES
(1, 'matameqa11', 'matame@gmail.com', '4567', 'activo'),
(2, 'quitomez', 'quitomendez@gmail.com', '1236', 'inactivo'),
(3, 'johanbb', 'johan@gmail.com', '7896', 'activo'),
(4, 'moral', 'moral@gmail.com', '1597', 'inactivo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`,`documento`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
