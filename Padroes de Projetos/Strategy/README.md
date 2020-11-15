# Padrão de Strategy
O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis
## 1.Nome e Classificação e Classificação do Padrão:
* **Nome:** Padrão Strategy
* **Classificação:** Padrão Comportamental
## 2.Intenção:
A tenteção do padrão Strategy é pegar uma classe que faz algo específico em diversas maneiras diferentes e extraia todos esses algoritmos para classes separadas chamadas estratégias.
## 3. Motivação:
* Permiir que você altere indiretamente o comportamento de um objeto durante a execução ao associá-lo com diferentes sub-objetos que pode fazer sub-tarefas específicas em diferentes formas.
## 4.Aplicabilidade:
O padrão State permite que você extraia ramificações dessas condicionais para dentro de métodos de classes correspondentes. Ao fazer isso, você também limpa para fora da classe principal os campos temporários e os métodos auxiliares envolvidos no código estado específico..

## 5.Estrutura:

 ![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Strategy/structure-indexed.png)

## 6. Participantes:
 *_Contexto:_*
 
* mantém uma referência para uma das estratégias concretas e se comunica com esse objeto através da interface da estratégia. 
 
 *_A interface Estratégia_*
 
* Ela declara um método que o contexto usa para executar uma estratégia.
 
 *_Estados Concretas_*
 
* implementam diferentes variações de um algoritmo que o contexto usa.
 
 *_Cliente_*
 
* cria um objeto estratégia específico e passa ele para o contexto. O contexto expõe um setter que permite o cliente mudar a estratégia associada com contexto durante a execução.

## 7. Código de amostra:
 [https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/State/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/State/Exemplo)
* Neste exemplo maostra como o padrão serve para usar um exemplo de estado do filme o pausado e o inicial, mudando o estado de pausados e inicializado
