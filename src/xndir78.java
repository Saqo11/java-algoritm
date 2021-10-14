public class xndir78 {
    public static void main(String[] args) {
        int n[] = {7, -8, 89, 65};
        int a = -8;
        int b = 65;
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >=a && n[i]<=b ){
                count+=n[i];
            }

        }
        System.out.println(count);
    }
}
