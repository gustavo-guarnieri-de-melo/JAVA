package CP5;

import java.util.Scanner;
import java.io.*;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*criar repositorio*/
        String pedidos = "C:\\temp\\pedido.txt";
        String total = "C:\\temp\\total_pedidos.txt";
        boolean continua = true;

        try (BufferedWriter totalP = new BufferedWriter(new FileWriter(total))) {
            while (continua) {
                try (BufferedReader pedidosP = new BufferedReader(new FileReader(pedidos))) {
                    double totalPedido = 0;
                    String nomePessoa = "";
                    String linha;

                    
                    System.out.println("NOME DO CLIENTE: ");
                    nomePessoa = ler.next();

                    System.out.println("QTDE DE PRODUTOS: ");
                    int qtdProduto = ler.nextInt();

                    for (int i = 0; i < qtdProduto; i++) {
                        Produto p = new Produto();

                        
                        System.out.println("PRODUTO " + (i + 1) + ": ");
                        p.setNome(ler.next());
                        

                        System.out.println("QUANTIDADE PRODUTO " + (i + 1) + ": ");
                        p.setQuantidade(ler.nextDouble());

                        System.out.println("VALOR UNITARIO PRODUTO " + (i + 1) + ": ");
                        p.setPreco(ler.nextDouble());

                        totalPedido += p.getQuantidade() * p.getPreco();

                        
                        linha = p.getNome() + "," + p.getQuantidade() + "," + p.getPreco() + "\n";
                        try (BufferedWriter pedidosWriter = new BufferedWriter(new FileWriter(pedidos, true))) {
                            pedidosWriter.write(nomePessoa + "\n");
                            pedidosWriter.write(linha);
                            pedidosWriter.newLine();
                        } catch (IOException e) {
                            System.out.print("ERRO AO ESCREVER ARQUIVO - " + e);
                            break;
                        }
                    }

                    
                    linha = nomePessoa + " - R$ " + String.format("%.2f", totalPedido);
                    totalP.write(linha);
                    totalP.newLine();

                    

                    
                    System.out.println("NOVO PEDIDO? (S/N)");
                    String resposta = ler.next();
                    if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("s")) {
                        continua = true;
                    } else {
                        continua = false;
                    }
                } catch (IOException e) {
                    System.out.print("ERRO LER ARQUIVO PEDIDOS- " + e);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.print("ERRO AO CRIAR ARQUIVO TOTAL - " + e);
        }

        System.out.println("OBRIGADO!");
    }
}