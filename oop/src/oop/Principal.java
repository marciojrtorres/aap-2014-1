package oop;

public class Principal {

    public static void main(String[] args) {
    	// tipo parametrizado
    	Dado<String> d1 = new Dado<>("porto", "paulo","marcio","jessica","daniel","bruno");
    	
    	//Dado d1 = new Dado(3,4,7,8,1);
    	
    	d1.joga();
    	
    	String v = (String) d1.getValor();
    	
    	System.out.println(v);
        
    	//Teste t = new Teste();    	
    	//System.out.println(t.getClass().getSuperclass().getSuperclass());
    }
} 

class Teste {
	
}
