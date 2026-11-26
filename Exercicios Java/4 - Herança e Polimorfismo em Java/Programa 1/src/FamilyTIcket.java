public class FamilyTIcket extends TIcket {
    private int numberOfTickets;

    public FamilyTIcket(String movieName, double value, String typeTicket, String audioType) {
        super(movieName, value, typeTicket, audioType);
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }


    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public double calculatePrice() {
        double total = this.getValue() * getNumberOfTickets();
        if (getNumberOfTickets() >= 4) {
            System.out.println("Você comprou " + getNumberOfTickets() + " ingressos, então você ganhou um desconto de 5% no valor total.");
            double descount = total * 0.05;
            total -= descount; // Subtrai o desconto do valor total
            System.out.println("O valor total com desconto é: " + total);
        } else {
            System.out.println("Você comprou " + getNumberOfTickets() + " ingressos, então você não ganhou desconto.");
            System.out.println("O valor total é: " + total);
        }
        return total;
    }
}
