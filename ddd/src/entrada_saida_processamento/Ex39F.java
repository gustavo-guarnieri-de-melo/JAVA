package entrada_saida_processamento;
import java.util.Scanner;


public class Ex39F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1 = 1;
		int v2 = 0;
		int i;
		int y;
		
		for (i = 0; i < 30; i++) {
		System.out.println(v1);
		y = v1;
		v1 = v1 + v2;
		v2 = y;
		}
	}

}
