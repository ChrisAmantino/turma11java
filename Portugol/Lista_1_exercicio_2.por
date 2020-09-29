programa
{
	
	funcao inicio()
	{
		/*
		 *  Faça um sistema que leia a idade de uma pessoa 
		 *  expressa em dias e mostre-a expressa em 
		 *  anos, meses e dias. 
		 *  1 ano = 365 dias
		 *  1 mes = 30 dias
		 *  1 dia = 1 dias
		 */

		 //ingredientes-variaveis
		 inteiro idadePessoa = 0
		 inteiro anos = 0
		 inteiro meses = 0
		 inteiro dias = 0

		 //modo de preparo
		 escreva("Escreva sua idade em dias: ")
		 leia(idadePessoa)
		 anos = idadePessoa/365
		 escreva("\nTotal de anos: ", anos)
		 meses = (idadePessoa%365)/30
		 escreva("\nTotal de meses: ", meses)
		 dias = (idadePessoa%365)%30
		 escreva("\nTotal de dias: ", dias)
		  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */