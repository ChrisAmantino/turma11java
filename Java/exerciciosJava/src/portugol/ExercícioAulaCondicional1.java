package portugol;

import java.util.Scanner;

public class Exerc�cioAulaCondicional1 {

	public static void main(String[] args) {
		/* nome da pessoa, ano de nascimento, sexo, perguntar se � chefe de fam�lia.
		 perguntar se � chefe de fam�lia ou n�o
		 se a pessoa > 18 anos e for chefe de 
		 fam�lia, recebe 600 reais
		 se a pessoa for > 18 e for mulher
		 recebe o dobro
		 escreve"Oi voc� � chefe(a) de fam�lia e vai receber x reais"
		*/
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento, idade;
		char chefeFamilia, sexo;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite seu ano de Nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.print("Voc� � chefe de fam�lia? ");
		chefeFamilia = leia.next().toUpperCase().charAt(0);
		System.out.print("Voc� � masculino ou feminino (m) ou (f)? ");
		sexo = leia.next().toUpperCase().charAt(0);
		
		idade = 2020 - anoNascimento;
		
		if (idade >= 18 && chefeFamilia == 'S') {
			if (sexo == 'F') 
			{
				System.out.printf("Ol�, %s, voc� � chefa de fam�lia e tem direito a R$ 1200,00!", nome);
			}
			else 
			{
				System.out.printf("Ol�, %s, voc� � chefe de fam�lia tem direito a R$ 600,00!", nome);
			}
		} else {
			System.out.printf("Ol�, %s, voc� n�o tem direito ao aux�lio emergencial!", nome);
		}
		leia.close();
		}
	
	

}
