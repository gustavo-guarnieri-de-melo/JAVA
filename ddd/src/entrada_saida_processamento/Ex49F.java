package entrada_saida_processamento;

import java.util.Scanner;


public class Ex49F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,x,n1,x1,a,s = 0;
		System.out.printf("Digite um valor qualquer(n): ");
		n=ler.nextInt();
		System.out.printf("Digite um valor qualquer(x): ");
		x=ler.nextInt();
		while(n==x) {
			System.out.println("Invalido! Os valores não podem ser iguais.");
			System.out.printf("Digite um valor qualquer(x): ");
			x=ler.nextInt();
		}
		if(n>x) {
			x1=n;
		    n1=x;
		}else {
			n1=n;
		    x1=x;
		}
		a=n1;
		for(n1=a;n1<=x1;n1++) {
			if(n1==a) {
				s=n1;
			}else {
				s=s+n1;
			}
			
		}
		System.out.print(s);
		
	}

}