programa
{
	
	funcao inicio()
	{
		/*
		 * Desenvolva um sistema em que:
			Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.
			4 variaveis valor
			4 variaveis quadrado do valor (valor1*valor1)
			se valor3*valor3 >= 100 - imprima quadrado3
			senao imprima valor1,valor2,valor3,valor4 e quadrado1, quadrado2, quadrado3, quadrado4
		 */

		 inteiro valor1, valor2, valor3, valor4
		 inteiro quadrado1, quadrado2, quadrado3, quadrado4

		 escreva("Digite um valor para 1: ")
		 leia(valor1)
		 escreva("Digite um valor para 2: ")
		 leia(valor2)
		 escreva("Digite um valor para 3: ")
		 leia(valor3)
		 escreva("Digite um valor para 4: ")
		 leia(valor4)

		 quadrado1 = (valor1*valor1)
		 quadrado2 = (valor2*valor2)
		 quadrado3 = (valor3*valor3)
		 quadrado4 = (valor4*valor4)

		 

		 se (quadrado3 >= 1000)
		 {
		 	escreva("O valor do numero 3 é ", valor3, " e seu quadrado é ",quadrado3)
		 }
		 senao 
		 {
		 	escreva("\n O valor de 1  ", valor1, " e seu quadrado é ", quadrado1)
		 	escreva("\n O valor de 2  ", valor2, " e seu quadrado é ", quadrado2)
		 	escreva("\n O valor de 3  ", valor3, " e seu quadrado é ", quadrado3)
		 	escreva("\n O valor de 4  ", valor4, " e seu quadrado é ", quadrado4)
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1186; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */