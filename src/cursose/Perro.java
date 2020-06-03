package cursose;

public class Perro extends Animal{
	
	private String rasa;
	
	public Perro(String nombre, int edad, String tipo_alimentacion, String rasa) {
		super(nombre, edad, tipo_alimentacion);
		this.rasa = rasa;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public void moludo() {
		System.out.println(getNombre() + " - "+ getEdad() + " - " + getTipo_alimentacion() + " - " + rasa);
	}
}
