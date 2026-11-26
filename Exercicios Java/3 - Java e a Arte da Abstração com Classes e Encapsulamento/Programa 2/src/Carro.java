public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;
    
    public Carro() {
        ligado = false;
        velocidade = 0;
        marcha = 0;
    }
    //Getters e setters
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    //Metodos
    public void ligarCarro(){
        setLigado(true);
        System.out.println("Carro ligado");
    }
    public void desligarCarro(){
        if (isLigado()) {
            if (getVelocidade() > 0 || getMarcha() > 0) {
                System.out.println("O carro está em movimento, ou a marcha não está em ponto morto, reduza a velocidade para desligar");
                return;
            } else if (getVelocidade() == 0 && getMarcha() == 0) {
                setLigado(false);
                System.out.println("Carro desligado.");
            } 
        } else {
            System.out.println("O carro já está desligado");
            return;
        }
    }
    public void acelerar(){
        if (isLigado()) {
            if (getMarcha() == 0) {
                System.out.println("Você está em ponto morto, não pode acelerar, aumente a marcha");
            } else if (getVelocidade() >= 1 && getMarcha() == 0) {
                System.out.println("Aumente a marcha");
            } else if (getVelocidade() >= 21 && getMarcha() == 1) {
                System.out.println("Aumente a marcha");
            } else if (getVelocidade() >= 41 && getMarcha() == 2) {
                System.out.println("Aumente a marcha");
            } else if (getVelocidade() >= 61 && getMarcha() == 3) {
                System.out.println("Aumente a marcha");
            } else if (getVelocidade() >= 81 && getMarcha() == 4) {
                System.out.println("Aumente a marcha");
            } else if (getVelocidade() >= 101 && getMarcha() == 5) {
                System.out.println("Aumente a marcha");
/*Acelerar*/} else if (getVelocidade() < 120) {
                setVelocidade(getVelocidade() + 1);
                System.out.println("Acelerando");
            } else {
                System.out.println("Chegou a velocidade máxima 120km");
            }
            
        } else {
            System.out.println("O carro está desligado, ligue o carro para acelerar");
        }
        
    }
    public void diminuirVelocidade(){
        if (isLigado()){
            if (getMarcha() == 0) {
                System.out.println("Você está em ponto morto, não pode desacelerar, aumente a marcha");
            } else if (getVelocidade() <= 20 && getMarcha() == 2) {
                System.out.println("Reduza a marcha");
            } else if (getVelocidade() <= 40 && getMarcha() == 3) {
                System.out.println("Reduza a marcha");
            } else if (getVelocidade() <= 60 && getMarcha() == 4) {
                System.out.println("Reduza a marcha");
            } else if (getVelocidade() <= 80 && getMarcha() == 5) {
                System.out.println("Reduza a marcha");
            } else if (getVelocidade() <= 100 && getMarcha() == 6) {
                System.out.println("Reduza a marcha");
/*Freando*/ } else if (getVelocidade() > 0) {
                setVelocidade(getVelocidade() - 1);
                System.out.println("Diminuindo, velocidade atualizada: " + getVelocidade());
            } else {
                System.out.println("Chegou a velocidade minima 0km");
            }
        } else {
            System.out.println("O carro está desligado, ligue o carro para frear");
        }
        
        
    }
    public void virarEsquerda(){
        if (isLigado()) {
            if (getVelocidade() >= 1 && getVelocidade() <= 40) {
                System.out.println("Virou para esquerda");
            } else if(getVelocidade() == 0){
                System.out.println("Seu carro está parado não da pra dar curva!");
            } else {
                System.out.println("Sua velocidade não permite dar curva, reduza ate chegar em 40km/h");
            }
        } else {
            System.out.println("O carro está desligado, ligue o carro para dar curva");
        }
        
    }
    public void virarDireita(){
        if (isLigado()) {
            if (getVelocidade() >= 1 && getVelocidade() <= 40) {
            System.out.println("Virou para direita");
            } else if(getVelocidade() == 0){
                System.out.println("Seu carro está parado não da pra dar curva!");
            } else {
                System.out.println("Sua velocidade não permite dar curva, reduza ate chegar em 40km/h");
            }
        } else {
            System.out.println("O carro está desligado, ligue o carro para dar curva");
        }
    }
    public void verificarVelocidade(){
        if (isLigado()) {
            System.out.println("A velocidade atual é: " + getVelocidade());
        } else {
            System.out.println("O carro está desligado, ligue o carro para verificar a velocidade");
        }
    }
    public void avancarMarcha(){
        if (isLigado()) {
            setMarcha(getMarcha() + 1);
            System.out.println("Marcha atual: " + getMarcha());
        } else {
            System.out.println("O carro está desligado, ligue o carro para trocar a marcha");
        }
    }
    public void reduzirMarcha(){
        if (isLigado()) {
            setMarcha(getMarcha() - 1);
            System.out.println("Marcha atual: " + getMarcha());
        } else {
            System.out.println("O carro está desligado, ligue o carro para trocar a marcha");
        }
    }
}
