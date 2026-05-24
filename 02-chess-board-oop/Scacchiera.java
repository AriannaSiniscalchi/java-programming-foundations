package scacchiera;

import scacchiera.pezzi.*;
import java.util.ArrayList;
import java.util.List;

public class Scacchiera {
    private final Casella[][] caselle;
    private static final int SIZE = 8;
    private Mossa ultimaMossa;

    public Scacchiera() {
        caselle = new Casella[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                caselle[i][j] = new Casella(new Coordinata(i, j));
            }
        }
        setupIniziale();
    }

    private void setupIniziale() {
        this.intializeReRow(0, Color.WHITE);
        this.intializePedoniRow(1, Color.WHITE);
        this.intializePedoniRow(6, Color.BLACK);
        this.intializeReRow(7, Color.BLACK);
    }

    private void intializePedoniRow(int row, Color color) {
        for (int i = 0; i < SIZE; i++) caselle[row][i].setPezzo(new Pedone(caselle[row][i], color));
    }

    private void intializeReRow(int row, Color color) {
        caselle[row][0].setPezzo(new Torre(caselle[row][0], color));
        caselle[row][1].setPezzo(new Cavallo(caselle[row][1], color));
        caselle[row][2].setPezzo(new Alfiere(caselle[row][2], color));
        caselle[row][3].setPezzo(new Regina(caselle[row][3], color));
        caselle[row][4].setPezzo(new Re(caselle[row][4], color));
        caselle[row][5].setPezzo(new Alfiere(caselle[row][5], color));
        caselle[row][6].setPezzo(new Cavallo(caselle[row][6], color));
        caselle[row][7].setPezzo(new Torre(caselle[row][7], color));
    }

    public Casella getCasella(Coordinata c) { return caselle[c.getX()][c.getY()]; }
    public Mossa getUltimaMossa() { return ultimaMossa; }
    public void setUltimaMossa(Mossa m) { this.ultimaMossa = m; }

    public boolean isCellaSottoAttacco(Coordinata coord, Color coloreDifensore) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Pezzo p = caselle[i][j].getPezzo();
                if (p != null && p.getColor() != coloreDifensore) {
                    if (p.mossaValida(this, caselle[coord.getX()][coord.getY()])) return true;
                }
            }
        }
        return false;
    }

    public Casella trovaRe(Color colore) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Pezzo p = caselle[i][j].getPezzo();
                if (p instanceof Re && p.getColor() == colore) return caselle[i][j];
            }
        }
        return null;
    }

    public boolean haMosseLegali(Color colore) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Pezzo p = caselle[i][j].getPezzo();
                if (p != null && p.getColor() == colore) {
                    for (int r = 0; r < SIZE; r++) {
                        for (int c = 0; c < SIZE; c++) {
                            if (p.mossaValida(this, caselle[r][c])) {
                                // Simula mossa per vedere se salva dallo scacco
                                if (simulaESalva(p, caselle[r][c], colore)) return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean simulaESalva(Pezzo p, Casella dest, Color colore) {
        Casella part = p.getCasella();
        Pezzo rimosso = dest.getPezzo();
        dest.setPezzo(p);
        part.unsetPezzo();
        boolean sicuro = !isCellaSottoAttacco(trovaRe(colore).getCoordinata(), colore);
        part.setPezzo(p);
        dest.setPezzo(rimosso);
        return sicuro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n    a  b  c  d  e  f  g  h\n  +-------------------------+\n");
        for (int i = SIZE - 1; i >= 0; i--) {
            sb.append(i).append(" |");
            for (int j = 0; j < SIZE; j++) {
                Pezzo p = caselle[i][j].getPezzo();
                sb.append(p == null ? " . " : " " + p + " ");
            }
            sb.append("| ").append(i).append("\n");
        }
        sb.append("  +-------------------------+\n    a  b  c  d  e  f  g  h\n");
        return sb.toString();
    }
}
