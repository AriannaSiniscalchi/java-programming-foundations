package collezioni02;

import java.util.Objects;

public class Animale {

	private final String CF;
	private final String nome;
	
	public Animale(String CF, String nome) {
		this.CF = CF;
		this.nome = nome;
	}

	public String getCF() {
		return CF;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Animale [CF=" + CF + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(CF, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animale other = (Animale) obj;
		return Objects.equals(CF, other.CF) && Objects.equals(nome, other.nome);
	}
	
	
}
