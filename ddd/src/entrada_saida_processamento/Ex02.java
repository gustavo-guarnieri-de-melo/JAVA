package entrada_saida_processamento;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a, h, resultado;

		System.out.printf("digite o valor da area");
		a = ler.nextInt();
		
		System.out.printf("digite o valor da altura");
		h = ler.nextInt();
		
		resultado = a * h;
		
		System.out.printf("o resultado e: %d", resultado);

	}

}
