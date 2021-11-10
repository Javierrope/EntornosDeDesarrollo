import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num1=0,num2=0;
		
		do {
			System.out.println("Introduce el primer número: ");
			Scanner sc=new Scanner(System.in);
			num1=sc.nextInt();
			System.out.println("Introduce el segundo número: ");
			Scanner sc2=new Scanner(System.in);
			num2=sc.nextInt();
		} while (num1!=num2);
		System.out.println("Los números son iguales");
	}
}
