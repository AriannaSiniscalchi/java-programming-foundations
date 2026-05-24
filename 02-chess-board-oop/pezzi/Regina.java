package scacchiera.pezzi;

import scacchiera.Casella;
import scacchiera.Color;
import scacchiera.Coordinata;
import scacchiera.Scacchiera;

public class Regina extends Pezzo {
    public Regina(Casella casella, Color color) {
        super(casella, color);
    }

    @Override
    public boolean mossaValida(Scacchiera s, Casella destinazione) {
        // La Regina può muoversi come una Torre o come un Alfiere
        Torre fintaTorre = new Torre(this.getCasella(), this.getColor());
        Alfiere fintoAlfiere = new Alfiere(this.getCasella(), this.getColor());
        
        return fintaTorre.mossaValida(s, destinazione) || fintoAlfiere.mossaValida(s, destinazione);
    }

    @Override
    public String toString() {
        return (this.getColor() == Color.WHITE) ? "Q" : "q";
    }
    /*@Override
    public String toString() {
        return "Q ["+this.getColore().toString()+"];
    }*/
}
