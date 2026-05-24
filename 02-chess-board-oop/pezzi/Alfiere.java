package scacchiera.pezzi;

import scacchiera.Casella;
import scacchiera.Color;
import scacchiera.Coordinata;
import scacchiera.Scacchiera;

public class Alfiere extends Pezzo {
    public Alfiere(Casella casella, Color color) {
        super(casella, color);
    }

    @Override
    public boolean mossaValida(Scacchiera s, Casella destinazione) {
        Coordinata part = this.getCasella().getCoordinata();
        Coordinata dest = destinazione.getCoordinata();

        int diffX = Math.abs(dest.getX() - part.getX());
        int diffY = Math.abs(dest.getY() - part.getY());

        if (diffX != diffY || diffX == 0) return false;
        if (!destinazione.isEmpty() && destinazione.getPezzo().getColor() == this.getColor()) return false;

        int deltaX = Integer.signum(dest.getX() - part.getX());
        int deltaY = Integer.signum(dest.getY() - part.getY());

        int x = part.getX() + deltaX;
        int y = part.getY() + deltaY;

        while (x != dest.getX() && y != dest.getY()) {
            if (!s.getCasella(new Coordinata(x, y)).isEmpty()) return false;
            x += deltaX;
            y += deltaY;
        }
        return true;
    }

    @Override
    public String toString() {
        return (this.getColor() == Color.WHITE) ? "A" : "a";
    }
    
    /*@Override
    public String toString() {
        return "A ["+this.getColore().toString()+"];
    }*/
}
