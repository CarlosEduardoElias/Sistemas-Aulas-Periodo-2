algoritmo "registros"
   tipo
       pessoa = registro
          nome : caractere
          endereco : caractere
       fimregistro
var
   cliente : vetor [0..1] de pessoa
   i, j : inteiro
inicio
   para i de 0 ate 1 faca
      escreval("Digite o Nome")
      leia(cliente[i].nome)
      escreval("Digite o Endereço")
      leia(cliente[i].endereco)
   fimpara
   
   para j de 0 ate 1 faca
      escreval(cliente[j].nome)
      escreval(cliente[j].endereco)
   fimpara
fimalgoritmo
