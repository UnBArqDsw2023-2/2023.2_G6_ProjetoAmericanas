# 3.1 Strategy

## Introdução
O strategy sugere que seja pega uma classe que faz algo específico de maneiras diferentes e extrai todos esses algoritimos para classes separadas chamadas estratégias. 
Este padrão de projeto será utilizado para implementar os diferentes tipos de reembolso disponíveis na Americanas.

<div align = "center">

![](../Assets/PadroesProjeto/.png)  
</div>
<h6 align = "center">Figura 1: Diagrama UML Strategy <br>Fonte: [1] Refactoring Guru</h6>

## Objetivo
O objetivo principal do strategy é permitir a utilização de diferentes variantes de um algorítimo dentro de um objeto, ser capaz de trocar de um algorítimo para outro durante a execução, 
bem como a generalização de classes muito parecida que diferem apenas na forma como elas executam um comportamento expecifico.
Este padrão de projeto também permite o isolamento do código melhorando consequentemente a organização, modularização, compreeção e capacidade de futuras expançoes e alterações caso seja necessário, por exemplo a criação de um novo método de devolução de pagamento.  


## Implementação
A implementação do padrão de projeto foi realizada usando a linguagem Java e criando uma abstração de como funcionaria no sistema da Lojas Americanas. 

### Diagrama UML
Modelagem utilizando a ferramenta [drawio](https://www.drawio.com)
