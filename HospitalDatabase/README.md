# 🏥 MediTrack – Hospital Database Manager (Java + MySQL)

**MediTrack** é um sistema simples de gerenciamento de pacientes em hospitais, desenvolvido em **Java** com conexão ao **MySQL**.

Ele permite que profissionais de saúde:
- Cadastrem pacientes com prioridade médica.
- Listem pacientes ordenados por prioridade de atendimento.

---

## 📁 Estrutura do Projeto

```
HospitalDatabase/
├── bin/                      # Arquivos compilados (IGNORADO no Git)
├── sql/
│   └── banco.sql             # Script para criar banco e tabela
├── src/
│   ├── dao/                  # Conexão com o banco de dados
│   ├── controller/           # Lógica de negócio (cadastro, listagem)
│   └── Main.java             # Ponto de entrada da aplicação
├── executar_projeto.bat      # Script para compilar e rodar no Windows
├── .gitignore
└── LICENSE
```

---

## 🧰 Pré-requisitos

- Java JDK 8+ (idealmente Java 17 ou mais recente)
- MySQL Server
- VS Code (opcional)

---

## ⚙️ Como Compilar e Rodar

### 📌 Compilar
```bash
javac --release 8 -d bin src\Main.java src\dao\Conexao.java src\controller\CadastrarPaciente.java src\controller\Lista_prioridade.java
```

### ▶️ Executar
```bash
java -cp bin Main
```

Ou apenas **execute o arquivo `executar_projeto.bat`** no Windows.

---

## 🧪 Banco de Dados

No MySQL:

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
```

---

## ❌ Ignorados no Git

O projeto já inclui `.gitignore` para evitar arquivos desnecessários no repositório, como:

```gitignore
/bin/
*.class
```

---

## 👨‍⚕️ Autor

Desenvolvido por João Gabriel (@joaogbpereira) para fins educacionais.

---

## 📄 Licença

Distribuído sob licença MIT. Veja o arquivo `LICENSE`.
