programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro num = 10

		enquanto (num>0)
		{
			limpa()
			escreva("A bomba explodirá em...", num)
			num = num - 1
			Util.aguarde(1000)
		} 
		limpa()
		escreva("BOOOOOOOM!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 233; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */