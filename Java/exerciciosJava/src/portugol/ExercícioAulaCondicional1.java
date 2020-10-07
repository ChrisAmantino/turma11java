package portugol;

import java.util.Scanner;

public class ExercícioAulaCondicional1 {

	public static void main(String[] args) {
		/* nome da pessoa, ano de nascimento, sexo, perguntar se é chefe de família.
		 perguntar se é chefe de família ou não
		 se a pessoa > 18 anos e for chefe de 
		 família, recebe 600 reais
		 se a pessoa for > 18 e for mulher
		 recebe o dobro
		 escreve"Oi você é chefe(a) de família e vai receber x reais"
		*/
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento, idade;
		char chefeFamilia, sexo;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite seu ano de Nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.print("Você é chefe de família? ");
		chefeFamilia = leia.next().toUpperCase().charAt(0);
		System.out.print("Você é masculino ou feminino (m) ou (f)? ");
		sexo = leia.next().toUpperCase().charAt(0);
		
		idade = 2020 - anoNascimento;
		
		if (idade >= 18 && chefeFamilia == 'S') {
			if (sexo == 'F') 
			{
				System.out.printf("Olá, %s, você é chefa de família e tem direito a R$ 1200,00!", nome);
			}
			else 
			{
				System.out.printf("Olá, %s, você é chefe de família tem direito a R$ 600,00!", nome);
			}
		} else {
			System.out.printf("Olá, %s, você não tem direito ao auxílio emergencial!", nome);
		}
		leia.close();
		}
	
	

}
