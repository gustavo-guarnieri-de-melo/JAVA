package entrada_saida_processamento;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int h, ca, co;
		
		System.out.printf("Digite o valor da hipotenusa: ");
		h = ler.nextInt();
		System.out.printf("Digite o valor do cateto adj: ");
		ca = ler.nextInt();
		System.out.printf("Digite o valor do cateto: ");
		co = ler.nextInt();
		
		if  (h * h == ca * ca + co * co) {
			System.out.printf("é um triangulo retangulo");
		}
		else{
			System.out.printf("não é um triangulo retangulo");
		}
		
		
		
		
	}


}