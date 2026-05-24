package scacchiera.pezzi;

import scacchiera.*;

public abstract class Pezzo {
    private Casella casella;
    private final Color color;
    private boolean mosso;

    public Pezzo(Casella casella, Color color) {
        this.casella = casella;
        this.color = color;
        this.mosso = false;
    }

    public abstract boolean mossaValida(Scacchiera s, Casella destinazione);

    public Casella getCasella() { return casella; }
    public void setCasella(Casella casella) { this.casella = casella; }
    public Color getColor() { return color; }
    public boolean isMosso() { return mosso; }
    public void setMosso(boolean mosso) { this.mosso = mosso; }
}
