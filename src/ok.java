public class ok {
    public static void main(String[] args) {
        int n = 9825257;

        int k = 1;

        int count = 1;

        int n1 = n;

        int n2 = 0;

        while (n >= 10) {
            n = n / 10;
            k *= 10;
            count++;

        }
        for (int i = 0; i < count; i++) {

            n2 = n1 % 10;

            System.out.print(n2);

            n1 = n1 / 10;

        }

    }
}
