package oop;

public class Dados{

    private final Dado[] dados;
    private int numeroLados;
    private int numeroDados;

    public Dados(){
        this(2,6);
    }

    public Dados(int numeroDados){
        this(numeroDados,6);
    }

    public Dados(int numeroDados,int numeroLados){
        if((numeroDados < 2)||(numeroDados > 8)) 
            throw new IllegalArgumentException("Numero de Dados deve ser entre 2 e 8");
        this.dados = new Dado[numeroDados];
        for(int i = 0; i < numeroDados; this.dados[i] = new Dado(numeroLados), i++);
    }

    public int getValor(){
        int valor = 0;

        for(int i = 0; i < dados.length ; valor += dados[i].getValor(),i++);

        return valor;
    }

    public int getValor(int posicao){
        if((posicao > this.dados.length)||(posicao == 0)) 
            throw new IllegalArgumentException("Não existe esse dado");
        else
        return dados[posicao-1].getValor();
    }

    @Override
    public String toString(){
        return "Valor Total: "+this.getValor() + " Numero de Dados: "+ this.numeroDados;
    }   
} 