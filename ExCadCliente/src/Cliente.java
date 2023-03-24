public class Cliente {
	  
    private int id;
    private String nome;
    private int idade;
    private String email;
    private Conta conta;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
   
    Cliente(){
       
    }
   
    Cliente(int id,String nome,int idade,String email, Conta conta){
        this.id=id;
        this.nome=nome;
        this.idade=idade;
        this.email=email;
        this.conta=conta;
    }
   
   
    public String exibirNomeIdade() {
        return("Nome: " + this.nome + " - Idade: " + this.idade);
    }
   

}