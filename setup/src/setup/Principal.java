package setup;

import static java.lang.System.out;
import aritmetica.Calculadora;
import static aritmetica.Calculadora.soma;

public class Principal {
    public static void main(String[] args) {
        
        out.println("Principal");

        out.println(aritmetica.Calculadora.soma(2,3));
        out.println(Calculadora.soma(4,5));
        out.println(soma(8,9));

        // assertiva de teste
        out.println(soma(8,12) == 20); // true
        out.println(soma(-9,-1) == -10); // true
        out.println(soma(2000000000,2000000000)); // buffer overflow
        
    }
}