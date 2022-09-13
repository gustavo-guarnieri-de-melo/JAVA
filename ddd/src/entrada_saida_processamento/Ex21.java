package entrada_saida_processamento;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, result;
		String escolhas;
		
		System.out.printf("Digite o primeiro valor");
		v1 = ler.nextInt();
		System.out.printf("Digite o segundo valor");
		v2 = ler.nextInt();
		
		System.out.printf("1- multiplicação, 2- adiçao, 3- divisão, 5- subtração, 5- fim do processo");
		escolhas = ler.next();
		
		if (escolhas.equals("1")) {
			result = v1 * v2;
			System.out.printf("seu resultado é %d", result);
			
			
		}else if(escolhas.equals("2")) {
			result = v1 + v2;
			System.out.printf("seu resultado é %d", result);
			
			
		}else if(escolhas.equals("3")) {
			result = v1 / v2;
			System.out.printf("seu resultado é %d", result);
			
			
		}else if(escolhas.equals("4")) {
			result = v1 - v2;
			System.out.printf("seu resultado é %d", result);
			
			
		}else if(escolhas.equals("5")) {
			System.out.printf("fim do processo");
			
			
		}else {
			System.out.printf("invalido");
		}
	}

}
