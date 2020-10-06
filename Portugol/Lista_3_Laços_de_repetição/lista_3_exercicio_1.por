programa
{
	
	funcao inicio()
	{
		/*
		 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
		 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
			a) média do salário da população; 
			b) média do número de filhos; 
			c) maior salário; 
			d) percentual de pessoas com salário até R$100,00. 

			variaveis:
			Usuario deve fornecer: salario e numero de filhos
			Eu devo fornecer: 
			- Média salario (soma de todos os salarios / 20)
			- Média numero de filhos (soma de todos os filhos / 20)
			- maior salario
			- Percentual de pessoas com salário até 100,00 (pra isso eu devo ter o numero de pessoas com salario menor que 100)
		 */
		 real salario, quantidadeFilhos, somaSalarios = 0.0, somaFilhos = 0.0, maiorSalario = 0.0, salario100 = 0.0, mediaFilhos = 0.0
		 real mediaSalario = 0.0
		 const inteiro HABITANTES = 3
		 
		 para (inteiro x = 1; x <= HABITANTES; x++)
		 {
		 	limpa()
		 	escreva("Digite aqui seu salário, habitante ", x, ": ")
		 	leia(salario)
		 	escreva("Digite aqui quantos filhos você tem, habitante ", x, ": ")
		 	leia(quantidadeFilhos)

		 	somaFilhos = somaFilhos + quantidadeFilhos
		 	mediaFilhos = somaFilhos/HABITANTES

		 	somaSalarios = somaSalarios + salario
		 	mediaSalario = somaSalarios/HABITANTES

		 	se(salario <= 100.0)
		 	{
		 		salario100 = salario100 + 1
		 	}

		 	se( salario > maiorSalario )
		 	{
		 		maiorSalario = salario
		 	} 	
		 	
		 }
		 escreva("A média de filhos da população é de: ", mediaFilhos, " filho(s);")
		 escreva("\n")
		 escreva("A média salarial da população é de: ",mediaSalario, " reais;")
		 escreva("\n")
		 escreva("O maior salário da população é de: ",maiorSalario, " reais;")
		 escreva("\n")
		 escreva("O porcentual de pessoas que recebem até R$100,00 é de: ",  ((salario100/HABITANTES) * 100), " %.")
		  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1855; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */