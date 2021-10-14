public class xnd145 {
    public static void main(String[] args) {
        String x = "ssdaaaasdd";
        String y = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a') {
                continue;
            }
            y += x.charAt(i);
        }
        System.out.println(y);
    }
}
