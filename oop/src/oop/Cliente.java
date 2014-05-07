package oop;

public class Cliente {

    private String nome;
    private Conta  conta;
    private int idade;

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return this.nome;
    }

    public Conta getConta() {
        return this.conta;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}