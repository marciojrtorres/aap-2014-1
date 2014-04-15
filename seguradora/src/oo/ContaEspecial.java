package oo;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial() {
        super(0);
    }

    public ContaEspecial(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return super.getSaldo() + this.limite;
    }

}