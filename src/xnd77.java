public class xnd77 {
    public static void main(String[] args) {
        int k[] = {-9, -98, 0, 10, -6, 25, 45};
        int countD = 0;

        int countB = 0;

        for (int i = 0; i < k.length; i++) {
            if (k[i] > 0) {
                countD ++;
            }
            if (k[i] < 0) {
                countB ++;
            }


        }
        System.out.println(countB + "  "+ countD);
    }
}
