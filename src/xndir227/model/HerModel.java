package xndir227.model;

public class HerModel {
    private String vernagir;
    private  int jam;
    private  int rope;

    public String getVernagir() {
        return vernagir;
    }

    public void setVernagir(String vernagir) {
        this.vernagir = vernagir;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getRope() {
        return rope;
    }

    public void setRope(int rope) {
        this.rope = rope;
    }

    @Override
    public String toString() {
        return "HerModel{" +
                "vernagir='" + vernagir + '\'' +
                ", jam=" + jam +
                ", rope=" + rope +
                '}';
    }
}
