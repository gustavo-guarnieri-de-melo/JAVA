package entrada_saida_processamento;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, t;
		
		System.out.print("Insira o numero positivo que deseja saber a tabuada: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.print("Insira um numero positivo valido: ");
			num = ler.nextInt();	
		}i = 1;
		while(i < 11) {
			t = num * i;
			System.out.printf("\n%d * %d = %d", num, i, t);
			i++;
		}
	}

}
