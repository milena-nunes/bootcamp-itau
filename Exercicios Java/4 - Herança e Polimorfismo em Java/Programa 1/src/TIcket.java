public class TIcket {
    private String movieName;
    private double value;
    private String typeTicket;
    private String audioType;

    public TIcket(String movieName, double value, String typeTicket, String audioType) {
        this.movieName = movieName;
        this.value = value;
        this.typeTicket = typeTicket;
        this.audioType = audioType;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(String typeTicket) {
        this.typeTicket = typeTicket;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

     public double calculatePrice() {
        System.out.println("O seu ingresso é do tipo: " + this.typeTicket);
        System.out.println("O seu valor é: " + this.value);
        return this.value;
    }
    
}
