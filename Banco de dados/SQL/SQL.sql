CREATE DATABASE gyma;
USE gyma;
CREATE TABLE alunos (
  id_alunos INT NOT NULL  auto_increment,
  pessoa_idpessoa INT NOT NULL,
  matricula INT ,
  objetivo VARCHAR(255) NOT NULL,
  estado INTEGER,
  PRIMARY KEY(id_alunos)
);

CREATE TABLE anamenese (
  id_anamenese INT NOT NULL ,
  id_questoes INTEGER  NOT NULL ,
  id_alunos INT NOT NULL ,
  resposta VARCHAR(20) NOT NULL,
  resposta_completa VARCHAR(255) ,
  PRIMARY KEY(id_anamenese)
);

CREATE TABLE contato_emergencia (
  id_emergencia INTEGER  NOT NULL  auto_increment,
  id_alunos INT NOT NULL ,
  nome VARCHAR(45) NOT NULL,
  tefone VARCHAR(20) NOT NULL,
  estado VARCHAR(20) ,
  cidade VARCHAR(45) ,
  rua VARCHAR(45) ,
  numero INTEGER  ,
  bairro VARCHAR(45) ,
  status_e INTEGER  ,
  PRIMARY KEY(id_emergencia)
);

CREATE TABLE horario (
  id_horario INTEGER  NOT NULL  auto_increment,
  id_alunos INT NOT NULL ,
  dia_semana VARCHAR(20) NOT NULL,
  turno VARCHAR(20) NOT NULL,
  horario TIME NOT NULL,
  PRIMARY KEY(id_horario)
);

CREATE TABLE questoes_anamenese (
  id_questoes_anamenese INTEGER  NOT NULL  auto_increment,
  texto_questao VARCHAR(255) NOT NULL,
  ordem INTEGER,
  estado INTEGER,
  PRIMARY KEY(id_questoes_anamenese)
);

CREATE TABLE avaliacoes (
  id_avaliacao INT NOT NULL  auto_increment,
  id_colaborador INT NOT NULL,
  id_alunos INT NOT NULL ,
  data_avaliacoes VARCHAR(20) ,
  estado INTEGER ,
  PRIMARY KEY(id_avaliacoes)
);
CREATE TABLE behnke_willmore (
  id_behnke INT NOT NULL  auto_increment,
  id_avalicao INT NOT NULL ,
  peso_perder double ,
  gordura_desejavel double ,
  peso_magro_desejavel double ,
  peso_gordura_perder double ,
  peso_magro_a_ganhar double ,
  peso_magro_ double,
  peso_gordura_ double,
  peso_ideal_ double,
  PRIMARY KEY(id_behnke)
);
CREATE TABLE dipasquali (
  id_dipasquali INT NOT NULL  auto_increment,
  id_avalicao INT NOT NULL ,
  peso_perder double ,
  gordura_desejavel double ,
  peso_magro_desejavel double ,
  peso_gordura_perder double ,
  peso_magro_ganhar double ,
  imc double ,
  peso_magro double ,
  peso_gordura double ,
  peso_ideal double ,
  PRIMARY KEY(id_dipasquali)
);
CREATE TABLE medidas (
  id_medida INT NOT NULL  auto_increment,
  id_avalicao INT NOT NULL ,
  estatura double ,
  circunferencia_abdominal_uml double ,
  peso_corporal double ,
  gordura double ,
  circunferencia_abdominal_inf double ,
  circunferencia_pescoco double ,
  circunferencia_quadril double ,
  PRIMARY KEY(id_medida)
);
CREATE TABLE protocolo_marinha (
  id_marinha INT NOT NULL  auto_increment,
  id_avalicao  INT NOT NULL ,
  gordura double ,
  peso_magro double ,
  peso_gordura double ,
  peso_ideal double ,
  peso_perder double ,
  gordura_desejavel double ,
  peso_magro_desejavel double ,
  peso_gordura_perder double ,
  peso_magro_ganhar double ,
  genero VARCHAR(20) ,
  PRIMARY KEY(id_marinha)
);
CREATE TABLE cargo (
  id_cargo INT NOT NULL  auto_increment,
  funcao VARCHAR(255) NOT NULL ,
  horario VARCHAR(255) NOT NULL,
  salario float NOT NULL,
  estado INTEGER  ,
  PRIMARY KEY(id_cargo)
);

CREATE TABLE colaborador (
  id_colaborador INT NOT NULL  auto_increment,
  id_pessoa INT NOT NULL ,
  pis VARCHAR(45)  NOT NULL,
  carteira_trabalho VARCHAR(45)  NOT NULL,
  estado INTEGER  ,
  PRIMARY KEY(id_colaborador)
);
CREATE TABLE pessoa (
  id_pessoa INT NOT NULL ,
  nome VARCHAR(255) NOT NULL ,
  cpf VARCHAR(20) NOT NULL,
  telefone VARCHAR(20) NOT NULL ,
  email VARCHAR(45) NOT NULL,
  user_password VARCHAR(45) NOT NULL,
  estado VARCHAR(45) ,
  cidade VARCHAR(255) ,
  rua VARCHAR(255) ,
  bairro VARCHAR(255) ,
  cep VARCHAR(20) NOT NULL,
  numero INTEGER  ,
  status_p INTEGER  ,
  genero VARCHAR(20) ,
  PRIMARY KEY(id_pessoa)
);

CREATE TABLE pessoa_cargo  (
  id_pessoa_cargo  INT NOT NULL  auto_increment,
  id_cargo INT NOT NULL ,
  id_pessoa INT NOT NULL ,
  estado INTEGER  ,
  data_inicio DATE ,
  data_termino DATE ,
  PRIMARY KEY(id_pessoa_cargo)
);
CREATE TABLE exercicios (
  id_exercicio INT NOT NULL  auto_increment,
  exercicio_nome VARCHAR(255) NOT NULL,
  categoria VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) ,
  estado INTEGER  ,
  PRIMARY KEY(id_exercicio)
);

CREATE TABLE lista (
  id_lista INT NOT NULL  auto_increment,
  nome VARCHAR(45) NOT NULL,
  velocidade VARCHAR(45) NOT NULL,
  intervalo VARCHAR(45) NOT NULL,
  estado INTEGER  ,
  dia VARCHAR(20) NOT NULL,
  PRIMARY KEY(id_lista)
);

CREATE TABLE lista_exercicio (
  id_lista_exercicio INTEGER NOT NULL  auto_increment,
  id_lista INT NOT NULL ,
  id_exercicio INT NOT NULL ,
  ordem VARCHAR(20) NOT NULL,
  serie VARCHAR(20) NOT NULL,
  estado INTEGER  ,
  PRIMARY KEY(id_lista_exercicio)
  );

CREATE TABLE lista_treino (
  id_lista_treino INTEGER  NOT NULL  auto_increment,
  id_treino INT NOT NULL ,
  id_lista INT NOT NULL ,
  PRIMARY KEY(id_lista_treino)
);

CREATE TABLE treino (
  id_treino INT NOT NULL  auto_increment,
  id_colaborador INT NOT NULL ,
  estado INTEGER  ,
  nivel VARCHAR(20) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  genero VARCHAR(20) ,
  dias VARCHAR(20) ,
  PRIMARY KEY(id_treino)
);


CREATE TABLE treino_alunos (
  id_treino_aluno INT NOT NULL  auto_increment,
  id_treino INT NOT NULL,
  id_aluno INT NOT NULL,
  data_inicio DATE NOT NULL,
  estado INTEGER  ,
  data_termino DATE ,
  PRIMARY KEY(id_treino_aluno)
);