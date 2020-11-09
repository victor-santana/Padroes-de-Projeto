# Padrão de State
O State é um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. 

## 1.Nome e Classificação e Classificação do Padrão:
* **Nome:** Padrão Singleton
* **Classificação:** Padrão Comportamental
## 2.Intenção:
A tenteção do padrão State é fazer o uso de um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o número de estados é enorme, e quando o código estado específico muda com frequência.
## 3. Motivação:
* Permiir que uma classe populada com condicionais gigantes que alteram como a classe se comporta de acordo com os valores atuais dos campos da classe.
## 4.Aplicabilidade:
O padrão State permite que você extraia ramificações dessas condicionais para dentro de métodos de classes correspondentes. Ao fazer isso, você também limpa para fora da classe principal os campos temporários e os métodos auxiliares envolvidos no código estado específico..

## 5.Estrutura:

 ![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/State/State.png)

## 6. Participantes:
 *_Contexto:_*
 
* Armazena uma referência a um dos objetos concretos de estado e delega a eles todos os trabalhos específicos de estado. 
 
 *_Estado:_*
 
* O estado declara métodos específicos a estados. Esses métodos devem fazer sentido para todos os estados concretos porque você não quer alguns dos seus estados tendo métodos inúteis que nunca irão ser chamados.
 
 *_Estados Concretos_*
 
* Fornecem suas próprias implementações para os métodos específicos de estados. Para evitar duplicação ou código parecido em múltiplos estados, você pode fornecer classes abstratas intermediárias que encapsulam alguns dos comportamentos comuns.

## 7. Código de amostra:
 [github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo](https://github.com/victor-santana/Padroes-de-Projeto/tree/master/Padroes%20de%20Projetos/Singleton/Exemplo)
#Neste exemplo a instancia de uma classe faz comunicação serial com um equipamento e recebe dados de forma assíncrona, e ao receber novos dados, ela notifica aos observadores que há um novo dado disponível.
