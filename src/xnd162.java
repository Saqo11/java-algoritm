public class xnd162 {
    public static void main(String[] args) {
        String ab1 = "vzgostepanyan995454";

        String ab3 = "vzgossstepanyan295454";

        String ab2 = "gagikcarukyan295454";

        String x = "295454";

        String[] p = {ab1, ab2, ab3};

        for (int i = 0; i < p.length; i++) {
            if (p[i].contains(x)) {
                System.out.println(p[i].substring(0, p[i].length() - 6));
            }

        }
    }

}

