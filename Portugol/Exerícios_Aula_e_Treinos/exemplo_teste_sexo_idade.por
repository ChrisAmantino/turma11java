programa
{
	
	funcao inicio()
	{
		//pegar do usuário o nome e
		//mandar uma mensagem de bom dia
		//Colocar "Sr ou Srº" de acordo com a opção
		cadeia nomeUsuario
		caracter opcao
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - para feminino: ")
		leia(opcao)
		se (opcao == 'F'){
			escreva("Oi Senhora ", nomeUsuario)
		}
		senao se (opcao == 'M') {
			escreva("Oi Senhor, ", nomeUsuario)
		}
		senao {
			escreva("Oi Senhorx ", nomeUsuario)
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */