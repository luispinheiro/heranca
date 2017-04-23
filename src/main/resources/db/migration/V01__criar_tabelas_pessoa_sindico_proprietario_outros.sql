CREATE TABLE pessoa (
   codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
   nome varchar(100) NOT NULL,
   endereco varchar(100) NOT NULL
);
   
CREATE TABLE fisica (
   codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
   CPF varchar(20) NOT NULL,
   FOREIGN KEY (codigo) REFERENCES pessoa (codigo)
);

CREATE TABLE juridica (
   codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
   cnpj varchar(15) NOT NULL,
   razao_social varchar(50) NOT NULL,
   FOREIGN KEY (codigo) REFERENCES pessoa (codigo)
);