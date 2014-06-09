package domino.main;

import domino.dominio.Domino;
import domino.dominio.Fileira;
import domino.dominio.Peça;

public class Main {

	public static void main(String[] args) {
		
		Domino dom = new Domino();
		
		Peça p1 = dom.pegaPeça();
		Peça p2 = dom.pegaPeça();
		
		System.out.println(p1);
		System.out.println(p2);
		
		boolean pode = p1.podeUnir(p2);
		
		Fileira fileira = p1.unir(p2);
		
		fileira.unir(dom.pegaPeça());
		
		dom.devolvePeça(p1);

	}

}
