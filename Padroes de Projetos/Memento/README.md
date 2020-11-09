# Memento


## Classification
Comportamental

## Intenção
O Memento é um padrão de projeto comportamental que permite que você salve e restaure o estado anterior de um objeto sem revelar os detalhes de sua implementação.

## Motivação

O padrão tem a otivação de permitir que você faça cópias completas do estado de um objeto, incluindo campos privados, e armazená-los separadamente do objeto. Embora a maioria das pessoas vão lembrar desse padrão graças ao caso “desfazer”, ele também é indispensável quando se está lidando com transações (isto é, se você precisa reverter uma operação quando se depara com um erro).


## Applicabilidade
O Memento faz o próprio objeto ser responsável por criar um retrato de seu estado. Nenhum outro objeto pode ler o retrato, fazendo do estado original do objeto algo seguro e confiável.

## Estrutura e Participantes

![https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Memento/Memento.png](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Memento/Memento.png)

**Originadora:** classe que produz retratos do seu próprio estado e também restaura o seu estado anterior quando necessário.

**Memento:** age como uma cópia do estado da originadora.

**Cuidadora:** Responsável por saber quando restaurar o estado. Tabém sabe quando e por quê capturar o estado da originadora.

## Código

[https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Memento/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Memento/Exemplo)

O exemplo acima é de um editor de texto que precisa manter o controle apenas do texto que é digitado, um notepad por exemplo.

