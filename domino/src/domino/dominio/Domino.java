package domino.dominio;

public class Domino {

	private Peça[] peças = new Peça[28];
	private int qtdPeças = 28;
	
	public Domino() {
		
		Valor[] valores = Valor.values();
		
		int p = 0;
		for (int i = 0; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				peças[p++] = new Peça(valores[i], valores[j]);
			}
		}
				
	}

	public Peça pegaPeça() {
		return peças[--qtdPeças];
	}

	public void devolvePeça(Peça peça) {
		peças[qtdPeças++] = peça;
	}
	
}
