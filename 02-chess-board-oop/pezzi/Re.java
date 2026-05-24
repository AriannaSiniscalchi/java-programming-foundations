package scacchiera.pezzi;

import scacchiera.Casella;
import scacchiera.Color;
import scacchiera.Coordinata;
import scacchiera.Scacchiera;

public class Re extends Pezzo {
    public Re(Casella casella, Color color) {
        super(casella, color);
    }

    @Override
    public boolean mossaValida(Scacchiera s, Casella destinazione) {
        Coordinata part = this.getCasella().getCoordinata();
        Coordinata dest = destinazione.getCoordinata();

        int diffX = Math.abs(dest.getX() - part.getX());
        int diffY = Math.abs(dest.getY() - part.getY());

        // Il Re si muove di una sola casella (orizzontale, verticale o diagonale)
        if (diffX <= 1 && diffY <= 1 && (diffX + diffY > 0)) {
            // Non può mangiare i suoi stessi pezzi
            return destinazione.isEmpty() || destinazione.getPezzo().getColor() != this.getColor();
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.getColor() == Color.WHITE) ? "K" : "k";
    }
    /*@Override
    public String toString() {
        return "K ["+this.getColore().toString()+"];
    }*/
}
