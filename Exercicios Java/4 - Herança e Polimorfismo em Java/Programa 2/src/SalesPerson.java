public class SalesPerson extends Emploee {

    private int salesQuantity;
    private final boolean administrator = false;
    
    public SalesPerson() {
        salesQuantity = 0;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }
    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }
    public boolean isAdministrator() {
        return administrator;
    }
    // Metodos

    public void makeSale() {
        setSalesQuantity(getSalesQuantity() + 1);
    }

    public void consultSales() {
        getSalesQuantity();
    }
}