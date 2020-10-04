# Padrão de Projeto Adapter
O Adapter é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.
##1.Nome e Classificação e Classificação do Padrão:
***Nome:** Padrão Adapter
***Classificação:** Padrão Estruturais
##2.Intenção:
O padrão adapter tem a intenção de se um adaptador encobre um dos objetos para esconder a complexidade da conversão acontecendo nos bastidores.
##3. Motivação:
O padrão adpter tem a motivação de criar um adaptador. Ele é um objeto especial que converte a interface de um objeto para que outro objeto possa entendê-lo.
##4.Aplicabilidade:
Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.
##5.Estrutura:






 

##6. Participantes:
*_Cliente: _*
*O Cliente é uma classe que contém a lógica de negócio do programa existente.
*_Interface do Cliente:_*
*A Interface do Cliente descreve um protocolo que outras classes devem seguir para ser capaz de colaborar com o código cliente.
*_Serviço:_*
*O Serviço é alguma classe útil (geralmente de terceiros ou código legado). O cliente não pode usar essa classe diretamente porque ela tem uma interface incompatível.
*_Adaptador:_*
*O Adaptador é uma classe que é capaz de trabalhar tanto com o cliente quanto o serviço: ela implementa a interface do cliente enquanto encobre o objeto do serviço. O adaptador recebe chamadas do cliente através da interface do adaptador e as traduz em chamadas para o objeto encobrido do serviço em um formato que ele possa entender.


##7. Código de amostra:
#Neste código é implementado uma adaptador que é capaz de converter a temperatura que veio em Fahrenheit e adaptar para colocar em Celsius, que originalmente deveria estar.