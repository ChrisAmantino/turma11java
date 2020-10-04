programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * Escreva  um sistema que leia três números inteiros e positivos 
		 * (A, B, C) e calcule a seguinte expressão
		 * D = (R + S)/2, onde R = (A+B)² e S=(B+C)²
		 */
		 inteiro a = 0
		 inteiro b = 0
		 inteiro c = 0
		 inteiro r = 0
		 inteiro s = 0
		 inteiro d = 0

		escreva("Digite o valor de a: ")
		leia(a)
		escreva("Digite o valor de b: ")
		leia(b)
		escreva("Digite o valor de c: ")
		leia(c)
		r = mat.potencia((a+b), 2)
		s = mat.potencia((b+c),2)
		d = (r+s)/2
		escreva("O resultado é: ", d)
			
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */