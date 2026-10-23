import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      // Desafio 1
      // A validacao deve ser exata, respeitando maiusculas e minusculas.
      // Compare a entrada com os tres codigos permitidos.

      // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.
      Scanner scanner = new Scanner(System.in);
      String operacao = scanner.next();
      boolean operacaoValida = false;
        
      if(operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA")) {
        operacaoValida = true;
      }

      System.out.println(operacaoValida ? "VALID" : "INVALID");

      // Desafio 2
      // Compare os dois textos exatamente como foram lidos.
      // Se forem identicos, exiba "ACESSO LIBERADO"; caso contrario, "ACESSO NEGADO".
      // TODO: imprima o resultado da validacao em uma unica linha.
      
      String codigoInformado = scanner.nextLine();
      String codigoEsperado = scanner.nextLine();
        
      if(codigoInformado.equals(codigoEsperado)) {
        System.out.println("ACESSO LIBERADO");
      } else {
        System.out.println("ACESSO NEGADO");
      }

      scanner.close();
    }
}