package RetailConnect_part02;

class ClienteTesserato extends Cliente {
    private int idTessera;
    private int saldoPunti;

    public ClienteTesserato(int id, String nome, String cognome, int idTessera) {
        super(id, nome, cognome);
        this.idTessera = idTessera;
        this.saldoPunti = 0;
    }

    // Accumulo: 1 punto ogni 15€
    public void accumulaPunti(double importo) {
        int puntiGuadagnati = (int) (importo / 15);
        this.saldoPunti += puntiGuadagnati;
        System.out.println("Punti accumulati: " + puntiGuadagnati);
    }

    // Consumo: ogni 50€ di spesa, sconto di 5€ usando 50 punti
    public double applicaScontoPunti(double totale) {
        if (totale >= 50 && saldoPunti >= 50) {
            System.out.println("Sconto fedeltà applicato (-5€)");
            saldoPunti -= 50;
            return totale - 5;
        }
        return totale;
    }

    @Override
    public double concludiSpesa(Negozio n) {
        double totaleLordo = super.concludiSpesa(n);
        double totaleScontato = applicaScontoPunti(totaleLordo);
        accumulaPunti(totaleScontato);
        
        System.out.println("Ricevuta Tesserato [" + idTessera + "] - Saldo Punti: " + saldoPunti);
        return totaleScontato;
    }
}
