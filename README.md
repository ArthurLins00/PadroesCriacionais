# Atividade: Padrões de Projeto Criacionais

**Instituição:** CESAR School  
**Curso:** Análise e Desenvolvimento de Sistemas  
**Disciplina:** Requisitos, Projeto de Software e Validação  
**Professor(a):** Hayanna Silva Oliveira

O projeto demonstra a aplicação prática dos padrões Singleton e Factory Method utilizando a linguagem Java e a IDE Eclipse.

## 📌 Padrões Implementados

### 1. Singleton (Carrinho de Compras)
* **O que resolve:** Garante que o sistema utilize uma única instância do carrinho de compras durante toda a execução, evitando que produtos sejam perdidos entre diferentes telas ou classes.
* **Implementação:** Foi utilizado um construtor privado e um método estático `getInstancia()` para controlar o acesso à instância única na memória.

### 2. Factory Method (Processamento de Pagamentos)
* **O que resolve:** Desacopla a lógica de criação dos métodos de pagamento (Pix, Boleto, etc.) do código principal. Isso permite adicionar novas formas de pagamento no futuro sem precisar alterar a classe `Principal`.
* **Implementação:** Foi criada uma interface `MetodoPagamento` e uma classe `PagamentoFactory` que decide qual objeto instanciar com base no tipo solicitado.

## 🛠️ Tecnologias
* Java 21
* IDE Eclipse
* Git/GitHub
