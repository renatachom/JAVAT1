# P12 - PRÁTICA ORIENTADA - JAVA 

Esta é uma aplicação Spring Boot que disponibiliza consultas aos dados dos vencedores de corridas de Fórmula 1 a partir de um arquivo CSV.

## Pré-requisitos

- JDK 11 ou superior instalado
- Maven instalado

## Configuração

1. Clone este repositório:

git clone: https://github.com/renatachom/

2. Navegue até o diretório do projeto: cd PO12
3. Execute a aplicação usando Maven: mvn spring-boot:run

## Endpoints Disponíveis

1. **Listar todos os vencedores**: `GET /todos`
   Retorna todos os vencedores presentes no arquivo CSV.

2. **Listar os vencedores brasileiros**: `GET /brasileiros`
   Retorna apenas os vencedores que têm "Brasil" como país de origem.

3. **Listar o Top 5 vencedores**: `GET /top5`
   Retorna os top 5 vencedores com base no número de vitórias em ordem decrescente.

4. **Listar o Top 10 vencedores**: `GET /top10`
   Retorna os top 10 vencedores com base no número de vitórias em ordem decrescente.

5. **Listar o número de vitórias por país**: `GET /porpais`
   Retorna o número de vitórias por país em ordem decrescente.

6. **Listar a média de vitórias por país**: `GET /mediaporpais`
   Retorna a média de vitórias por país, calculada dividindo o número total de vitórias pelo número total de vencedores para cada país, em ordem decrescente.






