# TarefaFlow - Gerenciador de Tarefas 🚧 *Em Desenvolvimento*

## Descrição
TaskFlow é um sistema de gerenciamento de tarefas simples e eficiente, criado para ajudar no planejamento do dia a dia. O programa roda no terminal e permite adicionar, listar e remover tarefas, além de organizar as tarefas por status.

⚠️ **Este projeto ainda está em desenvolvimento e novas funcionalidades estão sendo implementadas.**

## Funcionalidades
- ✅ Adicionar uma nova tarefa com prazo e status.
- 📋 Listar todas as tarefas cadastradas.
- ❌ Remover tarefas pelo nome.
- 🔄 Atualizar status de tarefas (To Do, Doing, Done).
- 💾 Salvar tarefas no banco de dados MySQL para persistência.

## Tecnologias Utilizadas
- 🟡 **Java** (versão 17 ou superior)
- 🛢 **MySQL** (para armazenamento das tarefas)
- 🔗 **JDBC** (para conexão com o banco de dados)
- 🗂 **Git** (para controle de versão)

## Como Rodar o Projeto
### 1. Clone o Repositório
```bash
git clone <URL_DO_REPOSITORIO>
cd TaskFlow
```

### 2. Configure o Banco de Dados
- Instale o MySQL
- Crie um banco de dados chamado `taskflow_db`
- Crie a tabela inicial:
```sql
CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    nome TEXT UNIQUE NOT NULL,
    prazo INT NOT NULL,
    status TEXT NOT NULL
);
```

### 3. Compile e Execute
```bash
javac TaskFlow.java
java TaskFlow
```

## Melhorias Futuras 🚀
- [ ] Implementar interface gráfica.
- [ ] Permitir edição de tarefas.
- [ ] Criar filtro por data.

## Autor
- **Diego Vinícius Duarte Cavalcante** - Desenvolvedor Backend

