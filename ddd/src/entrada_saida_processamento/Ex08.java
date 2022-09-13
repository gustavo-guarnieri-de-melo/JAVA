package entrada_saida_processamento;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1 , p2;
		
		System.out.printf("Digite o primeiro numero: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		p2 = ler.nextDouble();
		
		if (p1 > p2){
			System.out.printf("O primeiro valor é maior do que o segundo!");
		
		}else {
			System.out.printf("O segundo valor é maior que o primeiro!");
			
		}
	}

}
