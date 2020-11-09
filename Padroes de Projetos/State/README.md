# Padr�o de Projeto Observer
O State � um padr�o de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. 

##1.Nome e Classifica��o e Classifica��o do Padr�o:
***Nome:** Padr�o Singleton
***Classifica��o:** Padr�o Comportamental
##2.Inten��o:
A tente��o do padr�o State � fazer o uso de um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o n�mero de estados � enorme, e quando o c�digo estado espec�fico muda com frequ�ncia.
##3. Motiva��o:
*Permiir que uma classe populada com condicionais gigantes que alteram como a classe se comporta de acordo com os valores atuais dos campos da classe.
##4.Aplicabilidade:
O padr�o State permite que voc� extraia ramifica��es dessas condicionais para dentro de m�todos de classes correspondentes. Ao fazer isso, voc� tamb�m limpa para fora da classe principal os campos tempor�rios e os m�todos auxiliares envolvidos no c�digo estado espec�fico..

##5.Estrutura:

 ![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Singleton/Singleton.png)

##6. Participantes:
*_Contexto:_*
*Armazena uma refer�ncia a um dos objetos concretos de estado e delega a eles todos os trabalhos espec�ficos de estado. 
*_Estado:_*
*O estado declara m�todos espec�ficos a estados. Esses m�todos devem fazer sentido para todos os estados concretos porque voc� n�o quer alguns dos seus estados tendo m�todos in�teis que nunca ir�o ser chamados.
*_Estados Concretos_*
*Fornecem suas pr�prias implementa��es para os m�todos espec�ficos de estados. Para evitar duplica��o ou c�digo parecido em m�ltiplos estados, voc� pode fornecer classes abstratas intermedi�rias que encapsulam alguns dos comportamentos comuns.

##7. C�digo de amostra:
 [github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo)
#Neste exemplo a instancia de uma classe faz comunica��o serial com um equipamento e recebe dados de forma ass�ncrona, e ao receber novos dados, ela notifica aos observadores que h� um novo dado dispon�vel.
