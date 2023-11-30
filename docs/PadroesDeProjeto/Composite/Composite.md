# 3.1 Composite

## Introdução
De acordo com [1], O Composite é um padrão de projeto estrutural que permite que você componha objetos em estruturas de árvores e então trabalhe com essas estruturas como se elas fossem objetos individuais.

O padrão será aplicado na seleção dos itens que serão escolhidos para entrar no fluxo de devolução/troca.

<div align = "center">

![](../../Assets/PadroesProjeto/diagrama_uml_refactoring_guru.png)  
</div>
<h6 align = "center">Figura 1: Diagrama UML Composite <br>Fonte: [1] Refactoring Guru</h6>

## Objetivo

O objetivo principal de usar o padrão Composite é proporcionar uma experiência mais flexível e eficiente para os usuários, permitindo que eles gerenciem suas devoluções de maneira intuitiva, selecionando produtos individualmente ou agrupando-os conforme necessário. Facilitando assim a manutenção do código, tornando-o mais robusto contra mudanças futuras. Se a lógica de troca ou devolução precisar ser expandida para lidar com novos requisitos, o padrão Composite oferece uma base sólida. O padrão Composite simplifica operações que precisam ser realizadas recursivamente, como calcular o valor total dos produtos a serem trocados ou devolvidos, assim também como a quantidade selecionada dos produtos.

Em essência, ao aplicar o Composite, resultará em um sistema mais adaptável às mudanças nos requisitos e às evoluções futuras do catálogo de produtos.

## Implementação
A implementação do padrão de projeto foi realizada usando a linguagem Java e criando uma abstração de como funcionaria no sistema da Lojas Americanas. 

### Diagrama UML
Modelagem utilizando a ferramenta online [lucidchart](https://www.lucidchart.com/pages/)

![](../../Assets/PadroesProjeto/diagrama_composite.png)
<h6 align = "center">Figura 2: Codigo seleção de produtos. Fonte: Gabriel Ribeiro</h6>

### Código

A implementação pode ser encontrada na pasta Code/Composite do repositório do projeto.

### Interface do Produto

![](../../Assets/PadroesProjeto/interface_Composite.png)
<h6>Figura 3: Codigo Interface. Fonte: Gabriel Ribeiro</h6>

### Composite

![](../../Assets/PadroesProjeto/composite.png)
<h6>Figura 4: Codigo Composite. Fonte: Gabriel Ribeiro</h6>


### Models


![](../../Assets/PadroesProjeto/caixa_chocolate.png)
<h6>Figura 5: Codigo leaf caixa_chocolate. Fonte: Gabriel Ribeiro</h6>


![](../../Assets/PadroesProjeto/celular.png)
<h6>Figura 6: Codigo leaf celular. Fonte: Gabriel Ribeiro</h6>


![](../../Assets/PadroesProjeto/video_game.png)
<h6>Figura 7: Codigo leaf video_game. Fonte: Gabriel Ribeiro</h6>

### Main
#### Para fins didáticos, um exemplo para simular o fluxo.
![](../../Assets/PadroesProjeto/exemplo_main.png)
<h6>Figura 8: Codigo leaf video_game. Fonte: Gabriel Ribeiro</h6>

![](../../Assets/PadroesProjeto/exemplo_composite.png)
<h6>Figura 7: Codigo leaf video_game. Fonte: Gabriel Ribeiro</h6>
































## Referências

> [1] Refactoring Guru. **Chain of Responsibility**. Disponível em: https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility **Acesso em:** 29 nov. 2023.

## Versionamento

| Versão | Alteração |  Responsável  | Revisor | Data de realização | Data de revisão |
| :------: | :---: | :-----: | :----: | :----: | :-----: |
| 1.0    | criação do documento, codigo e diagramas | Gabriel Ribeiro | - | 29/11/2023| 30/11/2023 |