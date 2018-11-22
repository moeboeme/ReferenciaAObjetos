package mascotas;

public class Gato extends Mascota {
	
	public Gato(String nombre, String color)
	{
		setColor(color);
		setNombre(nombre);
	}
	
	@Override
	public void molestar()
	{
		System.out.println("rasguños! maullidos");
	}

	@Override
	public String getTipoMascota() {
		return "gato";
	}
	
}
