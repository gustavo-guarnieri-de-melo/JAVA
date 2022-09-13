package entrada_saida_processamento;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base , altura , calculo;
		
		System.out.printf("Digite a base do seu retangulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite a altura de seu retangulo: ");
		altura = ler.nextDouble();
		
		calculo = base * altura;
		
		
		if (calculo >= 100){
			System.out.printf("Seu terreno é grande!");
		
		}else {
			System.out.printf("Seu terreno é pequeno!");
		}
	}

}
