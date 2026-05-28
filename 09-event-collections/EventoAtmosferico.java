package collezioni02;

public class EventoAtmosferico extends Evento {

    public EventoAtmosferico(int occorrenza) {
        super(occorrenza);
    }

    @Override
    public int compareTo(Evento o) { // Il parametro deve essere Evento
        // Usiamo 'o' perché è il nome dichiarato nella firma
        return Integer.compare(this.getOccorrenza(), o.getOccorrenza());
    }
}
