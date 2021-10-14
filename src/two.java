public class two {
    public static void main(String[] args) {
        int n = 11171;
        int n1 = n;
        int n2 = 0;
        int count = 1;
        int zuyg = 0;
        int kent = 0;

        while (n >= 10) {
            n = n / 10;


            count++;
        }
        for (int i = 1; i <= count; i++) {
            n2 = n1 % 10;
            n1 = n1 / 10;
            if (i % 2 == 0) {
                zuyg += n2;
            } else {
                kent += n2;
            }

        }
        if (zuyg == kent) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
