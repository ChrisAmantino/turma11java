package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) 
	{
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
		 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas 
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:(WHILE)
			o número de pessoas calmas; 
			o número de mulheres nervosas; 
			o número de homens agressivos; 
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos; 
			o número de pessoas calmas com menos de 18 anos.
			idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, 
		 *se a pessoa era agressiva).
		 *limite = 150 pessoas (mas posso TESTAR com menos pessoas); 
		 */
		//instanciando o objeto teclado chamado leia
		Scanner leia = new Scanner(System.in);
		
		//declarar as variáveis
		final int LIMITE = 3;
		int idade;
		byte sexo; //1-feminino / 2-masculino / 3-Outros
		byte opc; //1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva.
		//tipo byte = é um tipo númerico, que ocupa pouca memória.
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosas40 = 0, calmasMenor18 = 0;
		int contador = 1; // pra entrar no laço
		
	
		while (contador <= LIMITE) 
		{	
			contador++; //fuga do laço
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros: ");
			sexo = leia.nextByte();
			System.out.print("Digite para cada tipo de pessoa: 1 - Calma/ 2 - Nervosa / 3 - Agressiva: ");
			opc = leia.nextByte();
			leia.nextLine(); //limpeza de buffer teclado (limpa a memória do teclado pra proxima digitação); Senha não pode ter buffer de teclado. O buffer é a memória que salva o que a pessoa digitou, é uma memoria curta.
			
			
			if(opc == 1)
			{
			pessoasCalmas = pessoasCalmas + 1;
			}
			else if (opc == 2 && sexo == 1)
			{
				mulheresNervosas = mulheresNervosas + 1;
			}
			else if (opc == 3 && sexo == 2)
			{
				homensAgressivos = homensAgressivos + 1;
			}
			if (opc == 1 && sexo == 3)
			{
				outrosCalmos = outrosCalmos + 1;
			}
			if (opc == 2 && idade > 40)
			{
				nervosas40 = nervosas40 +1;
			}
			if (opc == 1 && idade < 18)
			{
				calmasMenor18 = calmasMenor18 + 1;
			}
			
					
			
		}
		
		System.out.printf("\nO total de pessoas calmas é: %d", pessoasCalmas);
		System.out.printf("\nO total de mulheres nervosas é: %d", mulheresNervosas);
		System.out.printf("\nO total de homens agressivos é: %d", homensAgressivos);
		System.out.printf("\nO total de outros calmos é: %d", outrosCalmos);
		System.out.printf("\nO total de pessoas nervosas com mais de 40 anos é: %d", nervosas40);
		System.out.printf("\nO total de pessoas calmas menores de 18 anos é: %d", calmasMenor18);
		
	
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
