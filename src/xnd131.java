public class xnd131 {
    public static void main(String[] args) {
        int array1[] = {-1, 25, 9, -9, 36, -89,-98,897,5};
        int array2[];
        int count = 0;
        int index =0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                count++;

            }

        }
        array2 = new int[count * 2];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]>0){

                array2[index] = array1[i];
                index+=2;
            }

        }
        for (int i = 0; i < array2.length; i++) {

            System.out.println(array2[i]);

        }
    }
}
