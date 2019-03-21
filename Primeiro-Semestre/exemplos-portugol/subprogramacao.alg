algoritmo "subprogramacao"
var
   vetorCaractere : vetor[0..2] de caractere
   contador, resultado, valor1, valor2 : inteiro
   
   procedimento popularExibir
      inicio
            escreval("Entre com Três Valores para o Vetor")
            //Popular vetor
            para contador de 0 ate 2 faca
                 escreval("Informe o Valor para o índice ",contador, " do vetor")
                  leia(vetorCaractere[contador])
            fimpara
            //Exibir os valores do vetor
            para contador de 0 ate 2 faca
                 escreval("Valor do Vetor no índice ", contador, " é: ", vetorCaractere[contador])
            fimpara
   fimprocedimento
      
      funcao retornaSoma(valor1, valor2 : inteiro) : inteiro
         var
            soma : inteiro
         inicio
            soma <- valor1 + valor2
            retorne soma
      fimfuncao
      
inicio
   //popularExibir
   escreval("Informe o Valor 1")
   leia(valor1)
   escreval("Informe o Valor 2")
   leia(valor2)
   resultado <- retornaSoma(valor1, valor2)
   escreval("Resultado da Soma é: ", resultado)
fimalgoritmo
