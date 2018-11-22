package test;

import java.util.ArrayList;
import java.util.List;

import duenio.Duenio;
import mascotas.Gato;
import mascotas.Mascota;
import mascotas.Perro;

public class TestDueniosYMascotas {
	public static void main(String[] args) {
		Mascota gatoRufo = new Gato("Pelambres", "fucsia?") ;
		List<Mascota> mascotasDeRufo = new ArrayList<> () ;
		mascotasDeRufo.add(gatoRufo) ;
		Duenio rufo = new Duenio("Rufo", 9, mascotasDeRufo) ;
		System.out.println(rufo);
		
		Duenio bart = rufo ;
		
		bart.setNombre("El Barto");
		
		System.out.println(bart);
		System.out.println(rufo);
		
		Mascota huesos = new Perro("Huesos", "marron") ;
		Mascota ayudanteDeSanta = new Gato("Ayudante de Santa", "negro") ;
		
		List<Mascota> mascotasDeBart = new ArrayList<> () ;
		mascotasDeBart.add(huesos) ;
		mascotasDeBart.add(ayudanteDeSanta) ;
		
		Duenio bartSimpsons = new Duenio("Bart", 8, mascotasDeBart) ;
		
		System.out.println(bartSimpsons);
		
		System.out.println("cómo molestan las mascotas de rufo: ");
		rufo.getMascotas().stream().forEach(e -> e.molestar());
		
		System.out.println();
		
		System.out.println("cómo molestan las mascotas de bart: ");
		bartSimpsons.getMascotas().stream().forEach(e -> e.molestar());
		
		
	}
}
