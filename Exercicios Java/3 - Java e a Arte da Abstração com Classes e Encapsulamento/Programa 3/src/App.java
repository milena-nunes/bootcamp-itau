import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();
        Maquina maquina = new Maquina();
        String opcao;
        boolean first = true;

        do {
            TimerTask task = new TimerTask() {
                public void run(){
                    System.out.printf("_______________________\n" +
                            "O que deseja realizar, digite: \n\n" +
                            "1, Dar banho no pet \r\n" + 
                            "2, Abastecer agua \r\n" + 
                            "3, Abastecer shampoo \r\n" + 
                            "4, Verificar nivel de agua \r\n" + 
                            "5, Verificar nivel de shampoo \r\n" + 
                            "6, Verificar se tem pet no banho \r\n" + 
                            "7, Colocar pet na maquina \r\n" + 
                            "8, Retirar pet da maquina \r\n" + 
                            "9, Limpar maquina \r\n" +
                            "Sair \n" + 
                            "---------------------------\n");
                }
            };
            
            if (first) {
                task.run();
                first = !first;
                opcao = scanner.nextLine();
            } else {
                timer.schedule(task, 2000);
                opcao = scanner.nextLine();
            }
            if (opcao.equalsIgnoreCase("Dar banho no pet") || opcao.equalsIgnoreCase("1")) {
                maquina.darBanho();
            } else if (opcao.equalsIgnoreCase("Abastecer agua") || opcao.equalsIgnoreCase("2")) {
                maquina.abastecerAgua();
            } else if (opcao.equalsIgnoreCase("Abastecer shampoo") || opcao.equalsIgnoreCase("3")) {
                maquina.abastecerShampoo();
            } else if (opcao.equalsIgnoreCase("Verificar nivel de agua") || opcao.equalsIgnoreCase("4")) {
                maquina.verificarAgua();
            } else if (opcao.equalsIgnoreCase("Verificar nivel de shampoo") || opcao.equalsIgnoreCase("5")) {
                maquina.verificarShampoo();
            } else if (opcao.equalsIgnoreCase("Verificar se tem pet no banho") || opcao.equalsIgnoreCase("6")) {
                maquina.banhoOculpado();
            } else if (opcao.equalsIgnoreCase("Colocar pet na maquina") || opcao.equalsIgnoreCase("7")) {
                maquina.colocarPet();
            } else if (opcao.equalsIgnoreCase("Retirar pet da maquina") || opcao.equalsIgnoreCase("8")) {
                maquina.retirarPet();
            } else if (opcao.equalsIgnoreCase("Limpar maquina") || opcao.equalsIgnoreCase("9")) {
                maquina.limparMaquina();
            }    
        } while(!opcao.equalsIgnoreCase("Sair"));
        if (opcao.equalsIgnoreCase("sair")) {
            scanner.close();
        }
        

    }
}
