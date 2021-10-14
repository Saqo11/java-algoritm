public class xnd161 {
    public static void main(String[] args) {
        String n = "1234569789";
        int count = 0;
        for (int i = 1; i < n.length()-1; i++) {
            if (n.charAt(i)>n.charAt(i-1) && n.charAt(i)>n.charAt(i+1) ){
                count++;
            }

        }
        System.out.println(count);

    }

}
