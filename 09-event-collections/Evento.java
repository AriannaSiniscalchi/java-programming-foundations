package collezioni02;

public abstract class Evento implements Comparable<Evento>{

	private int occorrenza;

	public Evento(int occorrenza) {
		this.occorrenza = occorrenza;
	}
	
	public int getOccorrenza() {
		return occorrenza;
	}

	public void setOccorrenza(int occorrenza) {
		this.occorrenza = occorrenza;
	}
	
	@Override
	public int compareTo(Evento arg0) {
		return this.getOccorrenza() > arg0.getOccorrenza() ? 1 :
			this.getOccorrenza() == arg0.getOccorrenza() ? 0: -1;
	}
	
}
