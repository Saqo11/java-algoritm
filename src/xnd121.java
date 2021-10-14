public class xnd121 {
    public static void main(String[] args) {
        int array1[] = {10, 5, 7, 8, 25, 69};

        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
            int array2[] = new int[count];

            int count2 = 0;

            for (int j = 0; j < array1.length; j++) {
                if (j % 2 != 0) {

                    array2[count2] = array1[j];

                    count2++;

                }

            }
            for (int j = 0; j <array2.length ; j++) {
                System.out.println(array2[j]);

            }

        }

    }

