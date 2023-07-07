<div>
    <h1 align="center">Cobrança de Condomínios</h1>
    <h6 align="center">Controle de Boletos para Condomínios</h6>
</div>
<br><br>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Temgi/CobrancaCondominio/blob/main/LICENSE) 

<p align="center">
<img src="https://img.shields.io/badge/STATUS-completo-blue?style=for-the-badge">
</p>

## 🧠 Sobre o Projeto
<p>A Aplicação foi Construída a partir da necessidade de uma Tia que é Síndica no Condomínio onde mora em São Paulo, na qual ela tinha muita Dificuldade e pouca Praticidade para Controlar os Boletos Pagos ou em Aberto pelos Moradores do Edifício. O Software utiliza uma Interface Mobile/Web para Inclusão e Pesquisa de Títulos, conta com Recursos como Componente de Mensagem, Validação de Campos, Pesquisa, Inclusão, Edição, Exclusão de Boletos, Componente de Calendário e Modal de Exclusão. Resolvendo a Questão de quais Pagamentos já foram Efetuados pelos Condôminos e por ser Totalmente Responsivo pode ser Utilizados tanto em Plataformas Android como IPhone.</p> 

<a href="http://app-java.ddns.net:8083/cobranca/titulos" target="_blank" rel="noopener">Link do Projeto para Acesso Online</a>

## 📗 Sumário

* [Interface Web](#-interface-web)
* [Layout Mobile](#-layout-mobile)
* [Features](#%EF%B8%8F-features)
* [Modal Diálogo](#-modal-de-diálogo)
* [Estrutura de Classes](#-estrutura-de-classes)
* [Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [Validação de Dados](#-validação-de-dados) 
* [Como Executar o Projeto](#-como-executar-o-projeto)
* [Autor](#-autor)

## 💻 Interface Web
<br>

![Layout Web](https://github.com/Temgi/CobrancaCondominio/blob/main/assets/LayoutWeb2.png)

## 🎨 Layout Mobile
<br>

![Mobile 1](https://github.com/Temgi/CobrancaCondominio/blob/main/assets/Mobile1.png) ![Mobile 2](https://github.com/Temgi/CobrancaCondominio/blob/main/assets/Mobile2.png)

## ⚙️ Features

- [x] Inclusão de Boletos
- [x] Botões para Manipulação de Registros
- [x] Componente de Messagem
- [x] Validação de Campos
- [x] Pesquisa de Boletos
- [x] Atualização de Status
- [x] Exclusão de Boletos
- [x] App Mobile Responsivo
- [x] Componente de Calendário
- [x] Modal de Exclusão

## 💡 Modal de Diálogo
<br>

![Modal 1](https://github.com/Temgi/CobrancaCondominio/blob/main/assets/Modal.png)

## 🎯 Estrutura de Classes
<br>

![Estrutura de Classes](https://github.com/Temgi/CobrancaCondominio/blob/main/assets/EstruturaClasses.png)

## 🚀 Tecnologias Utilizadas:
### Back-End
<ul>
        <li> Java 11</li>
        <li> Spring MVC</li>
        <li> Spring Data JPA</li>
        <li>Spring Boot Devtools</li>
        <li> Thymeleaf</li>
        <li> Maven</li>
        <li> Apache TomCat</li>
        <li> JPA-Hibernate</li>
        <li>Bean Validation</li>
        <li>MySQL</li>
</ul>

### Front-End
<ul>
        <li>HTML 5</li>
        <li>BootStrap</li>
        <li>AJAX</li>
        <li>JQuery</li>
</ul>

## 🔥 Validação de Dados
A Aplicação Utiliza a API de Bean Validation para Validação de Entrada de Dados.
<br>

![API Bean Validation](https://github.com/Temgi/CobrancaCondominio/blob/main/assets/Validacao.png)

## 🏁 Como Executar o Projeto

### Instalações
1-Baixar e Instalar o Java-JDK no Link Abaixo:
<br>
https://www.oracle.com/br/java/technologies/javase/javase8-archive-downloads.html
<br><br>
2-Configurar Variáveis de Ambiente do Java-JDK Conforme Link Abaixo:
<br>
https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-instalacao-do-java
<br><br>
3-Baixar e Instalar o MySQL Seguindo os Links Abaixo:
<br>
https://dev.mysql.com/downloads/windows/installer/8.0.html
<br>
https://www.alura.com.br/artigos/mysql-do-download-e-instalacao-ate-sua-primeira-tabela
<br><br>

### Configuração Banco de Dados
1-Script SQL para Criação do Banco de Dados
~~~sql
CREATE SCHEMA `cobranca`;
~~~
<br>

2-Script SQL para Popular Tabela TITULO
~~~sql
INSERT INTO titulo(codigo, data_vencimento, descricao, status, valor)
VALUES(1, '2023-01-25', 'Condomínio Apto 501', 'RECEBIDO', 300);

INSERT INTO titulo(codigo, data_vencimento, descricao, status, valor)
VALUES(2, '2023-02-26', 'Condomínio Apto 502', 'PENDENTE', 550);

INSERT INTO titulo(codigo, data_vencimento, descricao, status, valor)
VALUES(3, '2023-03-27', 'Condomínio Apto 503', 'RECEBIDO', 430);

~~~
<br>

### Execução e Deploy do Projeto

```bash
# Clonar Repositório
git clone https://github.com/Temgi/CobrancaCondominio.git

# Executar o Projeto
- Baixar e Descompactar o Apache Maven apache-maven-3.8.4 no Unidade C:\
- Copiar o Endereço da Pasta [bin] no Caminho [C:\apache-maven-3.8.4\bin]
- Configurar as Variáveis de Ambiente para o Apache Maven apache-maven-3.8.4:

   Abra o Meu Computador no Windows(Win+E) / Botão Direito dentro de Meu Computador e Selecione [Propriedades] /
   Click no lado Esquerdo em [Configurações Avançadas de Sistema]  / Na Aba [Avançado], clique na Parte Inferior
   em [Variáveis de Ambiente]  / Em [Variáveis de Sistema] Click em [Novo] / No Campo [Nome da Variável] digite
   [MAVEN_HOME] / No Campo [Valor da Variável] digite [C:\apache-maven-3.8.4] e Click OK / Selecione na Lista o
   Item [PATH] e Click em [Editar] / Click em [Novo] digite [%MAVEN_HOME%\bin] / Click em OK - OK - OK. Abra o
   Executar no Windows com [Win+R] digite [cmd], no Prompt de Comando digite o comando [mvn -version]

- Acessar no Prompt de Comando o Caminho da Pasta [target] do Projeto [CobrancaCondominio]
- No Prompt Executar o Comando [java -jar Cobranca.jar]
- Acessar no Chrome o Endereço: [http://localhost:8083/cobranca/titulos]
```

## 📝 **Autor**

<table>
<tr>
<td align="center"><a href="https://github.com/Temgi"><img style="border-radius: 10%;" src="https://avatars.githubusercontent.com/u/8334174?v=4" width="80px;" alt="Foto de Rui Temgi Saraiva Azevedo no GitHub"/></a><br /></td>
</tr>
</table>

Rui Azevedo
<br>
Contatos:  <a href="https://www.linkedin.com/in/devruiazevedo/">LinkedIn</a> - <a href="https://wa.me/5511971973505?text=Olá.%20Estou%20Entrando%20em%20Contato%20a%20partir%20do%20Portfólio%20no%20GitHub.">WhatsApp</a> - <a href="#"> ruisaraivasp@gmail.com</a>













