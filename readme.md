Instruções

 
Na aula teórica (Slide 07), aprendemos a teoria sobre Pilhas e Filas. A partir disso, é necessário implementar essas estruturas.

 
Você pode fazer com seus colegas de classe, mas a entrega é individual.

 
01) Implementar a estrutura da Pilha baseada em vetores, devendo possuir os métodos que:

inserir ao topo (empilhar) - Feito

remover do topo (desempilhar) - Feito

verificar se a pilha está vazia - Feito

 
02) A partir da implementação da pilha, você deverá desenvolver um algoritmo que simule um desfazer/refazer de um editor de texto, que funciona da seguinte forma:

Usamos duas pilhas:

pilhaDesfazer: armazena os estados anteriores do texto - Feito

pilhaRefazer: armazena os estados futuros do texto - Feito

Principais operações:

inserirTexto: - Feito 

Salva o estado atual na pilha de desfazer

Limpa a pilha de refazer (já que uma nova ação foi realizada)

Adiciona o novo texto

desfazer: - Feito

Salva o estado atual na pilha de refazer

Restaura o estado anterior da pilha de desfazer

refazer: Feito

Salva o estado atual na pilha de desfazer

Restaura o estado futuro da pilha de refazer

O método main deve demonstrar o uso com um exemplo prático:

Insere texto inicial

Adiciona mais texto

Desfaz a última ação

Refaz a ação

Adiciona novo texto

Desfaz múltiplas vezes

Algumas observações importantes:

A pilha de refazer é limpa sempre que uma nova ação é realizada

O sistema mantém um histórico limitado (dependendo da capacidade da pilha) 

 

03) Implementar a estrutura da Fila, devendo possuir os seguintes métodos:

Inserir no final (enfileirar) - Feito

Remover do início (desenfileirar) - Feito

Verificar se a fila está vazia - Feito

 
04) A partir da implementação da fila, implemente um algoritmo de fila de impressão, onde os documentos são enfileirados e processados na ordem em que chegam, que funciona da seguinte forma:

Deve possuir uma classe Document - Feito

Esta classe deve ser implementada por você e possuir o nome e o tamanho

O número de documentos na fila

Principais operações:

adicionarDocumento - Feito

imprimirProximo - Feito

mostrarFila - Feito

O método main deve demonstrar o uso com um exemplo prático:

Adiciona documentos na fila - Feito

Imprime os documentos - Feito

Mostra a fila - Feito