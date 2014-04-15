package oo;

public class Principal {

    public static void main(String[] args) {
 
        Cliente cliente = new Cliente("Bruno", new Conta(2000.0), 24);        

        Veiculo veiculo = new Veiculo(2010, 24000.0);

        Seguro seguro = new Seguro(cliente, veiculo, "basico");        
        
        System.out.println(seguro.getValor()); // 0.0
    }
}
