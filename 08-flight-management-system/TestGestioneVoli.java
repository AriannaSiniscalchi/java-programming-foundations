package FlightManagement;

public class TestGestioneVoli {
    public static void main(String[] args) {
        // Creazione di un volo con 2 posti economica e 1 posto prima classe
        Volo v1 = new Volo("AZ123", "Roma FCO", "New York JFK", 2, 1);

        // Test aggiunta passeggeri
        v1.aggiungiPasseggero(new Passeggero("B001", "Mario", "Rossi", 450.0, 'E'));
        v1.aggiungiPasseggero(new Passeggero("B002", "Luigi", "Verdi", 1200.0, 'P'));
        
        // Questo dovrebbe fallire (secondo posto prima classe non disponibile)
        v1.aggiungiPasseggero(new Passeggero("B003", "Anna", "Neri", 1100.0, 'P'));

        v1.stampaListaPasseggeri();
        System.out.println("Incasso totale: " + v1.calcolaIncasso() + "€");

        // Test rimozione
        System.out.println("\nRimozione passeggero B001...");
        v1.rimuoviPasseggero("B001");
        
        v1.stampaListaPasseggeri();
        System.out.println("Incasso dopo rimozione: " + v1.calcolaIncasso() + "€");
    }
}
