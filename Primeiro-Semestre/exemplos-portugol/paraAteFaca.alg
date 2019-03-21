algoritmo "paraAteFaca"

var
   contador, valorInicial, valorFinal, tabuada : inteiro
   acumulador : inteiro
inicio
   acumulador <- 1
   
   //Conta até 10
   para contador de 0 ate 10 faca
      escreval("Valor Contador: ", contador)
      acumulador <- (acumulador + contador) * 2
   fimpara
   escreval("Valor do Acumulador: ", acumulador)
   
   escreval("=======================================")
   
   //Exibir a tabuada do número escolhido
   valorInicial <- 0
   valorFinal <- 10
   escreval("Deseja visualizar a Tabuada de qual Valor?")
   leia(tabuada)
   escreval("Tabuada do: ", tabuada)

   para contador de valorInicial ate valorFinal faca
      escreval(tabuada, " X ", contador, " = ", tabuada * contador)
   fimpara
   

fimalgoritmo
