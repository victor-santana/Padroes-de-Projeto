# Padrão de Projeto: Composite
O Composite é um padrão de projeto estrutural que permite compor objetos em uma estrutura semelhante a uma árvore e trabalhar com eles como se fosse um objeto singular.

![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Composite/img%20com.png)
 
O Composite se tornou uma solução bastante popular para a maioria dos problemas que exigem a construção de uma estrutura em árvore. O grande recurso do Composite é a capacidade de executar métodos recursivamente em toda a estrutura da árvore e resumir os resultado. Esse projeto tem a intenção de modificar a estrutura de um objeto. Em estrutura hierárquica como grafo ou árvore que requer funcionalidade genérica por toda a estrutura Aplicações onde precisa agregar dados por toda hierárquicas. Aplicação que precisa tratar a composição e objetados de maneira individuais e uniforme

**Estrutura:** 
![](https://github.com/victor-santana/Padroes-de-Projeto/blob/master/Padroes%20de%20Projetos/Composite/comp.png)

 
**Componentes:**
Os componentes que fazem parte do padrão Composite são os Componentes, Folha, Contêiner e o Cliente. 

**Componentes:**
A interface Componente descreve operações que são comuns tanto para elementos simples como para elementos complexos da árvore.

**Folha**
A Folha é um elemento básico de uma árvore que não tem sub-elementos.
Geralmente, componentes folha acabam fazendo boa parte do verdadeiro trabalho, uma vez que não tem mais ninguém para delegá-lo.

**Contêiner**
O Contêiner (ou composite) é o elemento que tem sub-elementos: folhas ou outros contêineres. Um contêiner não sabe a classe concreta de seus filhos. Ele trabalha com todos os sub-elementos apenas através da interface componente.
Ao receber um pedido, um contêiner delega o trabalho para seus sub-elementos, processa os resultados intermediários, e então retorna o resultado final para o cliente.

**Cliente**
O Cliente trabalha com todos os elementos através da interface componente. Como resultado, o cliente pode trabalhar da mesma forma tanto com elementos simples como elementos complexos da árvore.
