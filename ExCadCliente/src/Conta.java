import java.util.ArrayList;

public abstract class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private ArrayList<String> historico;
   
    public ArrayList<String> getHistorico() {
		return historico;
	}


	public void setHistorico(ArrayList<String> historico) {
		this.historico = historico;
	}


	public String getAgencia() {
        return agencia;
    }


    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    protected String exibirMensagem() {
        return "Bem vindo ao Internet Banking do Prof. Joseffe!";
    }  
   
    Conta(){
    	this.historico = new ArrayList<String>();
       
    }
   
    Conta(String agencia, String numero, double salario){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = salario;
    }
      
    public void Depositar(double valor) {
    	historico.add("Depósito: +" + valor);
        this.saldo += valor;
    }
    
    public Boolean Sacar(double valor) {
        if (saldo >= valor) {
        	this.saldo -= valor;
        	getHistorico().add("Saque: -" + valor);
            return true;        	
        }
        else
        	return false;

    }
    
    public String exibirDadosConta() {
        return("Agencia: "+this.getAgencia()+"\nNumero: "+this.getNumero()+"\nSaldo: "+this.getSaldo());
    }
}