package RetailConnect;

public class TestGestioneNegozi {
    public static void main(String[] args) {
        // Creazione Negozio
        Negozio carrefour = new Negozio(1, "Carrefour Express");
        
        // Rifornimento
        carrefour.rifornisci(new Prodotto(101, 10, 1.50)); // Latte
        carrefour.rifornisci(new Prodotto(102, 5, 3.00));  // Pane
        carrefour.rifornisci(new Prodotto(103, 20, 0.50)); // Acqua
        
        // Creazione Cliente
        Cliente cliente = new Cliente(500, "Mario", "Rossi");
        
        // Simulazione Spesa
        System.out.println("--- Inizio Spesa ---");
        carrefour.visualizzaProdotti();
        
        cliente.aggiungiALista(carrefour, 101, 2);  // Latte (ok)
        cliente.aggiungiALista(carrefour, 102, 10); // Pane (richiesta > disponibilità)
        
        // Modifica e rimozione
        cliente.modificaQuantita(101, 3); 
        
        // Conclusione spesa
        cliente.concludiSpesa(carrefour);
        
        // Verifica scorte finali
        System.out.println("\n--- Scorte dopo la spesa ---");
        carrefour.visualizzaProdotti();
    }
}
