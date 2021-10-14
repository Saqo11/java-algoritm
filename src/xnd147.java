public class xnd147 {
    public static void main(String[] args) {
        String str = "1234567"; //65321
        String x="";

        for (int i = str.length()-1; i >= 0; i--) {
            x+=str.charAt(i);

        }
        System.out.println(x);
    }
}
