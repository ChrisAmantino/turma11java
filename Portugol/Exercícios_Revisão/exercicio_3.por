programa
{
	
	funcao inicio()
	{
		/*
		 * Escrever um programa que leia uma quantidade desconhecida de números 
		 * e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
		 * A entrada de dados deve terminar quando for lido um número negativo.
		 */

		 inteiro posicao[4], numero


		faca
		{
			
			escreva("Digite qualquer numero positivo menor ou igual a 100: ")
			leia(numero)
			limpa()
			se (numero >= 0 e numero <=25)
			{
			posicao[0]++
			}
			senao se (numero >= 26 e numero <= 50)
			{
				posicao[1]++
			}
			senao se (numero >= 51 e numero <= 75)
			{
				posicao[2]++
			}
			senao se ( numero >= 76 e numero <=100)
			{
				posicao[3]++
			}
			
		} enquanto(numero >= 0 e numero <=100)
		
		escreva("Você não digitou um número dentro da regra!")
		pula()

		escreva("Quantidade de numeros no intervalo 0-25: ", posicao[0])
		pula()
		escreva("Quantidade de numeros no intervalo 26-50: ", posicao[1])
		pula()
		escreva("Quantidade de numeros no intervalo 51-75: ", posicao[2])
		pula()
		escreva("Quantidade de numeros no intervalo 76-100: ", posicao[3])
		
		 
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
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */