# PC Mania

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos
com Java.

## Informações do aluno

- Nome: Arthur Euflásio Brentegani de Sousa
- Curso: Eng de telecomunicações 
- Matrícula: 9863

## Descrição

O projeto PC Mania consiste no desenvolvimento de um sistema simples
de compras de computadores em Java.

O sistema apresenta três promoções de computadores e permite que o
cliente escolha quais computadores deseja comprar.

O usuário informa:

- 1 para comprar o computador da Promoção 1;
- 2 para comprar o computador da Promoção 2;
- 3 para comprar o computador da Promoção 3;
- 0 para finalizar a compra.

Após a finalização, o sistema apresenta as informações do cliente,
os computadores adquiridos e o valor total da compra.


## Uso de Inteligência Artificial

A Inteligência Artificial foi utilizada como ferramenta de apoio
durante o desenvolvimento do projeto.

A IA foi utilizada principalmente para:

esclarecer conceitos de Programação Orientada a Objetos;
compreender o funcionamento de private, public, getters e setters;
compreender a utilização de package e import;
auxiliar na organização dos pacotes do projeto;
explicar trechos de código Java;
auxiliar na identificação e correção de dúvidas de implementação;
revisar a lógica de alguns trechos do código.
Modelo utilizado

Modelo utilizado: GPT-5.6 Luna.

Prompts utilizados

Os principais prompts utilizados durante o desenvolvimento foram:

"Leia e absorva os conteúdos da apresentação em PPT sobre POO
em Java, logo em seguida me explique o passo a passo de como fazer
o projeto do PC Mania que está em PDF."
"Me dê os códigos em formato de texto e me explique como fazer
o arquivo README."
"Minha estruturação de pasta está assim. Me explica como fazer
o package em cima do código, o que tenho que alterar e como funciona
package."
"Reescreva todos os códigos comentando no código a explicação
de POO do que faz em cada linha."
"Me explique o que faz a diferença de um atributo privado e público
e me explique o conceito de getter e setter."
"Tem como você fazer o bloco de código do for de outra forma mais
simples e detalhada, mantendo a lógica original?"


Relatório sobre o uso da ia: 
O uso da IA neste projeto foi essencial para eu compreender a proposta. Ela explicou o projeto relacionando-o com a matéria de POO, já que enviei as apresentações das aulas no chat. Porém, na parte de lógica de programação, ela gerou uma solução mais complexa, e tive que pedir para simplificá-la para que eu pudesse entender o que estava sendo feito.Como no caso do for que esta no chat, Procurando comentar o código e compreender a lógica de maneira destrinchada, além de saber dar os prompts certos, a IA foi de fundamental importância para eu desenvolver este projeto.


lik para acessar o chat: https://chatgpt.com/share/6aab0d10-c740-83e9-a48a-991b8ca6300c

## Organização do projeto

O projeto foi organizado utilizando pacotes Java.

```text
src/
└── br/
    └── inatel/
        └── cdg/
            └── pcmania/
                ├── main/
                │   └── Main.java
                │
                ├── model/
                │   ├── Cliente.java
                │   ├── Computador.java
                │   ├── HardwareBasico.java
                │   ├── MemoriaUSB.java
                │   └── SistemaOperacional.java
                │
                └── service/
                    └── ProcessarPedido.java

