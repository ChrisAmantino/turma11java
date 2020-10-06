programa
{
	
	funcao inicio()
	{
		/*
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
		 * o rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que 
		 * o estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa 
		 * de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
		 * e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João 
		 * deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		 // se o tomate for > 50, pagara 4 reais por cada kg excedente

		inteiro P = 0
		inteiro E = 0
		real M = 0

		escreva("Digite o peso de tomates em quilos: ")
		leia(P)
		

		se (P > 50)
		{	
			E = P-50
			M = E*4
			escreva("Seu excesso foi de: " , E, " kg, e você pagará " , M, " reais de multa")
		}
		senao 
		{
			E = 0
			M = 0
			escreva("Seu excesso foi de ", E, " e você pagará ", M, " reais de multa")
		}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1055; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */