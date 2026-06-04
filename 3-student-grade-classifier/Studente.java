package GestioneStudenti;

import java.util.Arrays;
import java.util.Objects;

public class Studente implements Comparable<Studente> {
    private String nomeCognome;
    private int matricola;
    private int[] voti;
    private String paeseResidenza; // Opzionale (può essere null)

    // Costruttore 1: Residenza NON nota al momento della creazione
    public Studente(String nomeCognome, int matricola, int numeroEsami) {
        this.nomeCognome = nomeCognome;
        this.matricola = matricola;
        this.voti = new int[numeroEsami]; // Inizializzati automaticamente a 0
        this.paeseResidenza = null;
    }

    // Costruttore 2: Residenza NOTA al momento della creazione
    public Studente(String nomeCognome, int matricola, int numeroEsami, String paeseResidenza) {
        this(nomeCognome, matricola, numeroEsami); // Riutilizza il primo costruttore
        this.paeseResidenza = paeseResidenza;
    }

    // Metodo: Aggiungi voto esame in posizione x
    public void aggiungiVoto(int posizione, int voto) {
        if (posizione >= 0 && posizione < voti.length) {
            if (voto >= 18 && voto <= 30) {
                voti[posizione] = voto;
            } else {
                System.out.println("Errore: Il voto deve essere compreso tra 18 e 30.");
            }
        } else {
            System.out.println("Errore: Posizione dell'esame non valida.");
        }
    }

    // Metodo: Calcola media voti degli esami sostenuti (esclude gli elementi ancora a 0)
    public double calcolaMedia() {
        double somma = 0;
        int contatoreEsamiSostenuti = 0;

        for (int voto : voti) {
            if (voto != 0) { // Considera solo gli esami effettivamente verbalizzati
                somma += voto;
                contatoreEsamiSostenuti++;
            }
        }

        if (contatoreEsamiSostenuti == 0) {
            return 0.0; // Evita la divisione per zero se non ci sono esami sostenuti
        }
        return somma / contatoreEsamiSostenuti;
    }

    // Metodo: Modifica/Inserisci paese di residenza
    public void setPaeseResidenza(String paeseResidenza) {
        this.paeseResidenza = paeseResidenza;
    }

    // Test di uguaglianza (equals) basato sulla matricola (identità logica univoca)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Studente studente = (Studente) obj;
        return matricola == studente.matricola;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }

    // Ordinamento in base alla media in ordine DECRESCENTE
    @Override
    public int compareTo(Studente altro) {
        double miaMedia = this.calcolaMedia();
        double altraMedia = altro.calcolaMedia();

        // Per l'ordine decrescente confrontiamo la media dell'altro studente con la nostra
        return Double.compare(altraMedia, miaMedia);
    }

    @Override
    public String toString() {
        String residenza = (paeseResidenza != null) ? paeseResidenza : "Non specificata";
        return String.format("Matricola: %d | %s | Residenza: %s | Media: %.2f | Voti: %s", 
                matricola, nomeCognome, residenza, calcolaMedia(), Arrays.toString(voti));
    }
}
