package RetailConnect_part02;

import java.util.*;

class Prodotto {
    private int id;
    private int quantita;
    private double prezzoUnitario;

    public Prodotto(int id, int quantita, double prezzoUnitario) {
        this.id = id;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
    }

    public int getId() { return id; }
    public int getQuantita() { return quantita; }
    public void setQuantita(int quantita) { this.quantita = quantita; }
    public double getPrezzoUnitario() { return prezzoUnitario; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto)) return false;
        return id == ((Prodotto) o).id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}

class Negozio {
    private int id;
    private String nome;
    private Set<Prodotto> prodotti = new HashSet<>();

    public Negozio(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void rifornisci(Prodotto p) { prodotti.add(p); }
    
    public Prodotto cercaProdotto(int id) {
        return prodotti.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public String getNome() { return nome; }
}
