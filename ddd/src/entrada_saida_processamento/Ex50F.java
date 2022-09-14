package entrada_saida_processamento;

import java.util.Scanner;

public class Ex50F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,x1,n1;
		System.out.printf("Digite o valor (A): ");
		a=ler.nextInt();
		System.out.printf("Digite o valor (B): ");
		b=ler.nextInt();
		while(a==b) {
			System.out.printf("Invalido! Os valores não podem ser iguais.");
			System.out.printf("Digite um valor qualquer(B): ");
			b=ler.nextInt();
		}
		if(a>b) {
			x1=a;
		    n1=b;
		}else {
			n1=a;
		    x1=b;
		}
		for(n1=n1;n1<=x1;n1++) {
			if((n1%2)==0 && (n1>10)) {
				System.out.println(n1);
			}
		}

	}

}