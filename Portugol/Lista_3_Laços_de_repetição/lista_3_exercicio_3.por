programa
{
	
	funcao inicio()
	{
		/*
		 * Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
		 * no final o total do somatório, a média e o total de valores lidos. O programa deve fazer 
		 * as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, 
		 * o programa deve parar quando o usuário fornecer um valor negativo.
		 * variaveis:
		 * - somatorio(somatorio+numero)
		 * - media(somatorio/totalValores)
		 * - total de valores lidos
		 * -Valor oferecido pelo usuario(somente positivos) = numero
		 */

		 inteiro numero=0, somatorio = 0, media = 0, totalValores = 0
		
		 
		 enquanto(numero >= 0)
		 {
		 	limpa()
		 	escreva("Digite um numero positivo: ")
		 	leia(numero)

		 	se(numero >= 0)
		 	{
		 		somatorio = somatorio + numero
		 		totalValores = totalValores+1
		 		media = somatorio/totalValores
		 	}
		 	
		 } 
		 escreva("A soma de todos os valores que você digitou foi: ",somatorio,";")
		 escreva("\n")
		 escreva("Voce digitou: ", totalValores, " valores;")
		 escreva("\n")
		 escreva("A média dos valores que você digitou é: ",media,".")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 692; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */