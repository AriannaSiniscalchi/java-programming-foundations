package scacchiera.pezzi;

import scacchiera.Casella;
import scacchiera.Color;
import scacchiera.Coordinata;
import scacchiera.Scacchiera;

public class Pedone extends Pezzo {
    public Pedone(Casella casella, Color color) {
        super(casella, color);
    }

    @Override
    public boolean mossaValida(Scacchiera s, Casella destinazione) {
        Coordinata part = this.getCasella().getCoordinata();
        Coordinata dest = destinazione.getCoordinata();
        int direzione = (this.getColor() == Color.WHITE) ? 1 : -1;

        int diffX = dest.getX() - part.getX();
        int diffY = Math.abs(dest.getY() - part.getY());

        if (diffY == 0) { // Avanzamento dritto
            if (!destinazione.isEmpty()) return false;
            if (diffX == direzione) return true;
            // Primo movimento di due caselle
            if (((part.getX() == 1 && direzione == 1) || (part.getX() == 6 && direzione == -1)) && diffX == 2 * direzione) {
                return s.getCasella(new Coordinata(part.getX() + direzione, part.getY())).isEmpty();
            }
        } else if (diffY == 1 && diffX == direzione) { // Cattura diagonale
            return !destinazione.isEmpty() && destinazione.getPezzo().getColor() != this.getColor();
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.getColor() == Color.WHITE) ? "P" : "p";
    }
    /*@Override
    public String toString() {
        return "P ["+this.getColore().toString()+"];
    }*/
}
