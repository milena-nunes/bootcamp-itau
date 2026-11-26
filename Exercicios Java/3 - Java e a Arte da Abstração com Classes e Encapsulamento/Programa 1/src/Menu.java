import java.util.Scanner;

public class Menu extends Conta {
    
    private String opcao;    
    public Menu() {
        this.opcao = "";
    }
    public void menuOn() {
        Scanner scanner = new Scanner(System.in);
        switch (getNome()) {
            case null:
                System.out.println("Olá ");
                break;
            default:
                System.out.println("Olá " + getNome());
                break;
        }
        System.out.printf(" Qual das opções você deseja realizar?\r\n" +
                        "1, Criar conta \n" +
                        "2, Consultar saldo \n" + 
                        "3, consultar cheque especial\r\n" + 
                        "4, Depositar;\r\n" + 
                        "5, Sacar ;\r\n" + 
                        "6, Pagar boleto.\r\n" + 
                        "7, Verificar uso de cheque especial.\r\n" +
                        "Sair \r\n");
                        
        setOpcao(scanner.nextLine());
        
        if (opcao.equalsIgnoreCase("Criar conta") || opcao.equalsIgnoreCase("1")) {
            Conta conta = new Conta(0, 0, 0);
            setSaldo(0);
            setChequeEspecial(0);
            setChequeEspecialUsado(0);
            System.out.println("Digite o nome do titular da conta: ");
            setNome(scanner.nextLine());    
            System.out.println("Quanto deseja depositar na conta?");
            float depositar = scanner.nextFloat();
            Depositar(depositar);
            if (getSaldo() <= 500) {
                setChequeEspecial(50);
            } else if (getSaldo() > 500) { 
                float valor = getSaldo() / 2;
                setChequeEspecial(valor);
            }
            setLimiteChequeEspecial(getSaldo() + getChequeEspecial());
            System.out.println("Conta criada com sucesso!");
            
        }
        else if (opcao.equalsIgnoreCase("Consultar saldo") || opcao.equalsIgnoreCase("2")) {
            System.out.println("Seu saldo é de: " + ConsultarSaldo());
        } else if (opcao.equalsIgnoreCase("consultar cheque especial") || opcao.equalsIgnoreCase("3")) {
            System.out.println("Seu cheque especial tem o valor de: " + ConsultarChequeEspecial());
        } else if (opcao.equalsIgnoreCase("Depositar") || opcao.equalsIgnoreCase("4")) {
            System.out.println("Digite o valor que deseja depositar: ");
            float valor = scanner.nextFloat();
            Depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Saldo atual: "+ getSaldo());
        // abaixo, cobra o valor usado pelo chque especial assim que tiver saldo suficiente
            if (getChequeEspecialUsado() > 0 && getSaldo() >= getTaxa()){
                cobrarUsoDeCheque(getSaldo());
                System.out.println("Foi cobrado o valor referente ao usado no cheque especial ");
                System.out.println("Você usou " + getChequeEspecialUsado() + " e foi cobrado 20% desse valor, totalizando em: " + getTaxa());
                System.out.println("Seu saldo atual é de: " + getSaldo());
                setChequeEspecial(getChequeEspecial() + getChequeEspecialUsado());
                setChequeEspecialUsado(0);
                setTaxa(0);
            }
        } else if (opcao.equalsIgnoreCase("Sacar") || opcao.equalsIgnoreCase("5")) {
            System.out.println("Digite o valor que deseja sacar: ");
            float valor = scanner.nextFloat();
            Sacar(valor);
            System.out.println("Voçê sacou " + valor + " seu saldo agora é de: " + getSaldo());
        } else if (opcao.equalsIgnoreCase("Pagar boleto" ) || opcao.equalsIgnoreCase("6")) {
            System.out.println("Digite o valor do boleto: ");
            setValor(scanner.nextFloat());
            System.out.println(getValor());
            float disponivel = getChequeEspecial() - getChequeEspecialUsado();
            if (getChequeEspecialUsado() <= getChequeEspecial() && getSaldo() + disponivel >= getValor() || disponivel >= getValor()) {
                setSaldo(getSaldo() - getValor());
                if (getSaldo() < 0) {
                    setChequeEspecialUsado(getSaldo() * -1);
                    disponivel = getChequeEspecial() - getChequeEspecialUsado();
                    System.out.println("valor usado no cheque especial é: " + getChequeEspecialUsado());
                    System.out.println("valor do cheque especial disponivel é: " + disponivel);
                }    
            } else {
                System.out.println("Saldo insuficiente!");
            }
            
        } else if (opcao.equalsIgnoreCase("Verificar uso de cheque especial") || opcao.equalsIgnoreCase("7")) {
            if (getSaldo() < 0) {
            System.out.println("A conta está usando cheque especial.");
            } else {
            System.out.println("A conta não está usando cheque especial.");
            }
        } else if (opcao.equalsIgnoreCase("Sair")) {
            System.out.println("Saindo do programa...");  
            scanner.close();  
        } else {
            System.out.println("Opção inválida.");
        }
    }
    public String getOpcao() {
        return opcao;
    }
    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }
    
}
