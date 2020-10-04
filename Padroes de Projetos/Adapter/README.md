# Padr�o de Projeto Adapter
O Adapter � um padr�o de projeto estrutural que permite objetos com interfaces incompat�veis colaborarem entre si.
##1.Nome e Classifica��o e Classifica��o do Padr�o:
***Nome:** Padr�o Adapter
***Classifica��o:** Padr�o Estruturais
##2.Inten��o:
O padr�o adapter tem a inten��o de se um adaptador encobre um dos objetos para esconder a complexidade da convers�o acontecendo nos bastidores.
##3. Motiva��o:
O padr�o adpter tem a motiva��o de criar um adaptador. Ele � um objeto especial que converte a interface de um objeto para que outro objeto possa entend�-lo.
##4.Aplicabilidade:
Utilize a classe Adaptador quando voc� quer usar uma classe existente, mas sua interface n�o for compat�vel com o resto do seu c�digo.
##5.Estrutura:






 

##6. Participantes:
*_Cliente: _*
*O Cliente � uma classe que cont�m a l�gica de neg�cio do programa existente.
*_Interface do Cliente:_*
*A Interface do Cliente descreve um protocolo que outras classes devem seguir para ser capaz de colaborar com o c�digo cliente.
*_Servi�o:_*
*O Servi�o � alguma classe �til (geralmente de terceiros ou c�digo legado). O cliente n�o pode usar essa classe diretamente porque ela tem uma interface incompat�vel.
*_Adaptador:_*
*O Adaptador � uma classe que � capaz de trabalhar tanto com o cliente quanto o servi�o: ela implementa a interface do cliente enquanto encobre o objeto do servi�o. O adaptador recebe chamadas do cliente atrav�s da interface do adaptador e as traduz em chamadas para o objeto encobrido do servi�o em um formato que ele possa entender.


##7. C�digo de amostra:
#Neste c�digo � implementado uma adaptador que � capaz de converter a temperatura que veio em Fahrenheit e adaptar para colocar em Celsius, que originalmente deveria estar.