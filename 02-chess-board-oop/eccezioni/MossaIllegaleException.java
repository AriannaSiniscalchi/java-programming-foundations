package scacchiera.eccezioni;

/**
 * Eccezione personalizzata per gestire i tentativi di mosse non valide.
 */
public class MossaIllegaleException extends Exception {
    public MossaIllegaleException(String messaggio) {
        super(messaggio);
    }
}
