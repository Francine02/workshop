# Projeto MongoDB com Spring Boot

Este projeto foi desenvolvido como parte do curso **Programação Orientada a Objetos com Java** ministrado pelo Prof. Nelio Alves. O foco principal do projeto é a integração do banco de dados NoSQL MongoDB com uma aplicação Spring Boot, explorando conceitos de CRUD, design de banco de dados orientado a documentos e consultas utilizando Spring Data.

## Objetivos do Projeto

- **Diferenças entre Paradigmas**: Compreender as principais diferenças entre o paradigma de banco de dados orientado a documentos e o paradigma relacional.
- **Operações CRUD**: Implementar operações de criação, leitura, atualização e exclusão (CRUD) de dados utilizando o MongoDB.
- **Decisões de Design**: Refletir sobre as decisões de design de um banco de dados orientado a documentos, incluindo a escolha entre objetos aninhados e referências.
- **Associações entre Objetos**: Implementar associações entre objetos dentro de um banco de dados orientado a documentos.
- **Consultas com Spring Data**: Realizar consultas utilizando Spring Data e o repositório MongoRepository.

## Funcionalidades Implementadas

- **CRUD Completo**: A aplicação permite a criação, leitura, atualização e exclusão de usuários, armazenando os dados em uma coleção do MongoDB.
- **Associações e Referências**: O projeto implementa tanto objetos aninhados quanto referências para modelar relacionamentos entre entidades, como usuários e posts.
- **DTO (Data Transfer Object)**: Utilização de DTOs para otimizar o tráfego de dados e proteger informações sensíveis.
- **Consultas Avançadas**: Consultas personalizadas foram implementadas utilizando métodos de consulta do Spring Data e a anotação `@Query` para buscar posts com strings específicas no título.
- **Configuração Inicial**: Criação de uma classe de configuração que instancia automaticamente dados de exemplo na base de dados ao iniciar a aplicação.
- **Endpoints RESTful**: Implementação de endpoints RESTful para gerenciar as entidades `User` e `Post`, incluindo suporte para operações de listagem, busca por ID, inserção, deleção e atualização.

## Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada para o desenvolvimento da aplicação.
- **Spring Boot**: Framework utilizado para simplificar a criação da aplicação e sua integração com o MongoDB.
- **MongoDB**: Banco de dados NoSQL utilizado para armazenar as entidades do projeto.
- **Spring Data MongoDB**: Ferramenta para integração e manipulação do MongoDB dentro da aplicação Spring Boot.
- **MongoDB Compass**: Ferramenta utilizada para visualização e gerenciamento do banco de dados MongoDB.

## Estrutura do Projeto

- **Domain**: Contém as classes que representam as entidades do sistema, como `User` e `Post`.
- **Repository**: Contém as interfaces que extendem `MongoRepository` para operações com o banco de dados.
- **Services**: Contém as classes de serviço que implementam a lógica de negócios e interagem com os repositórios.
- **Resources**: Contém os controladores REST que expõem os endpoints da API.
- **Config**: Contém a classe de configuração responsável pela carga inicial de dados na base de dados.
- **DTO**: Contém as classes de Data Transfer Object para otimização e segurança nas respostas da API.

## Conclusão

Este projeto proporcionou uma compreensão profunda de como integrar MongoDB com uma aplicação Spring Boot, além de explorar as vantagens e desafios de utilizar um banco de dados orientado a documentos em um contexto de aplicação real. Através da implementação de funcionalidades avançadas como associações entre objetos e consultas personalizadas, o projeto reforçou os conhecimentos adquiridos sobre design de bancos de dados e desenvolvimento de APIs RESTful.

## Referência
[Java Completo - Udemy](https://www.udemy.com/course/java-curso-completo/)
