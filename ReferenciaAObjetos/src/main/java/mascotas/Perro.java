package mascotas;

public class Perro extends Mascota {
	public Perro(String nombre, String color)
	{
		this.setColor(color);
		this.setNombre(nombre);
	}
	@Override
	public void molestar()
	{
		System.out.println("ladridos!");
	}
	@Override
	public String getTipoMascota() {
		return "perro";
	}
}
