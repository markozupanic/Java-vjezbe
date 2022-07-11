package edunova;

import javax.swing.JOptionPane;

import edunova.klase.Polaznik;
import edunova.klase.Pravokutnik;
import edunova.klase.Predavac;
import edunova.zadatak2.Uredjaj;

public class Start {
	
	
	
	public static void main(String[] args) {
		
		
		Pravokutnik p;
		
		p=new Pravokutnik(20,10);
		
		System.out.println(p.getVisina()*p.getSirina());
		
		Polaznik polaznik=new Polaznik();
		Predavac predavac = new Predavac();
		
		p =new Pravokutnik(5,5);
		
		System.out.println(p);
		
		Pravokutnik drugi=new Pravokutnik(5,5);
		
		System.out.println(p.equals(drugi));
		System.out.println(p.hashCode());
		System.out.println(drugi.hashCode());
		
		polaznik =new Polaznik("Pero","Preiæ","2022/12");
		System.out.println(polaznik);
		
		predavac = new Predavac("Maja","Majiæ","HR2321");
		
		System.out.println(predavac);
		
		
		
		
		
		Uredjaj uredjaj=new Uredjaj();
		uredjaj=new Uredjaj("HP");
		System.out.println(uredjaj);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
