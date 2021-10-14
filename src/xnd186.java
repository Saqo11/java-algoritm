public class xnd186 {
    public static void main(String[] args) {
        String a = "abcdckm";
        String b = "33";
        String taza = "";
        char x = 'c';

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == x) {
                taza += b;
                continue;
            }
            taza += a.charAt(i);
        }



        System.out.println(taza);
    }
}
