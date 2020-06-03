package cursose;

public class Animal {
	
	private String nombre;
	
	private int edad;
	
	private String tipo_alimentacion;
	

	public Animal(String nombre, int edad, String tipo_alimentacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tipo_alimentacion = tipo_alimentacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipo_alimentacion() {
		return tipo_alimentacion;
	}

	public void setTipo_alimentacion(String tipo_alimentacion) {
		this.tipo_alimentacion = tipo_alimentacion;
	}
	
	
}
