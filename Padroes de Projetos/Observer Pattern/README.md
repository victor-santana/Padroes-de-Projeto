# Padrão de Projeto Observer
O Observer é um padrão de projeto comportamental que permite que você defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.

## 1.Nome e Classificação e Classificação do Padrão:
***Nome:** Padrão Singleton
***Classificação:** Padrão Comportamental
## 2.Intenção:
O padrão Observer tem como objetivo comportamental onde permite que defina um mecanismo de assinatura para notificar múltipos objetos sobre quaisquer eventos que aconteçam com objeto que eles estão observando.
## 3. Motivação:
* Permitir que qualquer objeto que implemente a interface do assinante possa se inscrever para notificações de eventos em objetos da publicadora.

## 4.Aplicabilidade:
Utilize o padrão quando alguns objetos em sua aplicação devem observar outros, mas apenas por um tempo limitado ou em casos específicos.

## 5.Estrutura:

 ![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Singleton/Singleton.png)

## 6. Participantes:
* _Publicadora:_*
* Manda eventos de interesses para outros objetos
* Eventos ocorrem quando a publicadora muda seu estado ou executa algum comportamento
* _Foreach:_*
* Quando um novo evento acontece, a publicadora percorre a lista de assinantes e chama o métoso de notificação declarando na interface do assinante em cada objeto assinante.
* _Interface do Assinante:_*
* Declara a interface de notificação, ela consiste de um único método, que pode ter vários parâmetos que permite que a publicadora passe detalhes de evento junto com a atualização.
* _Assinantes Concretos:_*
* Assinantes Concretos realizam algumas ações em resposta nàs notificações enviadas pela publicadora. Todas essas classes devem implementar a mesma interface para que a publicadora não fique acoplada à classes concretas.
* _Cliente:_*
* Cria a publicadora e os objetos assinantes separadamente e então registra os assinantes para as atualizações da publicadora.

## 7. Código de amostra:
 [github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo)
* Neste exemplo a instancia de uma classe faz comunicação serial com um equipamento e recebe dados de forma assíncrona, e ao receber novos dados, ela notifica aos observadores que há um novo dado disponível.
