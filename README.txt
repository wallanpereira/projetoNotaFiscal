Olá,
 Criei esse projeto na IDE NetBeans na versão 8.1, utilizei JSF, Hibernate, Primefaces e Banco de Dados MySQL.
 Citei a IDE, porque já tentei importar para outra IDE, e não consegui rodar a aplicação.
 
 Também tirei uns prints, da execução do programa que está dentro da pasta /application image

Antes de inicializar o programa precisamos primeiro altera a senha e o login, que fica no Pacotes de Código-fonte --> src.dao --> ConexaoDAO.java


	public class ConexaoDAO {
	    ...
	    private static String url = "jdbc:mysql://localhost:3306/mysql"; <-- Caso você tenha um servidor subtistuir "jdbc:mysql://seu-servidor-local:sua-porta/mysql"

	    private static String login = "seu usuario do banco";

	    private static String senha = "sua senha de usuario do banco";
	    ...


/* CASO NÃO TENHA O DATABASE MYSQL, EXECUTE O COMANDO ABAIXO*/
	
	CREATE DATABASE MYSQL;

/* AGORA VAMOS USAR O DATABASE CRIADO */
	USE MYSQL;

/* CRIANDO A TABELA PARA NOTAS FISCAIS */
	CREATE TABLE NOTAFISCAL(
 	 NUMERO INT UNSIGNED NOT NULL,
 	 DESCRICAO VARCHAR(50) NOT NULL,
 	 DATA_FATURAMENTO VARCHAR(10) NOT NULL,
 	 DATA_PAGAMENTO VARCHAR(10) NOT NULL,
 	 CONDICAO VARCHAR(15),
 	 PRIMARY KEY(NUMERO)
	);

/* CRIANDO A TABELA PARA ARMAZENAR SOLICITAÇÕES DE PAGAMENTO */
	CREATE TABLE SOLICITACAO(
 	 NUMERO INT UNSIGNED NOT NULL,
  	 DATA_PAGAMENTO VARCHAR(10) NOT NULL,
  	 DATA_SOLICITADA VARCHAR(10) NOT NULL,
  	 CONDICAO VARCHAR(20)
 	);

/*CASO QUEIRA CONFERIR AS ESTRUTRAS DAS TABELAS */
 	 DESC NOTAFISCAL;

 	 DESC SOLICITACAO;

/*CASO QUEIRA CONSULTAR OS DADOS INSERIDOS */
 	 SELECT * FROM NOTAFISCAL;

 	 SELECT * FROM SOLICITACAO;
