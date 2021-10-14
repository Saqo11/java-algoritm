public class xnd68 {
    public static void main(String[] args) {
        int array[] = {-1, 1, 2, 1, 2};
        int sum =0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 !=0){
                sum*=i;

            }


        }
        System.out.println(sum);
    }

}
