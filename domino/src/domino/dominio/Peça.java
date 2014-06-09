package domino.dominio;

public class Peça extends Componente {

	public Peça(Valor valor1, Valor valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "Peça [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}


	
	

}
