package RetailConnect;

import java.util.Objects;

public class Prodotto {
    private int id;
    private int quantita;
    private double prezzoUnitario;

    public Prodotto(int id, int quantita, double prezzoUnitario) {
        this.id = id;
        this.quantita = quantita;
        this.prezzoUnitario = prezzoUnitario;
    }

    // Getters e Setters
    public int getId() { return id; }
    public int getQuantita() { return quantita; }
    public void setQuantita(int quantita) { this.quantita = quantita; }
    public double getPrezzoUnitario() { return prezzoUnitario; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto)) return false;
        Prodotto prodotto = (Prodotto) o;
        return id == prodotto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
