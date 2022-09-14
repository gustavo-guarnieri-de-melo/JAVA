package entrada_saida_processamento;

import java.util.Scanner;

public class Ex48w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,x;
		System.out.printf("Digite um valor qualquer: ");
		n=ler.nextInt();
		x=n;
		while(n<=x+20) {
			System.out.println(n);
			n++;
		}

	}

}