import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaCompras listaCompras = new ListaCompras(10);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do produto " + (i+1) + ": ");
            String nome = scanner.next();

            System.out.print("Digite a quantidade de " + nome + ": ");
            int quantidade = scanner.nextInt();

            System.out.print("Digite o preço unitário de " + nome + ": ");
            double preco = scanner.nextDouble();

            Produto produto = new Produto(nome, quantidade, preco);
            listaCompras.adicionarProduto(i, produto);
        }

        try {
            listaCompras.gravarLista();
            System.out.println("Lista de compras gravada com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar lista de compras: " + e.getMessage());
        }
    }
}