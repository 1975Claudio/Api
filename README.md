# ⚖️ Sistema de Criação de Peças Processuais com Agentes de IA 🚀

Bem-vindo ao **Sistema de Criação de Peças Processuais**! Este projeto utiliza o **Google Gemini** para criar peças processuais jurídicas (como Recursos Especiais para o STJ) com base em temas jurídicos fornecidos pelo usuário. Ele é composto por **quatro agentes de IA** que trabalham juntos para buscar teses, planejar, redigir e revisar a peça final. Tudo isso com um toque de emojis para tornar o processo mais divertido! 😄

---

## 🎯 Objetivo do Projeto

Este sistema simula um ministro do STJ com assessores, automatizando a criação de peças processuais com base em jurisprudência recente. Ele é ideal para:
- Advogados que querem prototipar peças rapidamente 📜
- Estudantes de Direito explorando jurisprudência ⚖️
- Desenvolvedores interessados em IA aplicada ao Direito 🧑‍💻

---

## 🛠️ Como Funciona

O sistema é composto por **quatro agentes** que trabalham em sequência:

1. **🔍 Agente Buscador**: Pesquisa 10 teses jurídicas recentes (2024) no STJ usando a ferramenta de busca do Google Gemini.
2. **🧠 Agente Planejador**: Seleciona as 3 teses mais relevantes e aplicáveis para o caso.
3. **✍️ Agente Redator**: Redige uma peça processual (Recurso Especial) com linguagem jurídica formal.
4. **🔎 Agente Criador**: Revisa a peça, corrigindo erros e ajustando detalhes.

📅 **Data dinâmica**: A peça inclui a data atual (ex.: 17/05/2025) e é formatada para o STJ.

---

## 📋 Pré-requisitos

- 🐍 Python 3.7+ (recomendado no Google Colab)
- 🔑 Chave da API do Google Gemini (obtenha em [Google AI Studio](https://aistudio.google.com/))
- 📦 Bibliotecas Python:
  - `google-generativeai`
  - `IPython`

---

## 🚀 Instalação

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/1975Claudio/Api/blob/main/Imers%C3%A3o_IA_Alura_Projeto_Agentes_Advocacia.ipynb
