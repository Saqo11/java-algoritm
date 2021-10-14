public class xnd156 {
    public static void main(String[] args) {
        String mek = "123456";
        String tar = "asdfg";
        String datark = "";
        for (int i = 0; i < mek.length(); i++) {
            if (i == mek.length() / 2) {
                datark += tar;
            }
            datark += mek.charAt(i);


        }
        System.out.println(datark);
    }


}
