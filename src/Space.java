public class Space {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int space = 5;
        System.out.println("for stop add dot");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') space++;
        } while (ch != '.');
        System.out.println("space" + space);


        for (int i = 14; i >= 0; i--) {
            System.out.println(i);
        }
        int a = 12, b = 15415, c = 119, d = 256;

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else if (d > a && d > b && d > c) {
            System.out.println(d);
        }

    }

}


