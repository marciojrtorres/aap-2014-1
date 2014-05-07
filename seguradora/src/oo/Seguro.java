package oo;

public class Seguro {
    
    private Cliente cliente;
    private Veiculo veiculo;
    private double  valor;
    private Plano  plano; // minimo, basico, total 

    public Seguro(Cliente cliente, Veiculo veiculo, Plano plano) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.plano   = plano;
        calculaValor();
    }

    private void calculaValor() {    	
    	this.valor = plano.calcula(cliente, veiculo);
	}

	public double getValor() {
        return this.valor;
    }

	public void setPlano(Plano plano) {
		this.plano = plano;
		calculaValor();
	}

}