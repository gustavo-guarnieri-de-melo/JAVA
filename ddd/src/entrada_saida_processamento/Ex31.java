package entrada_saida_processamento;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		System.out.print("Insira um valor positivo: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.print("Insira um valor positivo: ");
			num = ler.nextInt();
			
		}System.out.print("Ok, o valor digitado e positivo!");

	}

}
