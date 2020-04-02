package cursose;
/*
 * Tenemos que tener en cuenta que si un IDE te facilita mucho el trabajo 
 * no olvidar que Java es un lenguaje donde tienes que compilar y luego ejecutar tu proyecto.
 * Java es un lenguaje fuertemente tipado
 * significa que para cada dato tenemos un tipo de variable
 * 
 */
public class JavaSE {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		
		//Tipos de variables
		//Tipo de dato primitivo:
		int numero1 = 2; // no te permite valores nulos
		System.out.println(numero1);
		
		Integer numero = 1;
		System.out.println(numero);
		
		String cadena = "Estudiando el curso de java SE";
		System.out.println(cadena);
		
		Number x = new Integer("9"); // no es muy recomendado
		System.out.println(x);
		
		String texto = "99";
		int suma = Integer.parseInt(texto) + x.intValue();//intValue parsea de un tipo Number a int
		System.out.println(suma);
		
		char caracter; // forma convencional de declaracion
		caracter = 'a';// si colocas comillas dobles ("") saldria un error , porque es para tipo String
		System.out.println(caracter);
		
		Character car = new Character('A');
		//character tiene un . seguido de propiedades que se le puedes aplicar
		System.out.println(car);
		
		//Caracteres especiales como  : \n para salto de linea
		//Si quieres poner "" dentro de una impresion \" para que aparesca
		// \t para una tabulacion
		
		String textoUsado = "WalterAbregu";
		String cadenaTexto = "Suscribete";
		char captura = textoUsado.charAt(0);//extrae el caracter de la posicion que le pasemos por parametro
		System.out.println(captura);
		
		int resultado = textoUsado.compareTo(cadenaTexto);// 0 es identico y diferente de 0 si son diferentes
		//compareToIgnoreCase hace lo mismo pero no diferencia mayusculas de minisculas
		System.out.println(resultado);
		
		boolean resul = textoUsado.contains("u");//busca si tienes el caracter en tu cadena , devuelve true o false
		System.out.println(resul);
		
		int posicion = textoUsado.indexOf("b");// te devuelve la 1era considencia en la cadena
		System.out.println(posicion);
		
		int cantidad = textoUsado.length();// te devuelve la 1era considencia en la cadena
		System.out.println(cantidad);
		
		
	}

}


