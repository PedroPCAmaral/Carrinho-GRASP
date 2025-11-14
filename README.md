# Carrinho-GRASP
Sobre o Projeto  Este projeto demonstra, de forma clara e prática, como aplicar os padrões GRASP em um sistema orientado a objetos. O sistema simula um carrinho de compras de console, com responsabilidades separadas, baixos níveis de acoplamento e alta coesão entre classes.  A estrutura foi construída com base em boas práticas de design.

🛒 Carrinho de Compras — Aplicação Java com Padrões GRASP
Projeto didático com arquitetura limpa, responsabilidade bem definida e código profissional.

📘 Sobre o Projeto

Este projeto demonstra, de forma clara e prática, como aplicar os padrões GRASP em um sistema orientado a objetos.
O sistema simula um carrinho de compras de console, com responsabilidades separadas, baixos níveis de acoplamento e alta coesão entre classes.

A estrutura foi construída com base em boas práticas de design, seguindo uma organização inspirada no padrão MVC.

🧩 Pilares do Projeto

✔️ Código limpo e organizado

✔️ Aplicação real dos padrões GRASP

✔️ Arquitetura de responsabilidades bem distribuídas

✔️ Classes altamente coesas

✔️ Baixo acoplamento entre View, Controller e Model

✔️ Projeto ideal para estudos, apresentações e portfólio

🧠 Padrões GRASP Implementados
Padrão GRASP	Onde Foi Aplicado	Descrição
Controller	CarrinhoController	Media a comunicação entre view e modelos.
Information Expert	CarrinhoDeCompras, ItemPedido	Quem tem a informação executa a ação.
Creator	CarrinhoDeCompras	Cria instâncias de ItemPedido.
High Cohesion	Todo o Model	Cada classe faz apenas sua responsabilidade.
🏗 Arquitetura do Sistema
📂 carrinho_grasp
 ├── Main.java                    → Interface com o usuário (View)
 ├── CarrinhoController.java      → Controlador da aplicação
 ├── CarrinhoDeCompras.java       → Gerenciador do carrinho (Model)
 ├── ItemPedido.java              → Item de compra (Model)
 └── Produto.java                 → Estrutura do produto (Model)

🛠 Tecnologias Utilizadas
Tecnologia	Uso
Java 17+	Linguagem principal do projeto
Arquitetura GRASP	Estruturação de responsabilidades
Paradigma OO	Base do design
Console Application	Interação simples e direta
▶️ Como Executar o Projeto
1. Compile
javac *.java

2. Execute
java Main

📌 Exemplo de Execução
==== Itens no Carrinho ====
Mouse Gamer | Qtd: 2 | Subtotal: R$ 300.0
Teclado Mecânico | Qtd: 1 | Subtotal: R$ 320.0
Monitor 24" | Qtd: 1 | Subtotal: R$ 900.0
===========================
Total da compra: R$ 1520.0

📚 Explicação dos Modelos
🛒 CarrinhoDeCompras

Adiciona itens

Calcula o total

Criador de ItemPedido (Creator)

📦 ItemPedido

Armazena quantidade

Calcula o subtotal (preço × quantidade)

Especialista na Informação (Information Expert)

💰 Produto

Guarda nome e preço

Simples, coeso e reutilizável

🎮 CarrinhoController

Recebe comandos da Main

Orquestra ações do sistema

Controller (GRASP Controller)

👤 Main

Simula interação do usuário

Chama métodos do controller

🧱 Diagrama de Classes (conceitual)
Main → CarrinhoController → CarrinhoDeCompras → ItemPedido → Produto

Projeto desenvolvido com foco em arquitetura limpa e boas práticas.
