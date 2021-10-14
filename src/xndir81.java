public class xndir81 {
    public static void main(String[] args) {
        int k = 25;
        int n[]={10,-9,25,67,-2};
        int sum  = 0;
        for (int i = 0; i < n.length; i++) {
            if (Math.abs(n[i])<k){
                sum += n[i] * n[i] * n[i];
            }


        }
        System.out.println(sum);
    }
}
