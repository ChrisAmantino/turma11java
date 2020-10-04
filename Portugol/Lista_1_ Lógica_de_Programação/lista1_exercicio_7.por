programa
{
	
	funcao inicio()
	{
		/*
		 * Um sistema de equações lineares do tipo: 
		 * ax+by = c
		 * dx+ey = f , pode ser resolvido segundo mostrado abaixo :
		 * x = (ce-bf)/(ae-bd) e y = (af-cd)/(ae-bd)
		 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
		 */

		 real A
		 real B
		 real C
		 real D
		 real E
		 real F
		 real X
		 real Y
		 

		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de b: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		escreva("Digite o valor de D: ")
		leia(D)
		escreva("Digite o valor de E: ")
		leia(E)
		escreva("Digite o valor de F: ")
		leia(F)
		 X = ( (C*E) - (B*F) ) / ( (A*E) - (B*D) )
		 Y = ( (A*F) - (C*D) ) / ( (A*E) - (B*D) )
		 escreva(X)
		 escreva("\n")
		 escreva(Y)
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */