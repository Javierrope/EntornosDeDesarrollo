import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int factor;

		Scanner sc=new Scanner(System.in);
			System.out.println("Introduce un número para imprimir su tabla de multiplicar: ");
		for (int i=1; i!=0; i++)	{
			factor=sc.nextInt();
			if (factor>0) {
				for (int j=1; j < 11; j++) {
					System.out.println(j + "*" + factor + "="+ (j*factor) );	
				}
			}
			else {
				System.out.println("Por favor, introduce un número positivo");
			}
		}
	}
}

