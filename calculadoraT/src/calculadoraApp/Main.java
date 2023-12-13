package calculadoraApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner Scanner = new Scanner (System.in);
		
		double valorUm;
		double valorDois;
		String valorTres;
		
		System.out.println("digite o valor de um: ");
		valorUm = Scanner.nextDouble();
		
		System.out.println("digite a operação(+, -, /, *) ");
		String operacao = Scanner.next();
		
		System.out.println("digite o valor de dois: ");
		valorDois = Scanner.nextDouble();
		System.out.println("Resultado:" + realizarCalculo(valorUm, valorDois, operacao));
	}
	static double realizarCalculo(Double valorUm, Double valorDois, String operacao){
	Double RespostaCalculo = 0.0;
	
	switch (operacao) {
	case "+":
	RespostaCalculo = valorUm + valorDois;
	break;
	case "-":
	RespostaCalculo = valorUm - valorDois;
	break;
	case "*":
		RespostaCalculo = valorUm * valorDois;
		break;
	case"/":
		RespostaCalculo = valorUm / valorDois;
		break;
		
		default:
			System.out.println("operação é inválida =(");
		
		
		
		
	
	
	}
	
	return RespostaCalculo;
	
	}
}
