public class xnd160 {
    public static void main(String[] args) {
        String n = "pabap";
        int countA = 0;
        int countB = 0;
        boolean jishta = false;
        int verj = n.length() - 1;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == n.charAt(verj)) {
                jishta = true;
                verj--;
            } else {
                jishta = false;
                break;
            }

        }
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a') {
                countA++;
            }
            if (n.charAt(i) == 'b') {
                countB++;
            }
        }
        if (jishta) {
            System.out.println(countA);
        } else {
            System.out.println(countB);
        }
    }
}

