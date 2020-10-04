programa
{
	
	funcao inicio()
	{
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		 * ou seja, diagonal principal.
		 */

		 const inteiro LIMITELINHA = 3, LIMITECOLUNA = 3
		 inteiro valor[LIMITELINHA][LIMITECOLUNA], l = 0, c = 0
		 inteiro somaDiagonal = 0, somaTotal = 0

		 para(l = 0; l < LIMITELINHA; l++)
		 {
		 	para(c = 0; c < LIMITECOLUNA; c++)
		 	{
		 		limpa()
		 		escreva("Digite um valor para linha ", l+1, ", coluna ", c+1, ": ")
		 		leia(valor[l][c])
		 		se(l == c)
		 		{
		 		somaDiagonal = somaDiagonal + valor[l][c]
		 		}
		 		somaTotal = somaTotal + valor[l][c]
		 	}	 
		 	
		 	
		 }
		 escreva("A soma dos números da Diagonal Principal é: ",somaDiagonal)
		 escreva("\n")
		 escreva("A soma dos valores da matriz é: ",somaTotal)
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */