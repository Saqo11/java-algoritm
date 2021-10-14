public class xnd142 {
    public static void main(String[] args) {
        String n = "q1-h";

        String z = "h2tttt";

        String k="";

        int hashvel=0;

        int index = 0;

        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < z.length(); j++) {
              if( n.charAt(i) == z.charAt(j)){

                k+=n.charAt(i);
              }
            }


        }
        System.out.println(k);
    }
}
