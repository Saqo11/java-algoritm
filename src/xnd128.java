public class xnd128 {
    public static void main(String[] args) {

        int array1[] = {5, 8, 9, 10};

        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }

        int array2[] = new int[array1.length];

        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array2[count] = max + array1[i];
            count++;


        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
