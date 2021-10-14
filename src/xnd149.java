public class xnd149 {
    //Ստանալ նոր
    //տող , որի տարրերը ստացվում են տրված տողի պայմանանշանների
    //ամեն մի երկյակից վերցնելով մեծ պայմանանշանը ;
    public static void main(String[] args) {
        String str = "abcdez";
        String x = "";

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)>str.charAt(i+1)){
                x+=str.charAt(i);
                i++;
            }else {
                x+=str.charAt(i+1);
                i++;
            }
        }
        System.out.println(x);
    }
}
