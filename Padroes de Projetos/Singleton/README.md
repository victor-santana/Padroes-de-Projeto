# Padrão de Projeto Singleton
O Singleton é um padrão de projeto criacional, que garante que apenas um objeto desse tipo exista e forneça um único ponto de acesso a ele para qualquer outro código.

## 1.Nome e Classificação e Classificação do Padrão:
* **Nome:** Padrão Singleton
* **Classificação:** Padrão Criacional
## 2.Intenção:
O padrão singleto tem a intenção de definir uma única instância. Fazendo que forneça um único ponto de acesso a ele para qualquer outro código.
## 3. Motivação:
* Fazer o construtor padrão privado, para prevenir que outros objetos usem o operador new com a classe singleton.
* Criar um método estático de criação que age como um construtor. Esse método chama o construtor privado por debaixo dos panos para criar um objeto e o salva em um campo estático. Todas as chamadas seguintes para esse método retornam o objeto em cache.
Se o seu código tem acesso à classe singleton, então ele será capaz de chamar o método estático da singleton. Então sempre que aquele método é chamado, o mesmo objeto é retornado.

## 4.Aplicabilidade:
* Quando houver necessidade de acesso a um recurso a partir de uma instância.
* Quando há uso em escala larga de um recurso em que se pode ter somente uma instância, há problemas de referência.

## 5.Estrutura:

![]()

 

## 6. Participantes:

 *Singleton:*
* É uma classe única deste padrão.
* O construtor é privado, não acessível externamente.

 *Cliente:*
* É quem usa o Singleton
* Está interessado na instância, não importa se é uma só no programa todo

## 7. Código de amostra:
* Neste código é implementado uma classe que manipula um arquivo e aplicando o singleton garante que não haja mais de uma instância dessa classe no programa
