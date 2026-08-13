-- USE gestion_ventas;

INSERT INTO clientes (nombre, apellido, dni, email, telefono, activo) VALUES
('Jorge', 'Carrizo', '30111222', 'jorge.carrizo@mail.com', '1144556677', TRUE),
('Lucía', 'Paredes', '29988111', 'lucia.paredes@mail.com', '1145678910', TRUE),
('Esteban', 'Benítez', '30555999', 'esteban.benitez@mail.com', '1133345566', TRUE),
('Romina', 'Silva', '31222888', 'romina.silva@mail.com', '1145567788', TRUE),
('Nahuel', 'López', '28888000', 'nahuel.lopez@mail.com', '1167788990', TRUE),
('Carolina', 'Maldonado', '30666999', 'carolina.maldonado@mail.com', '1132109876', TRUE),
('Gastón', 'Rivas', '31111777', 'gaston.rivas@mail.com', '1177008899', TRUE),
('Paula', 'Serrano', '30000444', 'paula.serrano@mail.com', '1149898989', TRUE),
('Matías', 'Suárez', '29555666', 'matias.suarez@mail.com', '1133334444', TRUE),
('Sabrina', 'Giménez', '29333444', 'sabrina.gimenez@mail.com', '1166665555', TRUE);

INSERT INTO productos (nombre, precio_compra, precio_venta, stock) VALUES
('Coca-Cola 500ml', 450, 600, 60),
('Coca-Cola 1L', 700, 950, 40),
('Agua Villavicencio 500ml', 300, 450, 50),
('Pepsi 1.5L', 650, 900, 35),
('Fanta 500ml', 450, 600, 45),
('Sprite 1L', 700, 950, 40),
('Papas Lays 90g', 800, 1100, 25),
('Papas Lays 45g', 500, 700, 30),
('Cheetos 70g', 600, 850, 20),
('Chicle Beldent x5', 250, 350, 100),
('Chocolate Milka 100g', 1000, 1350, 15),
('Chocolate Shot simple', 350, 500, 60),
('Alfajor Havanna', 750, 1100, 20),
('Alfajor Guaymallén', 150, 250, 120),
('Cigarrillos Marlboro Box', 2000, 2600, 40),
('Cigarrillos Lucky Strike', 1900, 2500, 45),
('Galletitas Oreo 117g', 900, 1200, 30),
('Galletitas Tita', 250, 350, 50),
('Palito salado 100g', 300, 450, 25),
('Agua saborizada Levité 600ml', 400, 550, 35);

INSERT INTO ventas (id_cliente, fecha, estado, total) VALUES
(1, '2025-03-01 10:05:00', 'PAGADA', 2450.00),
(2, '2025-03-02 11:30:00', 'PAGADA', 5600.00),
(3, '2025-03-03 14:15:00', 'PENDIENTE', 1750.00),
(4, '2025-03-04 09:45:00', 'PAGADA', 3200.00),
(5, '2025-03-05 16:30:00', 'PAGADA', 8700.00),
(6, '2025-03-06 17:00:00', 'PENDIENTE', 2900.00),
(7, '2025-03-07 13:20:00', 'PAGADA', 4200.00),
(8, '2025-03-08 18:40:00', 'ANULADA', 0.00),
(9, '2025-03-09 12:15:00', 'PAGADA', 6500.00),
(10, '2025-03-10 08:55:00', 'PAGADA', 7300.00);

INSERT INTO detalle_ventas (id_venta, id_producto, precio_unitario, cantidad, subtotal) VALUES
(1, 1, 600, 2, 1200.00),
(1, 7, 1100, 1, 1100.00),
(1, 10, 350, 2, 700.00),

(2, 15, 2600, 2, 5200.00),
(2, 12, 500, 1, 500.00),

(3, 3, 450, 2, 900.00),
(3, 17, 1200, 1, 1200.00),

(4, 5, 600, 2, 1200.00),
(4, 13, 1100, 1, 1100.00),
(4, 18, 350, 2, 700.00),

(5, 11, 1350, 2, 2700.00),
(5, 15, 2600, 2, 5200.00),
(5, 10, 350, 2, 700.00),

(6, 6, 950, 2, 1900.00),
(6, 19, 450, 2, 900.00),

(7, 1, 600, 2, 1200.00),
(7, 2, 950, 1, 950.00),
(7, 9, 850, 1, 850.00),
(7, 14, 250, 2, 500.00),

(8, 16, 2500, 1, 2500.00),

(9, 20, 550, 3, 1650.00),
(9, 13, 1100, 1, 1100.00),
(9, 7, 1100, 2, 2200.00),
(9, 14, 250, 4, 1000.00),

(10, 11, 1350, 2, 2700.00),
(10, 12, 500, 2, 1000.00),
(10, 1, 600, 2, 1200.00),
(10, 17, 1200, 2, 2400.00);
