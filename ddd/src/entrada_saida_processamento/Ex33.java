package entrada_saida_processamento;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		System.out.print("Insira seu sexo(m/f): ");
		sexo = ler.next();
		
		while((!sexo.equals("m") && (!sexo.equals("f")))){
			System.out.print("Insira um sexo valido!(m/f): ");
			sexo = ler.next();
		}System.out.print("Ok, voce digitou um sexo valido!");
	}

}
