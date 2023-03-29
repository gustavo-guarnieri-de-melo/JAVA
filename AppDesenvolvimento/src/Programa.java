import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Programa {

    public static void main(String[] args) {
        ArrayList<Tecnologia> tecnologias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas tecnologias deseja criar? ");
        int quantidadeTecnologias = scanner.nextInt();

        for (int i = 0; i < quantidadeTecnologias; i++) {
            System.out.print("Criar tecnologia de backend ou frontend? (B/F) ");
            char tipoTecnologia = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            System.out.print("Linguagem de programação: ");
            String linguagemProgramacao = scanner.nextLine();

            System.out.print("Principal framework: ");
            String principalFramework = scanner.nextLine();

            System.out.print("Descrição da linguagem: ");
            String descricaoLinguagem = scanner.nextLine();

            System.out.print("Descrição do framework: ");
            String descricaoFramework = scanner.nextLine();

            boolean conteinerizavel;
            boolean compativelWeb;
            boolean compativelMobile;

            if (tipoTecnologia == 'B') {
                System.out.print("Conteinerizável? (S/N) ");
                char resposta = scanner.next().toUpperCase().charAt(0);
                conteinerizavel = resposta == 'S';
                tecnologias.add(new Backend(linguagemProgramacao, principalFramework, descricaoLinguagem, descricaoFramework, conteinerizavel));
            } else if (tipoTecnologia == 'F') {
                System.out.print("Compatível com web? (S/N) ");
                char resposta = scanner.next().toUpperCase().charAt(0);
                compativelWeb = resposta == 'S';
                System.out.print("Compatível com mobile? (S/N) ");
                resposta = scanner.next().toUpperCase().charAt(0);
                compativelMobile = resposta == 'S';
                tecnologias.add(new Frontend(linguagemProgramacao, principalFramework, descricaoLinguagem, descricaoFramework, compativelWeb, compativelMobile));
            } else {
                System.out.println("Tipo de tecnologia inválido. Tente novamente.");
                i--;
            }
        }

        System.out.println("\nTecnologias cadastradas:");
        for (Tecnologia tecnologia : tecnologias) {
            System.out.println(tecnologia);
        }

        scanner.close();
    }
}