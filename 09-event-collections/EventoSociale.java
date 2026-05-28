package collezioni02;

/**
 * Classe EventoSociale corretta.
 * Estende la classe base Evento e implementa l'ordinamento naturale.
 */
public class EventoSociale extends Evento {

    /**
     * Costruttore che richiama quello della superclasse Evento.
     * @param occorrenza Il valore numerico dell'evento.
     */
    public EventoSociale(int occorrenza) {
        super(occorrenza); // Inizializza l'attributo occorrenza ereditato
    }

    /**
     * Implementazione del metodo di confronto.
     * La firma deve accettare 'Evento' come parametro per essere coerente 
     * con l'interfaccia Comparable<Evento> definita nella superclasse.
     */
    @Override
    public int compareTo(Evento o) {
        // Confronta l'occorrenza di questo evento con quella dell'evento passato[cite: 4]
        return Integer.compare(this.getOccorrenza(), o.getOccorrenza());
    }
}
