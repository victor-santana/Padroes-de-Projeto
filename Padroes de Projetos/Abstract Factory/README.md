# Padrão de Projeto Abstract Factory
O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

## 1.Nome e Classificação e Classificação do Padrão:
* **Nome:** Abstract Factory 
* **Classificação:** Projeto Criacional
## 2.Intenção:
O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

## 3. Motivação:
* O Abstract Factory fornece a você uma interface para a criação de objetos de cada classe das famílias de produtos.
## 4.Aplicabilidade:
 Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você não quer depender de classes concretas daqueles produtos-eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.

## 5.Estrutura:

 ![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Abstract%20Factory/structure-indexed.png)

## 6. Participantes:
*_Produtos Abstratos:_*
* Declaram interfaces para um conjunto de produtos distintos mas relacionados que fazem parte de uma família de produtos.

*_Produtos Concretos_*
* são várias implementações de produtos abstratos, agrupados por variantes. Cada produto abstrato (cadeira/sofá) deve ser implementado em todas as variantes dadas (Vitoriano/Moderno).

*_Fábrica Abstrata:_*
* A interface Fábrica Abstrata declara um conjunto de métodos para criação de cada um dos produtos abstratos.

*_Fábricas Concretas:_*
* Fábricas Concretas implementam métodos de criação fábrica abstratos. Cada fábrica concreta corresponde a uma variante específica de produtos e cria apenas aquelas variantes de produto.
*_Cliente:_*
* Embora fábricas concretas instanciam produtos concretos, assinaturas dos seus métodos de criação devem retornar produtos abstratos correspondentes. Dessa forma o código cliente que usa uma fábrica não fica ligada a variante específica do produto que ele pegou de uma fábrica. O Cliente pode trabalhar com qualquer variante de produto/fábrica concreto, desde que ele se comunique com seus objetos via interfaces abstratas.
## 7. Código de amostra:
 [https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Observer%20Pattern/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Observer%20Pattern/Exemplo)
* Neste exemplo, botões e caixas de seleção atuarão como produtos. Eles têm duas variantes: macOS e Windows.

O Abstract Factory define uma interface para criar botões e caixas de seleção. Existem duas fábricas concretas, que retornam ambos os produtos em uma única variante.
