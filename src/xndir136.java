public class xndir136 {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, -9, 58, 47, 4};

        int max = array1[0];

        int array2[] = array1;

        int index = 1;

        int count = 0;


        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }

        for (int i = 0; i < array2.length; i += 3) {
            if (i == 0) {
                continue;
            }

            array2[index] = 0;


        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }
    }


}
