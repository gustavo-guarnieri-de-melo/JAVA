package entrada_saida_processamento;
import java.util.Scanner;


public class Ex36W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, a, b, r;
		
		System.out.printf("digite um valor");
		x = ler.nextInt();
		
		while(x < 0) {
			System.out.printf("insira um valor positivo: ");
			x = ler.nextInt();
		}
		
		System.out.printf("digite o valor no qual ira se iniciar: ");
		a = ler.nextInt();
		
		System.out.printf("digite o valor no qual ira ser terminado: ");
		b = ler.nextInt();
		
		while(b < a) {
			System.out.printf("o segundo valor precisa ser maior que o primeiro: ");
			b = ler.nextInt();
		}
		
		while(b >= a) {
			r = x * b;
			System.out.printf("sua tabuada é:%d ", r);
			b = b -1;
			
		}

	}

}
