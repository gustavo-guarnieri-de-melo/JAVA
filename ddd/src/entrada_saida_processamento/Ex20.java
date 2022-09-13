package entrada_saida_processamento;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		double p1, minima;
		
		System.out.printf("digite a primeira nota: ");
		p1 = ler.nextDouble();
		
		minima = (15 - p1) /2;
		
		System.out.printf("voce precisa de %f", minima);

	}

}
