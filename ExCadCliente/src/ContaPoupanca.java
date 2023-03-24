public class ContaPoupanca extends Conta{
    private double rentabilidade;


    public double getRentabilidade() {
        return rentabilidade;
    }


    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupanca() {
    	super();
    }
    
   
    public ContaPoupanca(String agencia, String numero, double saldo, double rentabilidade) {
        super(agencia, numero, saldo);
       
        this.rentabilidade = rentabilidade;
    }
    
    public String exibirDadosConta() {
        return "Tipo de Conta: Conta Poupança\n" + super.exibirDadosConta() + "\nRentabilidade: " + rentabilidade;
    }
    
    public void Depositar(double valor) {
    	valor = valor * (1+rentabilidade);
    	
        super.Depositar(valor);
    }
}