package zavrsniutil;

import java.util.List;

import zavrsnimodel.Proizvod;

public class ProizvodCRUD {
	
	
	public static Proizvod unosNovog() {
		
		Proizvod p= new Proizvod();
	    p.setSifra(Pomocno.ucitajInt("Unesite sifru smjera"));
	    p.setNaziv(Pomocno.ucitajString("Unesi naziv proizvoda"));
	    p.setCijena(Pomocno.ucitajInt("Unesite cijenu prozvoda"));
	    p.setKolicina(Pomocno.ucitajInt("Unesite kolicinu proizvoda"));
		
	    
	    return p;
	}
	
	
	
	
	public static void ispis(List <Proizvod> proizvodi) {
		
		int rb=1;
		System.out.println("");
		System.out.println("Proizvodi u aplikaciji");
		for(Proizvod p: proizvodi) {
			
			System.out.println(rb++ + ". " + p.getNaziv());
			
		}
		
		System.out.println("-----------");
	}
	
	
	
	
	
	public static void promjena(Proizvod p ) {
		
		p.setSifra(Pomocno.ucitajInt("sifra (" + p.getSifra() + ")",true));
		p.setNaziv(Pomocno.ucitajString("naziv (" + p.getNaziv() + ")"));
		p.setVrsta(Pomocno.ucitajString("vrsta (" + p.getVrsta() + ")"));
		p.setCijena(Pomocno.ucitajInt("cijena (" + p.getCijena() + ")"));
		p.setKolicina(Pomocno.ucitajInt("kolièina (" + p.getKolicina() + ")"));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
