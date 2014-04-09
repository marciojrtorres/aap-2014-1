package oo;

public class TesteAgua {
    public static void main(String[] args) {

        // Agua
        // todo objeto tem estado

        Agua agua = new Agua(); // instancia
        // temperatura? 25
        System.out.println(agua.getTemperatura()); // 25        
        // como tornar a agua gasosa?
        agua.esquentar(); // ou agua.esquenta()
        System.out.println(agua.getTemperatura()); // 26
        agua.esquentar();
        System.out.println(agua.getTemperatura()); // 27
        // como tornar a agua solida?
        agua.esfriar(); // ou agua.esfria()
        System.out.println(agua.getTemperatura()); // 26
        
        System.out.println(agua.isLiquida()); // true
        System.out.println(agua.isSolida());  // false
        System.out.println(agua.isGasosa());  // false
        
        // se (agua.estaLiquida()) 
        if (agua.isLiquida()) {
            System.out.println("A agua estah liquida!!! yhaa!");
        }
        // 105
        // enquanto (nao agua.estaSolida()) agua.esfriar();
        // while (agua.isNotSolida()) agua.esfriar();

        agua.congelar();

        // uma API deve ser consistente
        // uma API deve ser previsivel

        System.out.println(agua.getTemperatura()); // 0a

    }
}