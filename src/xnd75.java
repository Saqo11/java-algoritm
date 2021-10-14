public class xnd75 {
    public static void main(String[] args) {
        int n[] = {-10, -5, 15, 12, 13};

        int count = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                if (n[i] < 0) {
                    n[i] = n[i] * -1;
                }
                count+=n[i];
            }


        }
        System.out.println(count);

    }
}
