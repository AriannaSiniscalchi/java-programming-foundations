package GradeManagement;

public class VotoStudente {
    private int valore;

    public VotoStudente(int valore) {
        // Lancia RuntimeException per voti non validi
        if (valore < 18 || valore > 30) {
            throw new RuntimeException("Voto fuori range (18-30): " + valore);
        }
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    @Override
    public String toString() {
        return String.valueOf(valore);
    }
}
