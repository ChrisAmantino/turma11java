programa
{
	
	funcao inicio()
	{
		inteiro matriz[4][3]
		
		para(inteiro l = 0; l<=3; l++)
		{
			para(inteiro c = 0; c<=2; c++)
			{
				escreva("Digite um valor para linha ", l+1, " e coluna ", c+1, ": ")
				leia(matriz[l][c])
			}
		}
		para(inteiro l = 0; l<=3; l++)
		{
			para(inteiro c = 0; c<=2; c++)
			{
				escreva("[",matriz[l][c],"]")			
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */