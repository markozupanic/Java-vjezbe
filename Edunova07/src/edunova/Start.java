package edunova;

import javax.swing.JButton;

public class Start {
	
	public static void main(String[] args) {
		
		Osoba osoba =new Osoba();
		osoba.setSifra(1);
		System.out.println(osoba.getSifra());
		
		JButton b=new JButton();
		
		Racunalo racunalo =new Racunalo();
		racunalo.setSifra(1);
		racunalo.setNaziv("HP");
		racunalo.setDatumNabave(RadSDatumima.kreirajDatum(2022, 7, 4));
		racunalo.setIspravno(true);
		
		System.out.println(racunalo.getNaziv());
		System.out.println(racunalo.getDatumNabave());
		
		Osoba[] osobe =new Osoba[30];
		for(int i=0;i<30;i++) {
			osoba =new Osoba();
			osoba.setSifra(i+1);
			osobe[i]=osoba;
}
		
		for(Osoba o:osobe) {
			System.out.println(o.getSifra());
		}
		
		
	}

}
