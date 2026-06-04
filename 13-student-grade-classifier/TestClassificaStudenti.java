package GestioneStudenti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClassificaStudenti {
    public static void main(String[] args) {
        // Creazione di una collezione di oggetti Studente
        List<Studente> elencoStudenti = new ArrayList<>();

        // Studenti creati SENZA residenza nota (Costruttore 1)
        Studente s1 = new Studente("Mario Rossi", 1001, 5);
        Studente s2 = new Studente("Giulia Bianchi", 1002, 4);

        // Studenti creati CON residenza nota (Costruttore 2)
        Studente s3 = new Studente("Luigi Verdi", 1003, 6, "Italia");
        Studente s4 = new Studente("Anna Neri", 1004, 5, "Spagna");

        // Aggiunta degli studenti alla lista
        elencoStudenti.add(s1);
        elencoStudenti.add(s2);
        elencoStudenti.add(s3);
        elencoStudenti.add(s4);

        // Simulazione inserimento voti esami
        s1.aggiungiVoto(0, 24);
        s1.aggiungiVoto(1, 28);
        s1.aggiungiVoto(2, 30); // Media s1: 27.33

        s2.aggiungiVoto(0, 18);
        s2.aggiungiVoto(1, 22); // Media s2: 20.00

        s3.aggiungiVoto(0, 28);
        s3.aggiungiVoto(1, 29);
        s3.aggiungiVoto(2, 30); // Media s3: 29.00

        s4.aggiungiVoto(0, 25);
        s4.aggiungiVoto(1, 25); // Media s4: 25.00

        // Test inserimento tardivo della residenza per s1
        s1.setPaeseResidenza("Francia");

        System.out.println("--- Elenco studenti ORIGINALE ---");
        for (Studente s : elencoStudenti) {
            System.out.println(s);
        }

        // Ordinamento automatico basato sul compareTo (Media in ordine decrescente)
        Collections.sort(elencoStudenti);

        System.out.println("\n--- Graduatoria studenti (Ordine Decrescente di Media) ---");
        for (Studente s : elencoStudenti) {
            System.out.println(s);
        }

        // Test rapido del metodo equals
        Studente cloneFittizio = new Studente("Infiltrato", 1001, 3);
        System.out.println("\nVerifica uguaglianza matricola 1001: " + s1.equals(cloneFittizio));
    }
}
