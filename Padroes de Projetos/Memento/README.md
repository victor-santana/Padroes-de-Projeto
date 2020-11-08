# Memento


## Classification
Comportamental

## Intent
Permitir que o usuário seja capaz de salvar e restaurar pontos específicos de determinado objeto sem revelar detalhes de implementação.

## Motivation
O padrão de projeto Memento é utilizado em larga escala principalmente quando estamos falando de editores, de texto por exemplo, pois dessa forma, com a implementação desse padrão de projeto é possível recuperar o estado padrão do objeto (o texto, neste caso).

Mas é claro que esse é apenas um exemplo, editores de imagem também são ótimos lugares para se aplicar o Memento e assim ele consegue recuperar o estado anterior da imagem que está sendo editada e copiar os dados para um objeto que vai ser futuramente restaurado.

## Applicability
O memento faz com que o objeto faça uma cópia de si mesmo (do seu estado), dessa forma nenhum outro objeto é capaz de interfirir, tornando assim o estado original do objeto seguro. 

No entanto, o memento é utilizado em maior escala quando precisamos produzir várias cópias do estado de determinado objeto para assim conseguirmos restaurar um estado anterior do objeto.

## Structure and Participants

![https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Memento/Memento.png](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Memento/Memento.png)

**Originadora:** classe que produz retratos do seu próprio estado e também restaura o seu estado anterior quando necessário.

**Memento:** age como uma cópia do estado da originadora.

**Cuidadora:** Responsável por saber quando restaurar o estado. Tabém sabe quando e por quê capturar o estado da originadora.

## Sample code 

[https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Memento/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Memento/Exemplo)

O exemplo apresentado acima foi retirado do blog de [Marcos Brizeno](https://brizeno.wordpress.com/category/padroes-de-projeto/memento/). Nele temos um código que segue ao "pé da letra" de como o memento funciona, mostrando todos os participantes da estrurura do padrão de projeto.


