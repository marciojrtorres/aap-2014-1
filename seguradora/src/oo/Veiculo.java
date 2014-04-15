package oo;

public class Veiculo {
    
    private int ano;
    private double valor;

    public Veiculo(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public int getAno() {
        return this.ano;
    }

    public double getValor() {
        return this.valor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}