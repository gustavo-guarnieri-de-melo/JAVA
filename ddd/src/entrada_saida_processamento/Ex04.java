package entrada_saida_processamento;

import java.util.Scanner;


public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, resultado;
		
		System.out.printf("digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("digite o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("digite o terceito valor: ");
		c = ler.nextInt();
		
		System.out.printf("digite o quarto valor: ");
		d = ler.nextInt();
		
		resultado = a + b + c + d;
		
		System.out.printf("o resultado da media e :%d ", resultado / 2);
	}

}
