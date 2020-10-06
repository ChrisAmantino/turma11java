programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
		 * para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
			Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
			IMC em adultos Condição 
			Abaixo de 18,5 Abaixo do peso 
			Entre 18,5 e 25 Peso normal 
			Entre 25 e 30 Acima do peso 
			Acima de 30 obeso

			variaveis = altura e peso

		 */

		 real altura, peso, imc = 0.0
			
		 escreva("Digite aqui seu seu peso em Kg: ")
		 leia(peso)
		 pula()
		 escreva("Digite aqui sua altura em metros: ")
		 leia(altura)
		 imc = peso / (altura * altura)
		 mat.arredondar(imc, 2)
		 pula()

		 se ( imc < 18.5 )
		 {
		 	escreva("O resultado do seu IMC foi: ", mat.arredondar(imc, 2), ", e de acordo com esse resultado, você está ABAIXO DO PESO.")
		 }
		 senao se ( imc >= 18.5 e imc < 25 )
		 {
		 	escreva("O resultado do seu IMC foi: ", mat.arredondar(imc, 2), ", e de acordo com esse resultado, você está no PESO NORMAL.")
		 }
		 senao se ( imc >= 25 e imc < 30 )
		{
			escreva("O resultado do seu IMC foi: ", mat.arredondar(imc, 2), ", e de acordo com esse resultado, você está ACIMA DO PESO")
		}
		senao 
		{
			escreva("O resultado do seu IMC foi: ", mat.arredondar(imc, 2), ", e de acordo com esse resultado, você está OBESO")
		}
		
		 
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
 * @POSICAO-CURSOR = 817; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */