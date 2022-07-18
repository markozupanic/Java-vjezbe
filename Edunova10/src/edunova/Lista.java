package edunova;

import java.util.ArrayList;
import java.util.List;

import model.Predavac;

public class Lista {
	
	public Lista() {
		List<Predavac> lista=new ArrayList<>();
		Predavac p=new Predavac();
		p.setIme("Pero");
		lista.add(p);
		
		System.out.println(lista.get(0).getIme());
	}

	public static void main(String[] args) {
		new Lista();
	}
}
