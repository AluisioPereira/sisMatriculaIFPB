CREATE SEQUENCE serial START 00001;

CREATE TABLE ALUNO(
	id serial,
	nome VARCHAR(50) NOT NULL,
        SobreNome VARCHAR(50) NOT NULL,
        dataNascimento DATE NOT NULL,
        nacionalidade VARCHAR (50) NOT NULL,
        rg VARCHAR (30) NOT NULL,
	cpf VARCHAR(14) NOT NULL UNIQUE,
        sexo VARCHAR(10) NOT NULL,
        docMilitar VARCHAR (13)UNIQUE,
        matricula serial NOT NULL UNIQUE,
	PRIMARY KEY(id)
ON DELETE RESTRICT   ON UPDATE CASCADE
        

);
CREATE TABLE MATRICULA(
	matricula INTEGER,
        dataMatricula timestamp without time zone DEFAULT CURRENT_TIMESTAMP(0)  NOT NULL ,
        FOREIGN KEY (matricula) REFERENCES ALUNO (matricula),
        PRIMARY KEY(matricula)
);
-- gatilho gera mat
CREATE FUNCTION GeraMat() RETURNS TRIGGER 
AS'
      BEGIN
                INSERT INTO matricula VALUES (NEW.matricula);
                RETURN NULL;
      END '
LANGUAGE PLPGSQL;

CREATE TRIGGER GeraMatTregger AFTER INSERT 
ON aluno 
FOR EACH ROW 
EXECUTE PROCEDURE GeraMat();

