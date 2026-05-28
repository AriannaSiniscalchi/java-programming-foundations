package RetailConnect;

import java.util.*;

public class Cliente {
    private String nome;
    private String cognome;
    private int id;
    private Map<Integer, Integer> listaSpesa; // ID Prodotto, Quantità richiesta

    public Cliente(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.listaSpesa = new HashMap<>();
    }

    public void aggiungiALista(Negozio n, int idProdotto, int qtaRichiesta) {
        Prodotto p = n.cercaProdotto(idProdotto);
        if (p != null) {
            listaSpesa.put(idProdotto, listaSpesa.getOrDefault(idProdotto, 0) + qtaRichiesta);
            System.out.println("Aggiunto " + idProdotto + " alla lista.");
        } else {
            System.out.println("Prodotto non trovato in questo negozio.");
        }
    }

    public void modificaQuantita(int idProdotto, int nuovaQta) {
        if (listaSpesa.containsKey(idProdotto)) {
            listaSpesa.put(idProdotto, nuovaQta);
        }
    }

    public void rimuoviDallaLista(int idProdotto) {
        listaSpesa.remove(idProdotto);
    }

    public void concludiSpesa(Negozio n) {
        double totale = 0;
        System.out.println("--- Ricevuta per " + nome + " " + cognome + " presso " + n.getNome() + " ---");
        
        for (Map.Entry<Integer, Integer> entry : listaSpesa.entrySet()) {
            Prodotto p = n.cercaProdotto(entry.getKey());
            if (p != null) {
                int richiesta = entry.getValue();
                int acquistata = Math.min(richiesta, p.getQuantita());
                
                if (acquistata > 0) {
                    totale += acquistata * p.getPrezzoUnitario();
                    p.setQuantita(p.getQuantita() - acquistata);
                    System.out.println("Prodotto " + p.getId() + ": acquistati " + acquistata + " pezzi.");
                }
            }
        }
        System.out.println("TOTALE: " + totale + "€");
        listaSpesa.clear(); // Svuota la lista dopo il checkout
    }
}
