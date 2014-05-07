package oo;

public class PlanoMinimo implements Plano {

	@Override
	public double calcula(Cliente cliente, Veiculo veiculo) {
		double valor = 100.0;
		if (cliente.getIdade() < 30) {
			valor = valor * 1.1; // + 10%
		}
		if (veiculo.getAno() > 2010) {
			valor = valor * 1.1; // + 10%
		}
		return valor;
	}

}
