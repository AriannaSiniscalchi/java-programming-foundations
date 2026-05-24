package eccezioni;

public class FrazioneNonCorrettaException extends Exception {

	private int numeratore;
	private int denominatore;
	
	public FrazioneNonCorrettaException(int numeratore, int denominatore) {
		this.numeratore = numeratore;
		this.denominatore = denominatore;
	}
}
