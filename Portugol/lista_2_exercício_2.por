programa
{
	
	funcao inicio()
	{
		/*
		 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número 
		 * de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha 
		 * R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento 
		 * armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o salário total e o salário excedente.
		 */

		inteiro C = 0
		inteiro N = 0
		inteiro E = 0
		inteiro salario = 0
		inteiro salarioTotal = 0
		
		escreva("Digite aqui seu código: ")
		leia(C)
		escreva("Digite aqui seu número de horas trabalhadas: ")
		leia(N)

		salario = N * 10

		se (N>50) 
		{
			E = (N - 50)*20
			salarioTotal = 500 + E
			// posso colocar o escreva("seu salário.......) aqui
		}
		senao 
		{
			E = 0
			salarioTotal = salario + E
			//// posso colocar o escreva("seu salário.......) aqui também
		} 
		escreva("Seu salário excedente é ", E, " reais, e seu salário total é " ,salarioTotal, " reais")
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 866; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */