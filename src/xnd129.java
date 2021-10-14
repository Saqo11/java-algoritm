public class xnd129 {
    public static void main(String[] args) {
            int array1[] = {1, 2, 45,46,7};

        int array2[] = new int[array1.length / 2];

        int count = 0;

        for (int i = 0; i < array1.length-1; i++) {

                if (array1[i] > array1[i + 1]) {
                    array2[count] = array1[i];
                    count++;
                    i++;
                } else {
                    array2[count] = array1[i + 1];
                    count++;
                    i++;
                }


        }




        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
