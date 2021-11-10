import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el segeundo número: ");
		num2=sc.nextInt();
		
		if  (num1>num2){
			System.out.println("El mayor es: " + num1);
		}
		else {
			if (num1==num2) {
			System.out.println("Son iguales.");
			}
			else {
			System.out.println("El mayor es: "+ num2);
			}
		}
	}

}
