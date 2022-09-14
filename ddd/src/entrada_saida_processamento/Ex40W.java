package entrada_saida_processamento;

import java.util.Scanner;

public class Ex40W {
	Scanner ler = new Scanner(System.in);
	
	int v = 20, v1 =1, v2 =1, v3=1, v4 =1, r;{
	
	do {
		r = v1 + v2 + v3;
		v1 = v2;
		v2 = v3;
		v3 = r;
		v4 = v4 + 1;
	}while(v4 <= 20);
	
	
	
	}
		
	
}
