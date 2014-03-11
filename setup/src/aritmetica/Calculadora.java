package aritmetica;

public class Calculadora {
	public static int soma (int a, int b) {
		return a + b;
	}

    public static int subtrai (int a, int b) {
        return a - b;
    }
    
    public static int multiplica (int a, int b) {
        int resultado = 0;
        if (b >= 0) {
            for (int i = 0; i < b; i++) resultado = resultado + a;
        } else {
            for (int i = 0; i > b; i--) resultado = resultado - a;
        }
        return resultado;
    }

    public static int quadrado (int a) { 
        return multiplica (a, a);
    }

    public static int cubo (int a) {
        return multiplica (a, quadrado(a));
    }

    public static int potencia (int a, int b) {
        int r = a;
        for (int i = 1; i < b ; i++) {
            r = multiplica (a, r);
        }
        return r;
    }


}