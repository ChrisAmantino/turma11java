programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um sistema que leia as 3 notas de um aluno 
		 * e calcule a média final deste aluno. Considerar que a 
		 * média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */

		 real notaA = 0
		 real notaB = 0
		 real notaC = 0
		 real mediaFinal

		 escreva("Digite sua nota A: ")
		 leia(notaA)
		 escreva("Digite sua nota B: ")
		 leia(notaB)
		 escreva("Digite sua nota C: ")
		 leia(notaC)
		 mediaFinal = ( ((notaA*2) + (notaB*3) + (notaC*5))/10
		 )
		 escreva("Sua média final é: ",mediaFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */