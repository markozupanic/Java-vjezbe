package edunova;

import javax.swing.JOptionPane;

public class Pomocno {
	
	
	public static int ucitajInt(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(
						JOptionPane
						.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"Niste unijeli cijeli broj");
			}
		}
	}
	
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s = JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, 
						"Obavezan unos");
				continue;
			}
			return s;
		}
	}
	
	public static int ucitajInt(String poruka, boolean pozitivni) {
		int i = ucitajInt(poruka);
		if(!pozitivni) {
			return i;
		}
		while(true) {
			if(i<0) {
				JOptionPane.showMessageDialog(null, 
						"Uèitani broj mora biti pozitivan");
				i=ucitajInt(poruka);
				continue;
			}
			return i;
		}
	}
	
	
	public static int slucajniBroj(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}

}
