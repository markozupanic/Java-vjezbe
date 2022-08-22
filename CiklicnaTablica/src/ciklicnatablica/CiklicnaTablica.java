package ciklicnatablica;



import javax.swing.JOptionPane;

public class CiklicnaTablica {
	
	   int red=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	    int stupac=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));;
       int[][] tablica = new int[red][stupac];
       int brojac=1;
       char smjer='E';
       int ljevo=0, gore=0, desno=stupac-1, dolje=red-1;
       while(ljevo<=desno && gore<=dolje) {
           if(smjer == 'E') {
               for(int i=ljevo; i<=desno; i++) {
                   tablica[gore][i] = brojac++;
               }
               gore++;
               smjer='S';
           }
           else if(smjer=='S') {
               for(int i=gore; i<=dolje; i++) {
                   tablica[i][desno] = brojac++;
               }
               desno--;
               smjer='W';
           }
           else if(smjer=='W') {
               for(int i=desno; i>=ljevo; i--) {
                   tablica[dolje][i] = brojac++;
               }
               dolje--;
               smjer='N';
           }
           else {
               for(int i=dolje; i>=gore; i--) {
                   tablica[i][ljevo] = brojac++;
               }
               ljevo++;
               smjer='E';
           }
       }
       for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {

				System.out.printf("%4d", tablica[i][j]);
			}
			System.out.println();
		}

   }
	
}

	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

