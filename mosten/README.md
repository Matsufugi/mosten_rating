# 🎬 Sistema de Votação de Filmes e Séries

Este projeto é uma API REST desenvolvida em **Java** com **Spring Boot** e **PostgreSQL** que permite o cadastro de filmes/séries e o registro de votos positivos e negativos.  
Os dados são persistidos no banco de dados e é possível visualizar o total de votos por item e no geral.

---

## 🚀 Funcionalidades
- 📌 **Cadastrar filmes ou séries**
- 👍 **Votar positivamente**
- 👎 **Votar negativamente**
- 📊 **Listar todos os filmes com seus votos**
- 🔢 **Exibir total de votos no sistema**
- 📈 **Consultar média de votos por filme (opcional)**

---

## 🛠 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **PostgreSQL**
- **Postman** (para testes)
- **Maven**

---


▶️ Como Rodar o Projeto
Clonar o repositório

git clone https://github.com/seuusuario/votacao-filmes.git
Acessar a pasta

cd votacao-filmes
Instalar dependências

mvn install
Rodar a aplicação

mvn spring-boot:run


#A API estará disponível em:

http://localhost:8080

📌 Endpoints Principais

1️⃣ Cadastrar Filme
POST /filmes

{
    "titulo": "O Senhor dos Anéis"
}

2️⃣ Listar Filmes
GET /filmes

3️⃣ Votar Positivo
POST /filmes/{id}/votar?positivo=true

4️⃣ Votar Negativo
POST /filmes/{id}/votar?positivo=false

5️⃣ Total de Votos
GET /filmes/total-votos

📮 Testes no Postman

🖋 Autor
Desenvolvido por Matheus Alves 🚀

