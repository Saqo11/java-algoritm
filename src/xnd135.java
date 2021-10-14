public class xnd135 {
    public static void main(String[] args) {
        int array1[] = {10, 20, -9, 9, -8, 11};

        int[] array2 = new int[array1.length];

        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {

                array2[index] = array1[i];
                index++;
            }

        }

        for (int j = 0; j < array1.length; j++) {

            if (array1[j] % 10 == 0) {

                array2[index] = array1[j];
                index++;

            }
        }
        for (int e = 0; e < array1.length; e++) {

            if (array1[e] > 0 && array1[e] % 10 != 0) {

                array2[index] = array1[e];
                index++;

            }


        }
        for (int q = 0; q < array2.length; q++) {
            System.out.println(array2[q]);

        }
    }
}