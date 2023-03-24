public class ContaSalario extends Conta{

    public ContaSalario() {
    	super();
    }
   
    public ContaSalario(String agencia, String numero, double salario) {
        super(agencia, numero, salario);
    }
    
    public String exibirDadosConta() {
        return "Tipo de Conta: Conta Salário\n" + super.exibirDadosConta();
    }
}