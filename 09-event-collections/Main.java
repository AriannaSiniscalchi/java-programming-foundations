package collezioni02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di una lista polimorfica di tipo Evento
        List<Evento> eventi = new ArrayList<>();

        // Aggiunta di istanze delle sottoclassi[cite: 5, 10]
        eventi.add(new EventoAtmosferico(10)); // Evento con 10 occorrenze[cite: 5, 10]
        eventi.add(new EventoSociale(5));      // Evento con 5 occorrenze[cite: 5, 10]
        eventi.add(new EventoAtmosferico(20));

        // Visualizzazione degli eventi
        System.out.println("Lista eventi inseriti:");
        for (Evento e : eventi) {
            // Viene stampato il tipo di classe e il valore di occorrenza[cite: 2, 5]
            System.out.println(e.getClass().getSimpleName() + " - Occorrenza: " + e.getOccorrenza());
        }

        // Esempio di ordinamento (grazie all'interfaccia Comparable corretta)
        eventi.sort(null); 

        System.out.println("\nLista eventi ordinati per occorrenza:");
        for (Evento e : eventi) {
            System.out.println(e.getClass().getSimpleName() + " - Occorrenza: " + e.getOccorrenza());
        }
    }
}
