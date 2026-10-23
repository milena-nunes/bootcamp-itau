import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        1- Escreva um código que receba o nome e o ano de nascimento de 
        alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

        2- Escreva um código que receba o tamanho do lado d
        e um quadrado, calcule sua área e exiba na tela

            fórmula: área=lado X lado
        3- Escreva um código que receba a base e a
         alturade um retângulo, calcule sua área e exiba na tela

            fórmula: área=base X altura
        4= Escreva um código que receba o nome e a
         idade de 2 pessoas e imprima a diferença de idade entre elas
         */

        // Programa 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scanner.next();
        System.out.println("Digite seu ano de nascimento: ");
        int birthYear = scanner.nextInt();
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int age = currentYear - birthYear;    

        System.out.printf("Olá %s, você tem %d anos\n", name, age);
        
        // Programa 2
           
        System.out.println("Digite o tamanho do lado de um quadrado: ex: 5");
        int side = scanner.nextInt();
        int areaQ = side * side;
        System.out.printf("A área do quadrado é: %d\n", areaQ);
        
        // Programa 3
        
        System.out.println("Digite a base de um retangulo: ex: 5"); 
        int base = scanner.nextInt();
        System.out.println("Digite a altura de um retangulo: ex: 5");
        int height = scanner.nextInt();
        int areaR = base * height;
         
        System.out.printf("A área do retângulo é: %s\n", areaR); 
        
        // Programa 4
        int ageDifference;
    
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        for (int i = 1; i <= 2; i++) { 
            System.out.println("Digite o nome da " + i +  "° pessoa: ");
            names.add(scanner.next());
            System.out.println("Digite a idade da " + i +  "° pessoa: ");
            ages.add(scanner.nextInt());
        } 
        
        if( ages.get(0) > ages.get(1)) {
            ageDifference = ages.get(0) - ages.get(1);
        } 
        else {
            ageDifference = ages.get(1) - ages.get(0);
        }
        
        System.out.printf("A diferença de idade entre %s e %s é de %d anos\n", names.get(0), names.get(1), ageDifference);
    }
}
