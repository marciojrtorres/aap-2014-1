package oo;

public class Principal {

    public static void main(String[] args) {
 
        Cliente cliente = new Cliente("Bruno", new Conta(2000.0));
        cliente.setIdade(28);

        Veiculo veiculo = new Veiculo(2010, 24000.0);

        Seguro seguro = new Seguro(cliente, veiculo);

        System.out.println(seguro.getValor()); // 0.0

        

        /*
        Conta c = new ContaEspecial(500.0, 200.0);

        System.out.println(c.getSaldo()); // 700.0

        // System.out.println(c.getLimite()); // nao funciona

        System.out.println(((ContaEspecial)c).getLimite());

        System.out.println(c instanceof Conta);

        System.out.println(c.getSaldo()); // saldo + limite

        ContaEspecial ce = new ContaEspecial(500.0, 500.0);

        Cliente cli = new Cliente("Porto", new UmaClasseQualquer());     
        
        System.out.println(cli.getConta().getSaldo());        
        */
    }
}

class UmaClasseQualquer extends ContaEspecial {
    public UmaClasseQualquer() {
        super(1000.0, 1000.0);
    }
}

