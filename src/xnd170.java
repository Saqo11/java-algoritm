public class xnd170 {
    public static void main(String[] args) {
        int n = 5;
        String dat = "";
        int count = 0;
        for (int i = 'a'; i <= 'z'; i++, count++) {

            if (count == n) {

                break;
            }
            dat += String.valueOf((char) (i));
        }
        System.out.println(dat);

    }
}
