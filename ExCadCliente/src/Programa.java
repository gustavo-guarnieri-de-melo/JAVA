import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
 
public class Programa {
 
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        HashMap<Integer, Cliente> listaClientes = new HashMap<Integer, Cliente>();
       
        int opcao;
        int id;
        Cliente cli;
        int id_cliente=0;
        int tipoConta;
        double v;
 
        do {        
           System.out.printf("===> Sistema de Cadastro de Clientes e Conta Bancária<===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Incluir \n" +
                             "2 - Excluir \n" +
                             "3 - Exibir \n" +
                             "4 - Depositar \n" +
                             "5 - Sacar \n" +
                             "6 - Extrato \n" +
                             "7 - Sair\n\n");


           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
               Cliente cliente = new Cliente();
               
               id_cliente++;
               cliente.setId(id_cliente);
               
               System.out.print("Digite o seu nome: ");
               cliente.setNome(ler.next());
               
               System.out.print("Digite a seu idade: ");
               cliente.setIdade(ler.nextInt());
               
               System.out.print("Digite o seu e-mail: ");
               cliente.setEmail(ler.next());
               
               System.out.print("Deseja criar conta (1 = corrente | 2 = poupaça | 3 = salário)?");
               tipoConta = ler.nextInt();
                             
               if(tipoConta == 1) {
                   ContaCorrente cc = new ContaCorrente();
                   
                   System.out.print("Digite a agencia: ");
                   cc.setAgencia(ler.next());
                   
                   System.out.print("Digite o numero: ");
                   cc.setNumero(ler.next());
                   
                   cc.setSaldo(0);
                   
                   cc.setChequeEspecial(100);
                   
                   cliente.setConta(cc);
               }
               else if(tipoConta == 2) {
                   ContaPoupanca cp = new ContaPoupanca();
                   
                   System.out.print("Digite a agencia: ");
                   cp.setAgencia(ler.next());
                   
                   System.out.print("Digite o numero: ");
                   cp.setNumero(ler.next());
                   
                   cp.setSaldo(0);
                   
                   cp.setRentabilidade(0.10);
                   
                   cliente.setConta(cp);                
               }
               else {
            	   ContaSalario cs = new ContaSalario();
            	   
                   System.out.print("Digite a agencia: ");
                   cs.setAgencia(ler.next());
                   
                   System.out.print("Digite o numero: ");
                   cs.setNumero(ler.next());
                   
                   cs.setSaldo(0);
                   
                   cliente.setConta(cs);
               }
               
               listaClientes.put(id_cliente, cliente);
               
               System.out.printf("Cliente incluído com sucesso!");
               System.in.read();
           }
           else if(opcao == 2) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                 });
               
               System.out.print("Digite o ID do cliente que você deseja excluir: ");
               id = ler.nextInt();
               
               if (listaClientes.containsKey(id)) {
            	   listaClientes.remove(id);
            	   System.out.printf("Cliente excluído com sucesso!");
               }
               else
            	   System.out.printf("Cliente não encontrado!");
               
               System.in.read();
           }
           else if(opcao == 3) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                   
                   if (valor.getConta() != null)
                	   System.out.println(valor.getConta().exibirDadosConta());
                 });

               System.in.read();
           }
           else if(opcao == 4) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                   
                   if (valor.getConta() != null)
                	   System.out.println(valor.getConta().exibirDadosConta());
                 });
               
               System.out.print("Digite o ID do cliente que você deseja realizar o depósito: ");
               id = ler.nextInt();
               
               if (listaClientes.containsKey(id)) {
            	   
                   System.out.print("Digite o valor do depósito: ");
                   v = ler.nextDouble();
                   
            	   listaClientes.get(id).getConta().Depositar(v);
            	   
            	   System.out.printf("Depósito realizado com sucesso!");
               }
               else
            	   System.out.printf("Cliente não encontrado!");

               System.in.read();
           }
           else if(opcao == 5) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                   
                   if (valor.getConta() != null)
                	   System.out.println(valor.getConta().exibirDadosConta());
                 });
               
               System.out.print("Digite o ID do cliente que você deseja realizar o saque: ");
               id = ler.nextInt();
               
               if (listaClientes.containsKey(id)) {
            	   
                   System.out.print("Digite o valor do saque: ");
                   v = ler.nextDouble();
                   
            	   if (listaClientes.get(id).getConta().Sacar(v))
            		   System.out.printf("Saque realizado com sucesso!");
            	   else
            		   System.out.printf("Saldo insuficiente para saque!");
               }
               else
            	   System.out.printf("Cliente não encontrado!");

               System.in.read();
           }
           else if(opcao == 6) {
               listaClientes.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirNomeIdade());
                   
                   if (valor.getConta() != null)
                	   System.out.println(valor.getConta().exibirDadosConta());
                   		for (String transacao: valor.getConta().getHistorico()) {
                   			System.out.println(transacao);
                   		}
                 });

               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 6) );
    }
}