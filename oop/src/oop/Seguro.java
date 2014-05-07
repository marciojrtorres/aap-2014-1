package oop;

public class Seguro {
    
    private Cliente cliente;
    private Veiculo veiculo;
    private double  valor;

    public Seguro(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public double getValor() {
        return this.valor;
    }

}