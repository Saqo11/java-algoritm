public class xnd114 {
    public static void main(String[] args) {
        int array[] = {5, 5, 25, 8, 4, 25};

        int max = array[0];

        int count = 0;

        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {

                max = array[i];

                index = i;

            }


        }
        System.out.println(index);
    }

}
