# Política de branches

## 1. Introdução

Este documento contém informações referentes à organização das branches, adotada pela equipe.

## 2. Gitflow

O Gitflow é um padrão amplamente conhecido, que representa uma ideia de fluxo de trabalho com uso do Git, "ele dita que tipos de ramificações configurar e como fazer o merge".

O git-flow é na verdade um conjunto de ferramentas e sua instalação se dá por meio de linha de comando. Após sua instalação, em um momento inicial, o git-flow pode ser usado para iniciar o projeto por meio do comando `git flow init`, que se encarregará de gerar as ramificações.

### 2.1. Branches do Gitflow

#### 2.1.1. Principal e desenvolvimento

O fluxo de trabalho usa duas ramificações para registrar o histórico do projeto, sendo uma delas a `main`, que armazena o histórico do **lançamento** oficial, e a outra a `develop`, que serve como uma ramificação de **integração** para recursos.

#### 2.1.2. Ramificações de recurso

A especificação define que cada novo recurso (_feature_) deve residir na sua própria ramificação, porém, ao invés de surgirem ramificações a partir da branch principal (main), são geradas branchs a partir da branch de desenvolvimento. Dessa forma, quando a implementação de um recurso é concluída, sua ramificação passa por um _merge_ para a branch de desenvolvimento.

#### 2.1.3. Ramificações de lançamento

Quando a branch de desenvolvimento adquiriu os recursos necessários para um lançamento, é gerada uma branch de lançamento a partir dela (em geral chamada de `release`). A partir daqui nenhum novo recurso deve ser inserido e são gerados apenas artefatos como documentação e atualizações de segurança, até que tudo esteja pronto e ocorra um _merge_ entre a branch de lançamento e a branch principal.

## 3. Definições da equipe

Como foi apresentado anteriormente, o fluxo de trabalho do Gitflow se mostra bastante organizado e por isso foi adotado pela equipe para ser seguido.

Vale destacar que o Gitflow em sua completude ainda apresenta outros modelos de ramificações, mas que não foram apresentados neste documento.

O intuito da equipe é seguir um **modelo adaptado** do Gitflow, por isso foram apresentados os modelos até o tópico [2.1.3.](#_213-ramificações-de-lançamento). Assim sendo, a equipe se baseou na ideia principal do Gitflow e realizou a separação das branches de forma manual, **sem o uso da ferramenta git-flow**.

Este é o padrão seguido pela equipe:

- utilização da branch `main` como branch para histórico de lançamentos (_deploys_)
- criação da branch `dev` como branch de integração
- para cada novo artefato, gerar uma branch de recurso a partir da `dev`, com nome significativo relacionado ao artefato
- ao fim do desenvolvimento do artefato, solicitar um Pull Request (PR) da branch de recurso para _merge_ com a branch `dev`
- após o _merge_ com a `dev`, a branch de recurso deve ser deletada
- tendo todos os recursos/artefatos reunidos na `dev`, abrir um PR para a branch `main` (sem gerar ramificações de lançamento), realizando o _deploy_ e marcando o fim de uma entrega




## Referências

> Atlassian Bitbucket. **Saiba tudo sobre o Gitflow Workflow**. Disponível em: <a href="https://www.atlassian.com/br/git/tutorials/comparing-workflows/gitflow-workflow" target="__blank">https://www.atlassian.com/br/git/tutorials/comparing-workflows/gitflow-workflow</a>. **Acesso em:** 27 set. 2023.


## Versionamento

| Versão | Alteração |  Responsável  | Revisor | Data de realização | Data de revisão |
| :------: | :---: | :-----: | :----: | :----: | :-----: |
| 1.0    | criação do documento | Matheus Costa | a definir | 27/09/2023| a definir |
