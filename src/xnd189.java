public class xnd189 {
    public static void main(String[] args) {
        String a = "abcd asd df 56";
        StringBuilder z = new StringBuilder();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                count++;
            }
            if (count == 1) {
                z.append(a.charAt(i));
            }
        }
        System.out.println(z);
    }
}
