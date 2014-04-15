package oo;

public class Seguro {
    
    private Cliente cliente;
    private Veiculo veiculo;
    private double  valor;
    private String  plano; // minimo, basico, total 

    public Seguro(Cliente cliente, Veiculo veiculo, String plano) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.plano   = plano;
        calculaValor();
    }

    private void calculaValor() {    	
    	if (plano.equals("minimo")) {
    		this.valor = 100.0;
    		if (cliente.getIdade() < 30) {
    			this.valor = this.valor * 1.1; // + 10%
    		}
    		if (veiculo.getAno() > 2010) {
    			this.valor = this.valor * 1.1; // + 10%
    		}
    	} else if (plano.equals("basico")) {
    		
    	} else if (plano.equals("total")) {
    		
    	}
		// this.valor = ?;
	}

	public double getValor() {
        return this.valor;
    }

}