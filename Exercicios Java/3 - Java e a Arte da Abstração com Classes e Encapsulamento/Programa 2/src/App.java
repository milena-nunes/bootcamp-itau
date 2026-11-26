import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        String opçao;
        do {
            System.out.println("________________________________\n" +
                        "O que deseja realizar? digite:\r\n" + 
                        "1, ou ligar carro;" + "                     |     Estatus do carro\r\n" +  
                        "2, ou desligar carro;" + "                  |  Ligado? " + carro.isLigado() + " \r\n" +      
                        "3, ou acelerar" + "                         |  Velocidade = " + carro.getVelocidade() + " \r\n" + 
                        "4, ou diminuir velocidade;" + "             |  Marcha = " + carro.getMarcha() + " \r\n" + 
                        "5, ou virar para esquerda" + "                 _______ \r\n" + 
                        "6, ou virar para direita" + "                 |_______[]   \n" + 
                        "7, ou verificar velocidade;" + "                °    °      \n" +  
                        "8, ou aumentar marcha\r\n" + 
                        "9, ou reduzir marcha\r\n" + 
                        "Sair\r\n" +
                        "______________________________");
            
            opçao = scanner.nextLine();
            if (opçao.equalsIgnoreCase("Ligar carro") || opçao.equals("1")) {
                carro.ligarCarro();
            } else if (opçao.equalsIgnoreCase("Desligar carro") || opçao.equalsIgnoreCase("2")) {
                carro.desligarCarro();
            } else if (opçao.equalsIgnoreCase("Acelerar") || opçao.equalsIgnoreCase("3")) {
                carro.acelerar();
            } else if (opçao.equalsIgnoreCase("Diminuir velocidade") || opçao.equalsIgnoreCase("4")) {
                carro.diminuirVelocidade();
            } else if (opçao.equalsIgnoreCase("Virar para esquerda") || opçao.equalsIgnoreCase("5")) {
                carro.virarEsquerda();
            } else if (opçao.equalsIgnoreCase("Virar para direita") || opçao.equalsIgnoreCase("6")) {
                carro.virarDireita();
            } else if (opçao.equalsIgnoreCase("Verificar velocidade") || opçao.equalsIgnoreCase("7")) {
                carro.verificarVelocidade();
            } else if (opçao.equalsIgnoreCase("Aumentar marcha") || opçao.equalsIgnoreCase("8")) {
                carro.avancarMarcha();
            } else if (opçao.equalsIgnoreCase("Reduzir marcha") || opçao.equalsIgnoreCase("9")) {
                carro.reduzirMarcha(); 
            } else if (opçao.equalsIgnoreCase("Sair")) {
                System.out.println("Saindo...");
            }
            
        } while (!opçao.equalsIgnoreCase("Sair"));
        if (opçao.equalsIgnoreCase("Sair")) {
            scanner.close();
        }
    }
}
