public class xndir172 {
    public static void main(String[] args) {
        String x = "ց";
        boolean v = false;
        for (int i = '0'; i <= 'z'; i++) {
            if (x.equals(String.valueOf((char) (i))) && i >= 'a' && i <= 'z') {
                System.out.println("3");
                v = true;
            } else if (x.equals(String.valueOf((char) (i))) && i >= 'A' && i <= 'Z') {
                System.out.println("2");
                v = true;
            } else if (x.equals(String.valueOf((char) (i))) && i >= '0' && i <= '9') {
                System.out.println("1");
                v = true;
            }
        }


        if (!v) {
            System.out.println("4");
        }


    }
}
