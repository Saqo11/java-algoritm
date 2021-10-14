public class xndir157 {
    public static void main(String[] args) {
        String n = "123456789";
        String x = "";
        for (int i = 0; i < n.length(); i++) {
            if (i == n.length() / 2 - 1 ){
                i++;
                i++;
                continue;
            }else {
                x+=n.charAt(i);
            }

        }
        System.out.println(x);

    }
}
