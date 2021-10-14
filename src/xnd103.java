public class xnd103 {
    public static void main(String[] args) {
        int array[] = {3, 2, 9, 6, 10};
        int sum = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 1000; j++) {
                if (i == j * j) {
                    sum += array[i];
                    count++;
                }
            }
        }
        System.out.println(sum/count);
    }
}
