package RetailConnect_part02;

public class TestRetailFramework {
    public static void main(String[] args) {
        Negozio shop = new Negozio(1, "TechStore");
        shop.rifornisci(new Prodotto(1, 50, 10.0)); // Prodotto da 10€
        
        // 1. Test Cliente Normale
        Cliente c1 = new Cliente(10, "Mario", "Rossi");
        c1.aggiungiALista(1, 2); // 20€
        System.out.println("Totale Mario: " + c1.concludiSpesa(shop) + "€\n");

        // 2. Test Cliente Tesserato
        ClienteTesserato c2 = new ClienteTesserato(11, "Luigi", "Bianchi", 888);
        
        // Prima spesa: accumula punti (120€ / 15 = 8 punti)
        c2.aggiungiALista(1, 12); 
        System.out.println("Totale Luigi (Spesa 1): " + c2.concludiSpesa(shop) + "€\n");
        
        // Simuliamo un saldo punti alto per testare lo sconto
        for(int i=0; i<10; i++) c2.accumulaPunti(100); 
        
        // Seconda spesa: applica sconto se totale > 50 e punti > 50
        c2.aggiungiALista(1, 6); // 60€
        System.out.println("Totale Luigi (Spesa 2): " + c2.concludiSpesa(shop) + "€");
    }
}
