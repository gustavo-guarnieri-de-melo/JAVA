package entrada_saida_processamento;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double c, d, r;
		
		System.out.printf("digite a cotacao: ");
		c = ler.nextDouble();
		
		System.out.printf("digite a quantidade: ");
		d = ler.nextDouble();
		
		r = c * d;
		System.out.printf("o resultado e %.2f", r);
		
	}

}
