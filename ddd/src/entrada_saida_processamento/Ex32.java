package entrada_saida_processamento;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.print("Insira o primeiro valor: ");
		v1 = ler.nextInt();
		
		System.out.print("Insira o segundo valor: ");
		v2 = ler.nextInt();
		
		while(v1 > v2) {
			System.out.print("Insira novamente o primeiro valor: ");
			v1 = ler.nextInt();
			System.out.print("Insira novamente o segundo valor: ");
			v2 = ler.nextInt();
			
		}System.out.print("O segundo valor é maior!");
	}

}
