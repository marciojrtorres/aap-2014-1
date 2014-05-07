package oop;

// representa nosso modelo de Agua
// representa nosso problema
// por isso chamamos de dominio (negocio)
// aqui nao tem entrada/saida, ou seja, sem System.out.println ...
public class Agua {
    // encapsulamento: nao saber como funciona
    // por dentro
    private int temp = 25;

    public int getTemperatura() {
        return temp;
    }

    public void esquentar() {
        temp = temp + 1;
        // temp++;
    }

    public void esfriar() {
        temp = temp - 1;
    }

    public boolean isLiquida() {
        return temp > 0 && temp < 100;
        // return temp > 0 && temp < 100;
        // return 25 > 0 && 25 < 100;
        // return true && 25 < 100;
        // return true && true;
        // return true;
        /*
        if (temp > 0 && temp < 100) {
            return true;
        } else {
            return false;
        }
        */
    }

    public boolean isSolida() {
        return temp <= 0;
    }

    public boolean isGasosa() {
        return temp >= 100;
    }

    public boolean isNotSolida() {
        // return ! this.isSolida(); // this opcional
        return ! isSolida();
    }

    public void congelar() {
        while (this.isNotSolida()) this.esfriar();
        // while (isNotSolida()) esfriar(); // this opcional
    }

}