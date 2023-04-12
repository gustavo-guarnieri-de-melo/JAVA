import java.io.FileWriter;
import java.io.IOException;

class ListaCompras {
    private Produto[] produtos;

    public ListaCompras(int numProdutos) {
        produtos = new Produto[numProdutos];
    }

    public void adicionarProduto(int index, Produto produto) {
        produtos[index] = produto;
    }

    public void gravarLista() throws IOException {
        FileWriter arquivo = new FileWriter("lista.txt");
        for (Produto produto : produtos) {
            arquivo.write(produto.toString() + "\n");
        }
        arquivo.close();
    }
}