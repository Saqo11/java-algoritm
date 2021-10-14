public class xnd95 {
    public static void main(String[] args) {
        int array [] = {8,15,3,0,-9,};
        int sum =0;
        int count =0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 ==0 && array[i] !=0){
                sum+=array[i];

                count++;
            }

        }
        System.out.println( sum / count);
    }
}
