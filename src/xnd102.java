public class xnd102 {
    public static void main(String[] args) {
        int array[] = {10,  6, 5, 3, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] + i) % 3 == 0) {
                sum += array[i] * array[i];
            }
        }
        System.out.println(sum);
    }

}
