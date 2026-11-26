public class HalfPriceTicket extends TIcket {
    
    public HalfPriceTicket(String movieName, double value, String typeTicket, String audioType) {
        super(movieName, value, typeTicket, audioType);
    }
    
    @Override
    public double calculatePrice() {
        System.out.println("Seu ingresso é meia entrada");
        double halfPrice = this.getValue() / 2;
        System.out.println("O seu valor é: " + halfPrice);
        return halfPrice;
    }
}
