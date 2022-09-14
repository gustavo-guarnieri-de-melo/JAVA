package entrada_saida_processamento;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.printf("Digite o valor do primeiro lado do triângulo: ");
		l1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo lado do triângulo: ");
		l2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro lado do triângulo: ");
		l3 = ler.nextDouble();

		if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
			System.out.printf("É um triângulo.");
			if ((l1 == l2) && (l1 == l3)) {
				System.out.printf("Triângulo Eqüilatero.");
			}else if ((l1 != l2) && (l1 != l3)) {
				System.out.printf("Triângulo Escaleno.");
			}else {
				System.out.printf("Triângulo Isósceles");
			}
		}else {
			System.out.printf("Não é um Triângulo.");
		}
	}

}
