# Cadastro de Usuários: Seu Primeiro CRUD com Spring Boot

Bem-vindo ao projeto **Cadastro de Usuários**! Este é um CRUD (Create, Read, Update, Delete) simples e eficaz, desenvolvido para demonstrar as operações básicas de gerenciamento de dados de usuários. Se você está começando no mundo do desenvolvimento web com Java e Spring Boot, este projeto é um excelente ponto de partida para entender como construir uma aplicação robusta e organizada.

## Sobre o Projeto

Este projeto foi criado com o objetivo de fornecer uma base sólida para quem deseja aprender a desenvolver aplicações de cadastro de usuários. Ele permite que você:

*   **Crie** novos usuários, adicionando suas informações ao sistema.
*   **Visualize** a lista de usuários existentes, com todos os detalhes.
*   **Atualize** os dados de usuários já cadastrados, corrigindo ou modificando informações.
*   **Exclua** usuários do sistema, mantendo a base de dados limpa e organizada.

É uma aplicação backend que expõe uma API RESTful para interagir com os dados dos usuários, utilizando um banco de dados em memória H2 para facilitar o desenvolvimento e os testes.

## Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias e ferramentas:

*   **Java 21:** A linguagem de programação principal, conhecida por sua robustez e portabilidade.
*   **Spring Boot 3.5.3:** Um framework poderoso que simplifica o desenvolvimento de aplicações Java, com foco em microserviços e APIs REST.
*   **Spring Data JPA:** Facilita a interação com bancos de dados, abstraindo a complexidade do JDBC e do Hibernate.
*   **Spring Web:** Módulo do Spring para construir aplicações web, incluindo APIs RESTful.
*   **H2 Database:** Um banco de dados relacional em memória, ideal para desenvolvimento e testes, pois não requer instalação prévia.
*   **Lombok:** Uma biblioteca que reduz a verbosidade do código Java, gerando automaticamente getters, setters, construtores, etc.
*   **Maven:** Uma ferramenta de automação de build e gerenciamento de dependências para projetos Java.




## Como Instalar e Rodar o Projeto

Para colocar este projeto em funcionamento na sua máquina, siga os passos abaixo:

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

*   **Java Development Kit (JDK) 21** ou superior.
*   **Maven** (geralmente já vem com algumas IDEs, como o IntelliJ IDEA, ou pode ser instalado separadamente).
*   Uma IDE (Ambiente de Desenvolvimento Integrado) de sua preferência, como IntelliJ IDEA, Eclipse ou VS Code com as extensões Java apropriadas.

### Passos para Configuração

1.  **Clone o Repositório:**
    Se este projeto estiver em um repositório Git, clone-o para sua máquina local. Caso contrário, descompacte o arquivo ZIP em um diretório de sua escolha.

    ```bash
    git clone <URL_DO_REPOSITORIO>
    cd Cadastro-Usuario
    ```

2.  **Navegue até o Diretório do Projeto:**
    Certifique-se de estar no diretório raiz do projeto `Cadastro-Usuario` (onde o arquivo `pom.xml` está localizado).

3.  **Construa o Projeto com Maven:**
    Abra o terminal ou prompt de comando no diretório do projeto e execute o seguinte comando para construir o projeto e baixar as dependências:

    ```bash
    mvn clean install
    ```

4.  **Execute a Aplicação:**
    Após a construção bem-sucedida, você pode executar a aplicação Spring Boot. Existem algumas maneiras de fazer isso:

    *   **Via Maven:**
        ```bash
        mvn spring-boot:run
        ```

    *   **Via IDE:**
        Abra o projeto na sua IDE (IntelliJ IDEA, Eclipse, etc.). Localize a classe principal `CadastroUsuarioApplication.java` (geralmente em `src/main/java/com/devhiago/Cadastro_Usuario/`) e execute-a como uma aplicação Java (clicando com o botão direito e selecionando 


 'Run' ou 'Debug').

    A aplicação será iniciada e estará disponível em `http://localhost:8080`.




## Como Usar o Projeto

Este projeto expõe uma API RESTful para gerenciar usuários. Você pode interagir com ela usando ferramentas como Postman, Insomnia, ou cURL. Abaixo estão os endpoints disponíveis:

### Endpoints da API

*   **Criar um novo usuário (POST)**
    *   **URL:** `/usuario`
    *   **Método:** `POST`
    *   **Corpo da Requisição (JSON):**
        ```json
        {
            "nome": "Nome do Usuário",
            "email": "email@example.com",
            "senha": "sua_senha"
        }
        ```
    *   **Exemplo cURL:**
        ```bash
        curl -X POST -H "Content-Type: application/json" -d '{"nome": "João Silva", "email": "joao.silva@example.com", "senha": "senha123"}' http://localhost:8080/usuario
        ```

*   **Buscar usuário por e-mail (GET)**
    *   **URL:** `/usuario?email={email}`
    *   **Método:** `GET`
    *   **Parâmetros de Query:**
        *   `email`: O e-mail do usuário a ser buscado.
    *   **Exemplo cURL:**
        ```bash
        curl -X GET "http://localhost:8080/usuario?email=joao.silva@example.com"
        ```

*   **Deletar usuário por e-mail (DELETE)**
    *   **URL:** `/usuario?email={email}`
    *   **Método:** `DELETE`
    *   **Parâmetros de Query:**
        *   `email`: O e-mail do usuário a ser deletado.
    *   **Exemplo cURL:**
        ```bash
        curl -X DELETE "http://localhost:8080/usuario?email=joao.silva@example.com"
        ```

*   **Atualizar usuário por ID (PUT)**
    *   **URL:** `/usuario?id={id}`
    *   **Método:** `PUT`
    *   **Parâmetros de Query:**
        *   `id`: O ID do usuário a ser atualizado.
    *   **Corpo da Requisição (JSON):**
        ```json
        {
            "nome": "Novo Nome",
            "email": "novo.email@example.com",
            "senha": "nova_senha"
        }
        ```
    *   **Exemplo cURL:**
        ```bash
        curl -X PUT -H "Content-Type: application/json" -d '{"nome": "Maria Souza", "email": "maria.souza@example.com", "senha": "nova_senha456"}' "http://localhost:8080/usuario?id=1"
        ```
