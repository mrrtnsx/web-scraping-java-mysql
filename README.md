# Web Scraping com Java, Jsoup e MySQL

Projeto desenvolvido para coletar dados de livros de um site e armazená-los em um banco de dados MySQL, aplicando conceitos de backend com Java.

---

## 🚀 Tecnologias

* Java 17
* Jsoup (Web Scraping)
* JDBC
* MySQL
* Maven

---

## 📌 Funcionalidades

* 🔎 Coleta automática de dados de produtos (livros)
* 📦 Extração de nome e preço
* 💾 Armazenamento em banco de dados
* 🧱 Estrutura organizada em camadas (program, entities, dao, db)

---

## 🏗 Estrutura do Projeto

```
com.meuprojeto
├── program       # Classe Main
├── entities      # Classe Produto
├── dao           # Acesso ao banco (ProdutoDAO)
├── db            # Conexão com o banco
```

---

## ⚙️ Como executar

### 1. Clonar o repositório

```
git clone https://github.com/mrrtnsx/web-scraping-java-mysql.git
```

---

### 2. Criar o banco de dados

Execute no MySQL:

```sql
CREATE DATABASE scraping;

USE scraping;

CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    preco VARCHAR(50)
);
```

---

### 3. Configurar variáveis de ambiente

Crie as variáveis:

```
DB_USER=root
DB_PASSWORD=1234
```

---

### 4. Executar

Rodar a classe `Main`.

---

## 🧠 Conceitos aplicados

* Web Scraping com Java
* Programação Orientada a Objetos (POO)
* Padrão DAO
* Integração com banco de dados
* Segurança com variáveis de ambiente

---

## 📷 Exemplo de saída

```
Livro: A Light in the Attic | Preço: £51.77
Livro: Tipping the Velvet | Preço: £53.74
```

---

## 💼 Objetivo

Projeto desenvolvido com foco em aprendizado prático de backend Java e preparação para oportunidades como desenvolvedor

---

## 👨‍💻 Autor

Diogo Martins
