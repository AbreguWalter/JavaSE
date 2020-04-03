package cursose;

public class Condicionales {

	public static void main(String[] args) {
		//Condicionales
		int z = 10;
		int y = 20;
		int mayor;
		
		if (z > y) {
			mayor = z;
		} else {
			mayor = y;
		}
		
		//De forma rapida
		
		mayor = (z > y) ? z : y;
		
		System.out.println(mayor);

	}

}
