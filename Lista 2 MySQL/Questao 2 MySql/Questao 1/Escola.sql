
CREATE TABLE cliente (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);


CREATE TABLE veiculo (
    chassi VARCHAR(17) PRIMARY KEY,
    placa VARCHAR(7) NOT NULL UNIQUE,
    modelo VARCHAR(50) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    ano INT NOT NULL
);


CREATE TABLE mecanico (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    salario DECIMAL(10, 2) NOT NULL
);




INSERT INTO cliente (cpf, nome, data_nascimento, telefone, endereco) 
VALUES 
('123.456.789-00', 'João Silva', '1985-03-15', '(11) 91234-5678', 'Rua das Flores, 123'),
('987.654.321-00', 'Maria Oliveira', '1990-07-22', '(21) 99876-5432', 'Avenida Brasil, 456');


INSERT INTO veiculo (chassi, placa, modelo, marca, ano) 
VALUES 
('1HGCM82633A123456', 'ABC1234', 'Civic', 'Honda', 2020),
('2C4RC1BG1KR123456', 'XYZ5678', 'Grand Caravan', 'Dodge', 2018);


INSERT INTO mecanico (cpf, nome, data_nascimento, telefone, endereco, salario) 
VALUES 
('456.789.123-00', 'Carlos Pereira', '1980-10-10', '(31) 91234-5678', 'Rua dos Mecânicos, 789', 3500.00),
('654.321.987-00', 'Ana Souza', '1988-05-05', '(41) 99876-5432', 'Rua das Engrenagens, 321', 4200.00);




SELECT * FROM cliente;


SELECT * FROM veiculo;


SELECT * FROM mecanico;




UPDATE cliente 
SET telefone = '(11) 98765-4321' 
WHERE cpf = '123.456.789-00';

UPDATE veiculo 
SET modelo = 'Accord' 
WHERE chassi = '1HGCM82633A123456';


UPDATE mecanico 
SET salario = 4500.00 
WHERE cpf = '456.789.123-00';


DELETE FROM cliente 
WHERE cpf = '987.654.321-00';


DELETE FROM veiculo 
WHERE chassi = '2C4RC1BG1KR123456';

DELETE FROM mecanico 
WHERE cpf = '654.321.987-00';
