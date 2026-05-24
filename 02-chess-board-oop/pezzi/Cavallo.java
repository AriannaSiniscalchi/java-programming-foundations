package scacchiera.pezzi;

import scacchiera.Casella;
import scacchiera.Color;
import scacchiera.Coordinata;
import scacchiera.Scacchiera;

public class Cavallo extends Pezzo {
    public Cavallo(Casella casella, Color color) {
        super(casella, color);
    }

    @Override
    public boolean mossaValida(Scacchiera s, Casella destinazione) {
        Coordinata part = this.getCasella().getCoordinata();
        Coordinata dest = destinazione.getCoordinata();

        int diffX = Math.abs(dest.getX() - part.getX());
        int diffY = Math.abs(dest.getY() - part.getY());

        if ((diffX == 2 && diffY == 1) || (diffX == 1 && diffY == 2)) {
            return destinazione.isEmpty() || destinazione.getPezzo().getColor() != this.getColor();
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.getColor() == Color.WHITE) ? "C" : "c";
    }
    /*@Override
    public String toString() {
        return "C ["+this.getColore().toString()+"];
    }*/
}
