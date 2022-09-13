package entrada_saida_processamento;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			double p = 0, a = 0;
			String sexo;
			double imc = p / (a * a);
			
			System.out.println("Sistema de calculo imc/n");
			
			System.out.printf("Digite o peso: ");
			p = ler.nextInt();
			
			System.out.printf("Digite a altura: ");
			a = ler.nextInt();
			
			System.out.printf("Digite o sexo m/f: ");
			sexo = ler.next();
			
			if (sexo.equals("m") ) {
				if (imc < 20) {
					System.out.printf("abaixo peso");
				}
				else if(imc < 25) {
					System.out.printf("peso ideal");
				}
				else {
					System.out.printf("acima do peso");
				}
				
				
				
			} else if(sexo.equals("f")) {
				
			}
			else if(imc < 19) {
					System.out.printf("abaixo do peso");
			}
			
			else if(imc < 24) {
				System.out.printf("peso ideal");
				
			}else {
				System.out.printf("acima do peso");
			}	
		}	
	
	}