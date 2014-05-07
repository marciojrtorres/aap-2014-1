package oop;

public class TesteInterfaces {

	public static void main(String[] args) {
		
		// abstrato = concreto
		OperacaoSoma soma = new OperacaoSoma();
		OperacaoSubtracao subtracao = new OperacaoSubtracao();
		OperacaoMultiplicacao multiplicacao = new OperacaoMultiplicacao();
		
		Calculadora calc = new Calculadora(subtracao, subtracao);
		
		System.out.println(calc.op1(2, 3)); // 5 
		
		System.out.println(calc.op2(2, 3)); // 6	
		
	}

}