# People API

Disponibiliza uma API REST para CRUD de pessoas.

As dúvidas e solicitações, relacionadas ao acesso da API, devem ser enviadas para o e-mail francixco.sf@gmail.com.

### Versão Java

- JDK 11

### IDE utilizada

![image sts4](https://user-images.githubusercontent.com/57726843/118711411-f332df00-b7f5-11eb-9c98-2d0481e433a6.png)

### Banco de Dados

- Host: LOCALHOST, DBS: db_people, Collection: people

![mongodb-logo](https://user-images.githubusercontent.com/57726843/118711707-460c9680-b7f6-11eb-82a6-138ac4d8c64e.png)

## Domain Classes

![Image People Diagram](https://user-images.githubusercontent.com/57726843/118710981-64be5d80-b7f5-11eb-8293-9d00642d3efc.png)

## Arquitetura

![Image Arquitetura sem seta](https://user-images.githubusercontent.com/57726843/118711106-90414800-b7f5-11eb-8d25-fe47be57ed6b.png)

## Instantiation

- Após configurar em 'application.properties' os dados do BD, manter ou alterar a instanciação dos documentos iniciais para teste
- Classe 'Instantiation' no pacote 'com.fransoufil.people.config'

## Endpoints/Métodos tratados

Requisições para a API devem seguir os padrões:

| Value | Método | Descrição |
|---|---|
| `/people` | `GET` | Retorna informações de todos os registros. |
| `/people/{id}` | `GET` | Retorna informações do registro do id informado. |
|       | `POST` | Utilizado para criar um novo registro. |
| `/people/{id}` | `PUT` | Atualiza dados do registro do id informado. |
| `/people/{id}` | `DELETE` | Remove o registro do id informado. |
| `/people/search/givenname?{givenName}` | `GET` | Busca o(s) registro(s) cujo primeiro nome contenha a sequência de caracteres informada. |
| `/people/search/familyname?{familyName}` | `GET` | Busca o(s) registro(s) cujo sobrenome contenha a sequência de caracteres informada. |

## ATENÇÃO

- Erros e validações personalizadas apenas para exemplo, serão incrementadas caso haja refatoração

