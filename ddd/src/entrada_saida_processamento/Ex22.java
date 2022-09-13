package entrada_saida_processamento;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double b, h, area;
		String escolhas;
		
		System.out.printf("Digite a base: ");
		b = ler.nextDouble();
		System.out.printf("Digite a altura: ");
		h = ler.nextDouble();
		
		System.out.printf("1- Triângulo, 2- Quadrado, 3- Retângulo, 4- Círculo, 5- fim do processo");
		escolhas = ler.next();
		
		if (escolhas.equals("1")) {
			area = b * h / 2;
			System.out.printf("seu resultado é %.2f", area);
			
			
		}else if(escolhas.equals("2")) {
			area = b * b;
			System.out.printf("seu resultado é %.2f", area);
			
			
		}else if(escolhas.equals("3")) {
			area = b * h;
			System.out.printf("seu resultado é %.2f", area);
			
			
		}else if(escolhas.equals("4")) {
			area = 3.14 * (b * b);
			System.out.printf("seu resultado é %.2f", area);
			
			
		}else if(escolhas.equals("5")) {
			System.out.printf("fim do processo");
			
			
		}else {
			System.out.printf("invalido");
		}
	}

}
