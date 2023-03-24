import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
 
public class Programa {
 
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        HashMap<Integer, Pessoa> listaPessoas = new HashMap<Integer, Pessoa>();
       
        int opcao;
        int id;
        PessoaFisica pf;
        PessoaJuridica pj;
        int id_pessoa=0;
        String possuiConta;
        String nome;
        String email;
        String cpf;
        String cnpj;
        Pessoa p;
        
 
        do {        
           System.out.printf("===> Sistema de Cadastro de Pessoas PF/PJ <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Incluir \n" +
                             "2 - Atualizar \n" +
                             "3 - Excluir \n" +
                             "4 - Exibir \n" +
                             "5 - Sair\n\n");


           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
               System.out.printf("Escolha o tipo de Pessoa: 1 - Pessoa Física | 2 - Pessoa Jurídica\n");
               opcao = ler.nextInt();
               
               id_pessoa++;
               
               System.out.print("Digite o seu nome: ");
               nome = ler.next();
               
               System.out.print("Digite o seu e-mail: ");
               email = ler.next();
               
               if (opcao == 1) {
                   System.out.print("Digite o seu CPF: ");
                   cpf = ler.next();
                   
                   pf = new PessoaFisica(id_pessoa, nome, email, cpf);
                   
                   listaPessoas.put(id_pessoa, pf);
               }
               else {
                   System.out.print("Digite o seu CNPJ: ");
                   cnpj = ler.next();
                   
                   pj = new PessoaJuridica(id_pessoa, nome, email, cnpj);
                   
                   listaPessoas.put(id_pessoa, pj);
               }
               
               System.out.printf("Pessoa incluída com sucesso!");
               System.in.read();
           }
           else if(opcao == 2) {              
               listaPessoas.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirDados());
                 });

               
               System.out.print("Digite o ID da pessoa que você deseja atualizar: ");
               id = ler.nextInt();
               
               if (listaPessoas.containsKey(id)) {
            	   p = listaPessoas.get(id);   
                   
                   System.out.print("Digite o seu novo nome: ");
                   p.setNome(ler.next());
                                     
                   System.out.print("Digite o seu novo e-mail: ");
                   p.setEmail(ler.next());
                   
                   System.out.printf("Pessoa atualizada com sucesso!");
               }
               else {
                   System.out.printf("Pessoa não encontrada!");
               }
               System.in.read();
           }
           else if(opcao == 3) {
               listaPessoas.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirDados());
                 });
               
               System.out.print("Digite o ID da pessoa que você deseja excluir: ");
               id = ler.nextInt();
               
               if (listaPessoas.containsKey(id)) {
            	   listaPessoas.remove(id);
            	   System.out.printf("Pessoa excluída com sucesso!");
               }
               else
            	   System.out.printf("Pessoa não encontrada!");
               
               System.in.read();
           }
           else if(opcao == 4) {
               listaPessoas.forEach((chave, valor) -> {
                   System.out.println("ID: " + chave + " - " + valor.exibirDados());
                 });

               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 4) );
    }
}