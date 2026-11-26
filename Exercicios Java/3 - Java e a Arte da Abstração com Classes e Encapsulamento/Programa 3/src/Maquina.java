import java.util.Timer;
import java.util.TimerTask;

public class Maquina extends Pet{

    private float aguaAtual = 30;
    private float shampooAtual = 10;
    private final int capacidadeMaximaAgua = 30;
    private final int capacidadeMaximaShampoo = 10;
    private boolean maquinaCheia = false;
    private boolean banhoCompleto = false;
    private float porcentAgua = 100;
    private float porcentShampoo = 100;

    Timer timer = new Timer();    
    
    //getters e setters
    public float getAguaAtual() {
        return aguaAtual;
    }
    public float getShampooAtual() {
        return shampooAtual;
    }
    public float getCapacidadeMaximaAgua() {
        return capacidadeMaximaAgua;
    }
    public float getCapacidadeMaximaShampoo() {
        return capacidadeMaximaShampoo;
    }
    public boolean isMaquinaCheia() {
        return maquinaCheia;
    }
    public boolean isBanhoCompleto() {
        return banhoCompleto;
    }
    public float getPorcentAgua() {
        return porcentAgua;
    }
    public float getPorcentShampoo() {
        return porcentShampoo;
    }
    public void setAguaAtual(float aguaAtual) {
        this.aguaAtual = aguaAtual;
    }
    public void setShampooAtual(float shampooAtual) {
        this.shampooAtual = shampooAtual;
    }
    public void setMaquinaCheia(boolean maquinaCheia) {
        this.maquinaCheia = maquinaCheia;
    }
    public void setBanhoCompleto(boolean banhoCompleto) {
        this.banhoCompleto = banhoCompleto;
    }
    public void setPorcentAgua(float porcentAgua) {
        this.porcentAgua = porcentAgua;
    }
    public void setPorcentShampoo(float porcentShampoo) {
        this.porcentShampoo = porcentShampoo;
    }
    // Métodos
    public void darBanho(){
        setBanhoCompleto(false);
        if (getAguaAtual() > 10 && getShampooAtual() > 2 && isMaquinaCheia() ) {
            setAguaAtual(getAguaAtual() - 10);
            setShampooAtual(getShampooAtual() - 2);
            if (getPorcentAgua() <= 15) {
                System.out.println("Nivel de água baixo " + getPorcentAgua() + "% reabasteça");
            } else if (getPorcentShampoo() <= 40){
                System.out.println("Nivel de shampoo baixo " + getPorcentShampoo() +" porcento reabasteça");
            }
            System.out.println("Limpando...");
            TimerTask task = new TimerTask() {
        
                public void run(){
                    setLimpo(true);
                    setBanhoCompleto(true);
                    if (isMaquinaCheia()) {
                        System.out.println("Banho completo, seu pet está limpinho!");
                    }
                }
            };
            timer.schedule(task, 5000);
        } else if (!isMaquinaCheia()){
            System.out.println("Coloque pet na maquina, agora está vazia");
        } else if (getShampooAtual() <= 2){
            System.out.println("Shampoo insuficiente reabasteça");
        } else if (getAguaAtual() <= 10 ){
            System.out.println("Água insuficiente reabasteça");
        }

    }
    public void abastecerAgua(){
        if (getAguaAtual() < getCapacidadeMaximaAgua()) {
            setAguaAtual(getAguaAtual() + 2);
            nivelDaAgua();
            System.out.println("Água abastecida, o nivel de água atual é: " + porcentAgua + "%");    
        }
    }
    public void abastecerShampoo(){
        if (getShampooAtual() < getCapacidadeMaximaShampoo() ) {
            setShampooAtual(getShampooAtual() + 2);
            nivelDoShampoo();
            System.out.println("Shampoo abastecido, o nivel de shampoo atual é: " + porcentShampoo + "%");    
        }
    }
    public void verificarAgua(){
        System.out.println("Sua água atual" + getAguaAtual());
        System.out.println("Status do nivel da água" + getPorcentAgua());
    }
    public void verificarShampoo(){
        System.out.println("Seu Shampoo atual" + getShampooAtual());
        System.out.println("Status do nivel do shampoo" + getPorcentShampoo());
    }
    public void banhoOculpado(){
        if (maquinaCheia) {
            System.out.println("A máquina está oculpada");
        } else {
            System.out.println("A máquina está desoculpada");
        }
        
    }
    public void colocarPet(){
        maquinaCheia = true;
        System.out.println("O pet agora está na maquina de banho");
    }
    public void retirarPet(){
        maquinaCheia = false;
        if (isBanhoCompleto() == false) {
            System.out.println("Pet retirado da maquina de banho");
            System.out.println("Pet foi retirado antes de completar processo de limpeza, então continua sujo.");
            System.out.println("É preciso limpar a maquina");
        }

    }
    public void limparMaquina(){
        setAguaAtual(getAguaAtual() - 3); 
        setShampooAtual(getShampooAtual() - 1);
        System.out.println("Máquina limpa com sucesso, pronta para uso.");
    }
    public void nivelDaAgua(){
        System.out.println((getAguaAtual() / getCapacidadeMaximaAgua()) * 100);
        float porcent = (getAguaAtual() / getCapacidadeMaximaAgua()) * 100;
        setPorcentAgua(porcent);
    }
    public void nivelDoShampoo(){
        float porcent = (getShampooAtual() / getCapacidadeMaximaShampoo()) * 100;
        setPorcentShampoo(porcent);
    }
}