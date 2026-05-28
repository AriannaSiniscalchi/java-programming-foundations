package GradeManagement;

import java.util.ArrayList;
import java.util.List;

public class AnalizzatoreVoti {

    public List<VotoStudente> estraiVoti(String elenco) {
        List<VotoStudente> votiValidi = new ArrayList<>();
        String[] segmenti = elenco.split(";");

        for (String s : segmenti) {
            try {
                // Tenta la conversione: intercetta NumberFormatException se non è un numero
                int num = Integer.parseInt(s.trim());
                
                // Tenta la creazione dell'oggetto: intercetta RuntimeException se fuori range
                votiValidi.add(new VotoStudente(num));

            } catch (NumberFormatException e) {
                System.out.println("Salto valore non numerico: " + s);
            } catch (RuntimeException e) {
                System.out.println("Salto valore non ammesso: " + e.getMessage());
            }
        }
        return votiValidi;
    }

    public void stampaStatistiche(List<VotoStudente> voti) {
        if (voti.isEmpty()) {
            System.out.println("Nessun dato disponibile per il calcolo.");
            return;
        }

        int max = 0;
        double somma = 0;

        for (VotoStudente v : voti) {
            if (v.getValore() > max) max = v.getValore();
            somma += v.getValore();
        }

        System.out.println("--- Risultati Analisi ---");
        System.out.println("Voti processati: " + voti);
        System.out.println("Voto Massimo: " + max);
        System.out.printf("Media Accademica: %.2f\n", (somma / voti.size()));
        System.out.println("-------------------------\n");
    }
}
