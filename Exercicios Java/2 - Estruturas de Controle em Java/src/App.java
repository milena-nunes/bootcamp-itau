import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instruções do exercicio estão no README.md
        // Programa 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber a sua tabuada: ");
        int number = scanner.nextInt();
        System.out.println("Tabuada do número " + number);
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%s x %s = %s\n", number, i, result);
        }
        
        // Programa 2
        System.out.println("==========================================");
        System.out.println("Digite o seu peso para calcular o IMC: ");
        float peso = scanner.nextFloat();
        System.out.println("Digite a sua altura para calcular o IMC: ");    
        float altura = scanner.nextFloat();
        float imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f\n", imc);
        if( imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Levemente acima do peso");    
        } else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        } else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        } else if(imc >= 40.0){
            System.out.println("Obesidade grau III (morbida)");
        } 
        else {
            System.out.println("Valor inválido");    
        }

        // Programa 3
        System.out.println("==========================================");
        System.out.println("Digite um número");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número maior que o primeiro");
        int num2 = scanner.nextInt();
        if(num2 > num1){
            System.out.println("Digite par ou impar");
            String parOuImpar = scanner.next();
            if(parOuImpar.equalsIgnoreCase("par")){
                do {
                    if(num2 % 2 == 0){
                        System.out.println(num2);
                    } else {
                        num2--;
                        System.out.println(num2);
                    }
                    num2 = num2 - 2;
                } while(num1 <= num2);
            } else if(parOuImpar.equalsIgnoreCase("impar")){
                while(num1 <= num2){
                    if(num2 % 3 == 0){
                        System.out.println(num2);
                    } else {
                        num2--;
                        System.out.println(num2);
                    }
                    num2 = num2 - 3;
                } 
            }else {
                System.out.println("Digite par ou impar");
            }
        } else {
            System.out.println("O segundo número deve ser maior que o primeiro");
        }

        // Programa 4
        System.out.println("==========================================");
        System.out.println("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();
        int secondNumber;
        do {
            System.out.println("Insira outro número maior que o primeiro: ");
            secondNumber = scanner.nextInt();
            
            if (secondNumber < firstNumber) {
                 System.out.println("O segundo número deve ser maior que o primeiro.");
            } 

        } while (secondNumber % firstNumber != 0);
    }
}
