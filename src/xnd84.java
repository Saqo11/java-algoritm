public class xnd84 {
    public static void main(String[] args) {
        int k = 5;
        int n[] = {-2, -8, 25, 5, 15, 2, 3, 9,8,9,10};
        int count = 0;
        int sum =0;
        for (int i = 0; i < n.length; i++) {
            if (i % k == 0) {
                count++;
                sum+=n[i];
            }


        }
        System.out.println(sum/count);

    }
}
