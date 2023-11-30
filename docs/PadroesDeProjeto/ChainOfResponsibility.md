# Chain of Responsibility - GoF Comportamental

## 1. Introdução
De acordo com [1], o Chain of Responsibility é um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de _handlers_. Ao receber um pedido, cada _handler_ decide se processa o pedido ou o passa adiante para o próximo _handler_ na corrente.

O padrão será aplicado para encaminhar as solicitações de troca ou devolução para o departamento específico, levando em consideração o motivo associado a cada solicitação.

<div align = "center">

![](../Assets/PadroesProjeto/chainResponse.png)  
</div>
<h6 align = "center">Figura 1: Exemplo de Diagrama UML Chain of responsability <br>Fonte: [1] Refactoring Guru</h6>

## 2. Objetivo

O objetivo principal de usar o padrão Chain of Responsibility é proporcionar uma maneira flexível e desacoplada de lidar com solicitações, permitindo que cada manipulador na cadeia decida se pode processar a solicitação ou a deve passar para o próximo manipulador. Isso promove a flexibilidade, a extensibilidade e a manutenção simplificada do código, facilitando a adição, remoção e modificação de manipuladores sem afetar o restante do sistema. O padrão é particularmente útil em cenários onde diferentes partes do sistema têm responsabilidades específicas e podem tratar diferentes tipos de solicitações.

Em essência, ao aplicar o Chain of Responsibility, estamos melhorando a organização do código, tornando-o mais flexível, fácil de estender, adaptável a mudanças e mais simples de manter, o que contribui para um design mais eficaz e sustentável do sistema.

## 3. Implementação
A implementação do padrão de projeto foi realizada usando a linguagem Java e criando uma abstração de como funcionaria no sistema da Lojas Americanas. 

### 3.1. Diagrama UML
Modelagem utilizando a ferramenta online [Lucidchart](https://www.lucidchart.com/pages/).

![](../Assets/PadroesProjeto/chainUml.png)
<h6 align = "center">Figura 2: Código dep. vendas. Fonte: Alex Gabriel</h6>

### 3.2. Código

A implementação pode ser encontrada na pasta Code/chain-of-responsability do repositório do projeto. 

#### 3.2.1 Interface do Handler.

![](../Assets/PadroesProjeto/chainHandler.png)
<h6 align = "center">Figura 3: Código Handler. Fonte: Alex Gabriel</h6>

#### 3.2.2. Requisição.

![](../Assets/PadroesProjeto/chainRequest.png)
<h6 align = "center">Figura 4: Código Requisição. Fonte: Alex Gabriel</h6>

#### 3.2.3. Handlers concretos.

##### 3.2.3.1. Departamento de vendas.
![](../Assets/PadroesProjeto/chainVendas.png)
<h6 align = "center">Figura 5: Código dep. vendas. Fonte: Alex Gabriel</h6>

##### 3.2.3.2 Departamento de qualidade.
![](../Assets/PadroesProjeto/chainQualidade.png)
<h6 align = "center">Figura 6: Código dep. qualidade. Fonte: Alex Gabriel</h6>

##### 3.2.3.3 Departamento de logística.
![](../Assets/PadroesProjeto/chainLogista.png)
<h6 align = "center">Figura 7: Código dep. logistica. Fonte: Alex Gabriel</h6>

##### 3.2.3.4 Departamento de atendimento ao cliente.
![](../Assets/PadroesProjeto/chainAtendimento.png)
<h6 align = "center">Figura 8: Código dep. vendas. Fonte: Alex Gabriel</h6>

## Referências

> [1] Refactoring Guru. **Chain of Responsibility**. Disponível em: https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility **Acesso em:** 29 nov. 2023.

> **Arquitetura e Desenho de Software - Aula GoFs Comportamentais**. Material de apoio em slides. Milene Serrano.

## Versionamento

| Versão | Alteração |  Responsável  | Revisor | Data de realização | Data de revisão |
| :------: | :---: | :-----: | :----: | :----: | :-----: |
| 1.0    | criação do documento, codigo e diagramas | Alex Gabriel | Matheus Costa | 29/11/2023| 29/11/2023 |
