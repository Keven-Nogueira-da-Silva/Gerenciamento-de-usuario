```markdown
# 📋 Projeto API de Usuários - Spring Boot

Este projeto é uma API RESTful desenvolvida com **Java 17** e **Spring Boot**, com funcionalidades completas de cadastro, listagem, atualização e remoção de usuários. Ideal para aprender e demonstrar domínio de CRUD com boas práticas de desenvolvimento.

---

## 🧰 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (banco de dados em memória para testes)
- Lombok (anotações para reduzir boilerplate)
- Swagger (documentação interativa da API)
- JUnit (testes unitários)

---

## 📁 Estrutura de Pastas

```bash
src/
├── main/
│   ├── java/
│   │   └── com.keven.usuarioapi/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── UsuarioApiApplication.java
│   └── resources/
│       └── application.properties
```

---

## ▶️ Como Rodar o Projeto

### ✅ Pré-requisitos
- Java 17 instalado
- Maven instalado
- IDE (IntelliJ, VSCode ou Eclipse)

### 🔧 Passos para rodar
1. Clone este repositório:
   ```bash
   git clone https://github.com/SeuUsuario/usuario-api.git
   ```

2. Navegue até o diretório:
   ```bash
   cd usuario-api
   ```

3. Rode o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse o Swagger:
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

---

## 📮 Endpoints da API

| Método | Endpoint           | Descrição                 |
|--------|--------------------|---------------------------|
| GET    | `/usuarios`        | Lista todos os usuários   |
| GET    | `/usuarios/{id}`   | Retorna um usuário por ID |
| POST   | `/usuarios`        | Cria um novo usuário      |
| PUT    | `/usuarios/{id}`   | Atualiza um usuário       |
| DELETE | `/usuarios/{id}`   | Remove um usuário         |

---

## 🧪 Testando com Postman

Você pode testar os endpoints diretamente no Postman ou no Swagger.

### Exemplo de corpo para POST:
```json
{
  "nome": "Keven",
  "email": "keven@email.com"
}
```

---

## 🧠 Aprendizados

- Estrutura de projeto Spring Boot
- Criação de REST APIs
- Boas práticas com camadas (Controller, Service, Repository)
- Testes com JUnit
- Integração com Swagger
- Uso do banco H2 para facilitar o desenvolvimento e testes

---

## 📌 Observações

- O projeto usa banco H2 em memória, portanto os dados são apagados ao reiniciar.
- Pode ser facilmente adaptado para MySQL, PostgreSQL, etc.

---
```
