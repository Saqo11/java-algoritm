public class xnd195 {
    public static void main(String[] args) {
        String n = "sdsd s    sdsd sfsf sd";
        String x[] = {};
        x = n.split("\\s+");

        String karj = x[0];
        for (int i = 0; i < x.length; i++) {
            if (karj.length() > x[i].length()) {
                karj = x[i];
            }
        }
        System.out.println(karj);
    }
}
