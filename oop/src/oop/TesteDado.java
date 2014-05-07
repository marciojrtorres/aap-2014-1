package oop;

public class TesteDado {
    public static void main(String[] args) {
       /*
        Dado dado = new Dado(); // de 6 lados, por padrão.

        // API do Dado
        
        System.out.println(dado.getValor()); // um valor de 1 a 6
        dado.joga(); // muda o estado
        System.out.println(dado.getValor()); // outro valor (possivelmente)
        dado.joga(); // muda o estado
        System.out.println(dado.getValor()); // outro valor (possivelmente)
        
        // Novos requisitos:
        
        Dado dado = new Dado(18); // um dado de 18 lados
        System.out.println(dado.getValor()); // um valor de 1 a 18
        
        // deve negar, um dado deve ter no mínimo 4 e no máximo 20 lados
        
        Dado dado = new Dado(22); 
        // lançar exceção com: throw new IllegalArgumentException("mensagem")
        
        Dados dados = new Dados(); // dois dados de 6 lados, por padrão
        System.out.println(dados.getValor()); // um valor de 2 a 12
        
        Dados dados = new Dados(3); // três dados de 6 lados
        System.out.println(dados.getValor()); // um valor de 3 a 18
        
        Dados dados = new Dados(3, 20); // três dados de 20 lados
        System.out.println(dados.getValor());  // um valor de 3 a 60 (soma de todos)
        System.out.println(dados.getValor(1)); // um valor de 1 a 20, do primeiro dado
        System.out.println(dados.getValor(2)); // um valor de 1 a 20, do segundo dado
        System.out.println(dados.getValor(3)); // um valor de 1 a 20, do terceiro dado
        System.out.println(dados.getValor(4)); // IllegalArgumentException (não há quarto dado)
        */
        // deve negar, um grupo de dados deve ser pelo menos 2 e no máximo 8
        Dados dados = new Dados(9, 20); // IllegalArgumentException

        // obs.: proteger o acesso de outros parâmetros inválidos não cobertos
        // nos testes acima.
        
    }
}