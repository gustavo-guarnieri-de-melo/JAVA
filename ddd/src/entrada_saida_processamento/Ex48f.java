package entrada_saida_processamento;
import java.util.Scanner;
public class Ex48f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,x;
		System.out.printf("Digite um valor qualquer: ");
		n=ler.nextInt();
		x=n;
		for(n=n;n<=x+20;n++) {
			System.out.println(n);
		}

	}

}