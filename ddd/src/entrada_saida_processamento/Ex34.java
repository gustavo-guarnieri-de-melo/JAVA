package entrada_saida_processamento;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Tabuada do 5");
		int num, i, t;
		
		num = 5;
		
		i = 1;
        
        while (i <= 10) {
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
           
            if (i == 10)
                break;
           
            i++;
        }
    }
}
