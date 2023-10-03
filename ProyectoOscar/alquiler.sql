-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-07-2023 a las 15:57:24
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alquiler`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `id` int(11) NOT NULL,
  `cedula` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `contrasena` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`id`, `cedula`, `nombre`, `contrasena`, `estado`) VALUES
(2, '1', 'Jose Angarita', '1', 'A'),
(3, '1008', 'Oscar Loaiza', '1008', 'A'),
(4, '000', 'Jhon Kley', '4321', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autos`
--

CREATE TABLE `autos` (
  `id` int(11) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `kilometraje` varchar(255) NOT NULL,
  `valorAlquiler` varchar(255) NOT NULL,
  `color` varchar(255) NOT NULL,
  `numero_placa` varchar(255) NOT NULL,
  `transmision` varchar(255) NOT NULL,
  `tamaño` varchar(255) NOT NULL,
  `aire_acondicionado` varchar(255) NOT NULL,
  `fecha` text NOT NULL,
  `estado` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `autos`
--

INSERT INTO `autos` (`id`, `marca`, `modelo`, `kilometraje`, `valorAlquiler`, `color`, `numero_placa`, `transmision`, `tamaño`, `aire_acondicionado`, `fecha`, `estado`) VALUES
(3, 'Nissan', 'GTR35', '200', '200000', 'Negro', 'JDA123', 'Automatico', '4 Puertas', 'Si', '12-07-2023', 'A'),
(4, 'Jeep', 'Prado', '3387', '190000', 'Negro', 'ICP192', 'Automatica', '2 Puertas', 'Si', '12-07-2023', 'A'),
(5, 'Masda', '2002', '1', '100000', 'Negro', '2', 'Automatica', '4 Puertas', 'Si', '12-07-2023', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autos_clientes`
--

CREATE TABLE `autos_clientes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `marca_vehiculo` varchar(200) NOT NULL,
  `cedula` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `tiempo_alquiler` varchar(255) NOT NULL,
  `total_valor` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `autos_clientes`
--

INSERT INTO `autos_clientes` (`id`, `nombre`, `marca_vehiculo`, `cedula`, `telefono`, `tiempo_alquiler`, `total_valor`) VALUES
(10, 'Jose Angarita', 'Jeep', '2', '3115633158', '5', '950000'),
(11, 'Jose Angarita', 'Nissan', '2', '3115633158', '5', '1000000'),
(12, 'Jose Angarita', 'Masda', '2', '3115633158', '2', '200000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `cedula` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `cedula`, `nombre`, `telefono`, `correo`, `direccion`) VALUES
(3, '2', 'Jose Angarita', '3115633158', 'joseangarita@gmail.com', 'Calle20'),
(6, '1008', 'Oscar Loaiza', '1234', 'Oscar@gmail.com', 'Calle20'),
(7, '1', 'Oscar', '313', 'oscar@gmail.com', 'Calle 8');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `id` int(11) NOT NULL,
  `cedula_cliente` varchar(255) NOT NULL,
  `numero_placa` varchar(255) NOT NULL,
  `fecha` text NOT NULL,
  `costo_final` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `autos`
--
ALTER TABLE `autos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `autos_clientes`
--
ALTER TABLE `autos_clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `autos`
--
ALTER TABLE `autos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `autos_clientes`
--
ALTER TABLE `autos_clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
