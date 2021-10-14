public class Tusk {
    public static void main(String[] args) {
        int n = 123;
        int n1 = n;
        int k = 1;
        int count = 1;

        while (n >= 10) {
            n = n / 10;
            k *= 10;
            count++;
        }
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                System.out.println(n1 / k);
            }
            k = k / 10;

            if (k == 0) {
                break;
            }

            System.out.println(n1 / k % 10);


        }

    }
}


