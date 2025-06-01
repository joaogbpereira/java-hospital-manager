# 🏥 Hospital Database – Java + MySQL

Este projeto é um sistema simples de gerenciamento de pacientes em hospitais, desenvolvido em **Java** com conexão ao **MySQL**.

Ele permite que profissionais de saúde:
- Cadastrem pacientes com prioridade médica.
- Listem pacientes ordenados por prioridade de atendimento.

---

## 📁 Estrutura do Projeto

hospital-database/
├── src/
│ ├── dao/ # Conexão com banco de dados
│ │ └── Conexao.java
│ ├── controller/ # Lógica de negócio
│ │ ├── CadastrarPaciente.java
│ │ └── Lista_prioridade.java
│ └── Main.java # Entrada do programa
├── sql/
│ └── banco.sql # Script de criação do banco e da tabela
├── .gitignore # Arquivos a serem ignorados no Git
└── README.md # Este arquivo


---

## ⚙️ Requisitos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [MySQL](https://dev.mysql.com/downloads/)
- IDE como [VS Code](https://code.visualstudio.com/) (opcional)

---

## 🧪 Banco de Dados

### 1. Crie o banco com o script:

Abra seu MySQL e execute o conteúdo do arquivo `sql/banco.sql`:

```sql
CREATE DATABASE IF NOT EXISTS hospital;
USE hospital;

CREATE TABLE IF NOT EXISTS pacientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(14) UNIQUE,
    data_admissao DATE,
    prioridade INT
);

Atualize seu usuário e senha do MySQL no arquivo:
DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "sua_senha");

PASSO A PASSO - 

1. Compile o projeto: javac -d bin src/**/*.java

2. Execute a aplicação: java -cp bin Main

🧭 Funcionalidades

    📌 Cadastro de pacientes

    ⚠️ Ordenação por prioridade

    📄 Listagem com nome, CPF e data de admissão

    📚 Pronto para expandir com histórico e busca por CPF

🚀 Próximos Passos (opcional)

    ✅ Buscar paciente por CPF

    ✅ Adicionar histórico clínico por paciente

    ✅ Interface gráfica com JavaFX ou Swing

    ✅ Integração com prontuários digitais


Desenvolvido por joão Gabriel 
💬 Para dúvidas ou sugestões, sinta-se à vontade para abrir uma issue ou fork no repositório.

Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.