public class xnd132 {
    public static void main(String[] args) {
        int array1[] = {1, -9, 63, 65, -7, 11};

        int b = -78;

        int array2[];

        int count1 = 0;

        int count2 = 0;

        int index = 0;

        boolean a = true;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] < b) {

                a = true;

                if (array1[i] > 0) {

                    count1++;

                }
            } else if (array1[i] < 0) {

                a = false;

                count2++;

            }
        }


        if (a == true) {
            array2 = new int[count1];
        } else {
            array2 = new int[count2];
        }


        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0 && a == true){
                array2[index]=array1[i];
                index++;
            }else if (array1[i] < 0 && a == false) {
                array2[index]=array1[i];
                index++;
            }
        }


        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
