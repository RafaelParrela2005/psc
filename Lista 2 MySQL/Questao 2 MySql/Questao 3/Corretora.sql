
CREATE TABLE cliente (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    agencia INT NOT NULL,
    conta VARCHAR(20) NOT NULL,
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    perfil ENUM('conservador', 'moderado', 'arrojado', 'sofisticado', 'agressivo') NOT NULL
);

CREATE TABLE ativo_financeiro (
    codigo VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    emissor VARCHAR(100),
    data_inicio DATE,
    data_fim DATE
);

CREATE TABLE nota_corretagem (
    numero_nota INT PRIMARY KEY AUTO_INCREMENT,
    folha INT NOT NULL,
    data_compra DATE NOT NULL,
    cpf_cliente VARCHAR(14) NOT NULL,
    codigo_ativo VARCHAR(20) NOT NULL,
    quantidade INT NOT NULL,
    cotacao DECIMAL(10, 2) NOT NULL,
    valor_compra DECIMAL(15, 2) NOT NULL,
    custos DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (cpf_cliente) REFERENCES cliente(cpf),
    FOREIGN KEY (codigo_ativo) REFERENCES ativo_financeiro(codigo)
);


INSERT INTO cliente (cpf, nome, data_nascimento, agencia, conta, telefone, endereco, perfil) 
VALUES 
('123.456.789-00', 'João Silva', '1980-05-15', 1234, '56789-0', '(11) 91234-5678', 'Rua das Flores, 123', 'conservador'),
('987.654.321-00', 'Maria Oliveira', '1990-10-20', 5678, '12345-6', '(21) 99876-5432', 'Avenida Brasil, 456', 'agressivo');

-- Inserir registros na tabela ativo_financeiro
INSERT INTO ativo_financeiro (codigo, nome, descricao, emissor, data_inicio, data_fim) 
VALUES 
('ACAO123', 'Ação Empresa A', 'Ação ordinária da Empresa A.', 'Empresa A S.A.', '2020-01-01', NULL),
('FII456', 'Fundo Imobiliário B', 'Fundo Imobiliário do setor logístico.', 'Gestora B', '2018-05-15', NULL);

INSERT INTO nota_corretagem (folha, data_compra, cpf_cliente, codigo_ativo, quantidade, cotacao, valor_compra, custos) 
VALUES 
(1, '2024-12-01', '123.456.789-00', 'ACAO123', 100, 15.50, 1550.00, 15.00),
(2, '2024-12-02', '987.654.321-00', 'FII456', 50, 120.00, 6000.00, 20.00);




SELECT * FROM cliente;


SELECT * FROM ativo_financeiro;

SELECT * FROM nota_corretagem;




UPDATE cliente 
SET perfil = 'moderado' 
WHERE cpf = '123.456.789-00';


UPDATE ativo_financeiro 
SET emissor = 'Empresa Atualizada S.A.' 
WHERE codigo = 'ACAO123';


UPDATE nota_corretagem 
SET custos = 25.00 
WHERE numero_nota = 1;




DELETE FROM cliente 
WHERE cpf = '987.654.321-00';


DELETE FROM ativo_financeiro 
WHERE codigo = 'FII456';


DELETE FROM nota_corretagem 
WHERE numero_nota = 2;
