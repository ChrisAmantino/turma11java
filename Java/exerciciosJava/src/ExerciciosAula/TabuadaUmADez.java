package ExerciciosAula;

public class TabuadaUmADez {

	public static void main(String[] args) {
		
		
		for (int x = 1; x <= 10; x++)
		{	
			System.out.println();
			System.out.printf("****Tabuada do %d*****",x);
			
			for(int i = 1; i <= 10; i++)
			{
				System.out.println();
				System.out.printf("%d x %d = %d", x, i, (x*i));
			}
		}

	}

}
