# email-service
Este projeto implementa um microservice de envio de e-mails utilizando princípios de arquitetura limpa (Clean Architecture). 

## Objetivo
O objetivo é criar um serviço escalável, testável e de fácil manutenção, que pode ser integrado em diferentes aplicações para gerenciar o envio de e-mails de maneira eficiente.

## Funcionalidades

- Envio de e-mails simples e com anexos
- Suporte a diferentes provedores de e-mail (ex: SMTP, API de terceiros)
- Filas de mensagens para garantir a entrega assíncrona
- Monitoramento e logging de e-mails enviados
- Estrutura modular e desacoplada para facilitar a extensão e manutenção

## Tecnologias Utilizadas

- Linguagem: Java
- Framework:  Spring Boot
- Banco de Dados: PostgreSQL / MongoDB
- Mensageria: RabbitMQ
<!-- Injeção de Dependência: Autofac / .NET Core DI 
Testes: xUnit / NUnit / Moq -->

## Estrutura do Projeto

- Core: Contém as entidades, interfaces e regras de negócio.
- Application: Implementação dos casos de uso e serviços da aplicação.
- Infrastructure: Implementação de repositórios, serviços externos e configuração de provedores de e-mail.
- Presentation: API RESTful para interação com o microservice.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença
Este projeto é licenciado sob a [Apacha Licence 2.0](https://www.apache.org/licenses/LICENSE-2.0).
