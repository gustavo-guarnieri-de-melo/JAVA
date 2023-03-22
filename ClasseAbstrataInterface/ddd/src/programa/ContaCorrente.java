package programa;

public class ContaCorrente extends Conta implements ContaBancaria, ContaBasica{
    private double chequeEspecial;
   
    public double getChequeEspecial() {
        return chequeEspecial;
    }


    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   
    public ContaCorrente() {
    }
   
    public ContaCorrente(String agencia, String numero, double saldo, double chequeEspecial) {
        super(agencia, numero, saldo);
        this.chequeEspecial = chequeEspecial;
    }
   
    public void Sacar(float valor){
        this.saldo -= valor;
    }
   
    public void enviarMensagemAoGerente(String mensagem) {
       
    }
}
