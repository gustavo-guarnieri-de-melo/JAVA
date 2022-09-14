package entrada_saida_processamento;

import java.util.Scanner;

public class Ex48WD {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		int inicial, total , i;
		
		System.out.print("Digite um valor positivo: ");
		inicial = ler.nextInt();
				
		total = inicial + 20;
		
		while(inicial < 0) {
			System.out.print("Digite um valor positivo: ");
			inicial = ler.nextInt();
			
		}
		i = inicial;
		
		while(inicial < total) {
			inicial = i + 1;
			System.out.println(inicial);
			
			i++;
		}
		
	}

}