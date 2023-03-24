public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }


    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   
    public ContaCorrente() {
    	super();
    }
   
    public ContaCorrente(String agencia, String numero, double salario, double chequeEspecial) {
        super(agencia, numero, salario);
       
        this.chequeEspecial = chequeEspecial;
    }
    
    public String exibirDadosConta() {
        return "Tipo de Conta: Conta Corrente\n" + super.exibirDadosConta() + "\nCheque Especial: " + chequeEspecial;
    }
    
    public Boolean Sacar(double valor) {
    	if ((getSaldo() + getChequeEspecial()) >= valor) {
    		if (valor > getSaldo()) {
                valor = valor - getSaldo();
                
    			super.Sacar(getSaldo());		
    		
    			chequeEspecial = chequeEspecial - valor;    		
    		}
    		else {
    			super.Sacar(valor);
    		}
            return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public void Depositar(double valor) {
    	if(chequeEspecial < 100) {
    		if ( valor <= (100-chequeEspecial) ) {
    			chequeEspecial = chequeEspecial + valor;
    		}
    		else {
    			valor = valor - (100-chequeEspecial);
    			chequeEspecial = 100;
    			super.Depositar(valor);
    		}
    	}
    	else
    		super.Depositar(valor);
    }
}