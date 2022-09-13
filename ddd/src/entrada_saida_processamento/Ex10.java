package entrada_saida_processamento;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1 , p2;
		
		System.out.printf("Digite o primeiro valor: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		p2 = ler.nextDouble();
		
		
		if (p1 > p2){
			System.out.printf("O primeiro valor é menor do que o segundo!");
		
		}else {
			System.out.printf("O segundo valor é menor que o primeiro!");
		}
	}

}
