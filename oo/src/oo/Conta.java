package oo;

public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double quantia) {
        this.saldo += quantia;
    }

}