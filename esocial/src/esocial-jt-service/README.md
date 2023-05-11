O **esocial-jt-service** é o módulo principal do sistema eSocial na Justiça do Trabalho, que recebe dados de ocorrências da vida funcional dos trabalhadores/servidores e os comunica ao sistema eSocial governametal central [eSocial-Gov](https://portal.esocial.gov.br/).

## Características

O **esocial-jt-service** foi construído em [Java 8](http://www.oracle.com/technetwork/pt/java/javaee/overview/index.html) utilizando o framework [Spring Boot](https://spring.io/projects/spring-boot). É uma aplicação primordialmente de _backend_ que fornece API RESTful trafegando dados no formato _JSON_.

Em poucas palavras, este módulo recebe um _JSON_ com os dados de uma **ocorrência\*** dos sistemas de origem, tranforma em um **evento** do eSocial, cria e assina o arquivo XML, transmite para o eSocial-Gov e posteriormente consulta o resultado de processamento com eventuais erros. Além disso, fornece API para consulta do estado interno da aplicação.

> Obs. 1: para não confundir os conceitos, os dados recebidos pelo esocial-jt-service são chamados de "ocorrencia" enquanto que os XMLs que são enviados para o eSocial-Gov são chamados de "eventos".

> Obs. 2: Cada instituição deve alterar seus sitemas de origem (RH, Folha, etc) ou criar um conector para extrair os dados e enviar no formato JSON para o esocial-jt-service.

## Instalação

### Pré-requisitos

- [Java EE 8](http://www.oracle.com/technetwork/pt/java/javaee/overview/index.html);
- [Maven 3.3.9](https://maven.apache.org/index.html) (ou superior);
- [Git 2.15.0](https://git-scm.com/) (ou superior);
- [Certificado Digital ICP-Brasil A1 válido](https://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita/perguntas-frequentes-producao-restrita#02---certificado-digital) (obrigatório mesmo para testes).

### Banco de dados

Atualmente, o **esocial-jt-service** é testado principalmente com **PostgreSQL**. Os parâmetros de conexão devem ser passados no arquivo de configuração, como explicado mais adiante.

### Criação/Atualização do banco de dados

Os scripts de preparação de banco encontram-se em: [src/esocial-jt-service/src/main/resources/db/migration](src/esocial-jt-service/src/main/resources/db/migration).

> TODO: Descrver o uso básico do flyway

### Download da aplicação

```bash
git clone https://github.com/tst-labs/esocial.git
```

### Configuração

Os seguintes parâmetros de configuração (camiho do arquivo do certificado digital e conexão com o banco de dados) devem ser passado editando o arquivo `config/application.properties`.

```properties
esocialjt.cnpj-empregador=

esocialjt.arquivoCertificado=
esocialjt.senhaCertificado=

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=
spring.jpa.database-platform=

esocialjt.proxyServer=
esocialjt.proxyPort=
esocialjt.proxyUser=
esocialjt.proxyPassword=
```

> Obs.: Como qualquer aplicação Spring Boot, existem outras maneiras de [sobreescrever os parâmetros de configuração](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html).

### Build e execução

Para fazer build do projeto, execute:

```bash
cd src
mvn clean package
```

E para iniciar:

```bash
java -jar src/esocial-jt-service/target/esocial-jt-service-0.0.1-SNAPSHOT.jar
```

Verifique se a aplicação está no ar acessando a url

```
http://localhost:8080/esocial-jt-service/actuator/health
```

#### Geração de war

Alternativamente, é possível gerar um `.war` que pode ser implantado no servidor de aplicação, utilizando o profile **war**.

```bash
cd src
mvn clean package -P war
```

### Testando o primeiro envio

O **esocial-jt-service** foi projetado para receber dados de ocorrência via JSON a partir dos sistemas de origem ou de um conector. Porém, para um primeiro teste, no ambiente de [Produção Restrita](http://portal.esocial.gov.br/institucional/ambiente-de-producao-restrita), é possível enviar manualmente dados para o **esocial-jt-service**. Para isso, faça uma cópia do arquivo [/src/main/resources/exemplos/informacoes_empregador.json](./src/main/resources/exemplos/informacoes_empregador.json), edite com as informações referentes à instituição (o CNPJ deve ser o mesmo do proprietário do Certificado Digital) e envia usando o método **POST** (via linha de comando ou [Postman](https://www.getpostman.com/)) para o _endpoint_:

```
http://localhost:8080/esocial-jt-service/ocorrencias
```

O log da aplicação irá exibir o status da transmissão para o eSocial-Gov, e também será possível consultar pelo método **GET** em alguns instantes:

```
http://localhost:8080/esocial-jt-service/ocorrencias
```

### Limpando o ambiente de Produção Restrita

É possível apagar os dados enviados para o ambiente de produção restrita por comando via **POST**

```
/esocial-jt-service/producao-restrita/acoes/limpar
```

## API Rest

Ver documentação na raiz do projeto.
