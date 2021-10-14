public class xnd191 {
    public static void main(String[] args) {
        String s = "tun rsd          kl";
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                continue;
            }
            n += s.charAt(i);
        }

        String[] nor = n.split(" ");
        char p = ' ';
        int count = 1;
        for (int l = 1; l < nor.length; l++) {
            p = nor[0].charAt(0);
            if (p == nor[l].charAt(0)) {
                count++;

            }
            if (count == 1) {
                count = 0;
            }

        }
        System.out.println(count);
    }
}
