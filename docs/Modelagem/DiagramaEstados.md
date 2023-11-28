# Diagrama de estados

## 1. Definição

O diagrama de estados é um diagrama dinâmico, que descreve o comportamento de um sistema por meio de estados finitos de transição, um objeto muda de estado quando ocorre algum evento interno ou externo ao sistema. Os diagramas de estados também podem ser utilizados para descrever os protocolos de uso de uma determinada parte do sistema.

## Simbolos e componentes utilizados no Diagrama de Atividades (draw.io)

|                                                   Símbolo                                                    | Nome                       | Descrição                                                                   |
| :----------------------------------------------------------------------------------------------------------: | -------------------------- | --------------------------------------------------------------------------- |
|   ![Estado Inicial](../Assets/modelagem/diagramaEstados/estado_inicial.png)     | Estado Inicial     | Marca o ponto de entrada da utilização do objeto. Normalmente pode ser sua instanciação ou a reinicialização do mesmo para um estado estável inicial.  |   
|   ![Estado Final](../Assets/modelagem/diagramaEstados/estado_final.png)     | Estado Final     | Marca o ponto de saída da utilização do objeto. Normalmente pode ser sua destruição (liberação de memória), ou simplesmente o ato de deixar de utilizar o objeto.  |  
|   ![Estado](../Assets/modelagem/diagramaEstados/estado.png)     | Estado     | Representa um dos possíveis estados em que o objeto pode se encontrar em cada dado momento. Um estado de um objeto é definido como sendo a identificação de todos os atributos que o compõem;  |  

## 1.1. Artefato

![Diagrama de estados](../Assets/diagrama_estados.png)
<h6 align = "center">Figura 1: Diagrama de Estados</h6>


No diagrama acima, é apresentado os estados que o sistema passa durante as situações de troca ou devolução de produtos.

## Referências

> State Machine Diagrams. Disponível em: https://www.uml-diagrams.org/state-machine-diagrams.html

## Versionamento

| Versão |     Alteração     |  Responsável  | Revisor | Data de realização | Data de revisão 
| :----: | :---------------: | :-----------: | :-----: | :---: | :----:
|  1.0   | Criação documento e diagrama | Bruno Kishibe | Matheus Costa | 08/10 | 08/10