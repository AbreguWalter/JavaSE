package cursose;

public class Clase {
	
	private String nombre;
	
	private int edad;
	
	public void saludar() {
		nombre = "Walter Abregu";
		System.out.println("Hola " + nombre);
	}
	/*
	 *Java tiene diferentes metodos , ya sean los que no tienen retorno como el void 
	 * o los que si tiene un valor especifico de retorno que tiene un tipo de valor y un return 
	 * en el metodo como el metodo saludar2
	 */

	public String saludar2(String datos) {
		return datos;
	}
	
	public static void main(String[] args) {
		Clase se = new Clase();
		se.saludar();

	}
	
	/*
	 * Java tiene ambitos de una variable
	 * public que pueden acceder dentro del proyecto
	 * private que es solo para la clase que la esta usando
	 * protected solo es para la clase padre e hijo
	 * package no es muy mensionada porque es el ambito que tiene por defecto cuando 
	 * no le ponemos ningun de los 3 anteriores , java lo interpreta como que 
	 * su ambito solo es dentro del paquete donde fue creado.
	 * */

}
