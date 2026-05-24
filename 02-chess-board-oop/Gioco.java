package scacchiera;

import scacchiera.pezzi.*;
import scacchiera.eccezioni.MossaIllegaleException;
import java.util.Scanner;

public class Gioco {
    private final Player[] players;
    private final Scacchiera scacchiera;
    private final Scanner in;

    public Gioco() {
        players = new Player[]{new Player(Color.WHITE), new Player(Color.BLACK)};
        scacchiera = new Scacchiera();
        in = new Scanner(System.in);
    }

    public void gioca() {
        int turno = 0;
        while (true) {
            Color coloreC = players[turno % 2].getColor();
            System.out.println(scacchiera);

            if (!scacchiera.haMosseLegali(coloreC)) {
                if (scacchiera.isCellaSottoAttacco(scacchiera.trovaRe(coloreC).getCoordinata(), coloreC)) {
                    System.out.println("SCACCO MATTO! Vince " + (coloreC == Color.WHITE ? "NERO" : "BIANCO"));
                } else {
                    System.out.println("PATTA PER STALLO!");
                }
                break;
            }

            try {
                eseguiTurno(coloreC);
                turno++;
            } catch (MossaIllegaleException e) {
                System.out.println("ERRORE: " + e.getMessage());
            }
        }
    }

    private void eseguiTurno(Color colore) throws MossaIllegaleException {
        System.out.println("Tocca al " + colore);
        System.out.print("Partenza (riga colonna): ");
        Coordinata p = new Coordinata(in.nextInt(), in.nextInt());
        System.out.print("Arrivo (riga colonna): ");
        Coordinata d = new Coordinata(in.nextInt(), in.nextInt());

        Casella cPart = scacchiera.getCasella(p);
        Casella cDest = scacchiera.getCasella(d);
        Pezzo pezzo = cPart.getPezzo();

        if (pezzo == null || pezzo.getColor() != colore) throw new MossaIllegaleException("Pezzo non valido!");
        if (!pezzo.mossaValida(scacchiera, cDest)) throw new MossaIllegaleException("Mossa illegale!");

        // Esecuzione mossa con controllo scacco
        Pezzo catturato = cDest.getPezzo();
        cDest.setPezzo(pezzo);
        cPart.unsetPezzo();

        if (scacchiera.isCellaSottoAttacco(scacchiera.trovaRe(colore).getCoordinata(), colore)) {
            cPart.setPezzo(pezzo);
            cDest.setPezzo(catturato);
            throw new MossaIllegaleException("Mossa non permessa: il Re rimarrebbe sotto scacco!");
        }

        pezzo.setCasella(cDest);
        pezzo.setMosso(true);
        scacchiera.setUltimaMossa(new Mossa(cPart, cDest, pezzo, catturato));
    }
}
