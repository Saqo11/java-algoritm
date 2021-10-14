package xndir209.model;

public class StudModel {
    private String azganun;
    private int gnahatakan;
    private int matyaniHamar;

    public String getAzganun() {
        return azganun;
    }

    public void setAzganun(String azganun) {
        this.azganun = azganun;
    }

    public int getGnahatakan() {
        return gnahatakan;
    }

    public void setGnahatakan(int gnahatakan) {
        this.gnahatakan = gnahatakan;
    }

    public int getMatyaniHamar() {
        return matyaniHamar;
    }

    public void setMatyaniHamar(int matyaniHamar) {
        this.matyaniHamar = matyaniHamar;
    }

    @Override
    public String toString() {
        return "StudModel{" +
                "azganun='" + azganun + '\'' +
                ", gnahatakan=" + gnahatakan +
                ", matyaniHamar=" + matyaniHamar +
                '}';
    }



}
