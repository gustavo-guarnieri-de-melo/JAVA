public class PessoaFisica extends Pessoa implements IPessoa{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica() {
		super();
	}
	
    PessoaFisica(int id,String nome,String email, String cpf){
        super(id,nome,email);
        this.cpf = cpf;
    }
    
    public String exibirDados() {
        return "PF - " + super.exibirDados();
    }
    
    public String exibirDadosPessoa() {
        return "PF - " + super.exibirDados() + " - Cpf: " + this.cpf;
    }
}