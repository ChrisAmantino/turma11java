programa
{
	
	funcao inicio()
	{
		inteiro numero[6],x

		para(x = 0; x<=5; x++)
		{
			limpa()
			escreva("Digite um numero positivo: ")
			leia(numero[x])
		}
		para(x = 0; x<=5; x++)
		{
			escreva("\nA posição ", x+1, " é o numero: ", numero[x])
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */