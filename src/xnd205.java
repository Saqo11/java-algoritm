public class xnd205 {
    public static void main(String[] args) {
        String n = "5abfcd";
        for (int i = 0; i < n.length()-1; i++) {
            if(n.codePointAt(i+1) - n.codePointAt(i)==1){
                System.out.println(true);
            }
        }

    }
}
