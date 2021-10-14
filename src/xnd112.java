public class xnd112 {
    public static void main(String[] args) {
        int array[] ={-9,9,62,52,14,5,8969,56};

        int max = array[0];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max<array[i]){
                max = array[i];
                index = i;
            }

        }
        System.out.println(max+index);


    }


}
