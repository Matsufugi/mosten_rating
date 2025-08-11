<p align="center">
  <img src="assets/Vem-ser-Mosten.webp" alt="Banner Mosten" width="700" />
</p>

# 🎬 Sistema de Votação de Filmes e Séries

Este projeto é uma API REST desenvolvida em **Java** com **Spring Boot** e **PostgreSQL** que permite o cadastro de filmes/séries e o registro de votos positivos e negativos. Os dados são persistidos no banco de dados e é possível visualizar o total de votos por item e no geral.

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

***Clonar o repositório***
```
git clone https://github.com/matsufugi/votacao-filmes.git
```
***Acessar a pasta***

```
cd votacao-filmes
```
***Instalar dependências***
```
mvn install
```
***Rodar a aplicação***
```
mvn spring-boot:run
```

#A API estará disponível em:

http://localhost:8080

📮 Testes no Postman

https://www.postman.com/

📌 Endpoints Principais

1️⃣ Cadastrar Filme
POST /filmes
```
{
    "titulo": "O Senhor dos Anéis",
    "tipo": "filme"
}
```
2️⃣ Listar Filmes
GET
```
http://localhost:8080/movies
```

3️⃣ Votar Positivo
POST 
```
http://localhost:8080/movies/votar/1?positivo=true
```

4️⃣ Votar Negativo
POST
```
http://localhost:8080/movies/votar/1?positivo=false
```

5️⃣ Total de Votos
GET
```
http://localhost:8080/movies/total-votos
```
5️⃣ Exibir total de votos mais média das notas
GET
```
http://localhost:8080/movies/medias
```

<h3 align="left">Language and tools</h3>

<a><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java" width="40" height="40"/></a>
<a><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="Spring Boot" width="40" height="40"/></a>
<a><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postman/postman-original.svg" alt="Postman" width="40" height="40"/></a>
<a><img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original.svg" alt="PostgreSQL" width="40" height="40"/></a>


🖋 Autor
Desenvolvido por ***Matheus Alves*** 🚀






