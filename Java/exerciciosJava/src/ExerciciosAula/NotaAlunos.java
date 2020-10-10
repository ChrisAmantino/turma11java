package ExerciciosAula;

import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String alunos[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Concei��o de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Ros�rio de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","Jo�o Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","M�nica dos santos ribeiro","Nat�lia Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corr�a","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"};
		int notas[] = new int[39];
		char continua = 'S';
		int codigoAluno, nota;
		
		
		do 
		{
			for (int i = 0; i < alunos.length; i++)
			{
				System.out.printf("C�digo : %d -  Aluno: %s - Nota: %d\n", (i+1), alunos[i], notas[i]);
			}
			
			System.out.println("Escolha um aluno pelo c�digo: ");
			codigoAluno = leia.nextInt();
			
			System.out.printf("Qual a nota do aluno %s?: ", alunos[codigoAluno-1]);
			nota = leia.nextInt();
			
			notas[codigoAluno-1] = nota;
			
			System.out.println("Continua?");
			continua = leia.next().toUpperCase().charAt(0);			
						
		} while (continua == 'S');
		
		for (int i = 0; i < alunos.length; i++)
		{
			System.out.printf("C�digo: %d - Aluno: %s - Nota: %d\n", (i+1), alunos[i], notas[i]);
		}
		
		
		leia.close();
		

	}

}
