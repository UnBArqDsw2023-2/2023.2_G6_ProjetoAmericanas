# Política de commits

## 1. Introdução

Este documento traz as definições estabelecidas de como deve ser feito um commit, em concordância com as especificações da equipe.

## 2. Padrões

As especificações deste documento se baseiam nas especificações da [Conventional Commits](https://www.conventionalcommits.org/pt-br/v1.0.0/), que por sua vez se baseiam no [Commit Message Guidelines](https://github.com/angular/angular/blob/22b96b9/CONTRIBUTING.md#-commit-message-guidelines) do Angular.

Seguindo estes padrões, a mensagem do commit consiste de um cabeçalho, um corpo e um rodapé, sendo os dois últimos opcionais, se apresentando da seguinte forma:

```
<tipo>[escopo opcional]: <descrição>

[corpo opcional]

[rodapé(s) opcional(is)]
```

Dentre os "tipos" que a convenção traz, podemos destacar os seguintes:

* **build**: Mudanças que afetam o sistema de compilação ou dependências externas (escopos de exemplo: gulp, brócolis, npm)
* **docs**: Apenas mudanças relacionadas à documentação
* **feat**: Uma nova _feature_
* **fix**: Correção de _bug_
* **perf**: Mudança de código que melhora performance
* **refactor**: Mudança de código que não é correção de _bug_ nem adição de _feature_ (no nosso caso se aplica bem a correções textuais, por exemplo)

## 3. Definições da equipe

Diante das especificações apresentadas, a equipe definiu o padrão de commit da seguinte forma:

- cabeçalho obrigatório
    - especificando entre os tipos `docs`, `feat`, `fix`, `perf`, `refactor`
    - breve descrição em português

- referência à issue (se for o caso), focando na rastreabilidade
    - referenciar no escopo do cabeçalho entre parêntesis ou
    - referenciar no corpo (forma livre)

### 3.1. Exemplos

Alguns exemplos de commits:

- adição de documentação, com referência de issue no cabeçalho:

``` docs(#10): adição de versionamento ```

- adição de um novo artefato, com referência de issue no corpo:

```
feat: adição de diagrama

#21
```

ou

```
feat: adição de diagrama

referente à issue #21
```

- correção após alguma revisão, sem referência de issue:

`refactor: correções textuais`


## Referências

> **Conventional Commits**. Disponível em: <a href="https://www.conventionalcommits.org/pt-br/v1.0.0/" target="__blank">https://www.conventionalcommits.org/pt-br/v1.0.0/</a>. **Acesso em:** 27 set. 2023.

> **Contributing to Angular**: Commit Message Guidelines. Disponível em: <a href="https://github.com/angular/angular/blob/22b96b9/CONTRIBUTING.md#-commit-message-guidelines" target="__blank">https://github.com/angular/angular/blob/22b96b9/CONTRIBUTING.md#-commit-message-guidelines</a>. **Acesso em:** 27 set. 2023.


## Versionamento

| Versão | Alteração |  Responsável  | Revisor | Data de realização | Data de revisão |
| :------: | :---: | :-----: | :----: | :----: | :-----: |
| 1.0    | criação do documento | Matheus Costa | Bruno Seiji | 27/09/2023| 28/09/23 |

