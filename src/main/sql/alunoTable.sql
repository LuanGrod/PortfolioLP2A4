DROP TABLE IF EXISTS aluno ;
CREATE TABLE IF NOT EXISTS aluno (
  matricula VARCHAR(45) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  endereco VARCHAR(45) NOT NULL,
  dataIngresso VARCHAR(45) NOT NULL,
  dataConclusao VARCHAR(45) NOT NULL,
  PRIMARY KEY (matricula));
  
  SELECT * FROM aluno;