package mapeVezba;

import model.Osoba;

public class GlavnaMape {

	public static void main(String[] args) {
		
		String adresa = "Knez Mihajlova";
		
		char poslednjiKarakter = adresa.charAt(adresa.length() - 1);
		boolean daLiJePoslednjiKarakterCifra = Character.isDigit(poslednjiKarakter);
		if(daLiJePoslednjiKarakterCifra) {
			System.out.println("Jeste cifra");
		}else {

			System.out.println("Nije cifra...");
		}
		
		
		Osoba osoba = new Osoba();
			osoba.setIme("Nenad");
			osoba.setPrezime("Cvijanovic");
			osoba.setJmbg("0402987710234");
		
		Osoba osoba2 = new Osoba("Pera","Zdera","1204987710456");
		
		System.out.println("Ime osobe je: " + osoba.getIme());
		System.out.println("Prezime osobe2 je: " + osoba2.getPrezime());
		
	}

}
