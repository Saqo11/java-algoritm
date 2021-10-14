public class xnd107 {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 8, 9};
        int artadryal = 1;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] * i) % 3 == 2) {
                artadryal *= array[i] * array[i];
            }
        }

        System.out.println(artadryal);
    }
}
