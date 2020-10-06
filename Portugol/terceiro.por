programa
{
	
	funcao inicio()
	{
	//Objetivo: receber um nome digitado pelo usuario
	// receber uma mensagem na tela com esse nome
	// varia = variável
	// recebe muitas letras - cadeia de caracteres
	
	//ingredientes
	cadeia nomeUsuario //camelCase - criou uma variavel na memória
	inteiro anoNascimento //variavel numerica para idade
	real salarioUsuario //variavel numerica para numeros quebrados
	inteiro idadeUsuario = 0

	//modo de preparo
	escreva("Digite o nome do usuário: ") // escreveu na tela
	leia(nomeUsuario) // prepara o teclado e recebe a digitação
	escreva("Ano de nascimento do usuário: ")
	leia(anoNascimento)
	escreva("Digite o salário: ")
	leia(salarioUsuario)

	//processamento
	idadeUsuario = 2020 - anoNascimento
	//saída
	escreva("\n Oi, meu nome é " + nomeUsuario) 
	escreva("\n nasci no ano de " + anoNascimento) // o \n é para pular linha
	escreva("\n salário atual é " + salarioUsuario)
	escreva("\n minha idade é " + idadeUsuario)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 960; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */