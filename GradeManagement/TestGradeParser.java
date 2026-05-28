package GradeManagement;

import java.util.List;

public class TestGradeParser {
    public static void main(String[] args) {
        AnalizzatoreVoti analizzatore = new AnalizzatoreVoti();

        // Test 1: Caso misto con stringhe e valori negativi[cite: 28]
        System.out.println("Esecuzione Test 1: 'a;18;20;-3'");
        List<VotoStudente> lista1 = analizzatore.estraiVoti("a;18;20;-3");
        analizzatore.stampaStatistiche(lista1);

        // Test 2: Caso con voti superiori al limite[cite: 28]
        System.out.println("Esecuzione Test 2: '28; 32; lode; 24'");
        List<VotoStudente> lista2 = analizzatore.estraiVoti("28; 32; lode; 24");
        analizzatore.stampaStatistiche(lista2);
    }
}
