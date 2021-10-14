public class xnd151 {
    public static void main(String[] args) {
        String str = "123456789";
        String x = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (count % 3 == 0) {
                x += 'a';
                count++;
            } else {
                x += str.charAt(i);
                count++;
            }
        }
        System.out.println(x);
    }
}
