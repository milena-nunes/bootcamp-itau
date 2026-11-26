public class Conta extends Boleto{
    private String nome;
    private float saldo;
    private float chequeEspecial;
    private float limiteChequeEspecial;
    private float chequeEspecialUsado;
    private float taxa = 0;

    public Conta(){

    }

    public Conta(float saldo, float chequeEspecial, float chequeEspecialUsado) {
        this.nome = "";
        this.saldo = 0;
        this.chequeEspecial = 0;
        this.chequeEspecialUsado = 0;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo (float saldo) {
        this.saldo = saldo;
    }
    public float getChequeEspecial(){
        return this.chequeEspecial;
    }
    public void setChequeEspecial (float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    public final void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = getChequeEspecial() + getSaldo();
    }
    public float getChequeEspecialUsado(){
        return chequeEspecialUsado;
    }
    public void setChequeEspecialUsado(float chequeEspecialUsado){
        this.chequeEspecialUsado = chequeEspecialUsado;
    }
    public float getTaxa(){
        return taxa;
    }
    public void setTaxa (float taxa) {
        this.taxa = taxa;
    }
    
    public float ConsultarSaldo(){
        return this.saldo;
    }
    public float ConsultarChequeEspecial(){
        return this.chequeEspecial;
    }
    public float Depositar(float valor){
        return this.saldo += valor;
    }
    
    public float Sacar(float valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return this.saldo;
    }
    public float cobrarUsoDeCheque(float saldo) {
        taxa = (getChequeEspecialUsado() * 0.2f);
        setSaldo(getSaldo() - taxa);
        return this.saldo;
    }
    
    
}