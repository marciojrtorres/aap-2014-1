package oop;

// Dado tem TIPO parametrizado
public class Dado<TIPO> {

    private TIPO valor;
    private Object[] faces;

    public Dado(TIPO[] faces) {
        if (faces.length < 4 || faces.length > 20) 
            throw new IllegalArgumentException("Numero de lados deve ser entre 4 e 20");
        
        this.faces = faces;
        
        this.joga();
    }
    
    // VARARGS = Variable Arguments = Argumentos Variáveis
    public Dado(TIPO f0, TIPO f1, 
    		TIPO f2, TIPO f3, 
    		TIPO... facesRecebidas) {
    	
    	this.faces = new Object[4 + facesRecebidas.length];
    	
    	this.faces[0] = f0;
    	this.faces[1] = f1;
    	this.faces[2] = f2;
    	this.faces[3] = f3;
    	
    	for (int i = 0; i < facesRecebidas.length; i++)
    		this.faces[i + 4] = facesRecebidas[i];
    	
    	this.joga();
    }


    public TIPO getValor(){
        return this.valor;
    }

    public void joga(){
    	int posicao = (int) (Math.random() * faces.length);
        this.valor = (TIPO) faces[posicao]; 
    }

    @Override
    public String toString(){
        return "Numero de Lados: " + faces.length + " Valor: " + this.valor;
    }   
}  