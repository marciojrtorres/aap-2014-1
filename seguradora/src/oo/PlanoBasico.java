package oo;

public class PlanoBasico implements Plano {

	@Override
	public double calcula(Cliente cliente, Veiculo veiculo) {
		double valor = 200.0;
		if (cliente.getIdade() > 60) {
			valor = 50.0;
		}
		return valor;
	}

}
