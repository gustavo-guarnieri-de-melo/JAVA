package entrada_saida_processamento;

import java.util.Scanner;

public class Ex41WD {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,i=0,a=0;
		
		System.out.printf("Digite um valor positivo menor que 100: ");
		n=ler.nextInt();
		while(n<=0 || n>100) {
			System.out.printf("Valor invalido!");
			System.out.printf("\nDigite um valor positivo menor que 100: ");
			n=ler.nextInt();
		}
		
		 do{
			if(i==0) {
				a=((i+1)*(i+1))+1;
			}else {
				a=a+((i+1)*(i+1))+1;
				System.out.printf("\nO %dº valor é:%d",i,a);
			}
			i++;
		}while(i<=n);

	}

}