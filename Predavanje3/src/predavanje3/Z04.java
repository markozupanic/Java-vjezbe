package predavanje3;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		int k = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		
		if(i>j && i>k) {
			
			System.out.println(i);
		}else if(j>i && j>k) {
			System.out.println(j);
		}else {
			System.out.println(k);
		}
	}

}
