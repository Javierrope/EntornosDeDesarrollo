import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num=0,suma=0,contador=0,media=0;
		System.out.println("Introduzca un número: ");
		Scanner sc=new Scanner(System.in);
		num =sc.nextInt();
		
		while (num > 0) {
			suma +=num;
			contador++;
			System.out.println("Introduzca un número: ");
			num=sc.nextInt();
	   	}
		
		if (contador==0) {
			System.out.println("No se puede calcular.");
		}
		else {
			media=suma/contador;
			System.out.println("La media es: " + media);
		}
	}

}
