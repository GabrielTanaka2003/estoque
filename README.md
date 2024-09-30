# Projeto de ESTOQUE

## REST API com Java 17, Spring Boot e Docker

Este projeto é uma API REST desenvolvida em **Java 17** usando **Spring Boot** e empacotada em um container **Docker**, utilizando **Postgres** como base de dados.

A ideia para o desenvolvimento desse sistema de estoque surgiu a partir de um trabalho acadêmico. O projeto inclui tanto o back-end (API) quanto o front-end, desenvolvido em **React**. Você pode acessar o código do front-end através deste [repositório](https://github.com/GabrielTanaka2003/front-end-estoque).

## Tecnologias Utilizadas no Back-end

- **Java 17**: A versão mais recente do Java, com melhorias de desempenho e novas funcionalidades.
- **Spring Boot**: Framework que facilita a criação de aplicações Java e APIs REST.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional, utilizado para armazenar os dados.
- **Maven**: Ferramenta para gerenciamento de dependências e automação de builds.
- **Docker**: Utilizado para containerizar a aplicação, garantindo portabilidade e consistência no ambiente de execução.

## Requisitos

Certifique-se de que os seguintes softwares estão instalados na sua máquina:

- [Java 17](https://www.oracle.com/pt/java/technologies/downloads/#java17)
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://www.docker.com/get-started)

## Configuração do Projeto

### 1. Clonar o Repositório

Clone o repositório do projeto para a sua máquina local:

```bash
git clone https://github.com/GabrielTanaka2003/estoque
cd estoque
```

### 2. Baixar as Dependências do Projeto

Após clonar o repositório, é necessário baixar as dependências com o Maven e preparar a aplicação para ser executada no Docker.

Execute os seguintes comandos:

```bash
mvn clean install
docker build -t estoque_api .
docker-compose up -d
```

A API estará disponível em http://localhost:8080, e o banco de dados PostgreSQL estará rodando no container configurado pelo Docker Compose.

### 3. Conectar com o Front-end

Agora que o back-end está rodando, você pode integrá-lo com o [front-end](https://github.com/GabrielTanaka2003/front-end-estoque), que foi desenvolvido em React. Siga as instruções no repositório do front-end para configurar e iniciar a interface da aplicação.

## Contribuições

Contribuições são bem-vindas! Se você deseja sugerir melhorias ou correções, fique à vontade para abrir um pull request.

## Licença

Este projeto está licenciado sob a MIT License.