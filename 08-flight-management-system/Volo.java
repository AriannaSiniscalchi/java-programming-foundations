package FlightManagement;

import java.util.ArrayList;
import java.util.List;

public class Volo {
    private String idVolo;
    private String aeroportoPartenza;
    private String aeroportoDestinazione;
    private int postiEconomicaResidui;
    private int postiPrimaResidui;
    private List<Passeggero> passeggeri;

    public Volo(String idVolo, String partenza, String destinazione, int capienzaE, int capienzaP) {
        this.idVolo = idVolo;
        this.aeroportoPartenza = partenza;
        this.aeroportoDestinazione = destinazione;
        this.postiEconomicaResidui = capienzaE;
        this.postiPrimaResidui = capienzaP;
        this.passeggeri = new ArrayList<>();
    }

    public boolean aggiungiPasseggero(Passeggero p) {
        if (p.getClasse() == 'E' && postiEconomicaResidui > 0) {
            passeggeri.add(p);
            postiEconomicaResidui--;
            return true;
        } else if (p.getClasse() == 'P' && postiPrimaResidui > 0) {
            passeggeri.add(p);
            postiPrimaResidui--;
            return true;
        }
        System.out.println("Errore: Posti esauriti in classe " + p.getClasse());
        return false;
    }

    public boolean rimuoviPasseggero(String idBiglietto) {
        for (Passeggero p : passeggeri) {
            if (p.getIdBiglietto().equals(idBiglietto)) {
                // Ripristiniamo il posto disponibile
                if (p.getClasse() == 'E') postiEconomicaResidui++;
                else postiPrimaResidui++;
                
                passeggeri.remove(p);
                return true;
            }
        }
        return false;
    }

    public double calcolaIncasso() {
        double totale = 0;
        for (Passeggero p : passeggeri) {
            totale += p.getPrezzoPagato();
        }
        return totale;
    }

    public void stampaListaPasseggeri() {
        System.out.println("--- Lista Passeggeri Volo " + idVolo + " ---");
        if (passeggeri.isEmpty()) System.out.println("Nessun passeggero a bordo.");
        else passeggeri.forEach(System.out::println);
        System.out.println("------------------------------------------");
    }
}
