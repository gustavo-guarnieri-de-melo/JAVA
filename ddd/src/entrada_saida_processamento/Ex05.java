package entrada_saida_processamento;

import java.util.Scanner;

public class Ex05 {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			double c, f;
			
			System.out.printf("Digite os graus celcius: ");
			c = ler.nextDouble();
			
			f = c * 1.8 + 32;
			
			System.out.printf("o resultado e %.2f: ", f);
	
		}
}
