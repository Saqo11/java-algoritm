public class xndir133 {
    public static void main(String[] args) {
        int array1[] = {2, -9, 6, 9, 19};
        int array2[];
        int max = array1[0];
        int min = array1[0];
        int mijin;
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            } else if (min > array1[i]) {
                min = array1[i];
            }
        }

        mijin = (max + min) / 2;
        for (int i = 0; i < array1.length; i++) {
            if (Math.abs(array1[i]) < mijin) {
                count++;
            }
        }
        array2 = new int[count];
        int index=0;
        for (int i = 0; i < array1.length; i++) {
            if (Math.abs(array1[i]) < mijin) {
                array2[index]=array1[i];
                index++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

}
