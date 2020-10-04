programa
{
	
	funcao inicio()
	{
		/*
		 *   Faça um programa que crie um vetor por leitura com 5 
		 *   valores de pontuação de uma atividade e o escreva em seguida. 
		 *   Encontre após a maior pontuação e a apresente.
		 *   
		 *   vetor valor[5]
		 *   variavel maiorNumero
		 */
		 inteiro valor[5]
		 inteiro maiorNumero=0

		 para(inteiro i = 0; i<=4; i++)
		 {
		 	escreva("Digite aqui um numero para a pontuação da ", i+1,"° atividade: ")
		 	leia(valor[i])
		 }
		 para(inteiro i = 0; i<=4; i++)
		 {
		 	escreva("\nA pontuação da ", i+1,"° atividade é: ",valor[i])
		 	 	se(valor[i] > maiorNumero)
		 		 {
		 		maiorNumero = valor[i]
				 }
		 }escreva("\nA maior nota é: ", maiorNumero)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */