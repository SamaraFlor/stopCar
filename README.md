# stopCar
Aplicação para cadastro de clientes do estacionamento


Ultilizando TesteContainer- https://www.testcontainers.org/
Testcontainers é uma biblioteca Java que suporta testes JUnit, fornecendo instâncias leves e descartáveis ​​de bancos de dados comuns, navegadores da Web Selenium ou qualquer outra coisa que possa ser executada em um contêiner do Docker.

Os contêineres de teste facilitam os seguintes tipos de testes:

Testes de integração da camada de acesso a dados : use uma instância em contêiner de um banco de dados MySQL, PostgreSQL ou Oracle para testar seu código de camada de acesso a dados para compatibilidade completa, mas sem exigir configuração complexa nas máquinas dos desenvolvedores e com a certeza de que seus testes sempre começarão com um estado de banco de dados conhecido. Qualquer outro tipo de banco de dados que possa ser conteinerizado também pode ser usado.

Ultilizando Spring Security-https://spring.io/projects/spring-security
Spring Security é uma estrutura que se concentra em fornecer autenticação e autorização para aplicativos Java. Como todos os projetos do Spring, o verdadeiro poder do Spring Security é encontrado na facilidade com que ele pode ser estendido para atender aos requisitos personalizados

configuração https://docs.spring.io/spring-security/reference/samples.html

// Ultilizando Swagger https://swagger.io/solutions/api-documentation/
O Swagger elimina o trabalho manual da documentação da API, com uma variedade de soluções para gerar, visualizar e manter os documentos da API.

Model Mapper- http://modelmapper.org/
O objetivo do ModelMapper é facilitar o mapeamento de objetos, determinando automaticamente como um modelo de objeto é mapeado para outro, com base em convenções, da mesma forma que um humano faria - enquanto fornece uma API simples e segura para refatoração para lidar com casos de uso específicos
Configurando http://modelmapper.org/getting-started/

Ultilizando Postgree no docker

docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

e Swagger http://localhost:8080/swagger-ui/index.html#/
senha e login para acessar
