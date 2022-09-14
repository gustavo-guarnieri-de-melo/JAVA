package entrada_saida_processamento;

import java.util.Scanner;

public class Ex42W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,i=1;
		double a=1,b=2,x=(a/b);
		
		System.out.printf("Digite um valor positivo menor que 50: ");
		n=ler.nextInt();
		while(n<=0 || n>50) {
			System.out.printf("Valor invalido!");
			System.out.printf("Digite um valor positivo menor que 50: ");
			n=ler.nextInt();
		}
		
		while(i<=n) {
			a=a+1;
		    b=b+1;
		    x=x+(a/b);
		    System.out.printf("\nO %dº valor é:%f",i,x);
		    i++;
		}

	}

}