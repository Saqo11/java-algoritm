public class xnd139 {
    public static void main(String[] args) {
        String n = "poaraopp";
        int index = n.length() - 1;
        boolean t = true;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == n.charAt(index)) {
                if (index == 0) {
                    break;
                }
                index--;

                t = true;
            } else {
                t = false;
            }
        }

        System.out.println(t);
    }
}
