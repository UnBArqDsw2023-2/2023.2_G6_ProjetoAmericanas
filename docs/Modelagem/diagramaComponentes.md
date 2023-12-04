# Diagrama de Componentes


## 1. Introdução
Os diagramas de componentes tem como objetivo mostrar a estrutura do sistema de software, que descreve os componentes do software, suas interfaces e suas dependências. É possível utilizar diagramas de componentes para modelar sistemas de software em um alto nível ou para mostrar componentes em um nível de pacote mais baixo.


### Simbolos e componentes utilizados no Diagrama de Estados

|                                                   Símbolo                                                    | Nome                       | Descrição                                                                   |
| :----------------------------------------------------------------------------------------------------------: | -------------------------- | --------------------------------------------------------------------------- |
|   ![Estado Inicial](../Assets/modelagem/diagramaComponentes/uml-components-symbols.png)     | Componente     | Marca o ponto de entrada da utilização do objeto. Normalmente pode ser sua instanciação ou a reinicialização do mesmo para um estado estável inicial.  |   
|   ![Estado Final](../Assets/modelagem/diagramaComponentes/uml-node-symbol.png)     | Nó   | Representa objetos de hardware ou software, que estão em um nível superior ao dos componentes  |  
|   ![Estado atual](../Assets/modelagem/diagramaComponentes/uml-port-symbol.png)     | Porta   | Especifica um ponto de interação separado entre o componente e o ambiente. As portas são simbolizadas por um pequeno quadrado.  |  
|   ![Condition](../Assets/modelagem/diagramaComponentes/uml-dependency-symbol.png)     | Dependência   | Mostra que uma parte do  sistema depende de outra. Dependências são representadas por linhas tracejadas que conectam um componente (ou elemento) a outro |  
<h6 align = "center">Tabela 1: Legenda dos elementos do diagrama</h6>


## 2. Diagrama de componentes
Esta foi a versão inicial do diagrama, mas após feedback da professora, foi gerado uma [nova versão](#_3-artefato-atualizado), porém foi encontrado um impedimento devido a limitação da ferramenta Lucid Chart para criação do diagrama e por isso foi utilizado o draw.io para a nova versão. Fica o adendo para a falta de algumas portas e interfaces no diagrama inicial.

![Diagrama Componentes](../Assets/diagrama-componentes-2.png)
<h6 align = "center">Figura 1: Diagrama de Componentes Gabriel de Souza e Guilherme Lima</h6>


## 3. Artefato Atualizado

![Diagrama Componentes](../Assets/modelagem/diagramaComponentes/Diagrama%20de%20componentes.png)

<h6 align = "center">Figura 2: Nova versão Diagrama de Componentes</h6>


## Referências

> LUCIDCHART. **O que é um diagrama de componentes UML?**. Disponível em: <a href="https://www.lucidchart.com/pages/pt/diagrama-de-componentes-uml" target="__blank">https://www.lucidchart.com/pages/pt/diagrama-de-componentes-uml</a>. **Acesso em:** 04 out. 2023.

## Versionamento

| Versão | Alteração |  Responsável  | Revisor | Data de realização | Data de revisão |
| :------: | :---: | :-----: | :----: | :----: | :-----: |
| 1.0    | criação do diagrama de componentes| Gabriel de Souza | Matheus Costa | 04/10/2023| 09/10/2023 |
| 2.0    | correções e novo diagrama de componentes| Gabriel de Souza | Matheus Costa | 09/10/2023| 09/10/2023 |
| 3.0    | adição do Diagrama Atualizado e migração do Lucidchart para o draw.io| Guilherme Lima | Matheus Raphael | 29/11/2023| 01/12/2023 |

