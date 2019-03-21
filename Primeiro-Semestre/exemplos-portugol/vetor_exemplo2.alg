algoritmo "vetor_exemplo2"

var
   vetorCaractere : vetor[0..2] de caractere
   contador : inteiro
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

fimalgoritmo
