package Exercise12_Substrings;

import java.util.Scanner;

public class GestioneStringa {
    public static void main(String[] args) {
        // Creazione dello scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);

        // 1. Fa inserire all'utente una stringa s
        System.out.print("Inserisci una stringa: ");
        String s = scanner.nextLine();

        // 2. Visualizza il numero totale di caratteri di s
        int lunghezza = s.length();
        System.out.println("Il numero totale di caratteri è: " + lunghezza);

        // 3. Chiede all'utente due posizioni intere (inizio e fine)
        System.out.print("Inserisci l'indice di inizio: ");
        int inizio = scanner.nextInt();

        System.out.print("Inserisci l'indice di fine: ");
        int fine = scanner.nextInt();

        // 4. Visualizza la sottostringa compresa tra inizio (incluso) e fine (escluso)
        // Il metodo s.substring(inizio, fine) funziona esattamente così di default in Java
        String sottostringa = s.substring(inizio, fine);
        System.out.println("La sottostringa estratta è: " + sottostringa);

        // Chiusura dello scanner
        scanner.close();
    }
}
