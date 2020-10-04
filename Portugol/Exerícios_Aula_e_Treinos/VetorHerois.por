programa
{
	
	funcao inicio()
	{
		cadeia herois[4]

		para(inteiro i = 0; i<=3; i++)
		{
			escreva("Digite um nome para seu heroi ", i+1, ": ")
			leia(herois[i])
			limpa()
		}
		para(inteiro i = 0; i<=3; i++)
		{
			escreva("\nSeu heroi ", i+1, " é: ", herois[i])
		}

		para(inteiro i = 3; i>=0; i--)
		{
			escreva("\nSeu heroi ", i-1, " é: ", herois[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */