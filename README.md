# API - Impostos sobre vendas

> Trata-se de um serviço criado para calcular os impostos de determinados itens importados.
![](header.png)

## Instalação

### O que você precisa
+ JDK 11 ou Posterior
+ Install Maven
+ GIT
+ Postman

## Install Maven.
+ [Install Maven on Windows](https://www.baeldung.com/install-maven-on-windows-linux-mac#installing-maven-on-windows)
+ [Install Maven on Linux](https://www.baeldung.com/install-maven-on-windows-linux-mac#installing-maven-on-linux)

## Install Java
+ [Install Java](https://java.tutorials24x7.com/blog/how-to-install-java-11-on-windows)

## Install GIT
+ [Install GIT](https://www.atlassian.com/br/git/tutorials/install-git)

## Install Postman
+ [Install GIT](https://www.softwaretestingmaterial.com/install-postman/)

```git

Para iniciar a instalação, é necessário clonar o projeto do GitHub num diretório de sua preferência:

Abra o terminal do git no diretorio criado e execute o seguinte comando:

git clone https://github.com/joaquim15/Java-Developer-Teste-Pratico.git
cd Java-Developer-Teste-Pratico

Dentro da pasta raiz do projeto execute os seguintes comandos

mvn clean 
mvn install

├── Imposto
│   ├── target
│     ├── Imposto-0.0.1-SNAPSHOT.jar

Ainda no diretório raiz, abra pasta target:
cd target

Dentro da pasta target execute o comando abaixo:
java -jar Imposto-0.0.1-SNAPSHOT.jar
```
## Inicialização do build

```java
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.0.RELEASE)

2020-05-27 22:36:54.225  INFO 11412 --- [           main] br.com.imposto.ImpostoApplication        : Starting ImpostoApplication v0.0.1-SNAPSHOT on LAPTOP-5RN7Q5T7 with PID 11412 (C:\desenvolvimento\wks-desenvolvimento\wks-local-3\Java-Developer-Teste-Pratico\target\Imposto-0.0.1-SNAPSHOT.jar started by Joaquim in C:\desenvolvimento\wks-desenvolvimento\wks-local-3\Java-Developer-Teste-Pratico\target)
2020-05-27 22:36:54.228  INFO 11412 --- [           main] br.com.imposto.ImpostoApplication        : No active profile set, falling back to default profiles: default
2020-05-27 22:36:55.967  INFO 11412 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8081 (http)
2020-05-27 22:36:55.988  INFO 11412 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-05-27 22:36:55.989  INFO 11412 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.35]
2020-05-27 22:36:56.100  INFO 11412 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-05-27 22:36:56.100  INFO 11412 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1799 ms
2020-05-27 22:36:56.377  INFO 11412 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-05-27 22:36:56.594  INFO 11412 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8081 (http) with context path ''
2020-05-27 22:36:56.610  INFO 11412 --- [           main] br.com.imposto.ImpostoApplication        : Started ImpostoApplication in 3.095 seconds (JVM running for 3.711)

```

## Teste da API

```sh
Abra o Postman e crie uma nova aba para uma requisicao do tipo POST 
```

Windows:

```sh
edit autoexec.bat

