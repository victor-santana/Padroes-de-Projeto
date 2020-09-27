# Padr�o de Projeto Singleton
O Singleton � um padr�o de projeto criacional, que garante que apenas um objeto desse tipo exista e forne�a um �nico ponto de acesso a ele para qualquer outro c�digo.

##1.Nome e Classifica��o e Classifica��o do Padr�o:
***Nome:** Padr�o Singleton
***Classifica��o:** Padr�o Criacional
##2.Inten��o:
O padr�o singleto tem a inten��o de definir uma �nica inst�ncia. Fazendo que forne�a um �nico ponto de acesso a ele para qualquer outro c�digo.
##3. Motiva��o:
*Fazer o construtor padr�o privado, para prevenir que outros objetos usem o operador new com a classe singleton.
*Criar um m�todo est�tico de cria��o que age como um construtor. Esse m�todo chama o construtor privado por debaixo dos panos para criar um objeto e o salva em um campo est�tico. Todas as chamadas seguintes para esse m�todo retornam o objeto em cache.
Se o seu c�digo tem acesso � classe singleton, ent�o ele ser� capaz de chamar o m�todo est�tico da singleton. Ent�o sempre que aquele m�todo � chamado, o mesmo objeto � retornado.

##4.Aplicabilidade:
Quando houver necessidade de acesso a um recurso a partir de uma inst�ncia.
Quando h� uso em escala larga de um recurso em que se pode ter somente uma inst�ncia, h� problemas de refer�ncia.

##5.Estrutura:






 

##6. Participantes:
*_Singleton:_*
*� uma classe �nica deste padr�o.
*O construtor � privado, n�o acess�vel externamente.
*_Cliente:_*
*� quem usa o Singleton
*Est� interessado na inst�ncia, n�o importa se � uma s� no programa todo

##7. C�digo de amostra:
#Neste c�digo � implementado uma classe que manipula um arquivo e aplicando o singleton garante que n�o haja mais de uma inst�ncia dessa classe no programa
