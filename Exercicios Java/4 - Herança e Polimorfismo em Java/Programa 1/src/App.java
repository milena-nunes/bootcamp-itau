import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            System.out.println("Bem-vindo ao sistema de cálculo de ingressos de cinema!");
            System.out.printf("Digite o nome do filme: \n");
            String movie = scanner.nextLine();
            System.out.println("Digite o valor do ingresso: ");
            String valueString = scanner.nextLine();
            System.out.println("Digite o tipo do ingresso: Normal, Meia ou Familiar: ");
            String typeTicket = scanner.nextLine();
            System.out.println("Dublado ou legendado? digite: D para dublado e L para legendado: ");
            String audio = scanner.nextLine();
            Double value = Double.parseDouble(valueString);
            TIcket ticket = new TIcket(movie, value, typeTicket, audio);

            if (typeTicket.equalsIgnoreCase("Normal")) {
                ticket.calculatePrice();
            } else if (typeTicket.equalsIgnoreCase("Meia")) {
                HalfPriceTicket halfPriceTicket = new HalfPriceTicket(movie, value, typeTicket, audio);
                halfPriceTicket.calculatePrice();
            } else if (typeTicket.equalsIgnoreCase("Familiar")) {
                FamilyTIcket familyTIcket = new FamilyTIcket(movie, value, typeTicket, audio);
                System.out.print("Digite o número de ingressos: ");
                int numberOfTickets = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do scanner
                familyTIcket.setNumberOfTickets(numberOfTickets);
                familyTIcket.calculatePrice();
            } else {
                System.out.println("Tipo de ingresso inválido.");
            }
            System.out.print("Deseja calcular outro ingresso? (S/N): ");
            response = scanner.nextLine();

            if (!response.equalsIgnoreCase("S") && !response.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida. Por favor, digite 'S' para sim ou 'N' para não.");
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("Encerrando o programa.");
                scanner.close();
            }

        } while (response.equalsIgnoreCase("S"));
        

    }
}
