package Exercicio;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		String baseDados = "CJose dos Santos,42,Sao Paulo;CJose dos Santos,42,Sao Paulo;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";
		
		String[] listaClientesProdutos = baseDados.split(";");
		
		
		for (String registro: listaClientesProdutos) {
			//if(registro.getBytes()[0] == 67) {
			if (registro.substring(0, 1).equals("C")) {
				registro = registro.substring(1);
				
				String[] dadosCliente = registro.split(",");
				
				Cliente c = new Cliente();
				c.setNome(dadosCliente[0]);
				c.setIdade(Integer.parseInt(dadosCliente[1]));
				c.setCidade(dadosCliente[2]);
				
				clientes.add(c);
			}
			// "P"
			//else if(registro.startsWith("P")) {
			else if(registro.getBytes()[0] == 80) {
				registro = registro.replaceFirst("P", "");
				
				String[] dadosProduto = registro.split(",");
				
				Produto p = new Produto();
				p.setNome(dadosProduto[0]);
				p.setQtdEstoque(Double.parseDouble(dadosProduto[1]));
				p.setPreco(Double.parseDouble(dadosProduto[2]));

				produtos.add(p);
			}
		}
		
		System.out.println("CLIENTES\n");
		for (Cliente c: clientes) {
			System.out.println("  Nome: " + c.getNome());
			System.out.println(" Idade: " + c.getIdade());
			System.out.println("Cidade: " + c.getCidade());
		}
		
		System.out.println("\n\nPRODUTOS\n");
		for (Produto p: produtos) {
			System.out.println("   Nome: " + p.getNome());
			System.out.println("Estoque: " + p.getQtdEstoque());
			System.out.println("  Preço: " + p.getPreco());
		}
	}
}