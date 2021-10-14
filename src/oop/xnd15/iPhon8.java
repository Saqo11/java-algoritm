package oop.xnd15;

public class iPhon8 extends iPhon7 {

    int battery = 6000;

    void character() {
        System.out.println("color=" + color + "\n" +  "camera="  +   camera +"\n"+ "qash="  +  (qash = 8000) +"\n"+ "battery=" + battery);
    }


    public static void main(String[] args) {
        iPhon8 iPhon8 = new iPhon8();
        iPhon8.character();

    }


}
