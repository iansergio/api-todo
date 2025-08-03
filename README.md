## Lista de tarefas (todos list) CRUD

Praticando API's Rest com o tema de gerenciamento de tarefas.

### Tecnologias
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI](https://springdoc.org/#getting-started)
- [MySQL](https://dev.mysql.com/downloads/)
- Swagger 
  - Acesso disponível em: [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Endpoints
#### **CREATE** 
### [insertTodo](http://localhost:8080/todos)
```
http POST :8080/todos name="Lembrar de ir ao mercado" description="Comprar carne" priority=0
```

---

#### **READ** 
### [getAllTodos](http://localhost:8080/todos)
```
http GET :8080/todos
```  

---

### [getTodoById](http://localhost:8080/todos/1) 
```
http GET :8080/todos/1
```

---

#### **UPDATE** 
### [updateTodo](http://localhost:8080/todos)
```
http PUT :8080/todos id="1" name="Lembrar de ir ao mercado" description="Comprar carne e sabonete" priority="0" completed="false"
```

---

#### **DELETE** 
### [deleteTodo](http://localhost:8080/todos26)
```
http DELETE :8080/todos/1
```