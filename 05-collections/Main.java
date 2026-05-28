package Collezioni;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Persona> studenti = new HashSet<>();
		
		Persona p1 = new Persona("Mario", "Rossi");
		Persona p2 = new Persona("Lucia", "Bianchi");
		Persona p3 = new Persona("Lucia", "Bianchi");
		
		studenti.add(p1);
		studenti.add(p2);
		studenti.add(p1);
		//p1=p2
		//System.out.println(p1.equals(p2));		
		//System.out.println(studenti);
		//System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(studenti);
	}
	
}
