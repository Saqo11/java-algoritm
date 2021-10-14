public class xnd137 {
    public static void main(String[] args) {
        int array1[] = {2, 1, 5, 8, -6, -5};

        int array2[] = new int[array1.length - 2];

        int max = array1[0], index = 0;
        int maxIndex = 0, minIndex = 0;
        int min = array1[array1.length - 1];

        for (int i = 0; i < array1.length; i++) {

            if (max < array1[1]) {

                maxIndex  = 1;

            }
            if (min > array1[array1.length - 2]) {
                minIndex = array1.length - 2;
            }

        }

        for (int i = 0; i < array1.length; i++) {
            if (i != maxIndex && i != minIndex) {
                array2[index] = array1[i];
                index++;
            }

        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
