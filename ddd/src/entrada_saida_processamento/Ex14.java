package entrada_saida_processamento;

import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double altura, peso, imc;
		
		System.out.printf("Digite altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o peso: ");
		peso = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc > 50) {
			System.out.printf("seu peso esta ideal");
		} else {
			System.out.printf("seu peso nao esta ideal");
		}
	}
}