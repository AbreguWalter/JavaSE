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
		
		
		int day = 5;
        String dayString;
         
        // instrucci�n switch con tipo de datos int
        switch (day) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia inv�lido";
                     break;
        }
        System.out.println(dayString);

	}

}
