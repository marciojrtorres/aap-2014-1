package oo;

import toolkit.Randomizer;

public class Dado {

    private int valor;
    
    // construtor
    public Dado() {
        // this.valor = (int) (Math.random() * 6 + 1); // VIOLA O DRY
        this.joga(); // CONFORME O DRY
    }

    // PRINCIPIO DA RESPONSABILIDADE UNICA
    // SRP (SINGLE RESPONSIBILITY PRINCIPLE)
    // UM METODO FAZ APENAS UMA COISA

    // PRINCIPIO COMMAND/QUERY SEPARATION
    // SEPARACAO DE COMANDO E CONSULTA

    // PRINCIPIO DRY: DON'T REPEAT YOURSELF
    // NAO SE REPITA: UMA UNICA REPRESENTACAO DO ALGORITMO
    public int getValor() { // CONSULTA: le o estado
        return this.valor;
    }

    public void joga() {    // COMANDO: altera o estado
        // coerção (tipo de conversão)
        this.valor = (int) (Math.random() * 6 + 1);
    }

}