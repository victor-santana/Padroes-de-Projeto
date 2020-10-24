# Padr�o de Projeto Observer
O Observer � um padr�o de projeto comportamental que permite que voc� defina um mecanismo de assinatura para notificar m�ltiplos objetos sobre quaisquer eventos que aconte�am com o objeto que eles est�o observando.

##1.Nome e Classifica��o e Classifica��o do Padr�o:
***Nome:** Padr�o Singleton
***Classifica��o:** Padr�o Comportamental
##2.Inten��o:
O padr�o Observer tem como objetivo comportamental onde permite que defina um mecanismo de assinatura para notificar m�ltipos objetos sobre quaisquer eventos que aconte�am com objeto que eles est�o observando.
##3. Motiva��o:
*Permitir que qualquer objeto que implemente a interface do assinante possa se inscrever para notifica��es de eventos em objetos da publicadora.

##4.Aplicabilidade:
Utilize o padr�o quando alguns objetos em sua aplica��o devem observar outros, mas apenas por um tempo limitado ou em casos espec�ficos.

##5.Estrutura:

 ![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Singleton/Singleton.png)

##6. Participantes:
*_Publicadora:_*
*Manda eventos de interesses para outros objetos
*Eventos ocorrem quando a publicadora muda seu estado ou executa algum comportamento
*_Foreach:_*
*Quando um novo evento acontece, a publicadora percorre a lista de assinantes e chama o m�toso de notifica��o declarando na interface do assinante em cada objeto assinante.
*_Interface do Assinante:_*
*Declara a interface de notifica��o, ela consiste de um �nico m�todo, que pode ter v�rios par�metos que permite que a publicadora passe detalhes de evento junto com a atualiza��o.
*_Assinantes Concretos:_*
*Assinantes Concretos realizam algumas a��es em resposta n�s notifica��es enviadas pela publicadora. Todas essas classes devem implementar a mesma interface para que a publicadora n�o fique acoplada � classes concretas.
*_Cliente:_*
*Cria a publicadora e os objetos assinantes separadamente e ent�o registra os assinantes para as atualiza��es da publicadora.

##7. C�digo de amostra:
 [github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo)
#Neste exemplo a instancia de uma classe faz comunica��o serial com um equipamento e recebe dados de forma ass�ncrona, e ao receber novos dados, ela notifica aos observadores que h� um novo dado dispon�vel.
