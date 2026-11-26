public class Pet {

    private boolean isLimpo;

    public Pet() {
        this.isLimpo = false;
    }

    public boolean isLimpo() {
        return isLimpo;
    }

    public void setLimpo(boolean isLimpo) {
        this.isLimpo = !isLimpo;
    }

    

}
