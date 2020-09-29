programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso em 
		 * horas, minutos e segundos.
		 * 1 seg 
		 * 1 min = 60 seg
		 * 1 hora = 3600 seg
		 */

		 inteiro tempoDeDuracao = 0
		 inteiro horas = 0
		 inteiro minutos = 0
		 inteiro segundos = 0

		 escreva("Digite aqui a duração do evento em segundos: ")
		 leia(tempoDeDuracao)
		 horas = (tempoDeDuracao/3600)
		 minutos = (tempoDeDuracao%3600)/60
		 segundos = (tempoDeDuracao%3600)%60
		 escreva("Seu evento durou: " + horas + " hora(s), " + minutos + " minuto(s), " + segundos + " segundo(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */