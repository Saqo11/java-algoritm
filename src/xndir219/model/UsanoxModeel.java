package xndir219.model;

public class UsanoxModeel {

    private int toshak;
    private int mijinGnahatakan;
    private String azganun;
    int k=20;

    public int getK() {
        return k;
    }

    public int getToshak() {
        return toshak;
    }

    public void setToshak(int toshak) {
        this.toshak = toshak;
    }

    public int getMijinGnahatakan() {
        return mijinGnahatakan;
    }

    public void setMijinGnahatakan(int mijinGnahatakan) {
        this.mijinGnahatakan = mijinGnahatakan;
    }

    public String getAzganun() {
        return azganun;
    }

    public void setAzganun(String azganun) {
        this.azganun = azganun;
    }

    @Override
    public String toString() {
        return "UsanoxModeel{" +
                "toshak=" + toshak +
                ", mijinGnahatakan=" + mijinGnahatakan +
                ", azganun='" + azganun + '\'' +
                '}';
    }
}
