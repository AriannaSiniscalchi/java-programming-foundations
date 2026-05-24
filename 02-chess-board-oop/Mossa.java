package scacchiera;

import scacchiera.pezzi.Pezzo;

public class Mossa {
    private final Casella partenza;
    private final Casella arrivo;
    private final Pezzo pezzoMosso;
    private final Pezzo pezzoCatturato;

    public Mossa(Casella partenza, Casella arrivo, Pezzo pezzoMosso, Pezzo pezzoCatturato) {
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.pezzoMosso = pezzoMosso;
        this.pezzoCatturato = pezzoCatturato;
    }

    public Casella getPartenza() { return partenza; }
    public Casella getArrivo() { return arrivo; }
    public Pezzo getPezzoMosso() { return pezzoMosso; }
    public Pezzo getPezzoCatturato() { return pezzoCatturato; }
}
