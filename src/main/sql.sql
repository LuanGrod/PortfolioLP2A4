DROP TABLE IF EXISTS aluno ;
CREATE TABLE IF NOT EXISTS aluno (
  matricula VARCHAR(45) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  endereco VARCHAR(45) NOT NULL,
  dataIngresso VARCHAR(45) NOT NULL,
  dataConclusao VARCHAR(45) NOT NULL,
  PRIMARY KEY (matricula));
  
  SELECT * FROM aluno;
  
DROP TABLE IF EXISTS disciplina ;
CREATE TABLE IF NOT EXISTS disciplina (
  id VARCHAR(45) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  alunos VARCHAR(45) NOT NULL,
  PRIMARY KEY (disciplina)),
  FOREIGN KEY (alunos) REFERENCES (aluno.macricula);
  
  SELECT * FROM disciplina;

 
insert into disciplina (id, nome) values ('dw2a4', 'dw2a4');

insert into aluno (matricula, nome, endereco, dataIngresso, dataConclusao) values ('sp307319x', 'Luan Rodrigues', 'Rua 1', '2022-1-10', '2021-01-11');

insert into disciplina_has_aluno(matricula, codigo, nota) values ( 'sp307319x', 'dw2a4', 1);
