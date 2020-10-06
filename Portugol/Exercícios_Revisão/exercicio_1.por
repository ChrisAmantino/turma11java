programa
{
	
	funcao inicio()
	{
		/*
		 * 1-	Elabore um programa que calcule o que deve ser pago por um produto,
		 * considerando o preço normal de etiqueta e a escolha da condição de pagamento
		 * .Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
		 * escolhida e efetuar o cálculo adequado.
			Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		*/
		const inteiro LIMITE = 5
		cadeia instrumentos[LIMITE] = {"Violino", "Guitarra", "Saxofone", "Violão", "Contrabaixo"}
		real precos[LIMITE] = {200.50, 600.00, 175.90, 300.00, 450.25}
		inteiro i = 0 
		inteiro codigo = 0
		inteiro opcaoPag = 0
		real desconto = 0
		real juros = 0

		para( i = 0; i < LIMITE; i++)
		{
			escreva("Codigo do produto: ", i+1, " -", instrumentos[i], " = ", precos[i], ";")
			pula()			
		}
		escreva("Digite o código do produto que você deseja comprar: ")
		leia(codigo)
		limpa()
		escreva("Voce selecionou o produto: ", instrumentos[codigo-1], " no valor de ", precos[codigo-1])
		pula()
		linha()
		pula()
		escreva("Selecione uma forma de pagamento: ")
		pula()
		escreva("1 - À vista em dinheiro ou cheque, recebe 20% de desconto;")
		pula()
		escreva("2 - À vista no cartão de crédito, recebe 15% de desconto;")
		pula()
		escreva("3 - Em duas vezes, preço normal de etiqueta sem juros;")
		pula()
		escreva("4 - Em três vezes, preço normal de etiqueta mais juros de 10%;")
		pula()
		pula()
		escreva("Opção de pagamento: ")
		leia(opcaoPag)
		limpa()

		se(opcaoPag == 1)
		{
			desconto = precos[codigo-1] - (precos[codigo-1]*0.2)
			escreva("Voce selecionou a opção de pagamento ", opcaoPag)
			pula()
			escreva("O valor inicial do seu produto é: ", precos[codigo-1], " e com o desconto de 20% você pagará ", desconto)
		}
		senao se(opcaoPag == 2)
		{
			desconto = precos[codigo-1] - (precos[codigo-1]*0.15)
			escreva("Voce selecionou a opção de pagamento ", opcaoPag)
			pula()
			escreva("O valor inicial do seu produto é: ", precos[codigo-1], " e com o desconto de 15% você pagará ", desconto)
		}
		senao se(opcaoPag == 3)
		{
			escreva("Voce selecionou a opção de pagamento ", opcaoPag)
			pula()
			escreva("O valor do seu produto é: ", precos[codigo-1], ", sem descontos e sem juros!")
		}
		senao se(opcaoPag == 4)
		{
			juros = (precos[codigo-1] + (precos[codigo-1] * 0.1))
			escreva("Voce selecionou a opção de pagamento ", opcaoPag)
			pula()
			escreva("O valor inicial do seu produto é: ", precos[codigo-1], " , com o acréscimo de 10% de juros, seu produto custará: ", juros)
		}
		senao
		{
			escreva("Você não selecionou nenhuma opção de pagamento, reinicie o programa!")
		}
		
		
		
	}
	funcao pula()
	{
		escreva("\n")	
	}
	funcao linha()
	{
		para(inteiro x = 0; x <= 60; x++)
		escreva("#")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */