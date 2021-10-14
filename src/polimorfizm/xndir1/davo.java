package polimorfizm.xndir1;

public class davo extends Computer {
    @Override
    public int drive() {

        return super.drive();
    }

    public static void main(String[] args) {
      davo d = new davo();
        System.out.println(d.drive());
    }


}
