programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		 * e apresente também quantas foram as ocorrências da maior pontuação.
		 * int main() {
		 */
		 inteiro lancamentos[10]
		 inteiro mediaLancamentos = 0
		 inteiro maiorPontuacao = 0
		 inteiro contador = 0
		 real somaLancamentos = 0.0
		 

		 escreva("Jogando o dado...")
		 escreva("\n")
		 Util.aguarde(1500)

		 para(inteiro i = 0; i<=9; i++)
		 {
		 	 lancamentos[i] = Util.sorteia(1,6)
		 	 se(lancamentos[i] > maiorPontuacao)
		 	 {
		 	 	maiorPontuacao = lancamentos[i]
		 	 }
		 	 somaLancamentos = somaLancamentos + lancamentos[i]
		 }
		 para(inteiro i = 0; i<=9; i++)
		 {
		 	escreva("\nO numero que caiu na ", i+1, "° jogada foi: ", lancamentos[i])
		 	Util.aguarde(1000)
		 	se(lancamentos[i] == maiorPontuacao)
		 	{
		 		contador++
		 	}
		 }
	 escreva("\n")
	 linha()
	 escreva("\nA maior pontuação foi: ",maiorPontuacao)
	 escreva("\nA soma de todos os lançamentos foi de: ",somaLancamentos)
	 escreva("\nA maior pontuação ocorreu ", contador, " vez(es)")
	 escreva("\nA média da soma total dos valores dos lançamentos foi de: ", (somaLancamentos/10),"\n")
	 linha()
		 
	}
	funcao linha()
	{
		escreva("****************************************************************************")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */