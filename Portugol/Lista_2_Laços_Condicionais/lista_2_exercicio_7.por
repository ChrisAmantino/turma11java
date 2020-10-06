programa
{
	
	funcao inicio()
	{
		/*
		 * Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.
		 * variavel base e altura
		 */
		 real base
		 real altura
		 real area = 0.0

		 escreva("Digite aqui a base do seu triângulo: ")
		 leia(base)
		 escreva("Digite aqui a altura do seu triângulo: ")
		 leia(altura)

		 se (base > 0 e altura > 0)
		 {
		 	area = (base*altura)/2
		 	escreva("A área do seu triângulo é: ",area)		 	
		 }
		 senao
		 {
		 	escreva("Ops! Há algo errado! Não é possível calcular a área do seu triangulo, pois os dados devem ser positivos e diferentes de 0!")
		 }
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */