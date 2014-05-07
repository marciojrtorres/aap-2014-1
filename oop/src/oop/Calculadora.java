package oop;

// Calculadora COM OPERACOES ABSTRATAS
public class Calculadora {
	
	// não é flexível, ela é "engessada"
	// por que? por que as operações são concretas!
	// private OperacaoBinaria op1 = new OperacaoSoma();
	// private OperacaoBinaria op2 = new OperacaoSubtracao();
	
	// operações flexíveis, por que são abstratas
	// dois atributos abstratos
	private OperacaoBinaria op1;
	private OperacaoBinaria op2;
	
	public Calculadora(OperacaoBinaria op1, OperacaoBinaria op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public int op1(int a, int b) {
		return op1.executa(a, b);
	}
	
	public int op2(int a, int b) {
		return op2.executa(a, b);
	}

}