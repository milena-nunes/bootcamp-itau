public class Boleto{
    private String instituiçao;
    private float valor;

    public Boleto() {
        instituiçao = "";
        this.valor = 0;    
    }
    public String getInstituiçao() {
        return this.instituiçao;
    }
    public void setInstituiçao(String instituiçao) {
        this.instituiçao = instituiçao;
    }
    public float getValor() {
        return this.valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

}