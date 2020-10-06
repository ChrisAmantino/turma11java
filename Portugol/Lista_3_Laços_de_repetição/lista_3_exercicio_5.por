programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Faça um programa que mostre uma contagem na tela de 233 a 456, 
		 * só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		 */
		inteiro valor = 233

		faca{
			limpa()
			se(valor >=300 e valor <=400)
			{
				valor = valor + 3
			}
			senao
			{
				valor = valor + 5
			}
			escreva(valor, "\n")
			Util.aguarde(500)			
		}enquanto(valor <= 456)	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */