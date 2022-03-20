# Cadastro de clientes - Java Swing

<p>Projeto criado utilizando Java Swing, sendo apenas um sistema básico de cadastro (para fins de estudo).</p>

## Ferramentas utilizadas

- Java Swing
- Oracle MySQL
- JCalendar

## Preparação do ambiente
Para rodar o projeto, utlize a IDE que você mais se identifique **(para trabalhar com aplicações desktop, me sinto mais confortável utilizando o NetBeans)**, em seguida, altere a classe **ConnectionFactory.java** para que o projeto se adeque ao seu servidor de **banco de dados**:

**Exemplo com o trecho da classe ConnectionFactory.java**:

````java
public class ConnectionFactory {
    
    private static final String urlBase = "jdbc:mysql://localhost:3306/{Nome do banco de dados}";
    private static final String usuario = "root";
    private static final String senha = "Dev2020@";
````

Em seguida, basta criar um banco de dados no MySql com o comando `Create schema {Nome do banco de dados}`

## Tutoriais úteis para configurar sua estação de trabalho.

- [Configurar variáveis de ambiente JAVA](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f)
- [Trabalhando com aplicações desktop - Apache Netbeans](https://netbeans.apache.org/kb/docs/java/gui-functionality_pt_BR.html)
