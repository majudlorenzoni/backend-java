
## Como Executar

1. Clone o repositório
2. Execute `mvn clean install` para compilar o projeto
3. Execute `mvn spring-boot:run` para iniciar a aplicação

## Endpoints da API

- `POST/api/tasks` - Cria uma nova tarefa
- `GET /api/tasks` - Retorna todas as tarefas
- `GET /api/tasks/{id}` - Retorna uma tarefa por ID
- `PUT /api/tasks/{id}` - Atualiza uma tarefa existente por ID
- `DELETE /api/tasks/{id}` - Deleta uma tarefa por ID

## Documentação da API

A documentação da API está disponível em `http://localhost:8080/swagger-ui.html` após iniciar a aplicação.

## Deploy no Railway

1. Crie uma conta no [Railway](https://railway.app/) e inicie um novo projeto.
2. Conecte seu repositório GitHub ao Railway.
3. Configure as variáveis de ambiente, se necessário.
4. Faça o deploy diretamente da interface do Railway.

## Contribuições

Sinta-se à vontade para abrir issues e pull requests. Todas as contribuições são bem-vindas!

## Licença

Este projeto está licenciado sob a Licença MIT.

