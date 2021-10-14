public class xnd118 {
    public static void main(String[] args) {
        int array1[] = {-2, 5, 6, -1, 8};

        int count = 0;

        int i;

        for (i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                count++;
            }
        }
        int array2[] = new int[count];
        int z = 0;

        for (int j = 0; j < array1.length; j++) {
            if (array1[j] > 0) {
                array2[z] = array1[j];
                z++;
            }
        }

        for (int k = 0; k < array2.length; k++) {
            System.out.println(array2[k]);
        }

    }
}
