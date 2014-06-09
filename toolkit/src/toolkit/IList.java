package toolkit;

public interface IList {

	// contrato
	// assinatura do método
	// API
	
	void append(Object object); 
	
	Object get(int index);
	
	int length();
	
	boolean drop(int index);
	
}
