# Sistema-de-Gerenciamento-Local-
Aqui estar o codigo em SQL 


CREATE DATABASE IF NOT EXISTS pastelaria_ts CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE pastelaria_ts;

CREATE USER IF NOT EXISTS 'IkarusRK'@'localhost' IDENTIFIED BY '12345';
GRANT ALL PRIVILEGES ON pastelaria_ts.* TO 'IkarusRK'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE IF NOT EXISTS insumos (
    cod_insumo INT PRIMARY KEY AUTO_INCREMENT, 
    nome_insumo VARCHAR(100) NOT NULL,
    fornecedor VARCHAR(100),
    medida VARCHAR(20) NOT NULL,
    valor_inicial DECIMAL(19,2) NOT NULL -- Usando DECIMAL [Importa BigDecimal do Java]
);

-- Usar esse comando para limpar a tabela. (Eu recomendo para testes)
TRUNCATE TABLE insumos;

-- Insumos para teste.
INSERT INTO insumos (nome_insumo, fornecedor, medida, valor_inicial) VALUES
('AÇÚCAR', 'Doce Mel', 'kg', 4.50),
('AZEITE DOCE', 'Olivares', 'l', 22.90),
('AZEITONA', 'Verde Vale', 'kg', 19.95),
('BACON', 'Friboi', 'kg', 23.89),
('BANANA DA TERRA', 'Fazenda Boa Vista', 'kg', 10.00),
('QUEIJO MUÇARELA', 'Laticínios Bom Gosto', 'kg', 28.50),
('CARNE MOÍDA', 'Açougue do Zé', 'kg', 35.00),
('FRANGO DESFIADO', 'Aves da Serra', 'kg', 22.75),
('PALMITO', 'Conservas da Nona', 'kg', 32.00),
('CATUPIRY (REQUEIJÃO)', 'Laticínios Bom Gosto', 'kg', 25.40),
('CALABRESA', 'Friboi', 'kg', 21.90),
('CEBOLA', 'Horta do Vale', 'kg', 5.99),
('TOMATE', 'Horta do Vale', 'kg', 8.50),
('ÓLEO DE SOJA', 'Soya', 'l', 9.80),
('FARINHA DE TRIGO', 'Dona Benta', 'kg', 5.50),
('SAL', 'Cisne', 'kg', 2.50),
('CHOCOLATE EM BARRA', 'Garoto', 'kg', 45.00),
('DOCE DE LEITE', 'Laticínios Bom Gosto', 'kg', 18.00),
('ORÉGANO', 'Temperos do Chef', 'pct', 3.00),
('MASSA DE PASTEL', 'Massas Frescas da Casa', 'rolo', 15.00);



-- Verifica os dados inseridos.
SELECT * FROM insumos;

