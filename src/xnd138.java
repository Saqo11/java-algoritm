public class xnd138 {
    public static void main(String[] args) {
        String aas = "b,l,g,2,a,a,aaaaaa,aaaaaaaaaaaaaaaaaaaaaaa";
        int count = 0;

        for (int i = 0; i < aas.length(); i++) {
            if (aas.charAt(i)==','){
                count++;
            }

        }
        System.out.println(count);
    }
}
