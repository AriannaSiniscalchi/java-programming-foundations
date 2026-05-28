package RetailConnect;

import java.util.*;

public class Negozio {
    private int id;
    private String nome;
    private Set<Prodotto> prodotti;

    public Negozio(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.prodotti = new HashSet<>();
    }

    public void rifornisci(Prodotto p) {
        if (!prodotti.add(p)) {
            // Se esiste già, aggiorna solo la quantità
            for (Prodotto esistente : prodotti) {
                if (esistente.equals(p)) {
                    esistente.setQuantita(esistente.getQuantita() + p.getQuantita());
                }
            }
        }
    }

    public void rimuoviProdotto(int idProdotto) {
        prodotti.removeIf(p -> p.getId() == idProdotto);
    }

    public Prodotto cercaProdotto(int idProdotto) {
        return prodotti.stream()
                .filter(p -> p.getId() == idProdotto)
                .findFirst()
                .orElse(null);
    }

    public void visualizzaProdotti() {
        System.out.println("Catalogo " + nome + ":");
        prodotti.forEach(p -> System.out.println("ID: " + p.getId() + " | Disponibili: " + p.getQuantita() + " | Prezzo: " + p.getPrezzoUnitario() + "€"));
    }

    public String getNome() { return nome; }
}
