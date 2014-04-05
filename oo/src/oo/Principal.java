package oo;

public class Principal {
    public static void main(String[] args) {
       
        Dado dado = new Dado(); // de 1 a 6
        // API do Dado (como usar o dado) (intenção)
        System.out.println(dado.getValor()); // um valor de 1 a 6
        dado.joga(); // mudei o estado
        System.out.println(dado.getValor()); // outro valor
        dado.joga(); // mudei o estado
        System.out.println(dado.getValor()); // outro valor

        Dado dado = new Dado(18); // mínimo e máximo: 4 a 20 // throw new IllegalArgumentException("motivo");
        System.out.println(dado.getValor()); // um valor de 1 a 18

        Dados dados = new Dados(); // dois dados de 6 lados
        System.out.println(dado.getValor()); // um valor de 2 a 12

        Dados dados = new Dados(3); // três dados de 6 lados
        System.out.println(dado.getValor()); // um valor de 3 a 18

        Dados dados = new Dados(3, 20); // três dados de 20 lados
        dados.joga();
        System.out.println(dado.getValor()); // um valor de 3 a 60 (todos somados)
        System.out.println(dado.getValor(1)); // valor do primeiro
        System.out.println(dado.getValor(2)); // valor do segundo
        System.out.println(dado.getValor(3)); // valor do terceiro
        // 22/4

    }
}