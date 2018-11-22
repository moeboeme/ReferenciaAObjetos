package duenio;

import java.util.List;

import mascotas.Mascota;

public class Duenio {
	private String nombre ;
	private int edad ;
	private List<Mascota> mascotas ;
	
	public Duenio( String nombre, int edad, List<Mascota> mascotas )
	{
		setNombre(nombre);
		setEdad(edad);
		setMascotas(mascotas);
	}
	
	@Override
	public String toString ()
	{
		return "Hola! soy: " + getNombre() + "\ntengo: " + getEdad() + " años\n"
				+ "mis mascotas son:\n" + getMascotas() + "\n\n";
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

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	

}
