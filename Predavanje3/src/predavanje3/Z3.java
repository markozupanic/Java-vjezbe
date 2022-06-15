package predavanje3;


import javax.swing.JOptionPane;

public class Z3 {

	public static void main(String[] args) {
		// Za unesena dva cjela broj
		// program ispisuje najveæi
		
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		
		if (i>j) {
			System.out.println(i);
		}else {
			System.out.println(j);
		}

	}

}
