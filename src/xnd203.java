public class xnd203 {
    public static void main(String[] args) {
        String t1 = "1234656";
        String t2 = "";
        String t3 = "";
        String t5 = "";
        String t6 ;
        for (int i = 0; i < t1.length(); i++) {
            if (i % 2 == 0) {
                t2 += t1.charAt(i);

            } else {
                t3 += t1.charAt(i);
            }
        }
        for (int g = t3.length() - 1; g >= 0; g--) {
            t5 += t3.charAt(g);
        }
        t6 = t2 + t5;
        System.out.println(t6);
    }
}
