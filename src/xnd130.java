public class xnd130 {

    public static void main(String[] args) {
        int array1[] = {1, 2, 45, 5, 9, 6, 11};
        int array2[];
        if (array1.length % 2 == 0) {
            array2 = new int[array1.length];
        } else {
            array2 = new int[array1.length - 1];
        }

        int count = 0;
        int f = 0;
        for (int i = 0; i < array2.length - 1; i++) {

            array2[count] = array1[f + 1];
            array2[count + 1] = array1[f];
            count += 2;
            f += 2;

            if (count > array2.length - 1) {
                break;
            }

        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}