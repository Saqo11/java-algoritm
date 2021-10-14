public class xnd140 {
    public static void main(String[] args) {
        String n = "s0aasfsx0jbx0s";
        int count = 0;
        int count2 = 0;
        boolean t = false;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'x') {
                count++;
            }
            if (count>=1){
                count2++;
            }

            if (count >= 2) {
                break;
            }
        }
        System.out.println(count2-2);
    }
}
