package FlightManagement;

public class Passeggero {
    private String idBiglietto;
    private String nome;
    private String cognome;
    private double prezzoPagato;
    private char classe; // 'P' per Prima Classe, 'E' per Economica

    public Passeggero(String idBiglietto, String nome, String cognome, double prezzoPagato, char classe) {
        this.idBiglietto = idBiglietto;
        this.nome = nome;
        this.cognome = cognome;
        this.prezzoPagato = prezzoPagato;
        this.classe = Character.toUpperCase(classe);
    }

    // Getters
    public String getIdBiglietto() { return idBiglietto; }
    public double getPrezzoPagato() { return prezzoPagato; }
    public char getClasse() { return classe; }

    @Override
    public String toString() {
        return String.format("[%s] %s %s - Classe: %c - Pagato: %.2f€", 
                idBiglietto, nome, cognome, classe, prezzoPagato);
    }
}
