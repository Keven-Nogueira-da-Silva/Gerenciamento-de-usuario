# 🗓️ Sistema de Reservas com Spring Boot

Este é um sistema de autenticação e gerenciamento de reservas desenvolvido em **Java com Spring Boot**, utilizando arquitetura em camadas e autenticação com Spring Security (Basic Auth).

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Security
- Spring Data JPA
- Hibernate
- H2 Database (ou MySQL/PostgreSQL)
- Maven

---

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── reservas.com.Sistema_de_reservas/
│   │       ├── controller/      # Controladores REST
│   │       ├── dto/             # Objetos de transferência
│   │       ├── model/           # Entidades JPA
│   │       ├── repository/      # Repositórios (JPA)
│   │       ├── service/         # Regras de negócio
│   │       └── config/          # Segurança e configuração
│   └── resources/
│       ├── application.properties
│       └── static/ e templates/ (caso use frontend)
```

---

## 🔧 Configuração `application.properties`

```properties
spring.application.name=Sistema-de-reservas
server.port=8080

# H2 (padrão)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---

## 🔐 Funcionalidades

- ✅ Registro de usuários
- ✅ Autenticação (Basic Auth)
- ✅ Segurança com Spring Security
- ✅ Senhas criptografadas (BCrypt)
- 🔜 CRUD de Reservas
- 🔜 Integração com JWT

---

## 🧪 Testes com Postman

### 1. Registrar Usuário

**POST** `http://localhost:8080/auth/registrar`  
**Body (JSON):**

```json
{
  "username": "keven",
  "password": "1234"
}
```

---

### 2. Acessar Rota Protegida

**GET** `http://localhost:8080/user/teste`  
- Vá na aba **Authorization**
- Tipo: **Basic Auth**
- Username: `keven`
- Password: `1234`

Se autenticado com sucesso, você verá a resposta da rota protegida.

---

## ✅ Endpoints

| Método | Endpoint              | Autenticação | Descrição                    |
|--------|------------------------|--------------|------------------------------|
| POST   | `/auth/registrar`      | ❌           | Registro de novo usuário     |
| GET    | `/user/teste`          | ✅ BasicAuth | Teste de rota protegida      |

---

## 📦 Executando o Projeto

```bash
# Clone o projeto
git clone https://github.com/seu-usuario/sistema-de-reservas.git

# Acesse a pasta
cd sistema-de-reservas

# Execute com Maven
./mvnw spring-boot:run
```

Abra o navegador ou Postman:  
👉 `http://localhost:8080`

---

## 🧩 Possibilidades Futuras

- 🔒 JWT (JSON Web Token)
- 📅 CRUD completo de Reservas
- 📊 Painel administrativo
- 📱 Front-end com React ou Thymeleaf
- 🧪 Testes com JUnit e Mockito

---

## 👨‍💻 Autor

**Keven Nogueira da Silva**  
📍 Duque de Caxias, RJ  
🔗 [LinkedIn](https://www.linkedin.com/in/keven-nogueira-da-silva-44237b361/)

---

## 📝 Licença

Este projeto está licenciado sob a Licença MIT.
