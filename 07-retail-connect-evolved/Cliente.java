package RetailConnect_part02;

import java.util.HashMap;
import java.util.Map;

class Cliente {
    protected String nome, cognome;
    protected int id;
    protected Map<Integer, Integer> listaSpesa = new HashMap<>();

    public Cliente(int id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public void aggiungiALista(int idProdotto, int qta) {
        listaSpesa.put(idProdotto, listaSpesa.getOrDefault(idProdotto, 0) + qta);
    }

    public double concludiSpesa(Negozio n) {
        double totale = 0;
        for (var entry : listaSpesa.entrySet()) {
            Prodotto p = n.cercaProdotto(entry.getKey());
            if (p != null) {
                int acquistata = Math.min(entry.getValue(), p.getQuantita());
                totale += acquistata * p.getPrezzoUnitario();
                p.setQuantita(p.getQuantita() - acquistata);
            }
        }
        listaSpesa.clear();
        return totale;
    }
}
