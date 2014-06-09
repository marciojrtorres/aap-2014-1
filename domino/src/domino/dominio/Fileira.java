package domino.dominio;

public class Fileira extends Componente {

	private Valor valor1;
	private Valor valor2;
	
	public Fileira(Peça peça) {
		peças[qtdPeças++] = peça;
	}

	public Valor getValor1() {
		return peças[0].getValor1();
	}
	
	public Valor getValor2() {
		return peças[0].getValor2();
	}
	
	public boolean podeUnir(Peça outra) {
		return valor1 == outra.valor1
				|| valor2 == outra.valor2
				|| valor1 == outra.valor2;
	}

	public Fileira unir(Peça outra) {		
		if (podeUnir(outra)) {
			return new Fileira(this, outra);
		}
		return new Fileira();
	}

}
