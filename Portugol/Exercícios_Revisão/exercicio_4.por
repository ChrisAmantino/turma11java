programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */
		inteiro numerador = -1, denominador = 0, soma = 0

		faca 
		{
		 denominador++
		 soma = soma + (numerador/denominador)
		 numerador = numerador + 2
		 escreva(numerador, "/" ,denominador)
		 pula()
		} enquanto (numerador <99 e denominador < 50)

		escreva("A soma dos numeros 1/1 + 3/2  + 5/3 + 7/4 + ... + 99/50 é: ", soma)

	}
		
		funcao pula()
	{
		escreva("\n")
	}
		

		
}
	


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */