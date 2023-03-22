package programa;

public class Conta {
    protected String agencia;
    protected String numero;
    protected double saldo;
   
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
       
    }
   
    Conta(String agencia, String numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
   
    public void Depositar(double valor) {
        this.saldo += valor;
    }
   
    public void Depositar(double valor, String nomeDepositante) {
        this.saldo += valor;
    }
   
    public void Depositar(String nomeDepositante, double valor, String telefoneDepositante) {
        this.saldo += valor;
    }
}
