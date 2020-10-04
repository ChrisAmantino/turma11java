programa
{
	
	funcao inicio()
	{
		inteiro numero[6]

		para(inteiro i = 0; i<=5; i++)
		{
			escreva("Digite um numero para salvar na posição ", i+1, ": ")
			leia(numero[i])
		}
		para(inteiro i = 0; i<=5; i++)
		{
			escreva("\nO numero que você salvou na posição ", i+1, " é: ", numero[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */