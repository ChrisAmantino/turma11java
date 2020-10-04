programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

			declarar:
			matriz N1[4][6]
			matriz N2[4][6]

			a)
			M1 = [l][c] = [0][0](da N1) + [0][0](da N2)

		 */
		 const inteiro LIMITELINHA = 4, LIMITECOLUNA = 6
		 inteiro N1[LIMITELINHA][LIMITECOLUNA], N2[LIMITELINHA][LIMITECOLUNA], M1soma[LIMITELINHA][LIMITECOLUNA], M2menos[LIMITELINHA][LIMITECOLUNA]
		 inteiro l = 0, c = 0

		 para(l = 0; l < LIMITELINHA; l++)
		 {
		 	para(c = 0; c < LIMITECOLUNA; c++)
		 	{
		 		N1[l][c] = Util.sorteia(1,50)
		 		N2[l][c] = Util.sorteia(1,50)
		 		pula()
		 		escreva("Em N1, o valor da linha ",l,", coluna ",c," é de:", N1[l][c])
		 		pula()
		 		escreva("Em N2, o valor da linha ",l,", coluna ",c," é de:", N2[l][c])
		 		pula()
		 		
		 	}
		 	pula()
		 	pula()
		 	pula()
		 	linha2()
		 	pula()
		 	pula()
		 	pula()
		 para para(l = 0; l < LIMITELINHA; l++){
		 	para(c = 0; c < LIMITECOLUNA; c++)
		 	{
		 		M1soma[l][c] = N1[l][c] + N2[l][c]
		 		M2menos[l][c] = N1[l][c] - N2[l][c]
		 		pula()
		 		escreva("Em M1, o valor da linha ",l,", coluna ",c," é de:", M1soma[l][c])
		 		pula()
		 		escreva("Em M2, o valor da linha ",l,", coluna ",c," é de:", M2menos[l][c])
		 		pula()
		 	}
		 }
		 }
		 
		 

		 

		 
	}
	funcao linha()
	{
		escreva("****************************************************************************")
	}
	funcao pula(){
		escreva("\n")
	}
	funcao linha2()
	{
		escreva("############################################################################")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */