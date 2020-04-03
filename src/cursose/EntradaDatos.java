package cursose;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre:");
		String nombre = input.next();
		System.out.println("Tu nombre es :" + nombre);
		
		System.out.println("Ingrese un numero:");
		int numero = input.nextInt();
		System.out.println("Tu numero es :" + numero);
	}

}
