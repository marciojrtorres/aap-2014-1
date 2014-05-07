package toolkit;

// especificar uma API (LISTA)
// permitir polimorfismo

public interface IList {

	void append(Object object);
	
	Object get(int index);
	
	int length();
	
	void drop(int index);
	
}
