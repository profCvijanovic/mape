package mapeVezba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Osoba;

public class GlavnaMape {

	public static void main(String[] args) {
	
			
		Osoba osoba1 = new Osoba();
			osoba1.setIme("Nenad");
			osoba1.setPrezime("Cvijanovic");
			osoba1.setJmbg("0402987710234");
		
		Osoba osoba2 = new Osoba("Pera","Zdera","1204987710456");
		
		List<Osoba> listaOsoba = new ArrayList<Osoba>();
			listaOsoba.add(osoba1);
			listaOsoba.add(osoba2);
		
		System.out.println(listaOsoba.get(1).getIme());
		
		Map<String, String> mapaImena = new HashMap<String, String>() ; // inicijalizacija mape
		
			mapaImena.put("m3", "Maja");
			mapaImena.put("a1", "Nenad");
			mapaImena.put("s2", "Pera");
		
		
		System.out.println("Ime osobe je: " + mapaImena.get("m3"));
		
		
	}

}
