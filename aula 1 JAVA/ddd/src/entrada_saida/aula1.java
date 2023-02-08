package entrada_saida;

import java.util.Scanner;

public class aula1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o seu CEP:");
    String cep = sc.nextLine();

    System.out.println("Digite o seu logradouro:");
    String logradouro = sc.nextLine();

    System.out.println("Digite o seu bairro:");
    String bairro = sc.nextLine();

    System.out.println("Digite a sua cidade:");
    String cidade = sc.nextLine();

    System.out.println("CEP: " + cep);
    System.out.println("Logradouro: " + logradouro);
    System.out.println("Bairro: " + bairro);
    System.out.println("Cidade: " + cidade);
  }
}
