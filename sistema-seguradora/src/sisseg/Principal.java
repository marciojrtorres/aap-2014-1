package sisseg;

import oo.Cliente;
import oo.Conta;
import oo.Plano;
import oo.PlanoMinimo;
import oo.PlanoTotal;
import oo.Seguro;
import oo.Veiculo;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Bruno", new Conta(2000.0), 24);        
        
        Veiculo veiculo = new Veiculo(2010, 24000.0);
        
        Plano p1 = new PlanoVip();
        Plano p2 = new PlanoMinimo();

        Seguro seguro = new Seguro(cliente, veiculo, p1);        
        
        System.out.println(seguro.getValor()); // 0.0
        
        // Padrão de Projeto: estratégia (Strategy)
        seguro.setPlano(p2);
        
        System.out.println(seguro.getValor()); // 0.0

	}

}


class PlanoVip implements Plano {

	@Override
	public double calcula(Cliente cliente, Veiculo veiculo) {
		return cliente.getIdade() * 100;
	}
	
}
