public class ssds {

    public static void main(String[] args) {

        int a = 1, b = 12, c = 2, d = 11;
        if (a % 2 != 0 && b % 2 != 0 || c % 2 != 0 && d % 2 != 0) {
            System.out.println(true);
        }
        if (a % 2 != 0 && c % 2 != 0 || b % 2 != 0 && d % 2 != 0) {
            System.out.println(true);
        }
        if (a % 2 != 0 && d % 2 != 0 || b % 2 != 0 && c % 2 != 0) {
            System.out.println(true);
        }

    }


}






