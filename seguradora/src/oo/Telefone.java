package oo;

// modelo anêmico (Martin Fowler)

public class Telefone {
	
	public enum Tipo { Residencial, Celular, Comercial }

	private Tipo tipo;
	private String ddd, numero;

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "(" + ddd + ") " + numero;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	
}
