package entrada_saida_processamento;
import java.util.Scanner;


public class Ex38F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor = 1;
		int r;
		int i;
		
		for (i = 1; i <= 99; i++) {
			r = valor + i;
			System.out.printf("%d",r);
		}
		
		
	}

}
