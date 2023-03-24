public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public String getCpf() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
		super();
	}
	
	PessoaJuridica(int id,String nome,String email, String cnpj){
        super(id,nome,email);
        this.cnpj = cnpj;
    }

    public String exibirDados() {
        return "PJ - " + super.exibirDados();
    }
}