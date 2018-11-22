package mascotas;

public abstract class Mascota {
	private String color ;
	private String nombre ;
	
	public String getColor()
	{
		return this.color ;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract String getTipoMascota() ;
 	
	@Override
	public String toString()
	{
		return this.getTipoMascota() + ": " + getNombre() +"\nColor:" + getColor() + "\n" ;
	}
	public void setNombre( String nombre)
	{
		this.nombre = nombre ;
	}
	public String getNombre()
	{
		return this.nombre ;
	}
	
	public abstract void molestar() ;
	
	
}
