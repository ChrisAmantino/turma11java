programa
{
	
	funcao inicio()
	{
		/*Faça um sistema que leia um número inteiro e mostre uma mensagem 
		 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
		 */
		 inteiro numero = 0

		 escreva("Digite um número: ")
		 leia(numero)

		 se ( numero > 0 e (numero%2)==0 )
		 {
		 	escreva("Seu número é par e positivo")
		 }
		 senao se ( numero > 0 e (numero%2) != 0)
		 { 
		 	escreva("Seu número é ímpar e positivo")		 	
		 }
		 senao se ( numero < 0 )
		 {
		 	escreva("seu número é negativo")
		 }
		 senao 
		 {
		 	escreva("seu número é 0, e 0 é neutro!")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */