package setup;

import static java.lang.System.out;
import aritmetica.Calculadora;
import static aritmetica.Calculadora.soma;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        // PROGRAMAR != PROJETAR (DESIGN/DESENHO)
        // BEM PROGRAMADO == FUNCIONA
        // BEM PROJETADO == [NAO CAUSA SURPRESAS, EVITAR REDUNDANCIA]
        // APROVEITAR CODIGO

        out.println("Principal");

        out.println(aritmetica.Calculadora.soma(2,3));
        out.println(Calculadora.soma(4,5));
        out.println(soma(8,9));

        // assertiva de teste (BOLEANA)
        // cumprir um contrato
        out.println(soma(8,12) == 20); // true
        // ASSERTIVA PARA UMA API
        out.println(soma(8,12));
        out.println(soma(-9,-1) == -10); // true
        // out.println(soma(2000000000,2000000000)); // buffer overflow

        // API: CONTRATO
        // APPLICATION PROGRAMMING INTERFACE
        // INTERFACE DE PROGRAMACAO DE APLICATIVOS

        // Calculadora.multiplica(int,int):int
        out.println(Calculadora.multiplica(3,4));
        out.println(Calculadora.multiplica(3,4) == 12); // 12
        out.println(Calculadora.multiplica(-3,4) == -12);
        out.println(Calculadora.multiplica(-3,-4) == 12);

        out.println(Calculadora.quadrado(3) == 9);
        out.println(Calculadora.quadrado(4) == 16);
        out.println(Calculadora.quadrado(-5) == 25);

        out.println(Calculadora.potencia(2,8) == 256);
        out.println(Calculadora.potencia(2,8));
    }
}