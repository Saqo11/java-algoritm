package xndir213.model;

public class AshxatakicModell {
    private String azganun;
    private int andamneriQanak;
    private int ashxatavardz;
    private int G=200000;

    public int getG() {
        return G;
    }

    public String getAzganun() {
        return azganun;
    }

    public void setAzganun(String azganun) {
        this.azganun = azganun;
    }

    public int getAndamneriQanak() {
        return andamneriQanak;
    }

    public void setAndamneriQanak(int andamneriQanak) {
        this.andamneriQanak = andamneriQanak;
    }

    public int getAshxatavardz() {
        return ashxatavardz;
    }

    public void setAshxatavardz(int ashxatavardz) {
        this.ashxatavardz = ashxatavardz;
    }

    @Override
    public String toString() {
        return "AshxatakicModell{" +
                "azganun='" + azganun + '\'' +
                ", andamneriQanak=" + andamneriQanak +
                ", ashxatavardz=" + ashxatavardz +
                ", G=" + G +
                '}';
    }
}
