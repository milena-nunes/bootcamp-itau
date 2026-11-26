public class Attendant extends Emploee {
    private int cashOnHand;
    private final boolean administrator = false;
    
    public int getCashOnHand() {
        return cashOnHand;
    }
    public void setCashOnHand(int cashOnHand) {
        this.cashOnHand = cashOnHand;
    }
    public boolean isAdministrator() {
        return administrator;
    }
    
    // Metodos
    
    public void receivePayment(int amount) {
        // Implement logic to receive payment and increment cash on hand
        this.cashOnHand += amount;
    }
    public void closeCashRegister() {
        // Implement logic to close cash register
    }

}