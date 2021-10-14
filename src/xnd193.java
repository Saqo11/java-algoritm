public class xnd193 {
    public static void main(String[] args) {
        String n = "abbx ab ab bt      b ";
        int count = 0;
        String[] x = {""};
        x = n.split(" ");

        int k = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length(); j++) {
                if (x[i].charAt(j) == 'b') {
                    count++;
                }


                if (x[i].charAt(j) == x[i].charAt(x[i].length() - 1) && count >= 2) {
                    System.out.println("ok");
                    count = 0;
                } else {
                    if (x[i].charAt(j) == x[i].charAt(x[i].length() - 1)) {
                        count = 0;
                    }
                }
            }

        }
        // System.out.println(count);
    }
}

